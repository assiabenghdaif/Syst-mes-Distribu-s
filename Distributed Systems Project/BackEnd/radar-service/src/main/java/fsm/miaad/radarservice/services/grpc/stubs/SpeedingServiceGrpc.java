package fsm.miaad.radarservice.services.grpc.stubs;

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
    comments = "Source: radargrpc.proto")
public final class SpeedingServiceGrpc {

  private SpeedingServiceGrpc() {}

  public static final String SERVICE_NAME = "SpeedingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Request,
      fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Response> getSpeedingRandomlyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SpeedingRandomly",
      requestType = fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Request.class,
      responseType = fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Request,
      fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Response> getSpeedingRandomlyMethod() {
    io.grpc.MethodDescriptor<fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Request, fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Response> getSpeedingRandomlyMethod;
    if ((getSpeedingRandomlyMethod = SpeedingServiceGrpc.getSpeedingRandomlyMethod) == null) {
      synchronized (SpeedingServiceGrpc.class) {
        if ((getSpeedingRandomlyMethod = SpeedingServiceGrpc.getSpeedingRandomlyMethod) == null) {
          SpeedingServiceGrpc.getSpeedingRandomlyMethod = getSpeedingRandomlyMethod = 
              io.grpc.MethodDescriptor.<fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Request, fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SpeedingService", "SpeedingRandomly"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeedingServiceMethodDescriptorSupplier("SpeedingRandomly"))
                  .build();
          }
        }
     }
     return getSpeedingRandomlyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Empty,
      fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Radars> getGetRadarIDExistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRadarIDExist",
      requestType = fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Empty.class,
      responseType = fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Radars.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Empty,
      fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Radars> getGetRadarIDExistMethod() {
    io.grpc.MethodDescriptor<fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Empty, fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Radars> getGetRadarIDExistMethod;
    if ((getGetRadarIDExistMethod = SpeedingServiceGrpc.getGetRadarIDExistMethod) == null) {
      synchronized (SpeedingServiceGrpc.class) {
        if ((getGetRadarIDExistMethod = SpeedingServiceGrpc.getGetRadarIDExistMethod) == null) {
          SpeedingServiceGrpc.getGetRadarIDExistMethod = getGetRadarIDExistMethod = 
              io.grpc.MethodDescriptor.<fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Empty, fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Radars>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SpeedingService", "GetRadarIDExist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Radars.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeedingServiceMethodDescriptorSupplier("GetRadarIDExist"))
                  .build();
          }
        }
     }
     return getGetRadarIDExistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Empty,
      fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Vehicles> getGetVehicleIDExistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVehicleIDExist",
      requestType = fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Empty.class,
      responseType = fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Vehicles.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Empty,
      fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Vehicles> getGetVehicleIDExistMethod() {
    io.grpc.MethodDescriptor<fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Empty, fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Vehicles> getGetVehicleIDExistMethod;
    if ((getGetVehicleIDExistMethod = SpeedingServiceGrpc.getGetVehicleIDExistMethod) == null) {
      synchronized (SpeedingServiceGrpc.class) {
        if ((getGetVehicleIDExistMethod = SpeedingServiceGrpc.getGetVehicleIDExistMethod) == null) {
          SpeedingServiceGrpc.getGetVehicleIDExistMethod = getGetVehicleIDExistMethod = 
              io.grpc.MethodDescriptor.<fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Empty, fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Vehicles>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SpeedingService", "GetVehicleIDExist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Vehicles.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeedingServiceMethodDescriptorSupplier("GetVehicleIDExist"))
                  .build();
          }
        }
     }
     return getGetVehicleIDExistMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SpeedingServiceStub newStub(io.grpc.Channel channel) {
    return new SpeedingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SpeedingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SpeedingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SpeedingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SpeedingServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SpeedingServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *BiDirectional Streaming Model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Request> speedingRandomly(
        io.grpc.stub.StreamObserver<fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Response> responseObserver) {
      return asyncUnimplementedStreamingCall(getSpeedingRandomlyMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Empty> getRadarIDExist(
        io.grpc.stub.StreamObserver<fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Radars> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetRadarIDExistMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Empty> getVehicleIDExist(
        io.grpc.stub.StreamObserver<fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Vehicles> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetVehicleIDExistMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSpeedingRandomlyMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Request,
                fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Response>(
                  this, METHODID_SPEEDING_RANDOMLY)))
          .addMethod(
            getGetRadarIDExistMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Empty,
                fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Radars>(
                  this, METHODID_GET_RADAR_IDEXIST)))
          .addMethod(
            getGetVehicleIDExistMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Empty,
                fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Vehicles>(
                  this, METHODID_GET_VEHICLE_IDEXIST)))
          .build();
    }
  }

  /**
   */
  public static final class SpeedingServiceStub extends io.grpc.stub.AbstractStub<SpeedingServiceStub> {
    private SpeedingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpeedingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpeedingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpeedingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *BiDirectional Streaming Model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Request> speedingRandomly(
        io.grpc.stub.StreamObserver<fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Response> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSpeedingRandomlyMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Empty> getRadarIDExist(
        io.grpc.stub.StreamObserver<fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Radars> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGetRadarIDExistMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Empty> getVehicleIDExist(
        io.grpc.stub.StreamObserver<fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Vehicles> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGetVehicleIDExistMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class SpeedingServiceBlockingStub extends io.grpc.stub.AbstractStub<SpeedingServiceBlockingStub> {
    private SpeedingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpeedingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpeedingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpeedingServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class SpeedingServiceFutureStub extends io.grpc.stub.AbstractStub<SpeedingServiceFutureStub> {
    private SpeedingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpeedingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpeedingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpeedingServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SPEEDING_RANDOMLY = 0;
  private static final int METHODID_GET_RADAR_IDEXIST = 1;
  private static final int METHODID_GET_VEHICLE_IDEXIST = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SpeedingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SpeedingServiceImplBase serviceImpl, int methodId) {
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
        case METHODID_SPEEDING_RANDOMLY:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.speedingRandomly(
              (io.grpc.stub.StreamObserver<fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Response>) responseObserver);
        case METHODID_GET_RADAR_IDEXIST:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getRadarIDExist(
              (io.grpc.stub.StreamObserver<fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Radars>) responseObserver);
        case METHODID_GET_VEHICLE_IDEXIST:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getVehicleIDExist(
              (io.grpc.stub.StreamObserver<fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.Vehicles>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SpeedingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SpeedingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return fsm.miaad.radarservice.services.grpc.stubs.Radargrpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SpeedingService");
    }
  }

  private static final class SpeedingServiceFileDescriptorSupplier
      extends SpeedingServiceBaseDescriptorSupplier {
    SpeedingServiceFileDescriptorSupplier() {}
  }

  private static final class SpeedingServiceMethodDescriptorSupplier
      extends SpeedingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SpeedingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SpeedingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SpeedingServiceFileDescriptorSupplier())
              .addMethod(getSpeedingRandomlyMethod())
              .addMethod(getGetRadarIDExistMethod())
              .addMethod(getGetVehicleIDExistMethod())
              .build();
        }
      }
    }
    return result;
  }
}
