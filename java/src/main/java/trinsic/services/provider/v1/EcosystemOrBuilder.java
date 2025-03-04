// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/provider/v1/provider.proto

package trinsic.services.provider.v1;

public interface EcosystemOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:services.provider.v1.Ecosystem)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * URN of the ecosystem
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * URN of the ecosystem
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Globally unique name for the ecosystem
   * </pre>
   *
   * <code>string name = 2;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Globally unique name for the ecosystem
   * </pre>
   *
   * <code>string name = 2;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Ecosystem description
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Ecosystem description
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * External URL associated with the organization or ecosystem entity
   * </pre>
   *
   * <code>string uri = 4 [deprecated = true];</code>
   *
   * @deprecated services.provider.v1.Ecosystem.uri is deprecated. See
   *     services/provider/v1/provider.proto;l=91
   * @return The uri.
   */
  @java.lang.Deprecated
  java.lang.String getUri();
  /**
   *
   *
   * <pre>
   * External URL associated with the organization or ecosystem entity
   * </pre>
   *
   * <code>string uri = 4 [deprecated = true];</code>
   *
   * @deprecated services.provider.v1.Ecosystem.uri is deprecated. See
   *     services/provider/v1/provider.proto;l=91
   * @return The bytes for uri.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * Configured webhooks, if any
   * </pre>
   *
   * <code>repeated .services.provider.v1.WebhookConfig webhooks = 5;</code>
   */
  java.util.List<trinsic.services.provider.v1.WebhookConfig> getWebhooksList();
  /**
   *
   *
   * <pre>
   * Configured webhooks, if any
   * </pre>
   *
   * <code>repeated .services.provider.v1.WebhookConfig webhooks = 5;</code>
   */
  trinsic.services.provider.v1.WebhookConfig getWebhooks(int index);
  /**
   *
   *
   * <pre>
   * Configured webhooks, if any
   * </pre>
   *
   * <code>repeated .services.provider.v1.WebhookConfig webhooks = 5;</code>
   */
  int getWebhooksCount();
  /**
   *
   *
   * <pre>
   * Configured webhooks, if any
   * </pre>
   *
   * <code>repeated .services.provider.v1.WebhookConfig webhooks = 5;</code>
   */
  java.util.List<? extends trinsic.services.provider.v1.WebhookConfigOrBuilder>
      getWebhooksOrBuilderList();
  /**
   *
   *
   * <pre>
   * Configured webhooks, if any
   * </pre>
   *
   * <code>repeated .services.provider.v1.WebhookConfig webhooks = 5;</code>
   */
  trinsic.services.provider.v1.WebhookConfigOrBuilder getWebhooksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Display details
   * </pre>
   *
   * <code>.services.provider.v1.EcosystemDisplay display = 6;</code>
   *
   * @return Whether the display field is set.
   */
  boolean hasDisplay();
  /**
   *
   *
   * <pre>
   * Display details
   * </pre>
   *
   * <code>.services.provider.v1.EcosystemDisplay display = 6;</code>
   *
   * @return The display.
   */
  trinsic.services.provider.v1.EcosystemDisplay getDisplay();
  /**
   *
   *
   * <pre>
   * Display details
   * </pre>
   *
   * <code>.services.provider.v1.EcosystemDisplay display = 6;</code>
   */
  trinsic.services.provider.v1.EcosystemDisplayOrBuilder getDisplayOrBuilder();

  /**
   *
   *
   * <pre>
   * Domain
   * </pre>
   *
   * <code>string domain = 7;</code>
   *
   * @return The domain.
   */
  java.lang.String getDomain();
  /**
   *
   *
   * <pre>
   * Domain
   * </pre>
   *
   * <code>string domain = 7;</code>
   *
   * @return The bytes for domain.
   */
  com.google.protobuf.ByteString getDomainBytes();
}
