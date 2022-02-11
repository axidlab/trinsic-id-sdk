# Code generated by protoc-gen-rbi. DO NOT EDIT.
# source: services/trust-registry/v1/trust-registry.proto
# typed: strict

module Services; end
module Services::Trustregistry; end
module Services::Trustregistry::V1; end

class Services::Trustregistry::V1::AddFrameworkRequest
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Trustregistry::V1::AddFrameworkRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Trustregistry::V1::AddFrameworkRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Trustregistry::V1::AddFrameworkRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Trustregistry::V1::AddFrameworkRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      governance_framework: T.nilable(Services::Trustregistry::V1::GovernanceFramework)
    ).void
  end
  def initialize(
    governance_framework: nil
  )
  end

  sig { returns(T.nilable(Services::Trustregistry::V1::GovernanceFramework)) }
  def governance_framework
  end

  sig { params(value: T.nilable(Services::Trustregistry::V1::GovernanceFramework)).void }
  def governance_framework=(value)
  end

  sig { void }
  def clear_governance_framework
  end

  sig { params(field: String).returns(T.untyped) }
  def [](field)
  end

  sig { params(field: String, value: T.untyped).void }
  def []=(field, value)
  end

  sig { returns(T::Hash[Symbol, T.untyped]) }
  def to_h
  end
end

class Services::Trustregistry::V1::AddFrameworkResponse
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Trustregistry::V1::AddFrameworkResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Trustregistry::V1::AddFrameworkResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Trustregistry::V1::AddFrameworkResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Trustregistry::V1::AddFrameworkResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      status: T.nilable(T.any(Symbol, String, Integer))
    ).void
  end
  def initialize(
    status: :SUCCESS
  )
  end

  sig { returns(Symbol) }
  def status
  end

  sig { params(value: T.any(Symbol, String, Integer)).void }
  def status=(value)
  end

  sig { void }
  def clear_status
  end

  sig { params(field: String).returns(T.untyped) }
  def [](field)
  end

  sig { params(field: String, value: T.untyped).void }
  def []=(field, value)
  end

  sig { returns(T::Hash[Symbol, T.untyped]) }
  def to_h
  end
end

class Services::Trustregistry::V1::RemoveFrameworkRequest
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Trustregistry::V1::RemoveFrameworkRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Trustregistry::V1::RemoveFrameworkRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Trustregistry::V1::RemoveFrameworkRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Trustregistry::V1::RemoveFrameworkRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      governance_framework: T.nilable(Services::Trustregistry::V1::GovernanceFramework)
    ).void
  end
  def initialize(
    governance_framework: nil
  )
  end

  sig { returns(T.nilable(Services::Trustregistry::V1::GovernanceFramework)) }
  def governance_framework
  end

  sig { params(value: T.nilable(Services::Trustregistry::V1::GovernanceFramework)).void }
  def governance_framework=(value)
  end

  sig { void }
  def clear_governance_framework
  end

  sig { params(field: String).returns(T.untyped) }
  def [](field)
  end

  sig { params(field: String, value: T.untyped).void }
  def []=(field, value)
  end

  sig { returns(T::Hash[Symbol, T.untyped]) }
  def to_h
  end
end

class Services::Trustregistry::V1::RemoveFrameworkResponse
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Trustregistry::V1::RemoveFrameworkResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Trustregistry::V1::RemoveFrameworkResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Trustregistry::V1::RemoveFrameworkResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Trustregistry::V1::RemoveFrameworkResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      status: T.nilable(T.any(Symbol, String, Integer))
    ).void
  end
  def initialize(
    status: :SUCCESS
  )
  end

  sig { returns(Symbol) }
  def status
  end

  sig { params(value: T.any(Symbol, String, Integer)).void }
  def status=(value)
  end

  sig { void }
  def clear_status
  end

  sig { params(field: String).returns(T.untyped) }
  def [](field)
  end

  sig { params(field: String, value: T.untyped).void }
  def []=(field, value)
  end

  sig { returns(T::Hash[Symbol, T.untyped]) }
  def to_h
  end
end

class Services::Trustregistry::V1::SearchRegistryRequest
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Trustregistry::V1::SearchRegistryRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Trustregistry::V1::SearchRegistryRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Trustregistry::V1::SearchRegistryRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Trustregistry::V1::SearchRegistryRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      query: T.nilable(String),
      continuation_token: T.nilable(String),
      options: T.nilable(Services::Common::V1::RequestOptions)
    ).void
  end
  def initialize(
    query: "",
    continuation_token: "",
    options: nil
  )
  end

  sig { returns(String) }
  def query
  end

  sig { params(value: String).void }
  def query=(value)
  end

  sig { void }
  def clear_query
  end

  sig { returns(String) }
  def continuation_token
  end

  sig { params(value: String).void }
  def continuation_token=(value)
  end

  sig { void }
  def clear_continuation_token
  end

  sig { returns(T.nilable(Services::Common::V1::RequestOptions)) }
  def options
  end

  sig { params(value: T.nilable(Services::Common::V1::RequestOptions)).void }
  def options=(value)
  end

  sig { void }
  def clear_options
  end

  sig { params(field: String).returns(T.untyped) }
  def [](field)
  end

  sig { params(field: String, value: T.untyped).void }
  def []=(field, value)
  end

  sig { returns(T::Hash[Symbol, T.untyped]) }
  def to_h
  end
end

class Services::Trustregistry::V1::SearchRegistryResponse
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Trustregistry::V1::SearchRegistryResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Trustregistry::V1::SearchRegistryResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Trustregistry::V1::SearchRegistryResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Trustregistry::V1::SearchRegistryResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      items_json: T.nilable(String),
      has_more: T.nilable(T::Boolean),
      count: T.nilable(Integer),
      continuation_token: T.nilable(String)
    ).void
  end
  def initialize(
    items_json: "",
    has_more: false,
    count: 0,
    continuation_token: ""
  )
  end

  sig { returns(String) }
  def items_json
  end

  sig { params(value: String).void }
  def items_json=(value)
  end

  sig { void }
  def clear_items_json
  end

  sig { returns(T::Boolean) }
  def has_more
  end

  sig { params(value: T::Boolean).void }
  def has_more=(value)
  end

  sig { void }
  def clear_has_more
  end

  sig { returns(Integer) }
  def count
  end

  sig { params(value: Integer).void }
  def count=(value)
  end

  sig { void }
  def clear_count
  end

  sig { returns(String) }
  def continuation_token
  end

  sig { params(value: String).void }
  def continuation_token=(value)
  end

  sig { void }
  def clear_continuation_token
  end

  sig { params(field: String).returns(T.untyped) }
  def [](field)
  end

  sig { params(field: String, value: T.untyped).void }
  def []=(field, value)
  end

  sig { returns(T::Hash[Symbol, T.untyped]) }
  def to_h
  end
end

class Services::Trustregistry::V1::GovernanceFramework
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Trustregistry::V1::GovernanceFramework) }
  def self.decode(str)
  end

  sig { params(msg: Services::Trustregistry::V1::GovernanceFramework).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Trustregistry::V1::GovernanceFramework) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Trustregistry::V1::GovernanceFramework, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      governance_framework_uri: T.nilable(String),
      trust_registry_uri: T.nilable(String),
      description: T.nilable(String)
    ).void
  end
  def initialize(
    governance_framework_uri: "",
    trust_registry_uri: "",
    description: ""
  )
  end

  sig { returns(String) }
  def governance_framework_uri
  end

  sig { params(value: String).void }
  def governance_framework_uri=(value)
  end

  sig { void }
  def clear_governance_framework_uri
  end

  sig { returns(String) }
  def trust_registry_uri
  end

  sig { params(value: String).void }
  def trust_registry_uri=(value)
  end

  sig { void }
  def clear_trust_registry_uri
  end

  sig { returns(String) }
  def description
  end

  sig { params(value: String).void }
  def description=(value)
  end

  sig { void }
  def clear_description
  end

  sig { params(field: String).returns(T.untyped) }
  def [](field)
  end

  sig { params(field: String, value: T.untyped).void }
  def []=(field, value)
  end

  sig { returns(T::Hash[Symbol, T.untyped]) }
  def to_h
  end
end

class Services::Trustregistry::V1::RegisterIssuerRequest
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Trustregistry::V1::RegisterIssuerRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Trustregistry::V1::RegisterIssuerRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Trustregistry::V1::RegisterIssuerRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Trustregistry::V1::RegisterIssuerRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      did_uri: T.nilable(String),
      x509_cert: T.nilable(String),
      credential_type_uri: T.nilable(String),
      valid_from_utc: T.nilable(Integer),
      valid_until_utc: T.nilable(Integer),
      governance_framework_uri: T.nilable(String)
    ).void
  end
  def initialize(
    did_uri: "",
    x509_cert: "",
    credential_type_uri: "",
    valid_from_utc: 0,
    valid_until_utc: 0,
    governance_framework_uri: ""
  )
  end

  sig { returns(String) }
  def did_uri
  end

  sig { params(value: String).void }
  def did_uri=(value)
  end

  sig { void }
  def clear_did_uri
  end

  sig { returns(String) }
  def x509_cert
  end

  sig { params(value: String).void }
  def x509_cert=(value)
  end

  sig { void }
  def clear_x509_cert
  end

  sig { returns(String) }
  def credential_type_uri
  end

  sig { params(value: String).void }
  def credential_type_uri=(value)
  end

  sig { void }
  def clear_credential_type_uri
  end

  sig { returns(Integer) }
  def valid_from_utc
  end

  sig { params(value: Integer).void }
  def valid_from_utc=(value)
  end

  sig { void }
  def clear_valid_from_utc
  end

  sig { returns(Integer) }
  def valid_until_utc
  end

  sig { params(value: Integer).void }
  def valid_until_utc=(value)
  end

  sig { void }
  def clear_valid_until_utc
  end

  sig { returns(String) }
  def governance_framework_uri
  end

  sig { params(value: String).void }
  def governance_framework_uri=(value)
  end

  sig { void }
  def clear_governance_framework_uri
  end

  sig { returns(T.nilable(Symbol)) }
  def authority
  end

  sig { params(field: String).returns(T.untyped) }
  def [](field)
  end

  sig { params(field: String, value: T.untyped).void }
  def []=(field, value)
  end

  sig { returns(T::Hash[Symbol, T.untyped]) }
  def to_h
  end
end

class Services::Trustregistry::V1::RegisterIssuerResponse
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Trustregistry::V1::RegisterIssuerResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Trustregistry::V1::RegisterIssuerResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Trustregistry::V1::RegisterIssuerResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Trustregistry::V1::RegisterIssuerResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      status: T.nilable(T.any(Symbol, String, Integer))
    ).void
  end
  def initialize(
    status: :SUCCESS
  )
  end

  sig { returns(Symbol) }
  def status
  end

  sig { params(value: T.any(Symbol, String, Integer)).void }
  def status=(value)
  end

  sig { void }
  def clear_status
  end

  sig { params(field: String).returns(T.untyped) }
  def [](field)
  end

  sig { params(field: String, value: T.untyped).void }
  def []=(field, value)
  end

  sig { returns(T::Hash[Symbol, T.untyped]) }
  def to_h
  end
end

class Services::Trustregistry::V1::RegisterVerifierRequest
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Trustregistry::V1::RegisterVerifierRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Trustregistry::V1::RegisterVerifierRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Trustregistry::V1::RegisterVerifierRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Trustregistry::V1::RegisterVerifierRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      did_uri: T.nilable(String),
      x509_cert: T.nilable(String),
      presentation_type_uri: T.nilable(String),
      valid_from_utc: T.nilable(Integer),
      valid_until_utc: T.nilable(Integer),
      governance_framework_uri: T.nilable(String)
    ).void
  end
  def initialize(
    did_uri: "",
    x509_cert: "",
    presentation_type_uri: "",
    valid_from_utc: 0,
    valid_until_utc: 0,
    governance_framework_uri: ""
  )
  end

  sig { returns(String) }
  def did_uri
  end

  sig { params(value: String).void }
  def did_uri=(value)
  end

  sig { void }
  def clear_did_uri
  end

  sig { returns(String) }
  def x509_cert
  end

  sig { params(value: String).void }
  def x509_cert=(value)
  end

  sig { void }
  def clear_x509_cert
  end

  sig { returns(String) }
  def presentation_type_uri
  end

  sig { params(value: String).void }
  def presentation_type_uri=(value)
  end

  sig { void }
  def clear_presentation_type_uri
  end

  sig { returns(Integer) }
  def valid_from_utc
  end

  sig { params(value: Integer).void }
  def valid_from_utc=(value)
  end

  sig { void }
  def clear_valid_from_utc
  end

  sig { returns(Integer) }
  def valid_until_utc
  end

  sig { params(value: Integer).void }
  def valid_until_utc=(value)
  end

  sig { void }
  def clear_valid_until_utc
  end

  sig { returns(String) }
  def governance_framework_uri
  end

  sig { params(value: String).void }
  def governance_framework_uri=(value)
  end

  sig { void }
  def clear_governance_framework_uri
  end

  sig { returns(T.nilable(Symbol)) }
  def authority
  end

  sig { params(field: String).returns(T.untyped) }
  def [](field)
  end

  sig { params(field: String, value: T.untyped).void }
  def []=(field, value)
  end

  sig { returns(T::Hash[Symbol, T.untyped]) }
  def to_h
  end
end

class Services::Trustregistry::V1::RegisterVerifierResponse
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Trustregistry::V1::RegisterVerifierResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Trustregistry::V1::RegisterVerifierResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Trustregistry::V1::RegisterVerifierResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Trustregistry::V1::RegisterVerifierResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      status: T.nilable(T.any(Symbol, String, Integer))
    ).void
  end
  def initialize(
    status: :SUCCESS
  )
  end

  sig { returns(Symbol) }
  def status
  end

  sig { params(value: T.any(Symbol, String, Integer)).void }
  def status=(value)
  end

  sig { void }
  def clear_status
  end

  sig { params(field: String).returns(T.untyped) }
  def [](field)
  end

  sig { params(field: String, value: T.untyped).void }
  def []=(field, value)
  end

  sig { returns(T::Hash[Symbol, T.untyped]) }
  def to_h
  end
end

class Services::Trustregistry::V1::UnregisterIssuerRequest
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Trustregistry::V1::UnregisterIssuerRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Trustregistry::V1::UnregisterIssuerRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Trustregistry::V1::UnregisterIssuerRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Trustregistry::V1::UnregisterIssuerRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      did_uri: T.nilable(String),
      x509_cert: T.nilable(String),
      credential_type_uri: T.nilable(String),
      governance_framework_uri: T.nilable(String)
    ).void
  end
  def initialize(
    did_uri: "",
    x509_cert: "",
    credential_type_uri: "",
    governance_framework_uri: ""
  )
  end

  sig { returns(String) }
  def did_uri
  end

  sig { params(value: String).void }
  def did_uri=(value)
  end

  sig { void }
  def clear_did_uri
  end

  sig { returns(String) }
  def x509_cert
  end

  sig { params(value: String).void }
  def x509_cert=(value)
  end

  sig { void }
  def clear_x509_cert
  end

  sig { returns(String) }
  def credential_type_uri
  end

  sig { params(value: String).void }
  def credential_type_uri=(value)
  end

  sig { void }
  def clear_credential_type_uri
  end

  sig { returns(String) }
  def governance_framework_uri
  end

  sig { params(value: String).void }
  def governance_framework_uri=(value)
  end

  sig { void }
  def clear_governance_framework_uri
  end

  sig { returns(T.nilable(Symbol)) }
  def authority
  end

  sig { params(field: String).returns(T.untyped) }
  def [](field)
  end

  sig { params(field: String, value: T.untyped).void }
  def []=(field, value)
  end

  sig { returns(T::Hash[Symbol, T.untyped]) }
  def to_h
  end
end

class Services::Trustregistry::V1::UnregisterIssuerResponse
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Trustregistry::V1::UnregisterIssuerResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Trustregistry::V1::UnregisterIssuerResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Trustregistry::V1::UnregisterIssuerResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Trustregistry::V1::UnregisterIssuerResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      status: T.nilable(T.any(Symbol, String, Integer))
    ).void
  end
  def initialize(
    status: :SUCCESS
  )
  end

  sig { returns(Symbol) }
  def status
  end

  sig { params(value: T.any(Symbol, String, Integer)).void }
  def status=(value)
  end

  sig { void }
  def clear_status
  end

  sig { params(field: String).returns(T.untyped) }
  def [](field)
  end

  sig { params(field: String, value: T.untyped).void }
  def []=(field, value)
  end

  sig { returns(T::Hash[Symbol, T.untyped]) }
  def to_h
  end
end

class Services::Trustregistry::V1::UnregisterVerifierRequest
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Trustregistry::V1::UnregisterVerifierRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Trustregistry::V1::UnregisterVerifierRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Trustregistry::V1::UnregisterVerifierRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Trustregistry::V1::UnregisterVerifierRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      did_uri: T.nilable(String),
      x509_cert: T.nilable(String),
      presentation_type_uri: T.nilable(String),
      governance_framework_uri: T.nilable(String)
    ).void
  end
  def initialize(
    did_uri: "",
    x509_cert: "",
    presentation_type_uri: "",
    governance_framework_uri: ""
  )
  end

  sig { returns(String) }
  def did_uri
  end

  sig { params(value: String).void }
  def did_uri=(value)
  end

  sig { void }
  def clear_did_uri
  end

  sig { returns(String) }
  def x509_cert
  end

  sig { params(value: String).void }
  def x509_cert=(value)
  end

  sig { void }
  def clear_x509_cert
  end

  sig { returns(String) }
  def presentation_type_uri
  end

  sig { params(value: String).void }
  def presentation_type_uri=(value)
  end

  sig { void }
  def clear_presentation_type_uri
  end

  sig { returns(String) }
  def governance_framework_uri
  end

  sig { params(value: String).void }
  def governance_framework_uri=(value)
  end

  sig { void }
  def clear_governance_framework_uri
  end

  sig { returns(T.nilable(Symbol)) }
  def authority
  end

  sig { params(field: String).returns(T.untyped) }
  def [](field)
  end

  sig { params(field: String, value: T.untyped).void }
  def []=(field, value)
  end

  sig { returns(T::Hash[Symbol, T.untyped]) }
  def to_h
  end
end

class Services::Trustregistry::V1::UnregisterVerifierResponse
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Trustregistry::V1::UnregisterVerifierResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Trustregistry::V1::UnregisterVerifierResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Trustregistry::V1::UnregisterVerifierResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Trustregistry::V1::UnregisterVerifierResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      status: T.nilable(T.any(Symbol, String, Integer))
    ).void
  end
  def initialize(
    status: :SUCCESS
  )
  end

  sig { returns(Symbol) }
  def status
  end

  sig { params(value: T.any(Symbol, String, Integer)).void }
  def status=(value)
  end

  sig { void }
  def clear_status
  end

  sig { params(field: String).returns(T.untyped) }
  def [](field)
  end

  sig { params(field: String, value: T.untyped).void }
  def []=(field, value)
  end

  sig { returns(T::Hash[Symbol, T.untyped]) }
  def to_h
  end
end

class Services::Trustregistry::V1::CheckIssuerStatusRequest
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Trustregistry::V1::CheckIssuerStatusRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Trustregistry::V1::CheckIssuerStatusRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Trustregistry::V1::CheckIssuerStatusRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Trustregistry::V1::CheckIssuerStatusRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      governance_framework_uri: T.nilable(String),
      did_uri: T.nilable(String),
      x509_cert: T.nilable(String),
      credential_type_uri: T.nilable(String)
    ).void
  end
  def initialize(
    governance_framework_uri: "",
    did_uri: "",
    x509_cert: "",
    credential_type_uri: ""
  )
  end

  sig { returns(String) }
  def governance_framework_uri
  end

  sig { params(value: String).void }
  def governance_framework_uri=(value)
  end

  sig { void }
  def clear_governance_framework_uri
  end

  sig { returns(String) }
  def did_uri
  end

  sig { params(value: String).void }
  def did_uri=(value)
  end

  sig { void }
  def clear_did_uri
  end

  sig { returns(String) }
  def x509_cert
  end

  sig { params(value: String).void }
  def x509_cert=(value)
  end

  sig { void }
  def clear_x509_cert
  end

  sig { returns(String) }
  def credential_type_uri
  end

  sig { params(value: String).void }
  def credential_type_uri=(value)
  end

  sig { void }
  def clear_credential_type_uri
  end

  sig { returns(T.nilable(Symbol)) }
  def member
  end

  sig { params(field: String).returns(T.untyped) }
  def [](field)
  end

  sig { params(field: String, value: T.untyped).void }
  def []=(field, value)
  end

  sig { returns(T::Hash[Symbol, T.untyped]) }
  def to_h
  end
end

class Services::Trustregistry::V1::CheckIssuerStatusResponse
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Trustregistry::V1::CheckIssuerStatusResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Trustregistry::V1::CheckIssuerStatusResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Trustregistry::V1::CheckIssuerStatusResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Trustregistry::V1::CheckIssuerStatusResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      status: T.nilable(T.any(Symbol, String, Integer))
    ).void
  end
  def initialize(
    status: :CURRENT
  )
  end

  sig { returns(Symbol) }
  def status
  end

  sig { params(value: T.any(Symbol, String, Integer)).void }
  def status=(value)
  end

  sig { void }
  def clear_status
  end

  sig { params(field: String).returns(T.untyped) }
  def [](field)
  end

  sig { params(field: String, value: T.untyped).void }
  def []=(field, value)
  end

  sig { returns(T::Hash[Symbol, T.untyped]) }
  def to_h
  end
end

class Services::Trustregistry::V1::CheckVerifierStatusRequest
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Trustregistry::V1::CheckVerifierStatusRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Trustregistry::V1::CheckVerifierStatusRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Trustregistry::V1::CheckVerifierStatusRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Trustregistry::V1::CheckVerifierStatusRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      governance_framework_uri: T.nilable(String),
      did_uri: T.nilable(String),
      x509_cert: T.nilable(String),
      presentation_type_uri: T.nilable(String)
    ).void
  end
  def initialize(
    governance_framework_uri: "",
    did_uri: "",
    x509_cert: "",
    presentation_type_uri: ""
  )
  end

  sig { returns(String) }
  def governance_framework_uri
  end

  sig { params(value: String).void }
  def governance_framework_uri=(value)
  end

  sig { void }
  def clear_governance_framework_uri
  end

  sig { returns(String) }
  def did_uri
  end

  sig { params(value: String).void }
  def did_uri=(value)
  end

  sig { void }
  def clear_did_uri
  end

  sig { returns(String) }
  def x509_cert
  end

  sig { params(value: String).void }
  def x509_cert=(value)
  end

  sig { void }
  def clear_x509_cert
  end

  sig { returns(String) }
  def presentation_type_uri
  end

  sig { params(value: String).void }
  def presentation_type_uri=(value)
  end

  sig { void }
  def clear_presentation_type_uri
  end

  sig { returns(T.nilable(Symbol)) }
  def member
  end

  sig { params(field: String).returns(T.untyped) }
  def [](field)
  end

  sig { params(field: String, value: T.untyped).void }
  def []=(field, value)
  end

  sig { returns(T::Hash[Symbol, T.untyped]) }
  def to_h
  end
end

class Services::Trustregistry::V1::CheckVerifierStatusResponse
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Trustregistry::V1::CheckVerifierStatusResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Trustregistry::V1::CheckVerifierStatusResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Trustregistry::V1::CheckVerifierStatusResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Trustregistry::V1::CheckVerifierStatusResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      status: T.nilable(T.any(Symbol, String, Integer))
    ).void
  end
  def initialize(
    status: :CURRENT
  )
  end

  sig { returns(Symbol) }
  def status
  end

  sig { params(value: T.any(Symbol, String, Integer)).void }
  def status=(value)
  end

  sig { void }
  def clear_status
  end

  sig { params(field: String).returns(T.untyped) }
  def [](field)
  end

  sig { params(field: String, value: T.untyped).void }
  def []=(field, value)
  end

  sig { returns(T::Hash[Symbol, T.untyped]) }
  def to_h
  end
end

class Services::Trustregistry::V1::FetchDataRequest
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Trustregistry::V1::FetchDataRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Trustregistry::V1::FetchDataRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Trustregistry::V1::FetchDataRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Trustregistry::V1::FetchDataRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      governance_framework_uri: T.nilable(String),
      query: T.nilable(String)
    ).void
  end
  def initialize(
    governance_framework_uri: "",
    query: ""
  )
  end

  sig { returns(String) }
  def governance_framework_uri
  end

  sig { params(value: String).void }
  def governance_framework_uri=(value)
  end

  sig { void }
  def clear_governance_framework_uri
  end

  sig { returns(String) }
  def query
  end

  sig { params(value: String).void }
  def query=(value)
  end

  sig { void }
  def clear_query
  end

  sig { params(field: String).returns(T.untyped) }
  def [](field)
  end

  sig { params(field: String, value: T.untyped).void }
  def []=(field, value)
  end

  sig { returns(T::Hash[Symbol, T.untyped]) }
  def to_h
  end
end

class Services::Trustregistry::V1::FetchDataResponse
  include Google::Protobuf
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Trustregistry::V1::FetchDataResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Trustregistry::V1::FetchDataResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Trustregistry::V1::FetchDataResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Trustregistry::V1::FetchDataResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      response_json: T.nilable(String),
      has_more_results: T.nilable(T::Boolean),
      continuation_token: T.nilable(String)
    ).void
  end
  def initialize(
    response_json: "",
    has_more_results: false,
    continuation_token: ""
  )
  end

  sig { returns(String) }
  def response_json
  end

  sig { params(value: String).void }
  def response_json=(value)
  end

  sig { void }
  def clear_response_json
  end

  sig { returns(T::Boolean) }
  def has_more_results
  end

  sig { params(value: T::Boolean).void }
  def has_more_results=(value)
  end

  sig { void }
  def clear_has_more_results
  end

  sig { returns(String) }
  def continuation_token
  end

  sig { params(value: String).void }
  def continuation_token=(value)
  end

  sig { void }
  def clear_continuation_token
  end

  sig { params(field: String).returns(T.untyped) }
  def [](field)
  end

  sig { params(field: String, value: T.untyped).void }
  def []=(field, value)
  end

  sig { returns(T::Hash[Symbol, T.untyped]) }
  def to_h
  end
end

module Services::Trustregistry::V1::RegistrationStatus
  self::CURRENT = T.let(0, Integer)
  self::EXPIRED = T.let(1, Integer)
  self::TERMINATED = T.let(2, Integer)
  self::REVOKED = T.let(3, Integer)
  self::NOT_FOUND = T.let(10, Integer)

  sig { params(value: Integer).returns(T.nilable(Symbol)) }
  def self.lookup(value)
  end

  sig { params(value: Symbol).returns(T.nilable(Integer)) }
  def self.resolve(value)
  end

  sig { returns(::Google::Protobuf::EnumDescriptor) }
  def self.descriptor
  end
end