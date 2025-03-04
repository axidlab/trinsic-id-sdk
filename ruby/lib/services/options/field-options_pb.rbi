# Code generated by protoc-gen-rbi. DO NOT EDIT.
# source: services/options/field-options.proto
# typed: strict

class Services::Options::AnnotationOption
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Options::AnnotationOption) }
  def self.decode(str)
  end

  sig { params(msg: Services::Options::AnnotationOption).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Options::AnnotationOption) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Options::AnnotationOption, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      active: T.nilable(T::Boolean),
      message: T.nilable(String)
    ).void
  end
  def initialize(
    active: false,
    message: ""
  )
  end

  sig { returns(T::Boolean) }
  def active
  end

  sig { params(value: T::Boolean).void }
  def active=(value)
  end

  sig { void }
  def clear_active
  end

  sig { returns(String) }
  def message
  end

  sig { params(value: String).void }
  def message=(value)
  end

  sig { void }
  def clear_message
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

class Services::Options::SdkTemplateOption
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Options::SdkTemplateOption) }
  def self.decode(str)
  end

  sig { params(msg: Services::Options::SdkTemplateOption).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Options::SdkTemplateOption) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Options::SdkTemplateOption, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      anonymous: T.nilable(T::Boolean),
      ignore: T.nilable(T::Boolean),
      no_arguments: T.nilable(T::Boolean),
      experimental: T.nilable(Services::Options::AnnotationOption),
      deprecated: T.nilable(Services::Options::AnnotationOption)
    ).void
  end
  def initialize(
    anonymous: false,
    ignore: false,
    no_arguments: false,
    experimental: nil,
    deprecated: nil
  )
  end

  sig { returns(T::Boolean) }
  def anonymous
  end

  sig { params(value: T::Boolean).void }
  def anonymous=(value)
  end

  sig { void }
  def clear_anonymous
  end

  sig { returns(T::Boolean) }
  def ignore
  end

  sig { params(value: T::Boolean).void }
  def ignore=(value)
  end

  sig { void }
  def clear_ignore
  end

  sig { returns(T::Boolean) }
  def no_arguments
  end

  sig { params(value: T::Boolean).void }
  def no_arguments=(value)
  end

  sig { void }
  def clear_no_arguments
  end

  sig { returns(T.nilable(Services::Options::AnnotationOption)) }
  def experimental
  end

  sig { params(value: T.nilable(Services::Options::AnnotationOption)).void }
  def experimental=(value)
  end

  sig { void }
  def clear_experimental
  end

  sig { returns(T.nilable(Services::Options::AnnotationOption)) }
  def deprecated
  end

  sig { params(value: T.nilable(Services::Options::AnnotationOption)).void }
  def deprecated=(value)
  end

  sig { void }
  def clear_deprecated
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
