package trinsic.services;

import static trinsic.TrinsicUtilities.getSdkVersion;
import static trinsic.TrinsicUtilities.getTrinsicServiceOptions;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.Metadata;
import io.grpc.stub.MetadataUtils;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import trinsic.TrinsicUtilities;
import trinsic.okapi.DidException;
import trinsic.okapi.OkapiMetadata;
import trinsic.sdk.options.v1.Options;
import trinsic.security.ISecurityProvider;
import trinsic.security.OberonSecurityProvider;
import trinsic.services.account.v1.AccountProfile;
import trinsic.storage.ITokenProvider;
import trinsic.storage.MemoryTokenProvider;

public abstract class ServiceBase {
  private final ISecurityProvider securityProvider = new OberonSecurityProvider();
  final ITokenProvider tokenProvider = new MemoryTokenProvider();
  private final Channel channel;
  private Options.ServiceOptions.Builder options;

  protected ServiceBase(Options.ServiceOptions.Builder options) {
    this.options = options;
    if (this.options == null) this.options = getTrinsicServiceOptions();
    this.channel = TrinsicUtilities.getChannel(this.options.build());
  }

  public void shutdown() {
    try {
      if (channel instanceof ManagedChannel) {
        ((ManagedChannel) this.channel).shutdownNow().awaitTermination(5000, TimeUnit.MILLISECONDS);
      }
    } catch (InterruptedException ignored) {
      // We'd rather exit than worry about it not shut down.
    }
  }

  private static void putMetadata(Metadata m, String key, String value) {
    m.put(Metadata.Key.of(key, Metadata.ASCII_STRING_MARSHALLER), value);
  }

  public Metadata buildMetadata(Message request)
      throws InvalidProtocolBufferException, DidException {
    var metadata = new Metadata();
    putMetadata(metadata, "TrinsicSDKLanguage", "java");
    putMetadata(metadata, "TrinsicSDKVersion", getSdkVersion());
    putMetadata(metadata, "TrinsicOkapiVersion", OkapiMetadata.getMetadata().getVersion());
    if (request != null) {
      if (this.options == null || this.options.getAuthToken().isEmpty())
        throw new IllegalArgumentException(
            "Cannot call authenticated endpoint: profile must be set");

      putMetadata(
          metadata, "authorization", securityProvider.GetAuthHeader(this.getProfile(), request));
    }
    return metadata;
  }

  private AccountProfile getProfile() throws InvalidProtocolBufferException {
    return AccountProfile.newBuilder()
        .mergeFrom(Base64.getUrlDecoder().decode(this.options.getAuthToken()))
        .build();
  }

  public void setAuthToken(String base64ProfileToken) {
    this.options.setAuthToken(base64ProfileToken);
  }

  public Options.ServiceOptions.Builder getOptionsBuilder() {
    return this.options;
  }

  public void setOptionsBuilder(Options.ServiceOptions.Builder builder) {
    this.options = builder;
  }

  public Channel getChannel() {
    return this.channel;
  }

  protected <T extends io.grpc.stub.AbstractStub<T>> T withMetadata(T stub, Message message)
      throws InvalidProtocolBufferException, DidException {
    return stub.withInterceptors(
        MetadataUtils.newAttachHeadersInterceptor(this.buildMetadata(message)));
  }
}
