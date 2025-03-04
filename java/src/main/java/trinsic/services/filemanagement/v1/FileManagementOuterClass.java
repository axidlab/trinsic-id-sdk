// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/file-management/v1/file-management.proto

package trinsic.services.filemanagement.v1;

public final class FileManagementOuterClass {
  private FileManagementOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_filemanagement_v1_File_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_filemanagement_v1_File_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_filemanagement_v1_StorageStats_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_filemanagement_v1_StorageStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_filemanagement_v1_UploadFileRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_filemanagement_v1_UploadFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_filemanagement_v1_UploadFileResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_filemanagement_v1_UploadFileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_filemanagement_v1_GetFileRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_filemanagement_v1_GetFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_filemanagement_v1_GetFileResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_filemanagement_v1_GetFileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_filemanagement_v1_DeleteFileRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_filemanagement_v1_DeleteFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_filemanagement_v1_DeleteFileResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_filemanagement_v1_DeleteFileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_filemanagement_v1_ListFilesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_filemanagement_v1_ListFilesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_filemanagement_v1_ListFilesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_filemanagement_v1_ListFilesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_filemanagement_v1_GetStorageStatsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_filemanagement_v1_GetStorageStatsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_services_filemanagement_v1_GetStorageStatsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_filemanagement_v1_GetStorageStatsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "1services/file-management/v1/file-manag"
          + "ement.proto\022\032services.filemanagement.v1\032$services/options/field-options.proto\"g\n"
          + "\004File\022\n\n"
          + "\002id\030\001 \001(\t\022\023\n"
          + "\013uploader_id\030\002 \001(\t\022\014\n"
          + "\004size\030\003 \001(\r"
          + "\022\021\n"
          + "\tmime_type\030\004 \001(\t\022\020\n"
          + "\010uploaded\030\005 \001(\t\022\013\n"
          + "\003url\030\006 \001(\t\"5\n"
          + "\014StorageStats\022\021\n"
          + "\tnum_files\030\001 \001(\r"
          + "\022\022\n\n"
          + "total_size\030\002 \001(\004\"8\n"
          + "\021UploadFileRequest\022\020\n"
          + "\010contents\030\001 \001(\014\022\021\n"
          + "\tmime_type\030\002 \001(\t\"M\n"
          + "\022UploadFileResponse\0227\n"
          + "\r"
          + "uploaded_file\030\001 \001(\0132 .services.filemanagement.v1.File\"\034\n"
          + "\016GetFileRequest\022\n\n"
          + "\002id\030\001 \001(\t\"A\n"
          + "\017GetFileResponse\022.\n"
          + "\004file\030\001 \001(\0132 .services.filemanagement.v1.File\"\037\n"
          + "\021DeleteFileRequest\022\n\n"
          + "\002id\030\001 \001(\t\"\024\n"
          + "\022DeleteFileResponse\"C\n"
          + "\020ListFilesRequest\022\r\n"
          + "\005query\030\001 \001(\t\022 \n"
          + "\022continuation_token\030\002 \001(\tB\004\200\246\035\001\"z\n"
          + "\021ListFilesResponse\022/\n"
          + "\005files\030\001 \003(\0132 .services.filemanagement.v1.File\022\030\n"
          + "\020has_more_results\030\002 \001(\010\022\032\n"
          + "\022continuation_token\030\003 \001(\t\"\030\n"
          + "\026GetStorageStatsRequest\"R\n"
          + "\027GetStorageStatsResponse\0227\n"
          + "\005stats\030\001 \001(\0132(.services.filemanagement.v1.StorageStats2\347\004\n"
          + "\016FileManagement\022u\n\n"
          + "UploadFile\022-.services.filemanagement.v1.UploadFileRequest\032..services"
          + ".filemanagement.v1.UploadFileResponse\"\010\212\246\035\004\"\002\010\001\022l\n"
          + "\007GetFile\022*.services.filemanage"
          + "ment.v1.GetFileRequest\032+.services.filemanagement.v1.GetFileResponse\"\010\212\246\035\004\"\002\010\001\022u\n"
          + "\n"
          + "DeleteFile\022-.services.filemanagement.v1"
          + ".DeleteFileRequest\032..services.filemanagement.v1.DeleteFileResponse\"\010\212\246\035\004\"\002\010\001\022r\n"
          + "\tListFiles\022,.services.filemanagement.v1.L"
          + "istFilesRequest\032-.services.filemanagement.v1.ListFilesResponse\"\010\212\246\035\004\"\002\010\001\022\204\001\n"
          + "\017GetStorageStats\0222.services.filemanagement.v"
          + "1.GetStorageStatsRequest\0323.services.file"
          + "management.v1.GetStorageStatsResponse\"\010\212\246\035\004\"\002\010\001Bv\n"
          + "\"trinsic.services.filemanagement.v1P\001Z)services/filemanagement/v1/file"
          + "management\252\002\"Trinsic.Services.FileManagement.V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              trinsic.services.protobuf.options.FieldOptions.getDescriptor(),
            });
    internal_static_services_filemanagement_v1_File_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_services_filemanagement_v1_File_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_filemanagement_v1_File_descriptor,
            new java.lang.String[] {
              "Id", "UploaderId", "Size", "MimeType", "Uploaded", "Url",
            });
    internal_static_services_filemanagement_v1_StorageStats_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_services_filemanagement_v1_StorageStats_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_filemanagement_v1_StorageStats_descriptor,
            new java.lang.String[] {
              "NumFiles", "TotalSize",
            });
    internal_static_services_filemanagement_v1_UploadFileRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_services_filemanagement_v1_UploadFileRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_filemanagement_v1_UploadFileRequest_descriptor,
            new java.lang.String[] {
              "Contents", "MimeType",
            });
    internal_static_services_filemanagement_v1_UploadFileResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_services_filemanagement_v1_UploadFileResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_filemanagement_v1_UploadFileResponse_descriptor,
            new java.lang.String[] {
              "UploadedFile",
            });
    internal_static_services_filemanagement_v1_GetFileRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_services_filemanagement_v1_GetFileRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_filemanagement_v1_GetFileRequest_descriptor,
            new java.lang.String[] {
              "Id",
            });
    internal_static_services_filemanagement_v1_GetFileResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_services_filemanagement_v1_GetFileResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_filemanagement_v1_GetFileResponse_descriptor,
            new java.lang.String[] {
              "File",
            });
    internal_static_services_filemanagement_v1_DeleteFileRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_services_filemanagement_v1_DeleteFileRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_filemanagement_v1_DeleteFileRequest_descriptor,
            new java.lang.String[] {
              "Id",
            });
    internal_static_services_filemanagement_v1_DeleteFileResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_services_filemanagement_v1_DeleteFileResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_filemanagement_v1_DeleteFileResponse_descriptor,
            new java.lang.String[] {});
    internal_static_services_filemanagement_v1_ListFilesRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_services_filemanagement_v1_ListFilesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_filemanagement_v1_ListFilesRequest_descriptor,
            new java.lang.String[] {
              "Query", "ContinuationToken",
            });
    internal_static_services_filemanagement_v1_ListFilesResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_services_filemanagement_v1_ListFilesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_filemanagement_v1_ListFilesResponse_descriptor,
            new java.lang.String[] {
              "Files", "HasMoreResults", "ContinuationToken",
            });
    internal_static_services_filemanagement_v1_GetStorageStatsRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_services_filemanagement_v1_GetStorageStatsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_filemanagement_v1_GetStorageStatsRequest_descriptor,
            new java.lang.String[] {});
    internal_static_services_filemanagement_v1_GetStorageStatsResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_services_filemanagement_v1_GetStorageStatsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_services_filemanagement_v1_GetStorageStatsResponse_descriptor,
            new java.lang.String[] {
              "Stats",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(trinsic.services.protobuf.options.FieldOptions.optional);
    registry.add(trinsic.services.protobuf.options.FieldOptions.sdkTemplateOption);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    trinsic.services.protobuf.options.FieldOptions.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
