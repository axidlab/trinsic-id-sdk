# frozen_string_literal: true

require_relative 'version'
require 'grpc'
require 'okapi'
require 'base64'
require 'time'
require 'uri'
require 'google/protobuf/well_known_types'
require 'services/account/v1/account_services_pb'
require 'services/universal-wallet/v1/universal-wallet_services_pb'
require 'services/file-management/v1/file-management_services_pb'
require 'services/provider/v1/provider_services_pb'
require 'services/verifiable-credentials/v1/verifiable-credentials_services_pb'
require 'services/verifiable-credentials/templates/v1/templates_services_pb'
require 'services/trust-registry/v1/trust-registry_services_pb'
require 'services/common/v1/common_pb'
require 'sdk/options/v1/options_pb'
require 'security'
require 'services/service_base'
require 'services/access_management_service'
require 'services/account_service'
require 'services/credential_service'
require 'services/file_management_service'
require 'services/provider_service'
require 'services/template_service'
require 'services/trustregistry_service'
require 'services/wallet_service'
require 'memoist'

# Module for all Trinsic servers
module Trinsic
  Common = Services::Common::V1
  Account = Services::Account::V1
  Credentials = Services::Verifiablecredentials::V1
  FileManagement = Services::Filemanagement::V1
  Options = Sdk::Options::V1
  Provider = Services::Provider::V1
  Template = Services::Verifiablecredentials::Templates::V1
  TrustRegistry = Services::Trustregistry::V1
  Wallet = Services::Universalwallet::V1

  def self.trinsic_server(auth_token = nil)
    server_endpoint = ENV.fetch('TEST_SERVER_ENDPOINT', 'prod.trinsic.cloud')
    server_port = ENV.fetch('TEST_SERVER_PORT', '443')
    server_use_tls = ENV.fetch('TEST_SERVER_USE_TLS', 'true')
    server_authtoken = auth_token || ''
    Options::ServiceOptions.new(server_endpoint: server_endpoint, server_port: server_port.to_i,
                                server_use_tls: server_use_tls.downcase != 'false', auth_token: server_authtoken)
  end

  class Error < StandardError; end

  # Wrapper for trinsic services to simplify access
  class TrinsicService < ServiceBase
    extend Memoist

    def initialize(service_options = nil)
      super(service_options)
    end

    def access_management_service
      AccessManagementService.new(@service_options)
    end

    def account_service
      AccountService.new(@service_options)
    end

    def credential_service
      CredentialService.new(@service_options)
    end

    def file_management_service
      FileManagementService.new(@service_options)
    end

    def provider_service
      ProviderService.new(@service_options)
    end

    def template_service
      TemplateService.new(@service_options)
    end

    def trust_registry_service
      TrustRegistryService.new(@service_options)
    end

    def wallet_service
      WalletService.new(@service_options)
    end

    memoize :access_management_service, :account_service, :credential_service, :file_management_service,
            :provider_service, :template_service, :trust_registry_service, :wallet_service
  end
end
