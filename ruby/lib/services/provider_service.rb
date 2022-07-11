# frozen_string_literal: true

require 'services/service_base'

module Trinsic
  # Provider Service wrapper
  class ProviderService < ServiceBase
    def initialize(service_options = nil)
      super(service_options)
      if @service_options.server_use_tls
        channel_creds = GRPC::Core::ChannelCredentials.new
        @client = Provider::Provider::Stub.new(url_string, channel_creds)
      else
        @client = Provider::Provider::Stub.new(url_string, :this_channel_is_insecure)
      end
    end

    def create_ecosystem(request = nil)
      request ||= Provider::CreateEcosystemRequest.new
      response = Provider::CreateEcosystemResponse
      response = if request.name.empty? && (request.details.nil? || request.details.email.empty?)
                   @client.create_ecosystem(request)
                 else
                   @client.create_ecosystem(request, metadata: metadata(request))
                 end
      encoded_profile = Base64.urlsafe_encode64(Account::AccountProfile.encode(response.profile))
      self.auth_token = encoded_profile
      response
    end
# BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
# target: ..\sdk\ruby\lib\services\provider_service.rb
nil

	#  Update an existing ecosystem
# @param [UpdateEcosystemRequest] request
# @return [UpdateEcosystemResponse]
    def update_ecosystem(request)
        @client.update_ecosystem(request, metadata: metadata(request))
    end
	#  Grant user authorization to ecosystem resources
# @param [GrantAuthorizationRequest] request
# @return [GrantAuthorizationResponse]
    def grant_authorization(request)
        @client.grant_authorization(request, metadata: metadata(request))
    end
	#  Revoke user authorization to ecosystem resources
# @param [RevokeAuthorizationRequest] request
# @return [RevokeAuthorizationResponse]
    def revoke_authorization(request)
        @client.revoke_authorization(request, metadata: metadata(request))
    end
	#  Retreive the list of permissions for this particular account/ecosystem
# @param [GetAuthorizationsRequest] request
# @return [GetAuthorizationsResponse]
    def get_authorizations(request)
        @client.get_authorizations(request, metadata: metadata(request))
    end
	#  Add a webhook endpoint to the ecosystem
# @param [AddWebhookRequest] request
# @return [AddWebhookResponse]
    def add_webhook(request)
        @client.add_webhook(request, metadata: metadata(request))
    end
	#  Delete a webhook endpoint from the ecosystem
# @param [DeleteWebhookRequest] request
# @return [DeleteWebhookResponse]
    def delete_webhook(request)
        @client.delete_webhook(request, metadata: metadata(request))
    end
	#  Get ecosystem information
# @param [EcosystemInfoRequest] request
# @return [EcosystemInfoResponse]
    def ecosystem_info(request)
        @client.ecosystem_info(request, metadata: metadata(request))
    end
	#  Generates an unprotected authentication token that can be used to
# configure server side applications
# @param [GenerateTokenRequest] request
# @return [GenerateTokenResponse]
    def generate_token(request)
        @client.generate_token(request, metadata: metadata(request))
    end
	#  Invite a user to the ecosystem
# @param [InviteRequest] request
# @return [InviteResponse]
    def invite(request)
        @client.invite(request, metadata: metadata(request))
    end
	#  Check the status of an invitation
# @param [InvitationStatusRequest] request
# @return [InvitationStatusResponse]
    def invitation_status(request)
        @client.invitation_status(request, metadata: metadata(request))
    end
	#  Returns the public key being used to create/verify oberon tokens
# @param [GetOberonKeyRequest] request
# @return [GetOberonKeyResponse]
    def get_oberon_key(request)
        @client.get_oberon_key(request, metadata: metadata(request))
    end
	#  Generate a signed token (JWT) that can be used to connect to the message bus
# @param [GetEventTokenRequest] request
# @return [GetEventTokenResponse]
    def get_event_token(request)
        @client.get_event_token(request, metadata: metadata(request))
    end

# END Code generated by protoc-gen-trinsic. DO NOT EDIT.
  end
end
