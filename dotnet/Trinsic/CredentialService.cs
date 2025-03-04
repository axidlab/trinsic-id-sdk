using System;
using System.Threading.Tasks;
using Microsoft.Extensions.Options;
using Trinsic.Sdk.Options.V1;
using Trinsic.Services.VerifiableCredentials.Templates.V1;
using Trinsic.Services.VerifiableCredentials.V1;

namespace Trinsic;

public class CredentialService : ServiceBase
{
    public CredentialService(ServiceOptions options)
        : base(options) {
        Client = new(Channel);
    }

    public CredentialService() {
        Client = new(Channel);
    }

    internal CredentialService(ITokenProvider tokenProvider) : base(new(), tokenProvider) {
        Client = new(Channel);
    }

    internal CredentialService(ITokenProvider tokenProvider, IOptions<ServiceOptions> options)
        : base(options.Value, tokenProvider) {
        Client = new(Channel);
    }

    private VerifiableCredential.VerifiableCredentialClient Client { get; }

// BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
// target: /home/runner/work/sdk/sdk/dotnet/Trinsic/CredentialService.cs

	/// <summary>
    ///This endpoint will be removed around May 1, 2023
    ///  Sign and issue a verifiable credential from a submitted document.
    ///  The document must be a valid JSON-LD document.
    /// </summary>
    [Obsolete("This endpoint will be removed around May 1, 2023")]
    public IssueResponse Issue(IssueRequest request) {
        
        return Client.Issue(request, BuildMetadata(request));
    }
	
	/// <summary>
    ///This endpoint will be removed around May 1, 2023
    ///  Sign and issue a verifiable credential from a submitted document.
    ///  The document must be a valid JSON-LD document.
    /// </summary>
    [Obsolete("This endpoint will be removed around May 1, 2023")]
    public async Task<IssueResponse> IssueAsync(IssueRequest request) {
        
        return await Client.IssueAsync(request, await BuildMetadataAsync(request));
    }

	/// <summary>
    /// Sign and issue a verifiable credential from a pre-defined template.
    ///  This process will also add schema validation and
    ///  revocation registry values to the credential.
    /// </summary>
    
    public IssueFromTemplateResponse IssueFromTemplate(IssueFromTemplateRequest request) {
        
        return Client.IssueFromTemplate(request, BuildMetadata(request));
    }
	
	/// <summary>
    /// Sign and issue a verifiable credential from a pre-defined template.
    ///  This process will also add schema validation and
    ///  revocation registry values to the credential.
    /// </summary>
    
    public async Task<IssueFromTemplateResponse> IssueFromTemplateAsync(IssueFromTemplateRequest request) {
        
        return await Client.IssueFromTemplateAsync(request, await BuildMetadataAsync(request));
    }

	/// <summary>
    /// Check credential status in the revocation registry
    /// </summary>
    
    public CheckStatusResponse CheckStatus(CheckStatusRequest request) {
        
        return Client.CheckStatus(request, BuildMetadata(request));
    }
	
	/// <summary>
    /// Check credential status in the revocation registry
    /// </summary>
    
    public async Task<CheckStatusResponse> CheckStatusAsync(CheckStatusRequest request) {
        
        return await Client.CheckStatusAsync(request, await BuildMetadataAsync(request));
    }

	/// <summary>
    /// Update credential status by setting the revocation value
    /// </summary>
    
    public UpdateStatusResponse UpdateStatus(UpdateStatusRequest request) {
        
        return Client.UpdateStatus(request, BuildMetadata(request));
    }
	
	/// <summary>
    /// Update credential status by setting the revocation value
    /// </summary>
    
    public async Task<UpdateStatusResponse> UpdateStatusAsync(UpdateStatusRequest request) {
        
        return await Client.UpdateStatusAsync(request, await BuildMetadataAsync(request));
    }

	/// <summary>
    /// Create a proof from a signed document that is a valid
    ///  verifiable credential and contains a signature from which a proof can be derived.
    /// </summary>
    
    public CreateProofResponse CreateProof(CreateProofRequest request) {
        
        return Client.CreateProof(request, BuildMetadata(request));
    }
	
	/// <summary>
    /// Create a proof from a signed document that is a valid
    ///  verifiable credential and contains a signature from which a proof can be derived.
    /// </summary>
    
    public async Task<CreateProofResponse> CreateProofAsync(CreateProofRequest request) {
        
        return await Client.CreateProofAsync(request, await BuildMetadataAsync(request));
    }

	/// <summary>
    /// Verifies a proof by checking the signature value, and if possible schema validation,
    ///  revocation status, and issuer status against a trust registry
    /// </summary>
    
    public VerifyProofResponse VerifyProof(VerifyProofRequest request) {
        
        return Client.VerifyProof(request, BuildMetadata(request));
    }
	
	/// <summary>
    /// Verifies a proof by checking the signature value, and if possible schema validation,
    ///  revocation status, and issuer status against a trust registry
    /// </summary>
    
    public async Task<VerifyProofResponse> VerifyProofAsync(VerifyProofRequest request) {
        
        return await Client.VerifyProofAsync(request, await BuildMetadataAsync(request));
    }

	/// <summary>
    /// Sends a document directly to a user's email within the given ecosystem
    /// </summary>
    
    public SendResponse Send(SendRequest request) {
        
        return Client.Send(request, BuildMetadata(request));
    }
	
	/// <summary>
    /// Sends a document directly to a user's email within the given ecosystem
    /// </summary>
    
    public async Task<SendResponse> SendAsync(SendRequest request) {
        
        return await Client.SendAsync(request, await BuildMetadataAsync(request));
    }

// END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}