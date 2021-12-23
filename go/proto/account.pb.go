// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.15.7
// source: services/account/v1/account.proto

package sdk

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// Confirmation method type for two-factor workflows
type ConfirmationMethod int32

const (
	// No confirmation required
	ConfirmationMethod_None ConfirmationMethod = 0
	// Email confirmation required
	ConfirmationMethod_Email ConfirmationMethod = 1
	// SMS confirmation required
	ConfirmationMethod_Sms ConfirmationMethod = 2
	// Confirmation from a connected device is required
	ConfirmationMethod_ConnectedDevice ConfirmationMethod = 3
	// Indicates third-party method of confirmation is required
	ConfirmationMethod_Other ConfirmationMethod = 10
)

// Enum value maps for ConfirmationMethod.
var (
	ConfirmationMethod_name = map[int32]string{
		0:  "None",
		1:  "Email",
		2:  "Sms",
		3:  "ConnectedDevice",
		10: "Other",
	}
	ConfirmationMethod_value = map[string]int32{
		"None":            0,
		"Email":           1,
		"Sms":             2,
		"ConnectedDevice": 3,
		"Other":           10,
	}
)

func (x ConfirmationMethod) Enum() *ConfirmationMethod {
	p := new(ConfirmationMethod)
	*p = x
	return p
}

func (x ConfirmationMethod) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (ConfirmationMethod) Descriptor() protoreflect.EnumDescriptor {
	return file_services_account_v1_account_proto_enumTypes[0].Descriptor()
}

func (ConfirmationMethod) Type() protoreflect.EnumType {
	return &file_services_account_v1_account_proto_enumTypes[0]
}

func (x ConfirmationMethod) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use ConfirmationMethod.Descriptor instead.
func (ConfirmationMethod) EnumDescriptor() ([]byte, []int) {
	return file_services_account_v1_account_proto_rawDescGZIP(), []int{0}
}

// Request for creating new account
type SignInRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Account registration details
	Details *AccountDetails `protobuf:"bytes,1,opt,name=details,proto3" json:"details,omitempty"`
	// Invitation code associated with this registration
	// This field is optional.
	InvitationCode string `protobuf:"bytes,2,opt,name=invitation_code,json=invitationCode,proto3" json:"invitation_code,omitempty"`
}

func (x *SignInRequest) Reset() {
	*x = SignInRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_services_account_v1_account_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SignInRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SignInRequest) ProtoMessage() {}

func (x *SignInRequest) ProtoReflect() protoreflect.Message {
	mi := &file_services_account_v1_account_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SignInRequest.ProtoReflect.Descriptor instead.
func (*SignInRequest) Descriptor() ([]byte, []int) {
	return file_services_account_v1_account_proto_rawDescGZIP(), []int{0}
}

func (x *SignInRequest) GetDetails() *AccountDetails {
	if x != nil {
		return x.Details
	}
	return nil
}

func (x *SignInRequest) GetInvitationCode() string {
	if x != nil {
		return x.InvitationCode
	}
	return ""
}

// Account Registration Details
type AccountDetails struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Account name (optional)
	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	// Email account (required)
	Email string `protobuf:"bytes,2,opt,name=email,proto3" json:"email,omitempty"`
	// SMS number including country code (optional)
	Sms string `protobuf:"bytes,3,opt,name=sms,proto3" json:"sms,omitempty"`
}

func (x *AccountDetails) Reset() {
	*x = AccountDetails{}
	if protoimpl.UnsafeEnabled {
		mi := &file_services_account_v1_account_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *AccountDetails) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AccountDetails) ProtoMessage() {}

func (x *AccountDetails) ProtoReflect() protoreflect.Message {
	mi := &file_services_account_v1_account_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AccountDetails.ProtoReflect.Descriptor instead.
func (*AccountDetails) Descriptor() ([]byte, []int) {
	return file_services_account_v1_account_proto_rawDescGZIP(), []int{1}
}

func (x *AccountDetails) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *AccountDetails) GetEmail() string {
	if x != nil {
		return x.Email
	}
	return ""
}

func (x *AccountDetails) GetSms() string {
	if x != nil {
		return x.Sms
	}
	return ""
}

// Response for creating new account
// This object will indicate if a confirmation code
// was sent to one of the users two-factor methods
// like email, SMS, etc.
type SignInResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The status of the response
	Status ResponseStatus `protobuf:"varint,1,opt,name=status,proto3,enum=services.common.v1.ResponseStatus" json:"status,omitempty"`
	// Indicates if confirmation of account is required.
	// This settings is configured globally by the server administrator.
	ConfirmationMethod ConfirmationMethod `protobuf:"varint,3,opt,name=confirmation_method,json=confirmationMethod,proto3,enum=services.account.v1.ConfirmationMethod" json:"confirmation_method,omitempty"`
	// Contains authentication data for use with the current device.
	// This object must be stored in a secure place. It can also be
	// protected with a PIN, but this is optional.
	// See the docs at https://docs.trinsic.id for more information
	// on working with authentication data.
	Profile *AccountProfile `protobuf:"bytes,4,opt,name=profile,proto3" json:"profile,omitempty"`
}

func (x *SignInResponse) Reset() {
	*x = SignInResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_services_account_v1_account_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SignInResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SignInResponse) ProtoMessage() {}

func (x *SignInResponse) ProtoReflect() protoreflect.Message {
	mi := &file_services_account_v1_account_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SignInResponse.ProtoReflect.Descriptor instead.
func (*SignInResponse) Descriptor() ([]byte, []int) {
	return file_services_account_v1_account_proto_rawDescGZIP(), []int{2}
}

func (x *SignInResponse) GetStatus() ResponseStatus {
	if x != nil {
		return x.Status
	}
	return ResponseStatus_SUCCESS
}

func (x *SignInResponse) GetConfirmationMethod() ConfirmationMethod {
	if x != nil {
		return x.ConfirmationMethod
	}
	return ConfirmationMethod_None
}

func (x *SignInResponse) GetProfile() *AccountProfile {
	if x != nil {
		return x.Profile
	}
	return nil
}

// Device profile containing sensitive authentication data.
// This information should be stored securely
type AccountProfile struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The type of profile, used to differentiate between
	// protocol schemes or versions
	ProfileType string `protobuf:"bytes,1,opt,name=profile_type,json=profileType,proto3" json:"profile_type,omitempty"`
	// Auth data containg information about the current device access
	AuthData []byte `protobuf:"bytes,2,opt,name=auth_data,json=authData,proto3" json:"auth_data,omitempty"`
	// Secure token issued by server used to generate zero-knowledge proofs
	AuthToken []byte `protobuf:"bytes,3,opt,name=auth_token,json=authToken,proto3" json:"auth_token,omitempty"`
	// Token security information about the token.
	// If token protection is enabled, implementations must supply
	// protection secret before using the token for authentication.
	Protection *TokenProtection `protobuf:"bytes,4,opt,name=protection,proto3" json:"protection,omitempty"`
}

func (x *AccountProfile) Reset() {
	*x = AccountProfile{}
	if protoimpl.UnsafeEnabled {
		mi := &file_services_account_v1_account_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *AccountProfile) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AccountProfile) ProtoMessage() {}

func (x *AccountProfile) ProtoReflect() protoreflect.Message {
	mi := &file_services_account_v1_account_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AccountProfile.ProtoReflect.Descriptor instead.
func (*AccountProfile) Descriptor() ([]byte, []int) {
	return file_services_account_v1_account_proto_rawDescGZIP(), []int{3}
}

func (x *AccountProfile) GetProfileType() string {
	if x != nil {
		return x.ProfileType
	}
	return ""
}

func (x *AccountProfile) GetAuthData() []byte {
	if x != nil {
		return x.AuthData
	}
	return nil
}

func (x *AccountProfile) GetAuthToken() []byte {
	if x != nil {
		return x.AuthToken
	}
	return nil
}

func (x *AccountProfile) GetProtection() *TokenProtection {
	if x != nil {
		return x.Protection
	}
	return nil
}

// Token protection info
type TokenProtection struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Indicates if token is protected using a PIN,
	// security code, HSM secret, etc.
	Enabled bool `protobuf:"varint,1,opt,name=enabled,proto3" json:"enabled,omitempty"`
	// The method used to protect the token
	Method ConfirmationMethod `protobuf:"varint,2,opt,name=method,proto3,enum=services.account.v1.ConfirmationMethod" json:"method,omitempty"`
}

func (x *TokenProtection) Reset() {
	*x = TokenProtection{}
	if protoimpl.UnsafeEnabled {
		mi := &file_services_account_v1_account_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *TokenProtection) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*TokenProtection) ProtoMessage() {}

func (x *TokenProtection) ProtoReflect() protoreflect.Message {
	mi := &file_services_account_v1_account_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use TokenProtection.ProtoReflect.Descriptor instead.
func (*TokenProtection) Descriptor() ([]byte, []int) {
	return file_services_account_v1_account_proto_rawDescGZIP(), []int{4}
}

func (x *TokenProtection) GetEnabled() bool {
	if x != nil {
		return x.Enabled
	}
	return false
}

func (x *TokenProtection) GetMethod() ConfirmationMethod {
	if x != nil {
		return x.Method
	}
	return ConfirmationMethod_None
}

type InfoRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *InfoRequest) Reset() {
	*x = InfoRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_services_account_v1_account_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *InfoRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*InfoRequest) ProtoMessage() {}

func (x *InfoRequest) ProtoReflect() protoreflect.Message {
	mi := &file_services_account_v1_account_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use InfoRequest.ProtoReflect.Descriptor instead.
func (*InfoRequest) Descriptor() ([]byte, []int) {
	return file_services_account_v1_account_proto_rawDescGZIP(), []int{5}
}

type InfoResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The account details associated with
	// the calling request context
	Details *AccountDetails `protobuf:"bytes,1,opt,name=details,proto3" json:"details,omitempty"`
}

func (x *InfoResponse) Reset() {
	*x = InfoResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_services_account_v1_account_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *InfoResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*InfoResponse) ProtoMessage() {}

func (x *InfoResponse) ProtoReflect() protoreflect.Message {
	mi := &file_services_account_v1_account_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use InfoResponse.ProtoReflect.Descriptor instead.
func (*InfoResponse) Descriptor() ([]byte, []int) {
	return file_services_account_v1_account_proto_rawDescGZIP(), []int{6}
}

func (x *InfoResponse) GetDetails() *AccountDetails {
	if x != nil {
		return x.Details
	}
	return nil
}

type ListDevicesRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *ListDevicesRequest) Reset() {
	*x = ListDevicesRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_services_account_v1_account_proto_msgTypes[7]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListDevicesRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListDevicesRequest) ProtoMessage() {}

func (x *ListDevicesRequest) ProtoReflect() protoreflect.Message {
	mi := &file_services_account_v1_account_proto_msgTypes[7]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListDevicesRequest.ProtoReflect.Descriptor instead.
func (*ListDevicesRequest) Descriptor() ([]byte, []int) {
	return file_services_account_v1_account_proto_rawDescGZIP(), []int{7}
}

type ListDevicesResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *ListDevicesResponse) Reset() {
	*x = ListDevicesResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_services_account_v1_account_proto_msgTypes[8]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListDevicesResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListDevicesResponse) ProtoMessage() {}

func (x *ListDevicesResponse) ProtoReflect() protoreflect.Message {
	mi := &file_services_account_v1_account_proto_msgTypes[8]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListDevicesResponse.ProtoReflect.Descriptor instead.
func (*ListDevicesResponse) Descriptor() ([]byte, []int) {
	return file_services_account_v1_account_proto_rawDescGZIP(), []int{8}
}

type RevokeDeviceRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *RevokeDeviceRequest) Reset() {
	*x = RevokeDeviceRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_services_account_v1_account_proto_msgTypes[9]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *RevokeDeviceRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*RevokeDeviceRequest) ProtoMessage() {}

func (x *RevokeDeviceRequest) ProtoReflect() protoreflect.Message {
	mi := &file_services_account_v1_account_proto_msgTypes[9]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use RevokeDeviceRequest.ProtoReflect.Descriptor instead.
func (*RevokeDeviceRequest) Descriptor() ([]byte, []int) {
	return file_services_account_v1_account_proto_rawDescGZIP(), []int{9}
}

type RevokeDeviceResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *RevokeDeviceResponse) Reset() {
	*x = RevokeDeviceResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_services_account_v1_account_proto_msgTypes[10]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *RevokeDeviceResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*RevokeDeviceResponse) ProtoMessage() {}

func (x *RevokeDeviceResponse) ProtoReflect() protoreflect.Message {
	mi := &file_services_account_v1_account_proto_msgTypes[10]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use RevokeDeviceResponse.ProtoReflect.Descriptor instead.
func (*RevokeDeviceResponse) Descriptor() ([]byte, []int) {
	return file_services_account_v1_account_proto_rawDescGZIP(), []int{10}
}

var File_services_account_v1_account_proto protoreflect.FileDescriptor

var file_services_account_v1_account_proto_rawDesc = []byte{
	0x0a, 0x21, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2f, 0x61, 0x63, 0x63, 0x6f, 0x75,
	0x6e, 0x74, 0x2f, 0x76, 0x31, 0x2f, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x12, 0x13, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x61, 0x63,
	0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x76, 0x31, 0x1a, 0x1f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x73, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2f, 0x76, 0x31, 0x2f, 0x63, 0x6f, 0x6d,
	0x6d, 0x6f, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x77, 0x0a, 0x0d, 0x53, 0x69, 0x67,
	0x6e, 0x49, 0x6e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x3d, 0x0a, 0x07, 0x64, 0x65,
	0x74, 0x61, 0x69, 0x6c, 0x73, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x23, 0x2e, 0x73, 0x65,
	0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x76,
	0x31, 0x2e, 0x41, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x44, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x73,
	0x52, 0x07, 0x64, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x73, 0x12, 0x27, 0x0a, 0x0f, 0x69, 0x6e, 0x76,
	0x69, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x63, 0x6f, 0x64, 0x65, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x0e, 0x69, 0x6e, 0x76, 0x69, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x43, 0x6f,
	0x64, 0x65, 0x22, 0x4c, 0x0a, 0x0e, 0x41, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x44, 0x65, 0x74,
	0x61, 0x69, 0x6c, 0x73, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x14, 0x0a, 0x05, 0x65, 0x6d, 0x61, 0x69,
	0x6c, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x05, 0x65, 0x6d, 0x61, 0x69, 0x6c, 0x12, 0x10,
	0x0a, 0x03, 0x73, 0x6d, 0x73, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x03, 0x73, 0x6d, 0x73,
	0x22, 0xe5, 0x01, 0x0a, 0x0e, 0x53, 0x69, 0x67, 0x6e, 0x49, 0x6e, 0x52, 0x65, 0x73, 0x70, 0x6f,
	0x6e, 0x73, 0x65, 0x12, 0x3a, 0x0a, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x0e, 0x32, 0x22, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x63,
	0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x76, 0x31, 0x2e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73,
	0x65, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x52, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12,
	0x58, 0x0a, 0x13, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x72, 0x6d, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f,
	0x6d, 0x65, 0x74, 0x68, 0x6f, 0x64, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x27, 0x2e, 0x73,
	0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e,
	0x76, 0x31, 0x2e, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x72, 0x6d, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x4d,
	0x65, 0x74, 0x68, 0x6f, 0x64, 0x52, 0x12, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x72, 0x6d, 0x61, 0x74,
	0x69, 0x6f, 0x6e, 0x4d, 0x65, 0x74, 0x68, 0x6f, 0x64, 0x12, 0x3d, 0x0a, 0x07, 0x70, 0x72, 0x6f,
	0x66, 0x69, 0x6c, 0x65, 0x18, 0x04, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x23, 0x2e, 0x73, 0x65, 0x72,
	0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x76, 0x31,
	0x2e, 0x41, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x50, 0x72, 0x6f, 0x66, 0x69, 0x6c, 0x65, 0x52,
	0x07, 0x70, 0x72, 0x6f, 0x66, 0x69, 0x6c, 0x65, 0x22, 0xb5, 0x01, 0x0a, 0x0e, 0x41, 0x63, 0x63,
	0x6f, 0x75, 0x6e, 0x74, 0x50, 0x72, 0x6f, 0x66, 0x69, 0x6c, 0x65, 0x12, 0x21, 0x0a, 0x0c, 0x70,
	0x72, 0x6f, 0x66, 0x69, 0x6c, 0x65, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x0b, 0x70, 0x72, 0x6f, 0x66, 0x69, 0x6c, 0x65, 0x54, 0x79, 0x70, 0x65, 0x12, 0x1b,
	0x0a, 0x09, 0x61, 0x75, 0x74, 0x68, 0x5f, 0x64, 0x61, 0x74, 0x61, 0x18, 0x02, 0x20, 0x01, 0x28,
	0x0c, 0x52, 0x08, 0x61, 0x75, 0x74, 0x68, 0x44, 0x61, 0x74, 0x61, 0x12, 0x1d, 0x0a, 0x0a, 0x61,
	0x75, 0x74, 0x68, 0x5f, 0x74, 0x6f, 0x6b, 0x65, 0x6e, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0c, 0x52,
	0x09, 0x61, 0x75, 0x74, 0x68, 0x54, 0x6f, 0x6b, 0x65, 0x6e, 0x12, 0x44, 0x0a, 0x0a, 0x70, 0x72,
	0x6f, 0x74, 0x65, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x04, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x24,
	0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e,
	0x74, 0x2e, 0x76, 0x31, 0x2e, 0x54, 0x6f, 0x6b, 0x65, 0x6e, 0x50, 0x72, 0x6f, 0x74, 0x65, 0x63,
	0x74, 0x69, 0x6f, 0x6e, 0x52, 0x0a, 0x70, 0x72, 0x6f, 0x74, 0x65, 0x63, 0x74, 0x69, 0x6f, 0x6e,
	0x22, 0x6c, 0x0a, 0x0f, 0x54, 0x6f, 0x6b, 0x65, 0x6e, 0x50, 0x72, 0x6f, 0x74, 0x65, 0x63, 0x74,
	0x69, 0x6f, 0x6e, 0x12, 0x18, 0x0a, 0x07, 0x65, 0x6e, 0x61, 0x62, 0x6c, 0x65, 0x64, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x08, 0x52, 0x07, 0x65, 0x6e, 0x61, 0x62, 0x6c, 0x65, 0x64, 0x12, 0x3f, 0x0a,
	0x06, 0x6d, 0x65, 0x74, 0x68, 0x6f, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x27, 0x2e,
	0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74,
	0x2e, 0x76, 0x31, 0x2e, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x72, 0x6d, 0x61, 0x74, 0x69, 0x6f, 0x6e,
	0x4d, 0x65, 0x74, 0x68, 0x6f, 0x64, 0x52, 0x06, 0x6d, 0x65, 0x74, 0x68, 0x6f, 0x64, 0x22, 0x0d,
	0x0a, 0x0b, 0x49, 0x6e, 0x66, 0x6f, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x22, 0x4d, 0x0a,
	0x0c, 0x49, 0x6e, 0x66, 0x6f, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x3d, 0x0a,
	0x07, 0x64, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x73, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x23,
	0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e,
	0x74, 0x2e, 0x76, 0x31, 0x2e, 0x41, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x44, 0x65, 0x74, 0x61,
	0x69, 0x6c, 0x73, 0x52, 0x07, 0x64, 0x65, 0x74, 0x61, 0x69, 0x6c, 0x73, 0x22, 0x14, 0x0a, 0x12,
	0x4c, 0x69, 0x73, 0x74, 0x44, 0x65, 0x76, 0x69, 0x63, 0x65, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x22, 0x15, 0x0a, 0x13, 0x4c, 0x69, 0x73, 0x74, 0x44, 0x65, 0x76, 0x69, 0x63, 0x65,
	0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x15, 0x0a, 0x13, 0x52, 0x65, 0x76,
	0x6f, 0x6b, 0x65, 0x44, 0x65, 0x76, 0x69, 0x63, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x22, 0x16, 0x0a, 0x14, 0x52, 0x65, 0x76, 0x6f, 0x6b, 0x65, 0x44, 0x65, 0x76, 0x69, 0x63, 0x65,
	0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2a, 0x52, 0x0a, 0x12, 0x43, 0x6f, 0x6e, 0x66,
	0x69, 0x72, 0x6d, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x4d, 0x65, 0x74, 0x68, 0x6f, 0x64, 0x12, 0x08,
	0x0a, 0x04, 0x4e, 0x6f, 0x6e, 0x65, 0x10, 0x00, 0x12, 0x09, 0x0a, 0x05, 0x45, 0x6d, 0x61, 0x69,
	0x6c, 0x10, 0x01, 0x12, 0x07, 0x0a, 0x03, 0x53, 0x6d, 0x73, 0x10, 0x02, 0x12, 0x13, 0x0a, 0x0f,
	0x43, 0x6f, 0x6e, 0x6e, 0x65, 0x63, 0x74, 0x65, 0x64, 0x44, 0x65, 0x76, 0x69, 0x63, 0x65, 0x10,
	0x03, 0x12, 0x09, 0x0a, 0x05, 0x4f, 0x74, 0x68, 0x65, 0x72, 0x10, 0x0a, 0x32, 0xf0, 0x02, 0x0a,
	0x07, 0x41, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x12, 0x51, 0x0a, 0x06, 0x53, 0x69, 0x67, 0x6e,
	0x49, 0x6e, 0x12, 0x22, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x61, 0x63,
	0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x76, 0x31, 0x2e, 0x53, 0x69, 0x67, 0x6e, 0x49, 0x6e, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x23, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65,
	0x73, 0x2e, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x76, 0x31, 0x2e, 0x53, 0x69, 0x67,
	0x6e, 0x49, 0x6e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x4b, 0x0a, 0x04, 0x49,
	0x6e, 0x66, 0x6f, 0x12, 0x20, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x61,
	0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x76, 0x31, 0x2e, 0x49, 0x6e, 0x66, 0x6f, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x21, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73,
	0x2e, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x76, 0x31, 0x2e, 0x49, 0x6e, 0x66, 0x6f,
	0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x60, 0x0a, 0x0b, 0x4c, 0x69, 0x73, 0x74,
	0x44, 0x65, 0x76, 0x69, 0x63, 0x65, 0x73, 0x12, 0x27, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x73, 0x2e, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x76, 0x31, 0x2e, 0x4c, 0x69,
	0x73, 0x74, 0x44, 0x65, 0x76, 0x69, 0x63, 0x65, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x1a, 0x28, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x61, 0x63, 0x63, 0x6f,
	0x75, 0x6e, 0x74, 0x2e, 0x76, 0x31, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x44, 0x65, 0x76, 0x69, 0x63,
	0x65, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x63, 0x0a, 0x0c, 0x52, 0x65,
	0x76, 0x6f, 0x6b, 0x65, 0x44, 0x65, 0x76, 0x69, 0x63, 0x65, 0x12, 0x28, 0x2e, 0x73, 0x65, 0x72,
	0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x76, 0x31,
	0x2e, 0x52, 0x65, 0x76, 0x6f, 0x6b, 0x65, 0x44, 0x65, 0x76, 0x69, 0x63, 0x65, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x1a, 0x29, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e,
	0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x76, 0x31, 0x2e, 0x52, 0x65, 0x76, 0x6f, 0x6b,
	0x65, 0x44, 0x65, 0x76, 0x69, 0x63, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x42,
	0x56, 0x0a, 0x1b, 0x74, 0x72, 0x69, 0x6e, 0x73, 0x69, 0x63, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x73, 0x2e, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x76, 0x31, 0x5a, 0x19,
	0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x74, 0x72, 0x69, 0x6e, 0x73,
	0x69, 0x63, 0x2d, 0x69, 0x64, 0x2f, 0x73, 0x64, 0x6b, 0xaa, 0x02, 0x1b, 0x54, 0x72, 0x69, 0x6e,
	0x73, 0x69, 0x63, 0x2e, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x2e, 0x41, 0x63, 0x63,
	0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x56, 0x31, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_services_account_v1_account_proto_rawDescOnce sync.Once
	file_services_account_v1_account_proto_rawDescData = file_services_account_v1_account_proto_rawDesc
)

func file_services_account_v1_account_proto_rawDescGZIP() []byte {
	file_services_account_v1_account_proto_rawDescOnce.Do(func() {
		file_services_account_v1_account_proto_rawDescData = protoimpl.X.CompressGZIP(file_services_account_v1_account_proto_rawDescData)
	})
	return file_services_account_v1_account_proto_rawDescData
}

var file_services_account_v1_account_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_services_account_v1_account_proto_msgTypes = make([]protoimpl.MessageInfo, 11)
var file_services_account_v1_account_proto_goTypes = []interface{}{
	(ConfirmationMethod)(0),      // 0: services.account.v1.ConfirmationMethod
	(*SignInRequest)(nil),        // 1: services.account.v1.SignInRequest
	(*AccountDetails)(nil),       // 2: services.account.v1.AccountDetails
	(*SignInResponse)(nil),       // 3: services.account.v1.SignInResponse
	(*AccountProfile)(nil),       // 4: services.account.v1.AccountProfile
	(*TokenProtection)(nil),      // 5: services.account.v1.TokenProtection
	(*InfoRequest)(nil),          // 6: services.account.v1.InfoRequest
	(*InfoResponse)(nil),         // 7: services.account.v1.InfoResponse
	(*ListDevicesRequest)(nil),   // 8: services.account.v1.ListDevicesRequest
	(*ListDevicesResponse)(nil),  // 9: services.account.v1.ListDevicesResponse
	(*RevokeDeviceRequest)(nil),  // 10: services.account.v1.RevokeDeviceRequest
	(*RevokeDeviceResponse)(nil), // 11: services.account.v1.RevokeDeviceResponse
	(ResponseStatus)(0),          // 12: services.common.v1.ResponseStatus
}
var file_services_account_v1_account_proto_depIdxs = []int32{
	2,  // 0: services.account.v1.SignInRequest.details:type_name -> services.account.v1.AccountDetails
	12, // 1: services.account.v1.SignInResponse.status:type_name -> services.common.v1.ResponseStatus
	0,  // 2: services.account.v1.SignInResponse.confirmation_method:type_name -> services.account.v1.ConfirmationMethod
	4,  // 3: services.account.v1.SignInResponse.profile:type_name -> services.account.v1.AccountProfile
	5,  // 4: services.account.v1.AccountProfile.protection:type_name -> services.account.v1.TokenProtection
	0,  // 5: services.account.v1.TokenProtection.method:type_name -> services.account.v1.ConfirmationMethod
	2,  // 6: services.account.v1.InfoResponse.details:type_name -> services.account.v1.AccountDetails
	1,  // 7: services.account.v1.Account.SignIn:input_type -> services.account.v1.SignInRequest
	6,  // 8: services.account.v1.Account.Info:input_type -> services.account.v1.InfoRequest
	8,  // 9: services.account.v1.Account.ListDevices:input_type -> services.account.v1.ListDevicesRequest
	10, // 10: services.account.v1.Account.RevokeDevice:input_type -> services.account.v1.RevokeDeviceRequest
	3,  // 11: services.account.v1.Account.SignIn:output_type -> services.account.v1.SignInResponse
	7,  // 12: services.account.v1.Account.Info:output_type -> services.account.v1.InfoResponse
	9,  // 13: services.account.v1.Account.ListDevices:output_type -> services.account.v1.ListDevicesResponse
	11, // 14: services.account.v1.Account.RevokeDevice:output_type -> services.account.v1.RevokeDeviceResponse
	11, // [11:15] is the sub-list for method output_type
	7,  // [7:11] is the sub-list for method input_type
	7,  // [7:7] is the sub-list for extension type_name
	7,  // [7:7] is the sub-list for extension extendee
	0,  // [0:7] is the sub-list for field type_name
}

func init() { file_services_account_v1_account_proto_init() }
func file_services_account_v1_account_proto_init() {
	if File_services_account_v1_account_proto != nil {
		return
	}
	file_services_common_v1_common_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_services_account_v1_account_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SignInRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_services_account_v1_account_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*AccountDetails); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_services_account_v1_account_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SignInResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_services_account_v1_account_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*AccountProfile); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_services_account_v1_account_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*TokenProtection); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_services_account_v1_account_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*InfoRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_services_account_v1_account_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*InfoResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_services_account_v1_account_proto_msgTypes[7].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListDevicesRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_services_account_v1_account_proto_msgTypes[8].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListDevicesResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_services_account_v1_account_proto_msgTypes[9].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*RevokeDeviceRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_services_account_v1_account_proto_msgTypes[10].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*RevokeDeviceResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_services_account_v1_account_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   11,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_services_account_v1_account_proto_goTypes,
		DependencyIndexes: file_services_account_v1_account_proto_depIdxs,
		EnumInfos:         file_services_account_v1_account_proto_enumTypes,
		MessageInfos:      file_services_account_v1_account_proto_msgTypes,
	}.Build()
	File_services_account_v1_account_proto = out.File
	file_services_account_v1_account_proto_rawDesc = nil
	file_services_account_v1_account_proto_goTypes = nil
	file_services_account_v1_account_proto_depIdxs = nil
}