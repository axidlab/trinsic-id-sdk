# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: services/event/v1/event.proto

require 'google/protobuf'

require 'google/protobuf/descriptor_pb'

Google::Protobuf::DescriptorPool.generated_pool.build do
  add_file("services/event/v1/event.proto", :syntax => :proto3) do
    add_message "trinsic.services.event.Event" do
      optional :id, :string, 1
      optional :type, :enum, 2, "trinsic.services.event.EventType"
      optional :timestamp, :string, 3
      optional :data, :bytes, 4
    end
    add_message "trinsic.services.event.APICall" do
      optional :source, :string, 1
      optional :request, :bytes, 2
      optional :response, :bytes, 3
    end
    add_message "trinsic.services.event.Ping" do
      optional :id, :string, 1
      optional :webhook_id, :string, 2
      optional :timestamp, :string, 3
      optional :message, :string, 4
    end
    add_message "trinsic.services.event.EGFCreated" do
      optional :id, :string, 1
      optional :ecosystem_id, :string, 2
      optional :trust_registry, :string, 3
      optional :governing_authority, :string, 4
      optional :type, :string, 5
      optional :name, :string, 6
      optional :description, :string, 7
      optional :governance_framework, :string, 8
    end
    add_message "trinsic.services.event.TemplateCreated" do
      optional :id, :string, 1
      optional :ecosystem_id, :string, 2
      optional :name, :string, 3
      optional :type, :string, 4
      optional :created_by, :string, 5
    end
    add_message "trinsic.services.event.ItemReceived" do
      optional :id, :string, 1
      optional :received, :string, 2
    end
    add_enum "trinsic.services.event.EventType" do
      value :PING, 0
      value :LOG, 1
      value :EGF_CREATED, 5
      value :EGF_MEMBER_REGISTERED, 6
      value :EGF_MEMBER_UNREGISTERED, 7
      value :TEMPLATE_CREATED, 10
      value :TEMPLATE_DELETED, 11
      value :WALLET_CREATED, 15
      value :ITEM_RECEIVED, 16
    end
  end
end

module Trinsic
  module Services
    module Event
      Event = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("trinsic.services.event.Event").msgclass
      APICall = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("trinsic.services.event.APICall").msgclass
      Ping = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("trinsic.services.event.Ping").msgclass
      EGFCreated = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("trinsic.services.event.EGFCreated").msgclass
      TemplateCreated = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("trinsic.services.event.TemplateCreated").msgclass
      ItemReceived = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("trinsic.services.event.ItemReceived").msgclass
      EventType = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("trinsic.services.event.EventType").enummodule
    end
  end
end
