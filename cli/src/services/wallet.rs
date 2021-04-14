use okapi::proto::google_protobuf::Struct;
use okapi::proto::trinsic_services::{
    wallet_client::WalletClient, CreateWalletRequest, GetProviderConfigurationRequest,
    InsertItemRequest, SearchRequest, WalletProfile,
};
use okapi::utils::{get_capability_document, read_file, read_file_as_string, write_file};
use tonic::transport::Channel;

use std::io::stdin;

use super::super::parser::wallet::*;
use crate::services::config::*;
use didcommgrpc::*;

#[allow(clippy::unit_arg)]
pub(crate) fn execute(args: &Command, config: Config) -> Result<(), Error> {
    match args {
        Command::Create(args) => create(args, config),
        Command::Search(args) => Ok(search(args, config)),
        Command::InsertItem(args) => Ok(insert_item(args)),
        Command::SetProfile(args) => Ok(set_profile(args)),
        Command::GetProviderConfiguration => Ok(get_provider_configuration()),
        _ => Err(Error::UnknownCommand),
    }
}

#[tokio::main]
async fn get_provider_configuration() {
    let config = Config::init().expect("Unable to read default configuration");

    let mut client = WalletClient::connect(config.server.address)
        .await
        .expect("Unable to connect to server");
    let request = tonic::Request::new(GetProviderConfigurationRequest {});
    let response = client
        .get_provider_configuration(request)
        .await
        .expect("Get Provider Configuration failed");
    println!("Received Response: {:?}", &response);
}

#[tokio::main]
async fn create(args: &CreateArgs, config: Config) -> Result<(), Error> {
    let mut new_config = config.clone();

    let key = match &args.key {
        Some(filename) => {
            serde_json::from_str(&read_file_as_string(Some(filename))).expect("Unable to parse key")
        }
        None => DIDKey::generate(&GenerateKeyRequest {
            seed: vec![],
            key_type: 0,
        })
        .unwrap(),
    };

    let did_doc_bytes = &key.did_document.unwrap().to_vec();

    let description = match &args.description {
        Some(desc) => desc.to_string(),
        None => "My Cloud Wallet".to_string(),
    };

    let mut client = WalletClient::connect(config.server.address)
        .await
        .expect("Unable to connect to server");
    let request = tonic::Request::new(CreateWalletRequest {
        controller: key.key[0].kid.clone(),
        description,
        ..Default::default()
    });

    let response = client
        .create_wallet(request)
        .await
        .expect("Create Wallet failed")
        .into_inner();

    use okapi::MessageFormatter;
    let profile = WalletProfile {
        wallet_id: response.wallet_id,
        did_document: Some(Struct::from_vec(&did_doc_bytes).unwrap()),
        invoker: key.key[0].kid.clone(),
        invoker_jwk: key.key[0].to_vec(),
        capability: response.capability,
    };

    new_config.save_profile(profile, args.profile_name.unwrap(), args.set_default)
}

#[tokio::main]
async fn search(args: &SearchArgs, config: Config) {
    let query = match args.query {
        Some(query) => query.to_string(),
        None => {
            let mut query = String::new();
            print!("Enter a query to be searched: ");
            //stdout().flush().expect("Unable to flush stdout");
            stdin()
                .read_line(&mut query)
                .expect("Unable to read from stdin");
            query
        }
    };

    let channel = Channel::from_shared(config.server.address.to_string())
        .unwrap()
        .connect()
        .await
        .expect("Unable to connect to server");

    let mut client = WalletClient::with_interceptor(channel, config);

    let request = tonic::Request::new(SearchRequest { query });

    let response = client
        .search(request)
        .await
        .expect("Get Provider Configuration failed")
        .into_inner();
    println!(
        "{}",
        &serde_json::to_string_pretty(&response.items).unwrap()
    );
}

#[tokio::main]
async fn insert_item(args: &InsertItemArgs) {
    let item_type = match args.item_type {
        Some(it) => it,
        None => panic!("Please include item type"),
    };
    let item: didcommgrpc::proto::google_protobuf::Struct =
        serde_json::from_str(&read_file_as_string(args.item)).expect("Unable to parse Item");
    let item_bytes = item.to_vec();

    use okapi::MessageFormatter;
    let item: Struct = Struct::from_vec(&item_bytes).unwrap();

    let config = Config::init().unwrap();

    let channel = Channel::from_shared(config.server.address.to_string())
        .unwrap()
        .connect()
        .await
        .expect("Unable to connect to server");

    let mut client = WalletClient::with_interceptor(channel, config);

    let response = client
        .insert_item(InsertItemRequest {
            item: Some(item),
            item_type: item_type.to_string(),
        })
        .await
        .expect("Insert item failed")
        .into_inner();

    println!("{:?}", response);
}

#[tokio::main]
async fn grant_access() {
    println!("Not yet implemented");
}

#[tokio::main]
async fn revoke_access() {
    println!("Not yet implemented");
}

fn set_profile(args: &SetProfileArgs) {
    use okapi::MessageFormatter;
    let wallet_profile: WalletProfile =
        WalletProfile::from_vec(&read_file(args.profile)).expect("Invalid wallet profile");
    let capability_document = get_capability_document(&wallet_profile.wallet_id);

    let res = LdProofs::create_proof(&CreateProofRequest {
        key: Some(JsonWebKey::from_vec(&wallet_profile.invoker_jwk).expect("Invalid key")),
        document: Some(
            serde_json::from_str(&capability_document).expect("Invalid capability document"),
        ),
        suite: LdSuite::JcsEd25519Signature2020 as i32,
    })
    .expect("Error creating proof");

    let cap_invocation = base64::encode(
        serde_json::to_string(&res.signed_document)
            .expect("Unable to serialize signed document as json"),
    );
    write_file(args.out, &cap_invocation.as_bytes().to_vec());
}
