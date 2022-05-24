package services

import (
	"context"
	"fmt"
	account "github.com/trinsic-id/sdk/go/proto/account/v1"
	options "github.com/trinsic-id/sdk/go/proto/options/v1"
	provider "github.com/trinsic-id/sdk/go/proto/provider/v1"
	trustregistry "github.com/trinsic-id/sdk/go/proto/trustregistry/v1"
	wallet "github.com/trinsic-id/sdk/go/proto/universalwallet/v1"
	credential "github.com/trinsic-id/sdk/go/proto/verifiablecredentials/v1"
	"io/ioutil"
	"path/filepath"
	"runtime"
	"testing"

	"github.com/google/uuid"
	"github.com/stretchr/testify/assert"
)

// pathData() {
func GetBasePath() string {
	_, fileName, _, _ := runtime.Caller(1)
	path := filepath.Clean(filepath.Join(filepath.Dir(fileName), "..", "..", "devops", "testdata"))
	return path
}
func GetVaccineCertUnsignedPath() string {
	return filepath.Join(GetBasePath(), "vaccination-certificate-unsigned.jsonld")
}
func GetVaccineCertFramePath() string {
	return filepath.Join(GetBasePath(), "vaccination-certificate-frame.jsonld")
}

// }

func TestServiceOptions(t *testing.T) {
	assert := assert.New(t)

	opts, err := NewServiceOptions()
	assert.Nil(err)

	prodOpts := &Options{ServiceOptions: &options.ServiceOptions{}}
	err = WithProductionEnv()(prodOpts)
	assert.Nil(err, "production options should return")

	prodOpts.ServiceOptions.DefaultEcosystem = "default"
	assert.Equal(prodOpts, opts, "should default to production env")
	assert.Equal("prod.trinsic.cloud", opts.ServiceOptions.ServerEndpoint, "incorrect prod url")

	err = WithAuthToken("test token")(opts)
	assert.Nil(err, "should not error on test token")
	assert.Equal("test token", opts.ServiceOptions.AuthToken, "test token not applied")

	err = WithDevEnv()(opts)
	assert.Nil(err, "should not error on dev env")
	assert.Equal("dev-internal.trinsic.cloud", opts.ServiceOptions.ServerEndpoint, "incorrect dev url")

	err = WithStagingEnv()(opts)
	assert.Nil(err, "should not error on staging env")
	assert.Equal("staging-internal.trinsic.cloud", opts.ServiceOptions.ServerEndpoint, "incorrect staging url")

	err = WithDefaultEcosystem("test1")(opts)
	assert.Nil(err, "should not error on setting default ecosystem")
	assert.Equal("test1", opts.ServiceOptions.DefaultEcosystem, "default ecosystem not updated")
}

func TestVaccineCredentialsDemo(t *testing.T) {
	assert2 := assert.New(t)

	// Open in background
	opts, err := NewServiceOptions(WithTestEnv())
	if !assert2.Nil(err) {
		return
	}

	accountService, err := NewAccountService(opts)
	if !assert2.Nil(err) {
		return
	}

	// if !accountService.GetChannel().WaitForStateChange(context.Background(), connectivity.Ready) {
	// 	t.Fail()
	// }

	// SETUP ACTORS
	// Create 3 different profiles for each participant in the scenario
	// setupActors() {
	allison, _, err := accountService.SignIn(context.Background(), &account.SignInRequest{})
	failError(t, "error creating profile", err)
	if !assert2.NotNil(allison) {
		return
	}

	clinic, _, err := accountService.SignIn(context.Background(), &account.SignInRequest{})
	failError(t, "error creating profile", err)
	if !assert2.NotNil(clinic) {
		return
	}

	airline, _, err := accountService.SignIn(context.Background(), &account.SignInRequest{})
	failError(t, "error creating profile", err)
	if !assert2.NotNil(airline) {
		return
	}
	// }

	// storeAndRecallProfile() {
	// Store profile for later use
	// File.WriteAllBytes("allison.bin", allison.ToByteString().ToByteArray());

	// Create profile from existing data
	// var allison = WalletProfile.Parser.ParseFrom(File.ReadAllBytes("allison.bin"));
	// }

	walletService, err := NewWalletService(opts)
	failError(t, "error creating wallet service", err)

	credentialService, err := NewCredentialService(opts)
	failError(t, "error creating credential service", err)

	// ISSUE CREDENTIAL
	// Sign a credential as the clinic and send it to Allison
	// issueCredential() {
	fileContent, err := ioutil.ReadFile(GetVaccineCertUnsignedPath())
	failError(t, "error reading file", err)

	credentialService.SetToken(clinic)
	// issueCredentialSample() {
	credentialResponse, err := credentialService.IssueCredential(context.Background(), &credential.IssueRequest{DocumentJson: string(fileContent)})
	// }
	failError(t, "error issuing credential", err)
	fmt.Printf("Credential:%s\n", credentialResponse)
	// }

	// sendCredential() {
	err = credentialService.Send(context.Background(), &credential.SendRequest{DocumentJson: credentialResponse.SignedDocumentJson,
		DeliveryMethod: &credential.SendRequest_Email{Email: "example@trinsic.id"}})
	// }
	// We ignore errors because we don't expect this email account to exist.
	err = nil

	// STORE CREDENTIAL
	// Alice stores the credential in her cloud wallet.
	// storeCredential() {
	walletService.SetToken(allison)
	failError(t, "error setting profile", err)
	// insertItemWallet() {
	itemID, err := walletService.InsertItem(context.Background(), &wallet.InsertItemRequest{ItemJson: credentialResponse.SignedDocumentJson})
	// }
	failError(t, "error inserting item", err)
	fmt.Println("item id", itemID)
	// }

	// searchWalletBasic() {
	items, err := walletService.Search(context.Background(), &wallet.SearchRequest{})
	// }
	// searchWalletSQL() {
	items2, err := walletService.Search(context.Background(), &wallet.SearchRequest{Query: "SELECT c.id, c.type, c.data FROM c WHERE c.type = 'VerifiableCredential'"})
	// }
	if items != nil && items2 != nil {
	}

	// SHARE CREDENTIAL
	// Allison shares the credential with the venue.
	// The venue has communicated with Allison the details of the credential
	// that they require expressed as a JSON-LD frame.
	// shareCredential() {
	walletService.SetToken(allison)
	failError(t, "error reading file", err)

	fileContent2, err := ioutil.ReadFile(GetVaccineCertFramePath())
	failError(t, "error reading file", err)

	req := &credential.CreateProofRequest{
		RevealDocumentJson: string(fileContent2),
		Proof:              &credential.CreateProofRequest_ItemId{ItemId: itemID},
	}

	credentialService.SetToken(allison)
	// createProof() {
	credentialProof, err := credentialService.CreateProof(context.Background(), req)
	// }
	failError(t, "error creating proof", err)
	fmt.Println("Credential proof", credentialProof)
	// }

	// VERIFY CREDENTIAL
	// The airline verifies the credential
	// verifyCredential() {
	walletService.SetToken(airline)
	failError(t, "error setting profile", err)
	// verifyProof() {
	valid, err := credentialService.VerifyProof(context.Background(), &credential.VerifyProofRequest{ProofDocumentJson: credentialResponse.SignedDocumentJson})
	// }
	failError(t, "error verifying proof", err)
	fmt.Println("Validation result", valid)
	if valid != true {
		t.Fail()
	}
	// }
}

func TestTrustRegistryDemo(t *testing.T) {
	assert2, authtoken, err := createAccountAndSignIn(t)
	if !assert2.Nil(err) {
		return
	}

	opts, err := NewServiceOptions(WithTestEnv(), WithAuthToken(authtoken))
	if !assert2.Nil(err) {
		return
	}

	service, _ := NewTrustRegistryService(opts)

	// register issuer
	didURI := "did:example:test"
	schemaUri := "https://schema.org/Card"
	frameworkURI := fmt.Sprintf("https://example.com/%s", uuid.New())

	// registerGovernanceFramework() {
	newFramework, err := service.RegisterGovernanceFramework(context.Background(), &trustregistry.AddFrameworkRequest{
		GovernanceFrameworkUri: frameworkURI,
		Name:                   fmt.Sprintf("Example Framework - %s", uuid.New()),
	})
	// }
	if !assert2.Nil(err) {
		return
	}

	// registerMemberSample() {
	registerMemberResponse, err := service.RegisterMember(context.Background(), &trustregistry.RegisterMemberRequest{
		FrameworkId: newFramework.Id,
		SchemaUri:   schemaUri,
		Member:      &trustregistry.RegisterMemberRequest_DidUri{DidUri: didURI},
	})
	// }
	if !assert2.Nil(err) {
		return
	}

	// getMembershipStatus() {
	getMembershipStatusResponse, err := service.GetMembershipStatus(context.Background(), &trustregistry.GetMembershipStatusRequest{
		GovernanceFrameworkUri: frameworkURI,
		Member:                 &trustregistry.GetMembershipStatusRequest_DidUri{DidUri: didURI},
		SchemaUri:              schemaUri,
	})
	// }
	if !assert2.Nil(err) {
		return
	}
	assert2.Equal(trustregistry.RegistrationStatus_CURRENT, getMembershipStatusResponse.Status, "Member status should be current")

	// searchTrustRegistry() {
	ecosystemList, err := service.SearchRegistry(context.Background(), nil)
	// }
	if !assert2.Nil(err) {
		return
	}
	assert2.NotNil(ecosystemList)
	assert2.NotEmpty(ecosystemList)

	// unregisterIssuer() {
	unregisterMemberResponse, err := service.UnregisterMember(context.Background(), &trustregistry.UnregisterMemberRequest{
		SchemaUri:   schemaUri,
		FrameworkId: newFramework.Id,
	})
	// }

	// This is for the variables used for demos above, so they appear "used".
	if unregisterMemberResponse == nil || registerMemberResponse == nil || getMembershipStatusResponse == nil {
		// Do absolutely nothing
	}
}

func createAccountAndSignIn(t *testing.T) (*assert.Assertions, string, error) {
	assert2 := assert.New(t)
	opts, err := NewServiceOptions(WithTestEnv())
	if !assert2.Nil(err) {
		return assert2, "", err
	}
	// Open in background
	accountService, err := NewAccountService(opts)
	if !assert2.Nil(err) {
		return assert2, "", err
	}
	authtoken, _, err := accountService.SignIn(context.Background(), &account.SignInRequest{})
	if !assert2.Nil(err) {
		fmt.Println(err)
		return assert2, "", err
	}
	return assert2, authtoken, nil
}

func createRandomEcosystem() error {
	opts, err := NewServiceOptions(WithTestEnv())
	if err != nil {
		return err
	}

	ps, err := NewProviderService(opts)
	if err != nil {
		return err
	}

	_, err = ps.CreateEcosystem(context.Background(), &provider.CreateEcosystemRequest{Name: "test-sdk-" + uuid.New().String()})

	return err
}
func TestEcosystemDemo(t *testing.T) {
	assert2, authtoken, err := createAccountAndSignIn(t)
	if !assert2.Nil(err) {
		return
	}

	opts, err := NewServiceOptions(WithTestEnv(), WithAuthToken(authtoken))
	if !assert2.Nil(err) {
		return
	}

	service, err := NewProviderService(opts)
	if !assert2.Nil(err) {
		return
	}

	// createEcosystem() {
	actualCreate, err := service.CreateEcosystem(context.Background(), &provider.CreateEcosystemRequest{
		Description: "My ecosystem",
		Uri:         "https://example.com",
	})
	// }
	if !assert2.Nil(err) {
		return
	}
	assert2.NotNil(actualCreate)
	// assert2.NotNil(actualCreate.Id)
	// assert2.True(strings.HasPrefix(actualCreate.Id, "urn:trinsic:ecosystems:"))

	// inviteParticipant() {
	inviteResponse, err := service.InviteParticipant(context.Background(),
		&provider.InviteRequest{Participant: provider.ParticipantType_participant_type_individual,
			Details: &account.AccountDetails{Email: "example@trinsic.id"}})
	// }
	if inviteResponse == nil {
		inviteResponse = &provider.InviteResponse{InvitationId: "NA"}
	}
	// invitationStatus() {
	inviteStatus, err := service.InvitationStatus(context.Background(), &provider.InvitationStatusRequest{InvitationId: inviteResponse.InvitationId})
	// }
	if inviteStatus != nil {
	}

}

// func TestCreateChannelUrlFromConfig(t *testing.T) {
// 	assert2 := assert.New(t)
// 	if !assert2.Equalf(CreateChannelUrlFromConfig(TrinsicProductionConfig()), CreateChannelUrlFromConfig(nil), "Default is production stack") {
// 		return
// 	}
// }

func failError(t *testing.T, message string, err error) {
	if err != nil {
		t.Helper()
		t.Errorf("%s: %v", message, err)
		t.FailNow()
	}
}
