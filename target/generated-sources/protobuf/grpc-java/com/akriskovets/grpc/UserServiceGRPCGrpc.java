package com.akriskovets.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.0)",
    comments = "Source: UserServiceGRPC.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGRPCGrpc {

  private UserServiceGRPCGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.akriskovets.grpc.UserServiceGRPC";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.akriskovets.grpc.UserServiceGRPCOuterClass.UserRequest,
      com.akriskovets.grpc.UserServiceGRPCOuterClass.UserResponse> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUser",
      requestType = com.akriskovets.grpc.UserServiceGRPCOuterClass.UserRequest.class,
      responseType = com.akriskovets.grpc.UserServiceGRPCOuterClass.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akriskovets.grpc.UserServiceGRPCOuterClass.UserRequest,
      com.akriskovets.grpc.UserServiceGRPCOuterClass.UserResponse> getGetUserMethod() {
    io.grpc.MethodDescriptor<com.akriskovets.grpc.UserServiceGRPCOuterClass.UserRequest, com.akriskovets.grpc.UserServiceGRPCOuterClass.UserResponse> getGetUserMethod;
    if ((getGetUserMethod = UserServiceGRPCGrpc.getGetUserMethod) == null) {
      synchronized (UserServiceGRPCGrpc.class) {
        if ((getGetUserMethod = UserServiceGRPCGrpc.getGetUserMethod) == null) {
          UserServiceGRPCGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<com.akriskovets.grpc.UserServiceGRPCOuterClass.UserRequest, com.akriskovets.grpc.UserServiceGRPCOuterClass.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akriskovets.grpc.UserServiceGRPCOuterClass.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akriskovets.grpc.UserServiceGRPCOuterClass.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceGRPCMethodDescriptorSupplier("getUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceGRPCStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceGRPCStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceGRPCStub>() {
        @java.lang.Override
        public UserServiceGRPCStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceGRPCStub(channel, callOptions);
        }
      };
    return UserServiceGRPCStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceGRPCBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceGRPCBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceGRPCBlockingStub>() {
        @java.lang.Override
        public UserServiceGRPCBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceGRPCBlockingStub(channel, callOptions);
        }
      };
    return UserServiceGRPCBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceGRPCFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceGRPCFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceGRPCFutureStub>() {
        @java.lang.Override
        public UserServiceGRPCFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceGRPCFutureStub(channel, callOptions);
        }
      };
    return UserServiceGRPCFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getUser(com.akriskovets.grpc.UserServiceGRPCOuterClass.UserRequest request,
        io.grpc.stub.StreamObserver<com.akriskovets.grpc.UserServiceGRPCOuterClass.UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UserServiceGRPC.
   */
  public static abstract class UserServiceGRPCImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserServiceGRPCGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UserServiceGRPC.
   */
  public static final class UserServiceGRPCStub
      extends io.grpc.stub.AbstractAsyncStub<UserServiceGRPCStub> {
    private UserServiceGRPCStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceGRPCStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceGRPCStub(channel, callOptions);
    }

    /**
     */
    public void getUser(com.akriskovets.grpc.UserServiceGRPCOuterClass.UserRequest request,
        io.grpc.stub.StreamObserver<com.akriskovets.grpc.UserServiceGRPCOuterClass.UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UserServiceGRPC.
   */
  public static final class UserServiceGRPCBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UserServiceGRPCBlockingStub> {
    private UserServiceGRPCBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceGRPCBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceGRPCBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.akriskovets.grpc.UserServiceGRPCOuterClass.UserResponse getUser(com.akriskovets.grpc.UserServiceGRPCOuterClass.UserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UserServiceGRPC.
   */
  public static final class UserServiceGRPCFutureStub
      extends io.grpc.stub.AbstractFutureStub<UserServiceGRPCFutureStub> {
    private UserServiceGRPCFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceGRPCFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceGRPCFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akriskovets.grpc.UserServiceGRPCOuterClass.UserResponse> getUser(
        com.akriskovets.grpc.UserServiceGRPCOuterClass.UserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER:
          serviceImpl.getUser((com.akriskovets.grpc.UserServiceGRPCOuterClass.UserRequest) request,
              (io.grpc.stub.StreamObserver<com.akriskovets.grpc.UserServiceGRPCOuterClass.UserResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akriskovets.grpc.UserServiceGRPCOuterClass.UserRequest,
              com.akriskovets.grpc.UserServiceGRPCOuterClass.UserResponse>(
                service, METHODID_GET_USER)))
        .build();
  }

  private static abstract class UserServiceGRPCBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceGRPCBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.akriskovets.grpc.UserServiceGRPCOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserServiceGRPC");
    }
  }

  private static final class UserServiceGRPCFileDescriptorSupplier
      extends UserServiceGRPCBaseDescriptorSupplier {
    UserServiceGRPCFileDescriptorSupplier() {}
  }

  private static final class UserServiceGRPCMethodDescriptorSupplier
      extends UserServiceGRPCBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UserServiceGRPCMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserServiceGRPCGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceGRPCFileDescriptorSupplier())
              .addMethod(getGetUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
