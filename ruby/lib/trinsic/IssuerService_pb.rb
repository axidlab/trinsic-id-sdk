# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: IssuerService.proto

require 'google/protobuf'

require_relative 'CoreService_pb'
Google::Protobuf::DescriptorPool.generated_pool.build do
  add_file("IssuerService.proto", :syntax => :proto3) do
    add_message "trinsic.services.IssueRequest" do
      optional :document, :message, 1, "trinsic.services.JsonPayload"
    end
    add_message "trinsic.services.IssueResponse" do
      optional :document, :message, 1, "trinsic.services.JsonPayload"
    end
    add_message "trinsic.services.CreateProofRequest" do
      optional :reveal_document, :message, 1, "trinsic.services.JsonPayload"
      optional :document_id, :string, 2
    end
    add_message "trinsic.services.CreateProofResponse" do
      optional :proof_document, :message, 1, "trinsic.services.JsonPayload"
    end
    add_message "trinsic.services.VerifyProofRequest" do
      optional :proof_document, :message, 1, "trinsic.services.JsonPayload"
    end
    add_message "trinsic.services.VerifyProofResponse" do
      optional :valid, :bool, 1
    end
    add_message "trinsic.services.SendRequest" do
      optional :document, :message, 100, "trinsic.services.JsonPayload"
      oneof :delivery_method do
        optional :email, :string, 1
        optional :did_uri, :string, 2
        optional :didcomm_invitation, :message, 3, "trinsic.services.JsonPayload"
      end
    end
    add_message "trinsic.services.SendResponse" do
      optional :status, :enum, 1, "trinsic.services.ResponseStatus"
    end
  end
end

module Trinsic
  module Services
    IssueRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("trinsic.services.IssueRequest").msgclass
    IssueResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("trinsic.services.IssueResponse").msgclass
    CreateProofRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("trinsic.services.CreateProofRequest").msgclass
    CreateProofResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("trinsic.services.CreateProofResponse").msgclass
    VerifyProofRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("trinsic.services.VerifyProofRequest").msgclass
    VerifyProofResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("trinsic.services.VerifyProofResponse").msgclass
    SendRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("trinsic.services.SendRequest").msgclass
    SendResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("trinsic.services.SendResponse").msgclass
  end
end
