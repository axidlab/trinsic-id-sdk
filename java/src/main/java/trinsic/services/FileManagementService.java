package trinsic.services;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.InvalidProtocolBufferException;
import trinsic.okapi.DidException;
import trinsic.sdk.options.v1.Options;
import trinsic.services.filemanagement.v1.*;

public class FileManagementService extends ServiceBase {
  private final FileManagementGrpc.FileManagementFutureStub stub;

  public FileManagementService() {
    this(null);
  }

  public FileManagementService(Options.ServiceOptions.Builder options) {
    super(options);

    this.stub = FileManagementGrpc.newFutureStub(this.getChannel());
  }
  // BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
  // target:
  // /home/runner/work/sdk/sdk/java/src/main/java/trinsic/services/FileManagementService.java

  /** This method is experimental Upload a file to Trinsic's CDN */
  @Deprecated(since = "This method is experimental")
  public ListenableFuture<UploadFileResponse> uploadFile(UploadFileRequest request)
      throws InvalidProtocolBufferException, DidException {

    return withMetadata(stub, request).uploadFile(request);
  }
  /** This method is experimental Fetch information about a file by its ID */
  @Deprecated(since = "This method is experimental")
  public ListenableFuture<GetFileResponse> getFile(GetFileRequest request)
      throws InvalidProtocolBufferException, DidException {

    return withMetadata(stub, request).getFile(request);
  }
  /** This method is experimental Delete a file by its ID */
  @Deprecated(since = "This method is experimental")
  public ListenableFuture<DeleteFileResponse> deleteFile(DeleteFileRequest request)
      throws InvalidProtocolBufferException, DidException {

    return withMetadata(stub, request).deleteFile(request);
  }
  /** This method is experimental List files the calling account has uploaded */
  @Deprecated(since = "This method is experimental")
  public ListenableFuture<ListFilesResponse> listFiles(ListFilesRequest request)
      throws InvalidProtocolBufferException, DidException {

    return withMetadata(stub, request).listFiles(request);
  }
  /** This method is experimental Get statistics about files uploaded by the calling account */
  @Deprecated(since = "This method is experimental")
  public ListenableFuture<GetStorageStatsResponse> getStorageStats(GetStorageStatsRequest request)
      throws InvalidProtocolBufferException, DidException {

    return withMetadata(stub, request).getStorageStats(request);
  }
  // END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}
