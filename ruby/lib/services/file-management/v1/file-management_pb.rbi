# Code generated by protoc-gen-rbi. DO NOT EDIT.
# source: services/file-management/v1/file-management.proto
# typed: strict

class Services::Filemanagement::V1::File
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Filemanagement::V1::File) }
  def self.decode(str)
  end

  sig { params(msg: Services::Filemanagement::V1::File).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Filemanagement::V1::File) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Filemanagement::V1::File, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      id: T.nilable(String),
      uploader_id: T.nilable(String),
      size: T.nilable(Integer),
      mime_type: T.nilable(String),
      uploaded: T.nilable(String),
      url: T.nilable(String)
    ).void
  end
  def initialize(
    id: "",
    uploader_id: "",
    size: 0,
    mime_type: "",
    uploaded: "",
    url: ""
  )
  end

  sig { returns(String) }
  def id
  end

  sig { params(value: String).void }
  def id=(value)
  end

  sig { void }
  def clear_id
  end

  sig { returns(String) }
  def uploader_id
  end

  sig { params(value: String).void }
  def uploader_id=(value)
  end

  sig { void }
  def clear_uploader_id
  end

  sig { returns(Integer) }
  def size
  end

  sig { params(value: Integer).void }
  def size=(value)
  end

  sig { void }
  def clear_size
  end

  sig { returns(String) }
  def mime_type
  end

  sig { params(value: String).void }
  def mime_type=(value)
  end

  sig { void }
  def clear_mime_type
  end

  sig { returns(String) }
  def uploaded
  end

  sig { params(value: String).void }
  def uploaded=(value)
  end

  sig { void }
  def clear_uploaded
  end

  sig { returns(String) }
  def url
  end

  sig { params(value: String).void }
  def url=(value)
  end

  sig { void }
  def clear_url
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

class Services::Filemanagement::V1::StorageStats
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Filemanagement::V1::StorageStats) }
  def self.decode(str)
  end

  sig { params(msg: Services::Filemanagement::V1::StorageStats).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Filemanagement::V1::StorageStats) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Filemanagement::V1::StorageStats, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      num_files: T.nilable(Integer),
      total_size: T.nilable(Integer)
    ).void
  end
  def initialize(
    num_files: 0,
    total_size: 0
  )
  end

  sig { returns(Integer) }
  def num_files
  end

  sig { params(value: Integer).void }
  def num_files=(value)
  end

  sig { void }
  def clear_num_files
  end

  sig { returns(Integer) }
  def total_size
  end

  sig { params(value: Integer).void }
  def total_size=(value)
  end

  sig { void }
  def clear_total_size
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

class Services::Filemanagement::V1::UploadFileRequest
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Filemanagement::V1::UploadFileRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Filemanagement::V1::UploadFileRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Filemanagement::V1::UploadFileRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Filemanagement::V1::UploadFileRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      contents: T.nilable(String),
      mime_type: T.nilable(String)
    ).void
  end
  def initialize(
    contents: "",
    mime_type: ""
  )
  end

  sig { returns(String) }
  def contents
  end

  sig { params(value: String).void }
  def contents=(value)
  end

  sig { void }
  def clear_contents
  end

  sig { returns(String) }
  def mime_type
  end

  sig { params(value: String).void }
  def mime_type=(value)
  end

  sig { void }
  def clear_mime_type
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

class Services::Filemanagement::V1::UploadFileResponse
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Filemanagement::V1::UploadFileResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Filemanagement::V1::UploadFileResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Filemanagement::V1::UploadFileResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Filemanagement::V1::UploadFileResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      uploaded_file: T.nilable(Services::Filemanagement::V1::File)
    ).void
  end
  def initialize(
    uploaded_file: nil
  )
  end

  sig { returns(T.nilable(Services::Filemanagement::V1::File)) }
  def uploaded_file
  end

  sig { params(value: T.nilable(Services::Filemanagement::V1::File)).void }
  def uploaded_file=(value)
  end

  sig { void }
  def clear_uploaded_file
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

class Services::Filemanagement::V1::GetFileRequest
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Filemanagement::V1::GetFileRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Filemanagement::V1::GetFileRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Filemanagement::V1::GetFileRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Filemanagement::V1::GetFileRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      id: T.nilable(String)
    ).void
  end
  def initialize(
    id: ""
  )
  end

  sig { returns(String) }
  def id
  end

  sig { params(value: String).void }
  def id=(value)
  end

  sig { void }
  def clear_id
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

class Services::Filemanagement::V1::GetFileResponse
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Filemanagement::V1::GetFileResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Filemanagement::V1::GetFileResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Filemanagement::V1::GetFileResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Filemanagement::V1::GetFileResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      file: T.nilable(Services::Filemanagement::V1::File)
    ).void
  end
  def initialize(
    file: nil
  )
  end

  sig { returns(T.nilable(Services::Filemanagement::V1::File)) }
  def file
  end

  sig { params(value: T.nilable(Services::Filemanagement::V1::File)).void }
  def file=(value)
  end

  sig { void }
  def clear_file
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

class Services::Filemanagement::V1::DeleteFileRequest
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Filemanagement::V1::DeleteFileRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Filemanagement::V1::DeleteFileRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Filemanagement::V1::DeleteFileRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Filemanagement::V1::DeleteFileRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      id: T.nilable(String)
    ).void
  end
  def initialize(
    id: ""
  )
  end

  sig { returns(String) }
  def id
  end

  sig { params(value: String).void }
  def id=(value)
  end

  sig { void }
  def clear_id
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

class Services::Filemanagement::V1::DeleteFileResponse
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Filemanagement::V1::DeleteFileResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Filemanagement::V1::DeleteFileResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Filemanagement::V1::DeleteFileResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Filemanagement::V1::DeleteFileResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig {void}
  def initialize; end

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

class Services::Filemanagement::V1::ListFilesRequest
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Filemanagement::V1::ListFilesRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Filemanagement::V1::ListFilesRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Filemanagement::V1::ListFilesRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Filemanagement::V1::ListFilesRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      query: T.nilable(String),
      continuation_token: T.nilable(String)
    ).void
  end
  def initialize(
    query: "",
    continuation_token: ""
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

class Services::Filemanagement::V1::ListFilesResponse
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Filemanagement::V1::ListFilesResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Filemanagement::V1::ListFilesResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Filemanagement::V1::ListFilesResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Filemanagement::V1::ListFilesResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      files: T.nilable(T::Array[T.nilable(Services::Filemanagement::V1::File)]),
      has_more_results: T.nilable(T::Boolean),
      continuation_token: T.nilable(String)
    ).void
  end
  def initialize(
    files: [],
    has_more_results: false,
    continuation_token: ""
  )
  end

  sig { returns(T::Array[T.nilable(Services::Filemanagement::V1::File)]) }
  def files
  end

  sig { params(value: ::Google::Protobuf::RepeatedField).void }
  def files=(value)
  end

  sig { void }
  def clear_files
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

class Services::Filemanagement::V1::GetStorageStatsRequest
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Filemanagement::V1::GetStorageStatsRequest) }
  def self.decode(str)
  end

  sig { params(msg: Services::Filemanagement::V1::GetStorageStatsRequest).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Filemanagement::V1::GetStorageStatsRequest) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Filemanagement::V1::GetStorageStatsRequest, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig {void}
  def initialize; end

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

class Services::Filemanagement::V1::GetStorageStatsResponse
  include ::Google::Protobuf
  include ::Google::Protobuf::MessageExts
  extend ::Google::Protobuf::MessageExts::ClassMethods

  sig { params(str: String).returns(Services::Filemanagement::V1::GetStorageStatsResponse) }
  def self.decode(str)
  end

  sig { params(msg: Services::Filemanagement::V1::GetStorageStatsResponse).returns(String) }
  def self.encode(msg)
  end

  sig { params(str: String, kw: T.untyped).returns(Services::Filemanagement::V1::GetStorageStatsResponse) }
  def self.decode_json(str, **kw)
  end

  sig { params(msg: Services::Filemanagement::V1::GetStorageStatsResponse, kw: T.untyped).returns(String) }
  def self.encode_json(msg, **kw)
  end

  sig { returns(::Google::Protobuf::Descriptor) }
  def self.descriptor
  end

  sig do
    params(
      stats: T.nilable(Services::Filemanagement::V1::StorageStats)
    ).void
  end
  def initialize(
    stats: nil
  )
  end

  sig { returns(T.nilable(Services::Filemanagement::V1::StorageStats)) }
  def stats
  end

  sig { params(value: T.nilable(Services::Filemanagement::V1::StorageStats)).void }
  def stats=(value)
  end

  sig { void }
  def clear_stats
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
