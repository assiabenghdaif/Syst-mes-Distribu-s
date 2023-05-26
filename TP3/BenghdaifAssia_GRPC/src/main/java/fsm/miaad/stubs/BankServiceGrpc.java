package fsm.miaad.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: bank.proto")
public final class BankServiceGrpc {

  private BankServiceGrpc() {}

  public static final String SERVICE_NAME = "BankService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<fsm.miaad.stubs.Bank.ConvertCurrencyRequest,
      fsm.miaad.stubs.Bank.ConvertCurrencyResponse> getConvertUnaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convert_unary",
      requestType = fsm.miaad.stubs.Bank.ConvertCurrencyRequest.class,
      responseType = fsm.miaad.stubs.Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<fsm.miaad.stubs.Bank.ConvertCurrencyRequest,
      fsm.miaad.stubs.Bank.ConvertCurrencyResponse> getConvertUnaryMethod() {
    io.grpc.MethodDescriptor<fsm.miaad.stubs.Bank.ConvertCurrencyRequest, fsm.miaad.stubs.Bank.ConvertCurrencyResponse> getConvertUnaryMethod;
    if ((getConvertUnaryMethod = BankServiceGrpc.getConvertUnaryMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getConvertUnaryMethod = BankServiceGrpc.getConvertUnaryMethod) == null) {
          BankServiceGrpc.getConvertUnaryMethod = getConvertUnaryMethod = 
              io.grpc.MethodDescriptor.<fsm.miaad.stubs.Bank.ConvertCurrencyRequest, fsm.miaad.stubs.Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "convert_unary"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.stubs.Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.stubs.Bank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("convert_unary"))
                  .build();
          }
        }
     }
     return getConvertUnaryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<fsm.miaad.stubs.Bank.ConvertCurrencyRequest,
      fsm.miaad.stubs.Bank.ConvertCurrencyResponse> getConvertServerSreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convert_Server_Sreaming",
      requestType = fsm.miaad.stubs.Bank.ConvertCurrencyRequest.class,
      responseType = fsm.miaad.stubs.Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<fsm.miaad.stubs.Bank.ConvertCurrencyRequest,
      fsm.miaad.stubs.Bank.ConvertCurrencyResponse> getConvertServerSreamingMethod() {
    io.grpc.MethodDescriptor<fsm.miaad.stubs.Bank.ConvertCurrencyRequest, fsm.miaad.stubs.Bank.ConvertCurrencyResponse> getConvertServerSreamingMethod;
    if ((getConvertServerSreamingMethod = BankServiceGrpc.getConvertServerSreamingMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getConvertServerSreamingMethod = BankServiceGrpc.getConvertServerSreamingMethod) == null) {
          BankServiceGrpc.getConvertServerSreamingMethod = getConvertServerSreamingMethod = 
              io.grpc.MethodDescriptor.<fsm.miaad.stubs.Bank.ConvertCurrencyRequest, fsm.miaad.stubs.Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "convert_Server_Sreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.stubs.Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.stubs.Bank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("convert_Server_Sreaming"))
                  .build();
          }
        }
     }
     return getConvertServerSreamingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<fsm.miaad.stubs.Bank.ConvertCurrencyRequest,
      fsm.miaad.stubs.Bank.ConvertCurrencyResponse> getConvertClientStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convert_Client_Streaming",
      requestType = fsm.miaad.stubs.Bank.ConvertCurrencyRequest.class,
      responseType = fsm.miaad.stubs.Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<fsm.miaad.stubs.Bank.ConvertCurrencyRequest,
      fsm.miaad.stubs.Bank.ConvertCurrencyResponse> getConvertClientStreamingMethod() {
    io.grpc.MethodDescriptor<fsm.miaad.stubs.Bank.ConvertCurrencyRequest, fsm.miaad.stubs.Bank.ConvertCurrencyResponse> getConvertClientStreamingMethod;
    if ((getConvertClientStreamingMethod = BankServiceGrpc.getConvertClientStreamingMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getConvertClientStreamingMethod = BankServiceGrpc.getConvertClientStreamingMethod) == null) {
          BankServiceGrpc.getConvertClientStreamingMethod = getConvertClientStreamingMethod = 
              io.grpc.MethodDescriptor.<fsm.miaad.stubs.Bank.ConvertCurrencyRequest, fsm.miaad.stubs.Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "convert_Client_Streaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.stubs.Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.stubs.Bank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("convert_Client_Streaming"))
                  .build();
          }
        }
     }
     return getConvertClientStreamingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<fsm.miaad.stubs.Bank.ConvertCurrencyRequest,
      fsm.miaad.stubs.Bank.ConvertCurrencyResponse> getConvertBiDirectionalStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convert_BiDirectional_Streaming",
      requestType = fsm.miaad.stubs.Bank.ConvertCurrencyRequest.class,
      responseType = fsm.miaad.stubs.Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<fsm.miaad.stubs.Bank.ConvertCurrencyRequest,
      fsm.miaad.stubs.Bank.ConvertCurrencyResponse> getConvertBiDirectionalStreamingMethod() {
    io.grpc.MethodDescriptor<fsm.miaad.stubs.Bank.ConvertCurrencyRequest, fsm.miaad.stubs.Bank.ConvertCurrencyResponse> getConvertBiDirectionalStreamingMethod;
    if ((getConvertBiDirectionalStreamingMethod = BankServiceGrpc.getConvertBiDirectionalStreamingMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getConvertBiDirectionalStreamingMethod = BankServiceGrpc.getConvertBiDirectionalStreamingMethod) == null) {
          BankServiceGrpc.getConvertBiDirectionalStreamingMethod = getConvertBiDirectionalStreamingMethod = 
              io.grpc.MethodDescriptor.<fsm.miaad.stubs.Bank.ConvertCurrencyRequest, fsm.miaad.stubs.Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "convert_BiDirectional_Streaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.stubs.Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.stubs.Bank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("convert_BiDirectional_Streaming"))
                  .build();
          }
        }
     }
     return getConvertBiDirectionalStreamingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BankServiceStub newStub(io.grpc.Channel channel) {
    return new BankServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BankServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BankServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BankServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BankServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BankServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *unary model
     * </pre>
     */
    public void convertUnary(fsm.miaad.stubs.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<fsm.miaad.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConvertUnaryMethod(), responseObserver);
    }

    /**
     * <pre>
     *server streaming model
     * </pre>
     */
    public void convertServerSreaming(fsm.miaad.stubs.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<fsm.miaad.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConvertServerSreamingMethod(), responseObserver);
    }

    /**
     * <pre>
     *client streaming model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<fsm.miaad.stubs.Bank.ConvertCurrencyRequest> convertClientStreaming(
        io.grpc.stub.StreamObserver<fsm.miaad.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getConvertClientStreamingMethod(), responseObserver);
    }

    /**
     * <pre>
     *BiDirectional Streaming Model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<fsm.miaad.stubs.Bank.ConvertCurrencyRequest> convertBiDirectionalStreaming(
        io.grpc.stub.StreamObserver<fsm.miaad.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getConvertBiDirectionalStreamingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConvertUnaryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                fsm.miaad.stubs.Bank.ConvertCurrencyRequest,
                fsm.miaad.stubs.Bank.ConvertCurrencyResponse>(
                  this, METHODID_CONVERT_UNARY)))
          .addMethod(
            getConvertServerSreamingMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                fsm.miaad.stubs.Bank.ConvertCurrencyRequest,
                fsm.miaad.stubs.Bank.ConvertCurrencyResponse>(
                  this, METHODID_CONVERT_SERVER_SREAMING)))
          .addMethod(
            getConvertClientStreamingMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                fsm.miaad.stubs.Bank.ConvertCurrencyRequest,
                fsm.miaad.stubs.Bank.ConvertCurrencyResponse>(
                  this, METHODID_CONVERT_CLIENT_STREAMING)))
          .addMethod(
            getConvertBiDirectionalStreamingMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                fsm.miaad.stubs.Bank.ConvertCurrencyRequest,
                fsm.miaad.stubs.Bank.ConvertCurrencyResponse>(
                  this, METHODID_CONVERT_BI_DIRECTIONAL_STREAMING)))
          .build();
    }
  }

  /**
   */
  public static final class BankServiceStub extends io.grpc.stub.AbstractStub<BankServiceStub> {
    private BankServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary model
     * </pre>
     */
    public void convertUnary(fsm.miaad.stubs.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<fsm.miaad.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConvertUnaryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *server streaming model
     * </pre>
     */
    public void convertServerSreaming(fsm.miaad.stubs.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<fsm.miaad.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getConvertServerSreamingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client streaming model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<fsm.miaad.stubs.Bank.ConvertCurrencyRequest> convertClientStreaming(
        io.grpc.stub.StreamObserver<fsm.miaad.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getConvertClientStreamingMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *BiDirectional Streaming Model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<fsm.miaad.stubs.Bank.ConvertCurrencyRequest> convertBiDirectionalStreaming(
        io.grpc.stub.StreamObserver<fsm.miaad.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getConvertBiDirectionalStreamingMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class BankServiceBlockingStub extends io.grpc.stub.AbstractStub<BankServiceBlockingStub> {
    private BankServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary model
     * </pre>
     */
    public fsm.miaad.stubs.Bank.ConvertCurrencyResponse convertUnary(fsm.miaad.stubs.Bank.ConvertCurrencyRequest request) {
      return blockingUnaryCall(
          getChannel(), getConvertUnaryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *server streaming model
     * </pre>
     */
    public java.util.Iterator<fsm.miaad.stubs.Bank.ConvertCurrencyResponse> convertServerSreaming(
        fsm.miaad.stubs.Bank.ConvertCurrencyRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getConvertServerSreamingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BankServiceFutureStub extends io.grpc.stub.AbstractStub<BankServiceFutureStub> {
    private BankServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary model
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<fsm.miaad.stubs.Bank.ConvertCurrencyResponse> convertUnary(
        fsm.miaad.stubs.Bank.ConvertCurrencyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConvertUnaryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONVERT_UNARY = 0;
  private static final int METHODID_CONVERT_SERVER_SREAMING = 1;
  private static final int METHODID_CONVERT_CLIENT_STREAMING = 2;
  private static final int METHODID_CONVERT_BI_DIRECTIONAL_STREAMING = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BankServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BankServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONVERT_UNARY:
          serviceImpl.convertUnary((fsm.miaad.stubs.Bank.ConvertCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<fsm.miaad.stubs.Bank.ConvertCurrencyResponse>) responseObserver);
          break;
        case METHODID_CONVERT_SERVER_SREAMING:
          serviceImpl.convertServerSreaming((fsm.miaad.stubs.Bank.ConvertCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<fsm.miaad.stubs.Bank.ConvertCurrencyResponse>) responseObserver);
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
        case METHODID_CONVERT_CLIENT_STREAMING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.convertClientStreaming(
              (io.grpc.stub.StreamObserver<fsm.miaad.stubs.Bank.ConvertCurrencyResponse>) responseObserver);
        case METHODID_CONVERT_BI_DIRECTIONAL_STREAMING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.convertBiDirectionalStreaming(
              (io.grpc.stub.StreamObserver<fsm.miaad.stubs.Bank.ConvertCurrencyResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BankServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return fsm.miaad.stubs.Bank.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BankService");
    }
  }

  private static final class BankServiceFileDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier {
    BankServiceFileDescriptorSupplier() {}
  }

  private static final class BankServiceMethodDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BankServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BankServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BankServiceFileDescriptorSupplier())
              .addMethod(getConvertUnaryMethod())
              .addMethod(getConvertServerSreamingMethod())
              .addMethod(getConvertClientStreamingMethod())
              .addMethod(getConvertBiDirectionalStreamingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
