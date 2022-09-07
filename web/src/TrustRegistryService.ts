import ServiceBase from "./ServiceBase";
import {
    AddFrameworkRequest,
    AddFrameworkResponse,
    FetchDataRequest,
    FetchDataResponse,
    GetMembershipStatusRequest,
    GetMembershipStatusResponse,
    RegisterMemberRequest,
    RegisterMemberResponse,
    RemoveFrameworkRequest,
    RemoveFrameworkResponse,
    SearchRegistryRequest,
    SearchRegistryResponse,
    ServiceOptions,
    TrustRegistryDefinition,
    UnregisterMemberRequest,
    UnregisterMemberResponse,
} from "./proto";

import type { Client as BrowserClient } from "nice-grpc-web";

export class TrustRegistryService extends ServiceBase {
    client: BrowserClient<typeof TrustRegistryDefinition>;

    constructor(options?: ServiceOptions) {
        super(options);

        this.client = this.createClient(TrustRegistryDefinition);
    }

    public async search(
        request: SearchRegistryRequest = SearchRegistryRequest.fromPartial({
            query: "SELECT * FROM c OFFSET 0 LIMIT 100",
        })
    ): Promise<SearchRegistryResponse> {
        return this.searchRegistry(request);
    }
    // BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
    // target: /home/runner/work/sdk/sdk/web/src/TrustRegistryService.ts

    /** Add a governance framework to the ecosystem */
    public async addFramework(
        request: AddFrameworkRequest
    ): Promise<AddFrameworkResponse> {
        return this.client.addFramework(request, {
            metadata: await this.buildMetadata(
                AddFrameworkRequest.encode(request).finish()
            ),
        });
    }
    /** Remove a governance framework from the ecosystem */
    public async removeFramework(
        request: RemoveFrameworkRequest
    ): Promise<RemoveFrameworkResponse> {
        return this.client.removeFramework(request, {
            metadata: await this.buildMetadata(
                RemoveFrameworkRequest.encode(request).finish()
            ),
        });
    }
    /** Search the ecosystem's governance frameworks */
    public async searchRegistry(
        request: SearchRegistryRequest
    ): Promise<SearchRegistryResponse> {
        return this.client.searchRegistry(request, {
            metadata: await this.buildMetadata(
                SearchRegistryRequest.encode(request).finish()
            ),
        });
    }
    /** Register an authoritative issuer for a credential schema */
    public async registerMember(
        request: RegisterMemberRequest
    ): Promise<RegisterMemberResponse> {
        return this.client.registerMember(request, {
            metadata: await this.buildMetadata(
                RegisterMemberRequest.encode(request).finish()
            ),
        });
    }
    /** Removes an authoritative issuer for a credential schema from the trust registry */
    public async unregisterMember(
        request: UnregisterMemberRequest
    ): Promise<UnregisterMemberResponse> {
        return this.client.unregisterMember(request, {
            metadata: await this.buildMetadata(
                UnregisterMemberRequest.encode(request).finish()
            ),
        });
    }
    /** Fetch the membership status of an issuer for a given credential schema in a trust registry */
    public async getMembershipStatus(
        request: GetMembershipStatusRequest
    ): Promise<GetMembershipStatusResponse> {
        return this.client.getMembershipStatus(request, {
            metadata: await this.buildMetadata(
                GetMembershipStatusRequest.encode(request).finish()
            ),
        });
    }
    // END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}
