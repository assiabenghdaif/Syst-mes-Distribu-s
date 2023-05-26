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
    comments = "Source: chat.proto")
public final class ChatServiceGrpc {

  private ChatServiceGrpc() {}

  public static final String SERVICE_NAME = "ChatService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<fsm.miaad.stubs.Chat.ChatCurrencyRequest,
      fsm.miaad.stubs.Chat.ChatCurrencyResponse> getChatBiDirectionalStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "chat_BiDirectional_Streaming",
      requestType = fsm.miaad.stubs.Chat.ChatCurrencyRequest.class,
      responseType = fsm.miaad.stubs.Chat.ChatCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<fsm.miaad.stubs.Chat.ChatCurrencyRequest,
      fsm.miaad.stubs.Chat.ChatCurrencyResponse> getChatBiDirectionalStreamingMethod() {
    io.grpc.MethodDescriptor<fsm.miaad.stubs.Chat.ChatCurrencyRequest, fsm.miaad.stubs.Chat.ChatCurrencyResponse> getChatBiDirectionalStreamingMethod;
    if ((getChatBiDirectionalStreamingMethod = ChatServiceGrpc.getChatBiDirectionalStreamingMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getChatBiDirectionalStreamingMethod = ChatServiceGrpc.getChatBiDirectionalStreamingMethod) == null) {
          ChatServiceGrpc.getChatBiDirectionalStreamingMethod = getChatBiDirectionalStreamingMethod = 
              io.grpc.MethodDescriptor.<fsm.miaad.stubs.Chat.ChatCurrencyRequest, fsm.miaad.stubs.Chat.ChatCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ChatService", "chat_BiDirectional_Streaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.stubs.Chat.ChatCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.stubs.Chat.ChatCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChatServiceMethodDescriptorSupplier("chat_BiDirectional_Streaming"))
                  .build();
          }
        }
     }
     return getChatBiDirectionalStreamingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<fsm.miaad.stubs.Chat.ChatCurrencyRequest,
      fsm.miaad.stubs.Chat.ChatCurrencyResponse> getChatUnaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "chat_unary",
      requestType = fsm.miaad.stubs.Chat.ChatCurrencyRequest.class,
      responseType = fsm.miaad.stubs.Chat.ChatCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<fsm.miaad.stubs.Chat.ChatCurrencyRequest,
      fsm.miaad.stubs.Chat.ChatCurrencyResponse> getChatUnaryMethod() {
    io.grpc.MethodDescriptor<fsm.miaad.stubs.Chat.ChatCurrencyRequest, fsm.miaad.stubs.Chat.ChatCurrencyResponse> getChatUnaryMethod;
    if ((getChatUnaryMethod = ChatServiceGrpc.getChatUnaryMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getChatUnaryMethod = ChatServiceGrpc.getChatUnaryMethod) == null) {
          ChatServiceGrpc.getChatUnaryMethod = getChatUnaryMethod = 
              io.grpc.MethodDescriptor.<fsm.miaad.stubs.Chat.ChatCurrencyRequest, fsm.miaad.stubs.Chat.ChatCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ChatService", "chat_unary"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.stubs.Chat.ChatCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.stubs.Chat.ChatCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChatServiceMethodDescriptorSupplier("chat_unary"))
                  .build();
          }
        }
     }
     return getChatUnaryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<fsm.miaad.stubs.Chat.ChatCurrencyRequest,
      fsm.miaad.stubs.Chat.ChatCurrencyResponse> getChatServerSreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "chat_Server_Sreaming",
      requestType = fsm.miaad.stubs.Chat.ChatCurrencyRequest.class,
      responseType = fsm.miaad.stubs.Chat.ChatCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<fsm.miaad.stubs.Chat.ChatCurrencyRequest,
      fsm.miaad.stubs.Chat.ChatCurrencyResponse> getChatServerSreamingMethod() {
    io.grpc.MethodDescriptor<fsm.miaad.stubs.Chat.ChatCurrencyRequest, fsm.miaad.stubs.Chat.ChatCurrencyResponse> getChatServerSreamingMethod;
    if ((getChatServerSreamingMethod = ChatServiceGrpc.getChatServerSreamingMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getChatServerSreamingMethod = ChatServiceGrpc.getChatServerSreamingMethod) == null) {
          ChatServiceGrpc.getChatServerSreamingMethod = getChatServerSreamingMethod = 
              io.grpc.MethodDescriptor.<fsm.miaad.stubs.Chat.ChatCurrencyRequest, fsm.miaad.stubs.Chat.ChatCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ChatService", "chat_Server_Sreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.stubs.Chat.ChatCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.stubs.Chat.ChatCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChatServiceMethodDescriptorSupplier("chat_Server_Sreaming"))
                  .build();
          }
        }
     }
     return getChatServerSreamingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<fsm.miaad.stubs.Chat.ChatCurrencyRequest,
      fsm.miaad.stubs.Chat.ChatCurrencyResponse> getChatClientStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "chat_Client_Streaming",
      requestType = fsm.miaad.stubs.Chat.ChatCurrencyRequest.class,
      responseType = fsm.miaad.stubs.Chat.ChatCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<fsm.miaad.stubs.Chat.ChatCurrencyRequest,
      fsm.miaad.stubs.Chat.ChatCurrencyResponse> getChatClientStreamingMethod() {
    io.grpc.MethodDescriptor<fsm.miaad.stubs.Chat.ChatCurrencyRequest, fsm.miaad.stubs.Chat.ChatCurrencyResponse> getChatClientStreamingMethod;
    if ((getChatClientStreamingMethod = ChatServiceGrpc.getChatClientStreamingMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getChatClientStreamingMethod = ChatServiceGrpc.getChatClientStreamingMethod) == null) {
          ChatServiceGrpc.getChatClientStreamingMethod = getChatClientStreamingMethod = 
              io.grpc.MethodDescriptor.<fsm.miaad.stubs.Chat.ChatCurrencyRequest, fsm.miaad.stubs.Chat.ChatCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ChatService", "chat_Client_Streaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.stubs.Chat.ChatCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.stubs.Chat.ChatCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChatServiceMethodDescriptorSupplier("chat_Client_Streaming"))
                  .build();
          }
        }
     }
     return getChatClientStreamingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChatServiceStub newStub(io.grpc.Channel channel) {
    return new ChatServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChatServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ChatServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChatServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ChatServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ChatServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *BiDirectional Streaming Model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<fsm.miaad.stubs.Chat.ChatCurrencyRequest> chatBiDirectionalStreaming(
        io.grpc.stub.StreamObserver<fsm.miaad.stubs.Chat.ChatCurrencyResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getChatBiDirectionalStreamingMethod(), responseObserver);
    }

    /**
     */
    public void chatUnary(fsm.miaad.stubs.Chat.ChatCurrencyRequest request,
        io.grpc.stub.StreamObserver<fsm.miaad.stubs.Chat.ChatCurrencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChatUnaryMethod(), responseObserver);
    }

    /**
     */
    public void chatServerSreaming(fsm.miaad.stubs.Chat.ChatCurrencyRequest request,
        io.grpc.stub.StreamObserver<fsm.miaad.stubs.Chat.ChatCurrencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChatServerSreamingMethod(), responseObserver);
    }

    /**
     * <pre>
     *client streaming model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<fsm.miaad.stubs.Chat.ChatCurrencyRequest> chatClientStreaming(
        io.grpc.stub.StreamObserver<fsm.miaad.stubs.Chat.ChatCurrencyResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getChatClientStreamingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getChatBiDirectionalStreamingMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                fsm.miaad.stubs.Chat.ChatCurrencyRequest,
                fsm.miaad.stubs.Chat.ChatCurrencyResponse>(
                  this, METHODID_CHAT_BI_DIRECTIONAL_STREAMING)))
          .addMethod(
            getChatUnaryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                fsm.miaad.stubs.Chat.ChatCurrencyRequest,
                fsm.miaad.stubs.Chat.ChatCurrencyResponse>(
                  this, METHODID_CHAT_UNARY)))
          .addMethod(
            getChatServerSreamingMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                fsm.miaad.stubs.Chat.ChatCurrencyRequest,
                fsm.miaad.stubs.Chat.ChatCurrencyResponse>(
                  this, METHODID_CHAT_SERVER_SREAMING)))
          .addMethod(
            getChatClientStreamingMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                fsm.miaad.stubs.Chat.ChatCurrencyRequest,
                fsm.miaad.stubs.Chat.ChatCurrencyResponse>(
                  this, METHODID_CHAT_CLIENT_STREAMING)))
          .build();
    }
  }

  /**
   */
  public static final class ChatServiceStub extends io.grpc.stub.AbstractStub<ChatServiceStub> {
    private ChatServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *BiDirectional Streaming Model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<fsm.miaad.stubs.Chat.ChatCurrencyRequest> chatBiDirectionalStreaming(
        io.grpc.stub.StreamObserver<fsm.miaad.stubs.Chat.ChatCurrencyResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getChatBiDirectionalStreamingMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void chatUnary(fsm.miaad.stubs.Chat.ChatCurrencyRequest request,
        io.grpc.stub.StreamObserver<fsm.miaad.stubs.Chat.ChatCurrencyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChatUnaryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void chatServerSreaming(fsm.miaad.stubs.Chat.ChatCurrencyRequest request,
        io.grpc.stub.StreamObserver<fsm.miaad.stubs.Chat.ChatCurrencyResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getChatServerSreamingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client streaming model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<fsm.miaad.stubs.Chat.ChatCurrencyRequest> chatClientStreaming(
        io.grpc.stub.StreamObserver<fsm.miaad.stubs.Chat.ChatCurrencyResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getChatClientStreamingMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class ChatServiceBlockingStub extends io.grpc.stub.AbstractStub<ChatServiceBlockingStub> {
    private ChatServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public fsm.miaad.stubs.Chat.ChatCurrencyResponse chatUnary(fsm.miaad.stubs.Chat.ChatCurrencyRequest request) {
      return blockingUnaryCall(
          getChannel(), getChatUnaryMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<fsm.miaad.stubs.Chat.ChatCurrencyResponse> chatServerSreaming(
        fsm.miaad.stubs.Chat.ChatCurrencyRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getChatServerSreamingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ChatServiceFutureStub extends io.grpc.stub.AbstractStub<ChatServiceFutureStub> {
    private ChatServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<fsm.miaad.stubs.Chat.ChatCurrencyResponse> chatUnary(
        fsm.miaad.stubs.Chat.ChatCurrencyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChatUnaryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHAT_UNARY = 0;
  private static final int METHODID_CHAT_SERVER_SREAMING = 1;
  private static final int METHODID_CHAT_BI_DIRECTIONAL_STREAMING = 2;
  private static final int METHODID_CHAT_CLIENT_STREAMING = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChatServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChatServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHAT_UNARY:
          serviceImpl.chatUnary((fsm.miaad.stubs.Chat.ChatCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<fsm.miaad.stubs.Chat.ChatCurrencyResponse>) responseObserver);
          break;
        case METHODID_CHAT_SERVER_SREAMING:
          serviceImpl.chatServerSreaming((fsm.miaad.stubs.Chat.ChatCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<fsm.miaad.stubs.Chat.ChatCurrencyResponse>) responseObserver);
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
        case METHODID_CHAT_BI_DIRECTIONAL_STREAMING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.chatBiDirectionalStreaming(
              (io.grpc.stub.StreamObserver<fsm.miaad.stubs.Chat.ChatCurrencyResponse>) responseObserver);
        case METHODID_CHAT_CLIENT_STREAMING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.chatClientStreaming(
              (io.grpc.stub.StreamObserver<fsm.miaad.stubs.Chat.ChatCurrencyResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ChatServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChatServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return fsm.miaad.stubs.Chat.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ChatService");
    }
  }

  private static final class ChatServiceFileDescriptorSupplier
      extends ChatServiceBaseDescriptorSupplier {
    ChatServiceFileDescriptorSupplier() {}
  }

  private static final class ChatServiceMethodDescriptorSupplier
      extends ChatServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ChatServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ChatServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChatServiceFileDescriptorSupplier())
              .addMethod(getChatBiDirectionalStreamingMethod())
              .addMethod(getChatUnaryMethod())
              .addMethod(getChatServerSreamingMethod())
              .addMethod(getChatClientStreamingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
