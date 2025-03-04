# Code generated by protoc-gen-rbi. DO NOT EDIT.
# source: services/verifiable-credentials/v1/verifiable-credentials.proto
# typed: strict

module Services::Verifiablecredentials::V1::VerifiableCredential
  class Service
    include ::GRPC::GenericService
  end

  class Stub < ::GRPC::ClientStub
    sig do
      params(
        host: String,
        creds: T.any(::GRPC::Core::ChannelCredentials, Symbol),
        kw: T.untyped,
      ).void
    end
    def initialize(host, creds, **kw)
    end

    sig do
      params(
        request: Services::Verifiablecredentials::V1::IssueRequest
      ).returns(Services::Verifiablecredentials::V1::IssueResponse)
    end
    def issue(request)
    end

    sig do
      params(
        request: Services::Verifiablecredentials::V1::IssueFromTemplateRequest
      ).returns(Services::Verifiablecredentials::V1::IssueFromTemplateResponse)
    end
    def issue_from_template(request)
    end

    sig do
      params(
        request: Services::Verifiablecredentials::V1::CheckStatusRequest
      ).returns(Services::Verifiablecredentials::V1::CheckStatusResponse)
    end
    def check_status(request)
    end

    sig do
      params(
        request: Services::Verifiablecredentials::V1::UpdateStatusRequest
      ).returns(Services::Verifiablecredentials::V1::UpdateStatusResponse)
    end
    def update_status(request)
    end

    sig do
      params(
        request: Services::Verifiablecredentials::V1::CreateProofRequest
      ).returns(Services::Verifiablecredentials::V1::CreateProofResponse)
    end
    def create_proof(request)
    end

    sig do
      params(
        request: Services::Verifiablecredentials::V1::VerifyProofRequest
      ).returns(Services::Verifiablecredentials::V1::VerifyProofResponse)
    end
    def verify_proof(request)
    end

    sig do
      params(
        request: Services::Verifiablecredentials::V1::SendRequest
      ).returns(Services::Verifiablecredentials::V1::SendResponse)
    end
    def send(request)
    end
  end
end
