# Account Service

The Account Service allows you to create and sign in to accounts.

!!! question "Wallets vs Accounts"
    Wallets and accounts are related and often interchangeable -- each account has an associated wallet, and operations on a wallet are performed using an account's access token.

    Every account has exactly one wallet.

!!! info "Authentication Tokens"
    When you create or sign in to an account, the response is an authentication token string.

    This string is an encoded form of your account profile, as well as an access key to perform calls using the account.

    These are effectively API keys; they should be kept safe and never published.

---

## Login

Attempts the first step of the login process for the specified account, creating it if it does not already exist.

Trinsic will response with a `challenge`, and send an authentication code to the account's email address.

The authentication code must be passed along with `challenge` to [LoginConfirm](#login-confirm) to finalize the login.

{{ proto_sample_start() }}
    === "Trinsic CLI"
        ```bash
        trinsic account login --email "bob@example.com" --ecosystem "<ecosystem id or name>"
        ```

    === "TypeScript"
        <!--codeinclude-->
        ```typescript
        [LoginRequest](../../../web/test/AccountService.test.ts) inside_block:loginRequest
        ```
        <!--/codeinclude-->

    === "C#"
        <!--codeinclude-->
        ```csharp
        [LoginRequest](../../../dotnet/Tests/Tests.cs) inside_block:loginRequest
        ```
        <!--/codeinclude-->

    === "Python"
        <!--codeinclude-->
        ```python
        [LoginRequest](../../../python/samples/account_demo.py) inside_block:loginRequest
        ```
        <!--/codeinclude-->

    === "Go"
        <!--codeinclude-->
        ```golang
        [LoginRequest](../../../go/services/account_service_test.go) inside_block:loginRequest
        ```
        <!--/codeinclude-->

    === "Java"
        <!--codeinclude-->
        ```java
        [LoginRequest](../../../java/src/test/java/trinsic/AccountServiceTest.java) inside_block:loginRequest
        ```
        <!--/codeinclude-->

{{ proto_method_tabs("services.account.v1.Account.Login") }}

!!! tip "Anonymous Login"
    Anonymous accounts are accounts which are not tied to any email or phone number, and do not require any authentication. They are typically used for testing and prototypes.

    To create an anonymous account with an SDK, use the `TrinsicService.LoginAnonymous()` method.

    To create an anonymous account with the CLI, simply leave the `email` parameter unspecified.

---

## Login Confirm

Finalizes the login process.

You must pass `challenge` as it was received in response to [Login](#login), along with the confirmation code that was sent in an email.

Our SDK will take care of hashing the confirmation code for you.

{{ proto_sample_start() }}
    === "Trinsic CLI"
        ```bash
        trinsic account login --email "bob@example.com"
        ```

    === "TypeScript"
        <!--codeinclude-->
        ```typescript
        [LoginConfirm](../../../web/test/AccountService.test.ts) inside_block:loginConfirm
        ```
        <!--/codeinclude-->

    === "C#"
        <!--codeinclude-->
        ```csharp
        [LoginConfirm](../../../dotnet/Tests/Tests.cs) inside_block:loginConfirm
        ```
        <!--/codeinclude-->

    === "Python"
        <!--codeinclude-->
        ```python
        [LoginConfirm](../../../python/samples/account_demo.py) inside_block:loginConfirm
        ```
        <!--/codeinclude-->

    === "Go"
        <!--codeinclude-->
        ```golang
        [LoginConfirm](../../../go/services/account_service_test.go) inside_block:loginConfirm
        ```
        <!--/codeinclude-->

    === "Java"
        <!--codeinclude-->
        ```java
        [LoginConfirm](../../../java/src/test/java/trinsic/AccountServiceTest.java) inside_block:loginConfirm
        ```
        <!--/codeinclude-->

{{ proto_method_tabs("services.account.v1.Account.LoginConfirm") }}

---

## Get Account Info

Returns the account information (name, email address, phone number, etc.) used to create the currently-active account profile.

{{ proto_sample_start() }}
    === "Trinsic CLI"
        ```bash
        trinsic account info
        ```

    === "TypeScript"
        ```typescript
        const info = await accountService.info();
        ```

    === "C#"
        <!--codeinclude-->
        ```csharp
        [CreateProof](../../../dotnet/Tests/Tests.cs) inside_block:accountServiceGetInfo
        ```
        <!--/codeinclude-->

    === "Python"
        <!--codeinclude-->
        ```python
        [Insert Item Wallet](../../../python/tests/test_trinsic_services.py) inside_block:accountServiceGetInfo
        ```
        <!--/codeinclude-->

    === "Go"
        <!--codeinclude-->
        ```golang
        [CreateEcosystem](../../../go/services/account_service_test.go) inside_block:getInfo
        ```
        <!--/codeinclude-->

    === "Java"
        <!--codeinclude-->
        ```java
        [CreateEcosystem](../../../java/src/test/java/trinsic/AccountServiceTest.java) inside_block:getInfo
        ```
        <!--/codeinclude-->

{{ proto_method_tabs("services.account.v1.Account.Info") }}

!!! note
    This call returns the information associated with the authentication token used to create the request; therefore, it is not possible to pass a different authentication token to this call. Otherwise, Trinsic's [zero-knowledge proof](/learn/platform/security) authentication scheme would be violated.

    When using the CLI, this will return information for the account most recently logged in to.

    When using the SDK, this will return information for the authentication token stored in the `AccountService` instance's `ServiceOptions.AuthToken` field, which will be the account most recently logged in to, unless you have manually set this value yourself.

---

## Authorize Webhook

Authorizes the ecosystem provider to receive webhooks pertaining to this wallet.

{{ proto_sample_start() }}
    === "Trinsic CLI"
        ```bash
        trinsic account authorize-webhook --events "*"
        ```

    === "TypeScript"
        <!--codeinclude-->
        ```typescript
        [AuthorizeWebhook](../../../web/test/AccountService.test.ts) inside_block:authorizeWebhook
        ```
        <!--/codeinclude-->

    === "C#"
        <!--codeinclude-->
        ```csharp
        [AuthorizeWebhook](../../../dotnet/Tests/Tests.cs) inside_block:authorizeWebhook
        ```
        <!--/codeinclude-->

    === "Python"
        <!--codeinclude-->
        ```python
        [AuthorizeWebhook](../../../python/samples/account_demo.py) inside_block:authorizeWebhook
        ```
        <!--/codeinclude-->

    === "Go"
        <!--codeinclude-->
        ```golang
        [AuthorizeWebhook](../../../go/services/account_service_test.go) inside_block:authorizeWebhook
        ```
        <!--/codeinclude-->

    === "Java"
        <!--codeinclude-->
        ```java
        [AuthorizeWebhook](../../../java/src/test/java/trinsic/AccountServiceTest.java) inside_block:authorizeWebhook
        ```
        <!--/codeinclude-->

{{ proto_method_tabs("services.account.v1.Account.AuthorizeWebhook") }}

---

## Protect Account Profile
!!! danger "Deprecated Sign-in Flow"
    This section is related to the the deprecated [SignIn](#deprecated-sign-in) endpoint; the new [Login](#login) flow does not require
    the use of `Protect` and `Unprotect`.

Protects the specified account profile with a security code. It is not possible to execute this call using the CLI.

=== "TypeScript"
    ```typescript
    const protectedProfile = await accountService.protect(accountProfile, "1234");
    ```

=== "C#"
    <!--codeinclude-->
    ```csharp
    [CreateProof](../../../dotnet/Tests/Tests.cs) inside_block:protectUnprotectProfile
    ```
    <!--/codeinclude-->

=== "Python"
    <!--codeinclude-->
    ```python
    [Insert Item Wallet](../../../python/tests/test_trinsic_services.py) inside_block:protectUnprotectProfile
    ```
    <!--/codeinclude-->

=== "Go"
    <!--codeinclude-->
    ```golang
    [CreateEcosystem](../../../go/services/account_service_test.go) inside_block:protectUnprotectProfile
    ```
    <!--/codeinclude-->

=== "Java"
    <!--codeinclude-->
    ```java
    [CreateEcosystem](../../../java/src/test/java/trinsic/AccountServiceTest.java) inside_block:protectUnprotectProfile
    ```
    <!--/codeinclude-->

!!! info
    In this context, "protection" refers to a cryptographic operation on the authorization token for an account.

    _Protecting_ an account profile with code `c` returns a new access token which is unusable until it is _unprotected_ with the same code `c`. It is not possible to reverse the protection process without the original protection code.

    You will receive a protected account profile from Trinsic if you attempt to sign in to an account via email, SMS, or any other method which requires authentication. Trinsic will send a security code to the email or phone number associated with the account, which can be used to unprotect the account profile.

    Specifically, Trinsic is using Oberon to handle access tokens; protection and unprotection is handled using the blinding/unblinding features of Oberon.

---

## Unprotect Account Profile
!!! danger "Deprecated Sign-in Flow"
    This section is related to the the deprecated [SignIn](#deprecated-sign-in) endpoint; the new [Login](#login) flow does not require
    the use of `Protect` and `Unprotect`.

Unprotects the specified account profile using the given code. It is not possible to execute this call using the CLI.

The profile must have been previously protected using the same code that is being used to unprotect it. Profiles can be protected using any arbitrary code via the [Protect](#protect-account-profile) method.

Most commonly, this method is used on a protected profile received from the [Sign In](#sign-in) method. The code to unprotect it will have been sent to the account owner via email or SMS.

=== "TypeScript"
    ```typescript
    const accountProfile = await accountService.unprotect(protectedProfile, "1234");
    ```

=== "C#"
    <!--codeinclude-->
    ```csharp
    [CreateProof](../../../dotnet/Tests/Tests.cs) inside_block:protectUnprotectProfile
    ```
    <!--/codeinclude-->

=== "Python"
    <!--codeinclude-->
    ```python
    [Insert Item Wallet](../../../python/tests/test_trinsic_services.py) inside_block:protectUnprotectProfile
    ```
    <!--/codeinclude-->

=== "Go"
    <!--codeinclude-->
    ```golang
    [CreateEcosystem](../../../go/services/account_service_test.go) inside_block:protectUnprotectProfile
    ```
    <!--/codeinclude-->

=== "Java"
    <!--codeinclude-->
    ```java
    [CreateEcosystem](../../../java/src/test/java/trinsic/AccountServiceTest.java) inside_block:protectUnprotectProfile
    ```
    <!--/codeinclude-->


---

## \[Deprecated\] Sign In

!!! danger "Deprecated"
    This endpoint is deprecated, and will be removed in the near future.

    Please use [Login](#login) and [LoginConfirm](#login-confirm).

Sign in to an existing account, or create a new one.

If no account details are passed to this method, an anonymous account will be created.

{{ proto_sample_start() }}
    === "Trinsic CLI"
        ```bash
        trinsic account login --email <PROFILE_EMAIL> --name <PROFILE_NAME>
        ```

    === "TypeScript"
        ```typescript
        const allison = (await accountService.signIn()).getProfile();
        ```

    === "C#"
        <!--codeinclude-->
        ```csharp
        [CreateProof](../../../dotnet/Tests/Tests.cs) inside_block:accountServiceSignIn
        ```
        <!--/codeinclude-->

    === "Python"
        <!--codeinclude-->
        ```python
        [Insert Item Wallet](../../../python/tests/test_trinsic_services.py) inside_block:accountServiceSignIn
        ```
        <!--/codeinclude-->

    === "Go"
        <!--codeinclude-->
        ```golang
        [CreateEcosystem](../../../go/services/account_service_test.go) inside_block:accountServiceSignIn
        ```
        <!--/codeinclude-->

    === "Java"
        <!--codeinclude-->
        ```java
        [CreateEcosystem](../../../java/src/test/java/trinsic/AccountServiceTest.java) inside_block:accountServiceSignIn
        ```
        <!--/codeinclude-->

{{ proto_method_tabs("services.account.v1.Account.SignIn") }}

This operation, if successful, returns an authentication token string.

!!! warning "Protected Authentication Tokens"
    If you are attempting to login to a non-anonymous account (by specifying an email address or phone number), the authentication token returned will be _protected_, and cannot be used until it has been unprotected.

    Trinsic will have sent a security code to the account's email address or phone number; this security code must be used with the [Unprotect](#unprotect-account-profile) call to receive a usable authentication token.

    In the future, we will provide an SDK call to determine if an authentication token is protected.
