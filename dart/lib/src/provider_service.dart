import 'dart:convert';

import 'package:trinsic_dart/src/proto/sdk/options/v1/options.pb.dart';
import 'package:trinsic_dart/src/proto/services/provider/v1/provider.pbgrpc.dart';
import 'package:trinsic_dart/src/service_base.dart';
import 'package:trinsic_dart/src/storage/token_provider.dart';

class ProviderService extends ServiceBase {
  late ProviderClient client;

  ProviderService(ServiceOptions? serverOptions, ITokenProvider? tokenProvider)
      : super(serverOptions, tokenProvider) {
    client = ProviderClient(super.channel);
  }

  Future<CreateEcosystemResponse> createEcosystem(
      {CreateEcosystemRequest? request}) async {
    request = request ?? CreateEcosystemRequest();
    var authenticate =
        (request.name.isNotEmpty || request.details.email.isNotEmpty);
    var metadata =
        authenticate ? buildMetadata(request: request) : buildMetadata();
    var response =
        await client.createEcosystem(request, options: await metadata);
    if (!response.profile.protection.enabled) {
      tokenProvider.save(
          Base64Encoder.urlSafe().convert(response.profile.writeToBuffer()));
    }
    return response;
  }

// BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
// target: /home/runner/work/sdk/sdk/dart/lib/src/provider_service.dart

  @Deprecated('This will be removed May 1, 2023')
  Future<UpdateEcosystemResponse> updateEcosystem(
      UpdateEcosystemRequest request) async {
    /// This will be removed May 1, 2023
    /// Update an existing ecosystem

    return client.updateEcosystem(request,
        options: await buildMetadata(request: request));
  }

  Future<AddWebhookResponse> addWebhook(AddWebhookRequest request) async {
    ///  Add a webhook endpoint to the ecosystem

    return client.addWebhook(request,
        options: await buildMetadata(request: request));
  }

  Future<DeleteWebhookResponse> deleteWebhook(
      DeleteWebhookRequest request) async {
    ///  Delete a webhook endpoint from the ecosystem

    return client.deleteWebhook(request,
        options: await buildMetadata(request: request));
  }

  Future<EcosystemInfoResponse> ecosystemInfo(
      EcosystemInfoRequest request) async {
    ///  Get ecosystem information

    return client.ecosystemInfo(request,
        options: await buildMetadata(request: request));
  }

  @Deprecated('This will be removed May 1, 2023')
  Future<GetPublicEcosystemInfoResponse> getPublicEcosystemInfo(
      GetPublicEcosystemInfoRequest request) async {
    /// This will be removed May 1, 2023
    /// Get public ecosystem information about *any* ecosystem

    return client.getPublicEcosystemInfo(request,
        options: await buildMetadata());
  }

  Future<GetOberonKeyResponse> getOberonKey(GetOberonKeyRequest request) async {
    ///  Returns the public key being used to create/verify oberon tokens

    return client.getOberonKey(request, options: await buildMetadata());
  }

  Future<UpgradeDidResponse> upgradeDID(UpgradeDidRequest request) async {
    ///  Upgrade a wallet's DID from `did:key` to another method

    return client.upgradeDID(request,
        options: await buildMetadata(request: request));
  }

  Future<RetrieveDomainVerificationRecordResponse>
      retrieveDomainVerificationRecord() async {
    ///  Retrieve a random hash TXT that can be used to verify domain ownership
    var request = RetrieveDomainVerificationRecordRequest();
    return client.retrieveDomainVerificationRecord(request,
        options: await buildMetadata(request: request));
  }

  Future<RefreshDomainVerificationStatusResponse>
      refreshDomainVerificationStatus(
          RefreshDomainVerificationStatusRequest request) async {
    ///  Call to verify domain

    return client.refreshDomainVerificationStatus(request,
        options: await buildMetadata(request: request));
  }

  Future<SearchWalletConfigurationResponse> searchWalletConfigurations(
      SearchWalletConfigurationsRequest request) async {
    ///  Search for issuers/providers/verifiers in the current ecosystem

    return client.searchWalletConfigurations(request,
        options: await buildMetadata(request: request));
  }
// END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}
