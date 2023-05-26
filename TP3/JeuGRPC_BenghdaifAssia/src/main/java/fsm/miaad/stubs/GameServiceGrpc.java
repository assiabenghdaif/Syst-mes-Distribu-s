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
    comments = "Source: game.proto")
public final class GameServiceGrpc {

  private GameServiceGrpc() {}

  public static final String SERVICE_NAME = "GameService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<fsm.miaad.stubs.Game.GameCurrencyRequest,
      fsm.miaad.stubs.Game.GameCurrencyResponse> getGameBiDirectionalStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "game_BiDirectional_Streaming",
      requestType = fsm.miaad.stubs.Game.GameCurrencyRequest.class,
      responseType = fsm.miaad.stubs.Game.GameCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<fsm.miaad.stubs.Game.GameCurrencyRequest,
      fsm.miaad.stubs.Game.GameCurrencyResponse> getGameBiDirectionalStreamingMethod() {
    io.grpc.MethodDescriptor<fsm.miaad.stubs.Game.GameCurrencyRequest, fsm.miaad.stubs.Game.GameCurrencyResponse> getGameBiDirectionalStreamingMethod;
    if ((getGameBiDirectionalStreamingMethod = GameServiceGrpc.getGameBiDirectionalStreamingMethod) == null) {
      synchronized (GameServiceGrpc.class) {
        if ((getGameBiDirectionalStreamingMethod = GameServiceGrpc.getGameBiDirectionalStreamingMethod) == null) {
          GameServiceGrpc.getGameBiDirectionalStreamingMethod = getGameBiDirectionalStreamingMethod = 
              io.grpc.MethodDescriptor.<fsm.miaad.stubs.Game.GameCurrencyRequest, fsm.miaad.stubs.Game.GameCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "GameService", "game_BiDirectional_Streaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.stubs.Game.GameCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.stubs.Game.GameCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GameServiceMethodDescriptorSupplier("game_BiDirectional_Streaming"))
                  .build();
          }
        }
     }
     return getGameBiDirectionalStreamingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<fsm.miaad.stubs.Game.GameCurrencyRequest,
      fsm.miaad.stubs.Game.GameCurrencyResponse> getBroadCastwinnerServerSreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BroadCastwinner_Server_Sreaming",
      requestType = fsm.miaad.stubs.Game.GameCurrencyRequest.class,
      responseType = fsm.miaad.stubs.Game.GameCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<fsm.miaad.stubs.Game.GameCurrencyRequest,
      fsm.miaad.stubs.Game.GameCurrencyResponse> getBroadCastwinnerServerSreamingMethod() {
    io.grpc.MethodDescriptor<fsm.miaad.stubs.Game.GameCurrencyRequest, fsm.miaad.stubs.Game.GameCurrencyResponse> getBroadCastwinnerServerSreamingMethod;
    if ((getBroadCastwinnerServerSreamingMethod = GameServiceGrpc.getBroadCastwinnerServerSreamingMethod) == null) {
      synchronized (GameServiceGrpc.class) {
        if ((getBroadCastwinnerServerSreamingMethod = GameServiceGrpc.getBroadCastwinnerServerSreamingMethod) == null) {
          GameServiceGrpc.getBroadCastwinnerServerSreamingMethod = getBroadCastwinnerServerSreamingMethod = 
              io.grpc.MethodDescriptor.<fsm.miaad.stubs.Game.GameCurrencyRequest, fsm.miaad.stubs.Game.GameCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "GameService", "BroadCastwinner_Server_Sreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.stubs.Game.GameCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.stubs.Game.GameCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GameServiceMethodDescriptorSupplier("BroadCastwinner_Server_Sreaming"))
                  .build();
          }
        }
     }
     return getBroadCastwinnerServerSreamingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GameServiceStub newStub(io.grpc.Channel channel) {
    return new GameServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GameServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GameServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GameServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GameServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GameServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *BiDirectional Streaming Model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<fsm.miaad.stubs.Game.GameCurrencyRequest> gameBiDirectionalStreaming(
        io.grpc.stub.StreamObserver<fsm.miaad.stubs.Game.GameCurrencyResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getGameBiDirectionalStreamingMethod(), responseObserver);
    }

    /**
     * <pre>
     *server streaming model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<fsm.miaad.stubs.Game.GameCurrencyRequest> broadCastwinnerServerSreaming(
        io.grpc.stub.StreamObserver<fsm.miaad.stubs.Game.GameCurrencyResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getBroadCastwinnerServerSreamingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGameBiDirectionalStreamingMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                fsm.miaad.stubs.Game.GameCurrencyRequest,
                fsm.miaad.stubs.Game.GameCurrencyResponse>(
                  this, METHODID_GAME_BI_DIRECTIONAL_STREAMING)))
          .addMethod(
            getBroadCastwinnerServerSreamingMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                fsm.miaad.stubs.Game.GameCurrencyRequest,
                fsm.miaad.stubs.Game.GameCurrencyResponse>(
                  this, METHODID_BROAD_CASTWINNER_SERVER_SREAMING)))
          .build();
    }
  }

  /**
   */
  public static final class GameServiceStub extends io.grpc.stub.AbstractStub<GameServiceStub> {
    private GameServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GameServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GameServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GameServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *BiDirectional Streaming Model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<fsm.miaad.stubs.Game.GameCurrencyRequest> gameBiDirectionalStreaming(
        io.grpc.stub.StreamObserver<fsm.miaad.stubs.Game.GameCurrencyResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGameBiDirectionalStreamingMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *server streaming model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<fsm.miaad.stubs.Game.GameCurrencyRequest> broadCastwinnerServerSreaming(
        io.grpc.stub.StreamObserver<fsm.miaad.stubs.Game.GameCurrencyResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getBroadCastwinnerServerSreamingMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class GameServiceBlockingStub extends io.grpc.stub.AbstractStub<GameServiceBlockingStub> {
    private GameServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GameServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GameServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GameServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class GameServiceFutureStub extends io.grpc.stub.AbstractStub<GameServiceFutureStub> {
    private GameServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GameServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GameServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GameServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GAME_BI_DIRECTIONAL_STREAMING = 0;
  private static final int METHODID_BROAD_CASTWINNER_SERVER_SREAMING = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GameServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GameServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GAME_BI_DIRECTIONAL_STREAMING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.gameBiDirectionalStreaming(
              (io.grpc.stub.StreamObserver<fsm.miaad.stubs.Game.GameCurrencyResponse>) responseObserver);
        case METHODID_BROAD_CASTWINNER_SERVER_SREAMING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.broadCastwinnerServerSreaming(
              (io.grpc.stub.StreamObserver<fsm.miaad.stubs.Game.GameCurrencyResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GameServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GameServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return fsm.miaad.stubs.Game.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GameService");
    }
  }

  private static final class GameServiceFileDescriptorSupplier
      extends GameServiceBaseDescriptorSupplier {
    GameServiceFileDescriptorSupplier() {}
  }

  private static final class GameServiceMethodDescriptorSupplier
      extends GameServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GameServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GameServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GameServiceFileDescriptorSupplier())
              .addMethod(getGameBiDirectionalStreamingMethod())
              .addMethod(getBroadCastwinnerServerSreamingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
