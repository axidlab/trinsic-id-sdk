// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.20.3
// source: services/account/v1/account.proto

package account

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// AccountClient is the client API for Account service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type AccountClient interface {
	// Deprecated: Do not use.
	// Sign in to an already existing account
	SignIn(ctx context.Context, in *SignInRequest, opts ...grpc.CallOption) (*SignInResponse, error)
	// Begin login flow for specified account, creating one if it does not already exist
	Login(ctx context.Context, in *LoginRequest, opts ...grpc.CallOption) (*LoginResponse, error)
	// Finalize login flow with two-factor confirmation code
	LoginConfirm(ctx context.Context, in *LoginConfirmRequest, opts ...grpc.CallOption) (*LoginConfirmResponse, error)
	// Get account information
	Info(ctx context.Context, in *AccountInfoRequest, opts ...grpc.CallOption) (*AccountInfoResponse, error)
	// Authorize Ecosystem to receive webhook events
	AuthorizeWebhook(ctx context.Context, in *AuthorizeWebhookRequest, opts ...grpc.CallOption) (*AuthorizeWebhookResponse, error)
}

type accountClient struct {
	cc grpc.ClientConnInterface
}

func NewAccountClient(cc grpc.ClientConnInterface) AccountClient {
	return &accountClient{cc}
}

// Deprecated: Do not use.
func (c *accountClient) SignIn(ctx context.Context, in *SignInRequest, opts ...grpc.CallOption) (*SignInResponse, error) {
	out := new(SignInResponse)
	err := c.cc.Invoke(ctx, "/services.account.v1.Account/SignIn", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountClient) Login(ctx context.Context, in *LoginRequest, opts ...grpc.CallOption) (*LoginResponse, error) {
	out := new(LoginResponse)
	err := c.cc.Invoke(ctx, "/services.account.v1.Account/Login", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountClient) LoginConfirm(ctx context.Context, in *LoginConfirmRequest, opts ...grpc.CallOption) (*LoginConfirmResponse, error) {
	out := new(LoginConfirmResponse)
	err := c.cc.Invoke(ctx, "/services.account.v1.Account/LoginConfirm", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountClient) Info(ctx context.Context, in *AccountInfoRequest, opts ...grpc.CallOption) (*AccountInfoResponse, error) {
	out := new(AccountInfoResponse)
	err := c.cc.Invoke(ctx, "/services.account.v1.Account/Info", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountClient) AuthorizeWebhook(ctx context.Context, in *AuthorizeWebhookRequest, opts ...grpc.CallOption) (*AuthorizeWebhookResponse, error) {
	out := new(AuthorizeWebhookResponse)
	err := c.cc.Invoke(ctx, "/services.account.v1.Account/AuthorizeWebhook", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// AccountServer is the server API for Account service.
// All implementations must embed UnimplementedAccountServer
// for forward compatibility
type AccountServer interface {
	// Deprecated: Do not use.
	// Sign in to an already existing account
	SignIn(context.Context, *SignInRequest) (*SignInResponse, error)
	// Begin login flow for specified account, creating one if it does not already exist
	Login(context.Context, *LoginRequest) (*LoginResponse, error)
	// Finalize login flow with two-factor confirmation code
	LoginConfirm(context.Context, *LoginConfirmRequest) (*LoginConfirmResponse, error)
	// Get account information
	Info(context.Context, *AccountInfoRequest) (*AccountInfoResponse, error)
	// Authorize Ecosystem to receive webhook events
	AuthorizeWebhook(context.Context, *AuthorizeWebhookRequest) (*AuthorizeWebhookResponse, error)
	mustEmbedUnimplementedAccountServer()
}

// UnimplementedAccountServer must be embedded to have forward compatible implementations.
type UnimplementedAccountServer struct {
}

func (UnimplementedAccountServer) SignIn(context.Context, *SignInRequest) (*SignInResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method SignIn not implemented")
}
func (UnimplementedAccountServer) Login(context.Context, *LoginRequest) (*LoginResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Login not implemented")
}
func (UnimplementedAccountServer) LoginConfirm(context.Context, *LoginConfirmRequest) (*LoginConfirmResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method LoginConfirm not implemented")
}
func (UnimplementedAccountServer) Info(context.Context, *AccountInfoRequest) (*AccountInfoResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Info not implemented")
}
func (UnimplementedAccountServer) AuthorizeWebhook(context.Context, *AuthorizeWebhookRequest) (*AuthorizeWebhookResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method AuthorizeWebhook not implemented")
}
func (UnimplementedAccountServer) mustEmbedUnimplementedAccountServer() {}

// UnsafeAccountServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to AccountServer will
// result in compilation errors.
type UnsafeAccountServer interface {
	mustEmbedUnimplementedAccountServer()
}

func RegisterAccountServer(s grpc.ServiceRegistrar, srv AccountServer) {
	s.RegisterService(&Account_ServiceDesc, srv)
}

func _Account_SignIn_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(SignInRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountServer).SignIn(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/services.account.v1.Account/SignIn",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountServer).SignIn(ctx, req.(*SignInRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _Account_Login_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(LoginRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountServer).Login(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/services.account.v1.Account/Login",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountServer).Login(ctx, req.(*LoginRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _Account_LoginConfirm_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(LoginConfirmRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountServer).LoginConfirm(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/services.account.v1.Account/LoginConfirm",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountServer).LoginConfirm(ctx, req.(*LoginConfirmRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _Account_Info_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(AccountInfoRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountServer).Info(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/services.account.v1.Account/Info",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountServer).Info(ctx, req.(*AccountInfoRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _Account_AuthorizeWebhook_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(AuthorizeWebhookRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountServer).AuthorizeWebhook(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/services.account.v1.Account/AuthorizeWebhook",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountServer).AuthorizeWebhook(ctx, req.(*AuthorizeWebhookRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// Account_ServiceDesc is the grpc.ServiceDesc for Account service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var Account_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "services.account.v1.Account",
	HandlerType: (*AccountServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "SignIn",
			Handler:    _Account_SignIn_Handler,
		},
		{
			MethodName: "Login",
			Handler:    _Account_Login_Handler,
		},
		{
			MethodName: "LoginConfirm",
			Handler:    _Account_LoginConfirm_Handler,
		},
		{
			MethodName: "Info",
			Handler:    _Account_Info_Handler,
		},
		{
			MethodName: "AuthorizeWebhook",
			Handler:    _Account_AuthorizeWebhook_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "services/account/v1/account.proto",
}
