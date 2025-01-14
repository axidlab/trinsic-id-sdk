# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: services/trust-registry/v1/trust-registry.proto
# plugin: python-betterproto
from dataclasses import dataclass
from typing import (
    TYPE_CHECKING,
    AsyncIterator,
    Dict,
    Optional,
)

import betterproto
import grpclib
from betterproto.grpc.grpclib_server import ServiceBase


if TYPE_CHECKING:
    from betterproto.grpc.grpclib_client import MetadataLike
    from grpclib.metadata import Deadline


class RegistrationStatus(betterproto.Enum):
    CURRENT = 0
    EXPIRED = 1
    TERMINATED = 2
    REVOKED = 3
    NOT_FOUND = 10


@dataclass(eq=False, repr=False)
class AddFrameworkRequest(betterproto.Message):
    """
    Request to register a new ecosystem governance framework in the current
    ecosystem
    """

    governance_framework_uri: str = betterproto.string_field(1)
    """URI of governance framework organization"""

    name: str = betterproto.string_field(2)
    """Name of governance framework organization"""

    description: str = betterproto.string_field(3)
    """Description of governance framework"""


@dataclass(eq=False, repr=False)
class AddFrameworkResponse(betterproto.Message):
    """Response to `AddFrameworkRequest`"""

    id: str = betterproto.string_field(1)
    """Unique framework identifier"""

    governing_authority: str = betterproto.string_field(2)
    """DID URI of Trinsic account which created the governance framework"""

    trust_registry: str = betterproto.string_field(3)
    """URN of trust registry for governance framework"""


@dataclass(eq=False, repr=False)
class RemoveFrameworkRequest(betterproto.Message):
    """Request to remove a governance framework from the current ecosystem"""

    id: str = betterproto.string_field(1)
    """ID of governance framework to remove"""


@dataclass(eq=False, repr=False)
class RemoveFrameworkResponse(betterproto.Message):
    """Response to `RemoveFrameworkRequest`"""

    pass


@dataclass(eq=False, repr=False)
class SearchRegistryRequest(betterproto.Message):
    """Request to search all governance frameworks within ecosystem"""

    query: str = betterproto.string_field(1)
    """
    SQL query to execute against frameworks. Example: `SELECT c from c where
    c.type == 'GovernanceFramework'`
    """

    continuation_token: str = betterproto.string_field(2)
    """
    Token to fetch next set of results, from previous `SearchRegistryResponse`
    """


@dataclass(eq=False, repr=False)
class SearchRegistryResponse(betterproto.Message):
    """Response to `SearchRegistryRequest`"""

    items_json: str = betterproto.string_field(1)
    """JSON string containing array of resultant objects"""

    has_more: bool = betterproto.bool_field(2)
    """Whether more data is available to fetch for query"""

    continuation_token: str = betterproto.string_field(4)
    """Token to fetch next set of results via `SearchRegistryRequest`"""


@dataclass(eq=False, repr=False)
class GovernanceFramework(betterproto.Message):
    """Ecosystem Governance Framework"""

    governance_framework_uri: str = betterproto.string_field(1)
    """URI of governance framework organization"""

    trust_registry_uri: str = betterproto.string_field(2)
    """URI of trust registry associated with governance framework"""

    description: str = betterproto.string_field(3)
    """Description of governance framework"""


@dataclass(eq=False, repr=False)
class RegisterMemberRequest(betterproto.Message):
    """
    Request to register a member as a valid issuer of a specific credential
    schema. Only one of `did_uri`, `wallet_id`, or `email` may be specified.
    """

    did_uri: str = betterproto.string_field(1, group="member")
    """DID URI of member to register"""

    wallet_id: str = betterproto.string_field(3, group="member")
    """Trinsic Wallet ID of member to register"""

    email: str = betterproto.string_field(4, group="member")
    """
    Email address of member to register. Must be associated with an existing
    Trinsic account.
    """

    schema_uri: str = betterproto.string_field(10)
    """URI of credential schema to register member as authorized issuer of"""

    valid_from_utc: int = betterproto.uint64_field(11)
    """
    Unix Timestamp member is valid from. Member will not be considered valid
    before this timestamp.
    """

    valid_until_utc: int = betterproto.uint64_field(12)
    """
    Unix Timestamp member is valid until. Member will not be considered valid
    after this timestamp.
    """

    framework_id: str = betterproto.string_field(30)
    """ID of the governance framework that member is being added to"""


@dataclass(eq=False, repr=False)
class RegisterMemberResponse(betterproto.Message):
    """Response to `RegisterMemberRequest`"""

    pass


@dataclass(eq=False, repr=False)
class UnregisterMemberRequest(betterproto.Message):
    """
    Request to unregister a member as a valid issuer of a specific credential
    schema. Only one of `did_uri`, `wallet_id`, or `email` may be specified.
    """

    did_uri: str = betterproto.string_field(1, group="member")
    """DID URI of member to unregister"""

    wallet_id: str = betterproto.string_field(3, group="member")
    """Trinsic Wallet ID of member to unregister"""

    email: str = betterproto.string_field(4, group="member")
    """
    Email address of member to unregister. Must be associated with an existing
    Trinsic account.
    """

    schema_uri: str = betterproto.string_field(10)
    """
    URI of credential schema to unregister member as authorized issuer of
    """

    framework_id: str = betterproto.string_field(20)
    """ID of the governance framework that member is being removed from"""


@dataclass(eq=False, repr=False)
class UnregisterMemberResponse(betterproto.Message):
    """Response to `UnregisterMemberRequest`"""

    pass


@dataclass(eq=False, repr=False)
class GetMembershipStatusRequest(betterproto.Message):
    """
    Request to fetch membership status in governance framework for a specific
    credential schema.
    """

    framework_id: str = betterproto.string_field(1)
    """
    The ID of the ecosystem governance framework. This ID may be found in the
    'trustRegistry' field in the verifiable credential model
    """

    did_uri: str = betterproto.string_field(2)
    """DID URI of member"""

    schema_uri: str = betterproto.string_field(4)
    """URI of credential schema associated with membership"""


@dataclass(eq=False, repr=False)
class GetMembershipStatusResponse(betterproto.Message):
    """Response to `GetMembershipStatusRequest`"""

    status: "RegistrationStatus" = betterproto.enum_field(1)
    """Status of member for given credential schema"""


@dataclass(eq=False, repr=False)
class FetchDataRequest(betterproto.Message):
    """Not implemented."""

    governance_framework_uri: str = betterproto.string_field(1)
    query: str = betterproto.string_field(2)


@dataclass(eq=False, repr=False)
class FetchDataResponse(betterproto.Message):
    """Not implemented."""

    response_json: str = betterproto.string_field(1)
    has_more_results: bool = betterproto.bool_field(2)
    continuation_token: str = betterproto.string_field(3)


class TrustRegistryStub(betterproto.ServiceStub):
    async def add_framework(
        self,
        add_framework_request: "AddFrameworkRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> "AddFrameworkResponse":
        return await self._unary_unary(
            "/services.trustregistry.v1.TrustRegistry/AddFramework",
            add_framework_request,
            AddFrameworkResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )

    async def remove_framework(
        self,
        remove_framework_request: "RemoveFrameworkRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> "RemoveFrameworkResponse":
        return await self._unary_unary(
            "/services.trustregistry.v1.TrustRegistry/RemoveFramework",
            remove_framework_request,
            RemoveFrameworkResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )

    async def search_registry(
        self,
        search_registry_request: "SearchRegistryRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> "SearchRegistryResponse":
        return await self._unary_unary(
            "/services.trustregistry.v1.TrustRegistry/SearchRegistry",
            search_registry_request,
            SearchRegistryResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )

    async def register_member(
        self,
        register_member_request: "RegisterMemberRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> "RegisterMemberResponse":
        return await self._unary_unary(
            "/services.trustregistry.v1.TrustRegistry/RegisterMember",
            register_member_request,
            RegisterMemberResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )

    async def unregister_member(
        self,
        unregister_member_request: "UnregisterMemberRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> "UnregisterMemberResponse":
        return await self._unary_unary(
            "/services.trustregistry.v1.TrustRegistry/UnregisterMember",
            unregister_member_request,
            UnregisterMemberResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )

    async def get_membership_status(
        self,
        get_membership_status_request: "GetMembershipStatusRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> "GetMembershipStatusResponse":
        return await self._unary_unary(
            "/services.trustregistry.v1.TrustRegistry/GetMembershipStatus",
            get_membership_status_request,
            GetMembershipStatusResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )

    async def fetch_data(
        self,
        fetch_data_request: "FetchDataRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> AsyncIterator["FetchDataResponse"]:
        async for response in self._unary_stream(
            "/services.trustregistry.v1.TrustRegistry/FetchData",
            fetch_data_request,
            FetchDataResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        ):
            yield response


class TrustRegistryBase(ServiceBase):
    async def add_framework(
        self, add_framework_request: "AddFrameworkRequest"
    ) -> "AddFrameworkResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def remove_framework(
        self, remove_framework_request: "RemoveFrameworkRequest"
    ) -> "RemoveFrameworkResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def search_registry(
        self, search_registry_request: "SearchRegistryRequest"
    ) -> "SearchRegistryResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def register_member(
        self, register_member_request: "RegisterMemberRequest"
    ) -> "RegisterMemberResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def unregister_member(
        self, unregister_member_request: "UnregisterMemberRequest"
    ) -> "UnregisterMemberResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def get_membership_status(
        self, get_membership_status_request: "GetMembershipStatusRequest"
    ) -> "GetMembershipStatusResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def fetch_data(
        self, fetch_data_request: "FetchDataRequest"
    ) -> AsyncIterator["FetchDataResponse"]:
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def __rpc_add_framework(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()
        response = await self.add_framework(request)
        await stream.send_message(response)

    async def __rpc_remove_framework(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()
        response = await self.remove_framework(request)
        await stream.send_message(response)

    async def __rpc_search_registry(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()
        response = await self.search_registry(request)
        await stream.send_message(response)

    async def __rpc_register_member(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()
        response = await self.register_member(request)
        await stream.send_message(response)

    async def __rpc_unregister_member(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()
        response = await self.unregister_member(request)
        await stream.send_message(response)

    async def __rpc_get_membership_status(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()
        response = await self.get_membership_status(request)
        await stream.send_message(response)

    async def __rpc_fetch_data(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()
        await self._call_rpc_handler_server_stream(
            self.fetch_data,
            stream,
            request,
        )

    def __mapping__(self) -> Dict[str, grpclib.const.Handler]:
        return {
            "/services.trustregistry.v1.TrustRegistry/AddFramework": grpclib.const.Handler(
                self.__rpc_add_framework,
                grpclib.const.Cardinality.UNARY_UNARY,
                AddFrameworkRequest,
                AddFrameworkResponse,
            ),
            "/services.trustregistry.v1.TrustRegistry/RemoveFramework": grpclib.const.Handler(
                self.__rpc_remove_framework,
                grpclib.const.Cardinality.UNARY_UNARY,
                RemoveFrameworkRequest,
                RemoveFrameworkResponse,
            ),
            "/services.trustregistry.v1.TrustRegistry/SearchRegistry": grpclib.const.Handler(
                self.__rpc_search_registry,
                grpclib.const.Cardinality.UNARY_UNARY,
                SearchRegistryRequest,
                SearchRegistryResponse,
            ),
            "/services.trustregistry.v1.TrustRegistry/RegisterMember": grpclib.const.Handler(
                self.__rpc_register_member,
                grpclib.const.Cardinality.UNARY_UNARY,
                RegisterMemberRequest,
                RegisterMemberResponse,
            ),
            "/services.trustregistry.v1.TrustRegistry/UnregisterMember": grpclib.const.Handler(
                self.__rpc_unregister_member,
                grpclib.const.Cardinality.UNARY_UNARY,
                UnregisterMemberRequest,
                UnregisterMemberResponse,
            ),
            "/services.trustregistry.v1.TrustRegistry/GetMembershipStatus": grpclib.const.Handler(
                self.__rpc_get_membership_status,
                grpclib.const.Cardinality.UNARY_UNARY,
                GetMembershipStatusRequest,
                GetMembershipStatusResponse,
            ),
            "/services.trustregistry.v1.TrustRegistry/FetchData": grpclib.const.Handler(
                self.__rpc_fetch_data,
                grpclib.const.Cardinality.UNARY_STREAM,
                FetchDataRequest,
                FetchDataResponse,
            ),
        }
