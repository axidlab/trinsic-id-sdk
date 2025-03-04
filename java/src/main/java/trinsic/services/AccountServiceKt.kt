package trinsic.services

import com.google.protobuf.ByteString
import com.google.protobuf.InvalidProtocolBufferException
import java.util.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import trinsic.okapi.DidException
import trinsic.okapi.Hashing
import trinsic.okapi.Oberon
import trinsic.okapi.security.v1.Security.BlindOberonTokenRequest
import trinsic.okapi.security.v1.Security.UnBlindOberonTokenRequest
import trinsic.sdk.options.v1.Options
import trinsic.services.account.v1.*

class AccountServiceKt(options: Options.ServiceOptions.Builder?) : ServiceBase(options) {
  var stub: AccountGrpcKt.AccountCoroutineStub = AccountGrpcKt.AccountCoroutineStub(this.channel)

  suspend fun signIn(): String {
    return signIn(SignInRequest.newBuilder().build())
  }

  suspend fun signIn(request: SignInRequest): String {
    var request2 = request
    if (request.ecosystemId.isBlank())
        request2 = SignInRequest.newBuilder(request).setEcosystemId("default").build()
    val authToken =
        Base64.getUrlEncoder().encodeToString(stub.signIn(request2).profile.toByteArray())
    withContext(Dispatchers.IO) { tokenProvider.save(authToken).get() }
    return authToken
  }

  companion object {
    @JvmStatic
    @Throws(InvalidProtocolBufferException::class, DidException::class)
    fun unprotect(base64Profile: String?, securityCode: String?): String {
      var profile =
          AccountProfile.newBuilder()
              .mergeFrom(Base64.getUrlDecoder().decode(base64Profile))
              .build()
      val request =
          UnBlindOberonTokenRequest.newBuilder()
              .setToken(profile.authToken)
              .addBlinding(ByteString.copyFromUtf8(securityCode))
              .build()
      val result = Oberon.unBlindToken(request)
      profile =
          AccountProfile.newBuilder(profile)
              .setAuthToken(result.token)
              .setProtection(
                  TokenProtection.newBuilder()
                      .setMethod(ConfirmationMethod.None)
                      .setEnabled(false)
                      .build())
              .build()
      return Base64.getUrlEncoder().encodeToString(profile.toByteArray())
    }

    @JvmStatic
    @Throws(InvalidProtocolBufferException::class, DidException::class)
    fun protect(base64Profile: String?, securityCode: String?): String {
      var profile =
          AccountProfile.newBuilder()
              .mergeFrom(Base64.getUrlDecoder().decode(base64Profile))
              .build()
      val request =
          BlindOberonTokenRequest.newBuilder()
              .setToken(profile.authToken)
              .addBlinding(ByteString.copyFromUtf8(securityCode))
              .build()
      val result = Oberon.blindToken(request)
      profile =
          AccountProfile.newBuilder(profile)
              .setAuthToken(result.token)
              .setProtection(
                  TokenProtection.newBuilder()
                      .setMethod(ConfirmationMethod.Other)
                      .setEnabled(true)
                      .build())
              .build()
      return Base64.getUrlEncoder().encodeToString(profile.toByteArray())
    }
  }

  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun login(request: LoginRequest): LoginResponse {
    val response = stub.login(request)
    val authToken = Base64.getUrlEncoder().encodeToString(response.profile.toByteArray())
    withContext(Dispatchers.IO) {
      if (!response.profile.protection.enabled) tokenProvider.save(authToken).get()
    }
    return response
  }

  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun loginConfirm(challenge: ByteString, authCode: String): String {
    val hashed =
        Hashing.blake3_hash(
                trinsic.okapi.hashing.v1.Hashing.Blake3HashRequest.newBuilder()
                    .setData(ByteString.copyFromUtf8(authCode))
                    .build())
            .digest

    val request =
        LoginConfirmRequest.newBuilder()
            .setChallenge(challenge)
            .setConfirmationCodeHashed(hashed)
            .build()

    val response = stub.loginConfirm(request)
    val authToken = Base64.getUrlEncoder().encodeToString(response.profile.toByteArray())

    withContext(Dispatchers.IO) { tokenProvider.save(authToken).get() }

    return authToken
  }

  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun loginAnonymous(ecosystemId: String = "default"): String {
    val response = this.login(LoginRequest.newBuilder().setEcosystemId(ecosystemId).build())

    val authToken = Base64.getUrlEncoder().encodeToString(response.profile.toByteArray())
    withContext(Dispatchers.IO) { tokenProvider.save(authToken).get() }
    return authToken
  }

  suspend fun getInfo(): AccountInfoResponse {
    val request = AccountInfoRequest.newBuilder().build()
    return withMetadata(stub, request).info(request)
  }

  // BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
  // target: /home/runner/work/sdk/sdk/java/src/main/java/trinsic/services/AccountServiceKt.kt

  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun info(): AccountInfoResponse {
    /** Get account information */
    val request = AccountInfoRequest.newBuilder().build()
    return withMetadata(stub, request).info(request)
  }
  @Throws(InvalidProtocolBufferException::class, DidException::class)
  suspend fun authorizeWebhook(request: AuthorizeWebhookRequest): AuthorizeWebhookResponse {
    /** Authorize Ecosystem to receive webhook events */
    return withMetadata(stub, request).authorizeWebhook(request)
  }
  // END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}
