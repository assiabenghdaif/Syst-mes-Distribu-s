package fsm.miaad.immatriculationservice.web.grpc.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: immatriculation.proto")
public final class ImmatriculationServiceGrpc {

  private ImmatriculationServiceGrpc() {}

  public static final String SERVICE_NAME = "ImmatriculationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Immatriculation.Empty,
      Immatriculation.OwnerList> getAllOwnersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "allOwners",
      requestType = Immatriculation.Empty.class,
      responseType = Immatriculation.OwnerList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Immatriculation.Empty,
      Immatriculation.OwnerList> getAllOwnersMethod() {
    io.grpc.MethodDescriptor<Immatriculation.Empty, Immatriculation.OwnerList> getAllOwnersMethod;
    if ((getAllOwnersMethod = ImmatriculationServiceGrpc.getAllOwnersMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getAllOwnersMethod = ImmatriculationServiceGrpc.getAllOwnersMethod) == null) {
          ImmatriculationServiceGrpc.getAllOwnersMethod = getAllOwnersMethod = 
              io.grpc.MethodDescriptor.<Immatriculation.Empty, Immatriculation.OwnerList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "allOwners"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Immatriculation.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Immatriculation.OwnerList.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("allOwners"))
                  .build();
          }
        }
     }
     return getAllOwnersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Immatriculation.OwnerId,
      Immatriculation.Owner> getOneOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "oneOwner",
      requestType = Immatriculation.OwnerId.class,
      responseType = Immatriculation.Owner.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Immatriculation.OwnerId,
      Immatriculation.Owner> getOneOwnerMethod() {
    io.grpc.MethodDescriptor<Immatriculation.OwnerId, Immatriculation.Owner> getOneOwnerMethod;
    if ((getOneOwnerMethod = ImmatriculationServiceGrpc.getOneOwnerMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getOneOwnerMethod = ImmatriculationServiceGrpc.getOneOwnerMethod) == null) {
          ImmatriculationServiceGrpc.getOneOwnerMethod = getOneOwnerMethod = 
              io.grpc.MethodDescriptor.<Immatriculation.OwnerId, Immatriculation.Owner>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "oneOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Immatriculation.OwnerId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Immatriculation.Owner.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("oneOwner"))
                  .build();
          }
        }
     }
     return getOneOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Immatriculation.Owner,
      Immatriculation.Owner> getAddOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addOwner",
      requestType = Immatriculation.Owner.class,
      responseType = Immatriculation.Owner.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Immatriculation.Owner,
      Immatriculation.Owner> getAddOwnerMethod() {
    io.grpc.MethodDescriptor<Immatriculation.Owner, Immatriculation.Owner> getAddOwnerMethod;
    if ((getAddOwnerMethod = ImmatriculationServiceGrpc.getAddOwnerMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getAddOwnerMethod = ImmatriculationServiceGrpc.getAddOwnerMethod) == null) {
          ImmatriculationServiceGrpc.getAddOwnerMethod = getAddOwnerMethod = 
              io.grpc.MethodDescriptor.<Immatriculation.Owner, Immatriculation.Owner>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "addOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Immatriculation.Owner.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Immatriculation.Owner.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("addOwner"))
                  .build();
          }
        }
     }
     return getAddOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Immatriculation.Owner,
      Immatriculation.Owner> getEditOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "editOwner",
      requestType = Immatriculation.Owner.class,
      responseType = Immatriculation.Owner.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Immatriculation.Owner,
      Immatriculation.Owner> getEditOwnerMethod() {
    io.grpc.MethodDescriptor<Immatriculation.Owner, Immatriculation.Owner> getEditOwnerMethod;
    if ((getEditOwnerMethod = ImmatriculationServiceGrpc.getEditOwnerMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getEditOwnerMethod = ImmatriculationServiceGrpc.getEditOwnerMethod) == null) {
          ImmatriculationServiceGrpc.getEditOwnerMethod = getEditOwnerMethod = 
              io.grpc.MethodDescriptor.<Immatriculation.Owner, Immatriculation.Owner>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "editOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Immatriculation.Owner.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Immatriculation.Owner.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("editOwner"))
                  .build();
          }
        }
     }
     return getEditOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Immatriculation.OwnerId,
      Immatriculation.Empty> getDeleteOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteOwner",
      requestType = Immatriculation.OwnerId.class,
      responseType = Immatriculation.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Immatriculation.OwnerId,
      Immatriculation.Empty> getDeleteOwnerMethod() {
    io.grpc.MethodDescriptor<Immatriculation.OwnerId, Immatriculation.Empty> getDeleteOwnerMethod;
    if ((getDeleteOwnerMethod = ImmatriculationServiceGrpc.getDeleteOwnerMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getDeleteOwnerMethod = ImmatriculationServiceGrpc.getDeleteOwnerMethod) == null) {
          ImmatriculationServiceGrpc.getDeleteOwnerMethod = getDeleteOwnerMethod = 
              io.grpc.MethodDescriptor.<Immatriculation.OwnerId, Immatriculation.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "deleteOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Immatriculation.OwnerId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Immatriculation.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("deleteOwner"))
                  .build();
          }
        }
     }
     return getDeleteOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Immatriculation.Empty,
      Immatriculation.VehiculeList> getAllVehiculesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "allVehicules",
      requestType = Immatriculation.Empty.class,
      responseType = Immatriculation.VehiculeList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Immatriculation.Empty,
      Immatriculation.VehiculeList> getAllVehiculesMethod() {
    io.grpc.MethodDescriptor<Immatriculation.Empty, Immatriculation.VehiculeList> getAllVehiculesMethod;
    if ((getAllVehiculesMethod = ImmatriculationServiceGrpc.getAllVehiculesMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getAllVehiculesMethod = ImmatriculationServiceGrpc.getAllVehiculesMethod) == null) {
          ImmatriculationServiceGrpc.getAllVehiculesMethod = getAllVehiculesMethod = 
              io.grpc.MethodDescriptor.<Immatriculation.Empty, Immatriculation.VehiculeList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "allVehicules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Immatriculation.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Immatriculation.VehiculeList.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("allVehicules"))
                  .build();
          }
        }
     }
     return getAllVehiculesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Immatriculation.VehicleId,
      Immatriculation.Vehicule> getOneVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "oneVehicule",
      requestType = Immatriculation.VehicleId.class,
      responseType = Immatriculation.Vehicule.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Immatriculation.VehicleId,
      Immatriculation.Vehicule> getOneVehiculeMethod() {
    io.grpc.MethodDescriptor<Immatriculation.VehicleId, Immatriculation.Vehicule> getOneVehiculeMethod;
    if ((getOneVehiculeMethod = ImmatriculationServiceGrpc.getOneVehiculeMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getOneVehiculeMethod = ImmatriculationServiceGrpc.getOneVehiculeMethod) == null) {
          ImmatriculationServiceGrpc.getOneVehiculeMethod = getOneVehiculeMethod = 
              io.grpc.MethodDescriptor.<Immatriculation.VehicleId, Immatriculation.Vehicule>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "oneVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Immatriculation.VehicleId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Immatriculation.Vehicule.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("oneVehicule"))
                  .build();
          }
        }
     }
     return getOneVehiculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Immatriculation.Vehicule,
      Immatriculation.Vehicule> getAddVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addVehicule",
      requestType = Immatriculation.Vehicule.class,
      responseType = Immatriculation.Vehicule.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Immatriculation.Vehicule,
      Immatriculation.Vehicule> getAddVehiculeMethod() {
    io.grpc.MethodDescriptor<Immatriculation.Vehicule, Immatriculation.Vehicule> getAddVehiculeMethod;
    if ((getAddVehiculeMethod = ImmatriculationServiceGrpc.getAddVehiculeMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getAddVehiculeMethod = ImmatriculationServiceGrpc.getAddVehiculeMethod) == null) {
          ImmatriculationServiceGrpc.getAddVehiculeMethod = getAddVehiculeMethod = 
              io.grpc.MethodDescriptor.<Immatriculation.Vehicule, Immatriculation.Vehicule>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "addVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Immatriculation.Vehicule.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Immatriculation.Vehicule.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("addVehicule"))
                  .build();
          }
        }
     }
     return getAddVehiculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Immatriculation.Vehicule,
      Immatriculation.Vehicule> getEditVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "editVehicule",
      requestType = Immatriculation.Vehicule.class,
      responseType = Immatriculation.Vehicule.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Immatriculation.Vehicule,
      Immatriculation.Vehicule> getEditVehiculeMethod() {
    io.grpc.MethodDescriptor<Immatriculation.Vehicule, Immatriculation.Vehicule> getEditVehiculeMethod;
    if ((getEditVehiculeMethod = ImmatriculationServiceGrpc.getEditVehiculeMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getEditVehiculeMethod = ImmatriculationServiceGrpc.getEditVehiculeMethod) == null) {
          ImmatriculationServiceGrpc.getEditVehiculeMethod = getEditVehiculeMethod = 
              io.grpc.MethodDescriptor.<Immatriculation.Vehicule, Immatriculation.Vehicule>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "editVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Immatriculation.Vehicule.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Immatriculation.Vehicule.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("editVehicule"))
                  .build();
          }
        }
     }
     return getEditVehiculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Immatriculation.VehicleId,
      Immatriculation.Empty> getDeleteVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteVehicule",
      requestType = Immatriculation.VehicleId.class,
      responseType = Immatriculation.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Immatriculation.VehicleId,
      Immatriculation.Empty> getDeleteVehiculeMethod() {
    io.grpc.MethodDescriptor<Immatriculation.VehicleId, Immatriculation.Empty> getDeleteVehiculeMethod;
    if ((getDeleteVehiculeMethod = ImmatriculationServiceGrpc.getDeleteVehiculeMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getDeleteVehiculeMethod = ImmatriculationServiceGrpc.getDeleteVehiculeMethod) == null) {
          ImmatriculationServiceGrpc.getDeleteVehiculeMethod = getDeleteVehiculeMethod = 
              io.grpc.MethodDescriptor.<Immatriculation.VehicleId, Immatriculation.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "deleteVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Immatriculation.VehicleId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Immatriculation.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("deleteVehicule"))
                  .build();
          }
        }
     }
     return getDeleteVehiculeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImmatriculationServiceStub newStub(io.grpc.Channel channel) {
    return new ImmatriculationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImmatriculationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ImmatriculationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImmatriculationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ImmatriculationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ImmatriculationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Owner operations
     * </pre>
     */
    public void allOwners(Immatriculation.Empty request,
                          io.grpc.stub.StreamObserver<Immatriculation.OwnerList> responseObserver) {
      asyncUnimplementedUnaryCall(getAllOwnersMethod(), responseObserver);
    }

    /**
     */
    public void oneOwner(Immatriculation.OwnerId request,
                         io.grpc.stub.StreamObserver<Immatriculation.Owner> responseObserver) {
      asyncUnimplementedUnaryCall(getOneOwnerMethod(), responseObserver);
    }

    /**
     */
    public void addOwner(Immatriculation.Owner request,
                         io.grpc.stub.StreamObserver<Immatriculation.Owner> responseObserver) {
      asyncUnimplementedUnaryCall(getAddOwnerMethod(), responseObserver);
    }

    /**
     */
    public void editOwner(Immatriculation.Owner request,
                          io.grpc.stub.StreamObserver<Immatriculation.Owner> responseObserver) {
      asyncUnimplementedUnaryCall(getEditOwnerMethod(), responseObserver);
    }

    /**
     */
    public void deleteOwner(Immatriculation.OwnerId request,
                            io.grpc.stub.StreamObserver<Immatriculation.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteOwnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Vehicule operations
     * </pre>
     */
    public void allVehicules(Immatriculation.Empty request,
                             io.grpc.stub.StreamObserver<Immatriculation.VehiculeList> responseObserver) {
      asyncUnimplementedUnaryCall(getAllVehiculesMethod(), responseObserver);
    }

    /**
     */
    public void oneVehicule(Immatriculation.VehicleId request,
                            io.grpc.stub.StreamObserver<Immatriculation.Vehicule> responseObserver) {
      asyncUnimplementedUnaryCall(getOneVehiculeMethod(), responseObserver);
    }

    /**
     */
    public void addVehicule(Immatriculation.Vehicule request,
                            io.grpc.stub.StreamObserver<Immatriculation.Vehicule> responseObserver) {
      asyncUnimplementedUnaryCall(getAddVehiculeMethod(), responseObserver);
    }

    /**
     */
    public void editVehicule(Immatriculation.Vehicule request,
                             io.grpc.stub.StreamObserver<Immatriculation.Vehicule> responseObserver) {
      asyncUnimplementedUnaryCall(getEditVehiculeMethod(), responseObserver);
    }

    /**
     */
    public void deleteVehicule(Immatriculation.VehicleId request,
                               io.grpc.stub.StreamObserver<Immatriculation.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteVehiculeMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAllOwnersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Immatriculation.Empty,
                Immatriculation.OwnerList>(
                  this, METHODID_ALL_OWNERS)))
          .addMethod(
            getOneOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Immatriculation.OwnerId,
                Immatriculation.Owner>(
                  this, METHODID_ONE_OWNER)))
          .addMethod(
            getAddOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Immatriculation.Owner,
                Immatriculation.Owner>(
                  this, METHODID_ADD_OWNER)))
          .addMethod(
            getEditOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Immatriculation.Owner,
                Immatriculation.Owner>(
                  this, METHODID_EDIT_OWNER)))
          .addMethod(
            getDeleteOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Immatriculation.OwnerId,
                Immatriculation.Empty>(
                  this, METHODID_DELETE_OWNER)))
          .addMethod(
            getAllVehiculesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Immatriculation.Empty,
                Immatriculation.VehiculeList>(
                  this, METHODID_ALL_VEHICULES)))
          .addMethod(
            getOneVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Immatriculation.VehicleId,
                Immatriculation.Vehicule>(
                  this, METHODID_ONE_VEHICULE)))
          .addMethod(
            getAddVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Immatriculation.Vehicule,
                Immatriculation.Vehicule>(
                  this, METHODID_ADD_VEHICULE)))
          .addMethod(
            getEditVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Immatriculation.Vehicule,
                Immatriculation.Vehicule>(
                  this, METHODID_EDIT_VEHICULE)))
          .addMethod(
            getDeleteVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Immatriculation.VehicleId,
                Immatriculation.Empty>(
                  this, METHODID_DELETE_VEHICULE)))
          .build();
    }
  }

  /**
   */
  public static final class ImmatriculationServiceStub extends io.grpc.stub.AbstractStub<ImmatriculationServiceStub> {
    private ImmatriculationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ImmatriculationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Owner operations
     * </pre>
     */
    public void allOwners(Immatriculation.Empty request,
                          io.grpc.stub.StreamObserver<Immatriculation.OwnerList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllOwnersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void oneOwner(Immatriculation.OwnerId request,
                         io.grpc.stub.StreamObserver<Immatriculation.Owner> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOneOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addOwner(Immatriculation.Owner request,
                         io.grpc.stub.StreamObserver<Immatriculation.Owner> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editOwner(Immatriculation.Owner request,
                          io.grpc.stub.StreamObserver<Immatriculation.Owner> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteOwner(Immatriculation.OwnerId request,
                            io.grpc.stub.StreamObserver<Immatriculation.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Vehicule operations
     * </pre>
     */
    public void allVehicules(Immatriculation.Empty request,
                             io.grpc.stub.StreamObserver<Immatriculation.VehiculeList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllVehiculesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void oneVehicule(Immatriculation.VehicleId request,
                            io.grpc.stub.StreamObserver<Immatriculation.Vehicule> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOneVehiculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addVehicule(Immatriculation.Vehicule request,
                            io.grpc.stub.StreamObserver<Immatriculation.Vehicule> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddVehiculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editVehicule(Immatriculation.Vehicule request,
                             io.grpc.stub.StreamObserver<Immatriculation.Vehicule> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditVehiculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteVehicule(Immatriculation.VehicleId request,
                               io.grpc.stub.StreamObserver<Immatriculation.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteVehiculeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ImmatriculationServiceBlockingStub extends io.grpc.stub.AbstractStub<ImmatriculationServiceBlockingStub> {
    private ImmatriculationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ImmatriculationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Owner operations
     * </pre>
     */
    public Immatriculation.OwnerList allOwners(Immatriculation.Empty request) {
      return blockingUnaryCall(
          getChannel(), getAllOwnersMethod(), getCallOptions(), request);
    }

    /**
     */
    public Immatriculation.Owner oneOwner(Immatriculation.OwnerId request) {
      return blockingUnaryCall(
          getChannel(), getOneOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public Immatriculation.Owner addOwner(Immatriculation.Owner request) {
      return blockingUnaryCall(
          getChannel(), getAddOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public Immatriculation.Owner editOwner(Immatriculation.Owner request) {
      return blockingUnaryCall(
          getChannel(), getEditOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public Immatriculation.Empty deleteOwner(Immatriculation.OwnerId request) {
      return blockingUnaryCall(
          getChannel(), getDeleteOwnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Vehicule operations
     * </pre>
     */
    public Immatriculation.VehiculeList allVehicules(Immatriculation.Empty request) {
      return blockingUnaryCall(
          getChannel(), getAllVehiculesMethod(), getCallOptions(), request);
    }

    /**
     */
    public Immatriculation.Vehicule oneVehicule(Immatriculation.VehicleId request) {
      return blockingUnaryCall(
          getChannel(), getOneVehiculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public Immatriculation.Vehicule addVehicule(Immatriculation.Vehicule request) {
      return blockingUnaryCall(
          getChannel(), getAddVehiculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public Immatriculation.Vehicule editVehicule(Immatriculation.Vehicule request) {
      return blockingUnaryCall(
          getChannel(), getEditVehiculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public Immatriculation.Empty deleteVehicule(Immatriculation.VehicleId request) {
      return blockingUnaryCall(
          getChannel(), getDeleteVehiculeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ImmatriculationServiceFutureStub extends io.grpc.stub.AbstractStub<ImmatriculationServiceFutureStub> {
    private ImmatriculationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ImmatriculationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Owner operations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Immatriculation.OwnerList> allOwners(
        Immatriculation.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getAllOwnersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Immatriculation.Owner> oneOwner(
        Immatriculation.OwnerId request) {
      return futureUnaryCall(
          getChannel().newCall(getOneOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Immatriculation.Owner> addOwner(
        Immatriculation.Owner request) {
      return futureUnaryCall(
          getChannel().newCall(getAddOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Immatriculation.Owner> editOwner(
        Immatriculation.Owner request) {
      return futureUnaryCall(
          getChannel().newCall(getEditOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Immatriculation.Empty> deleteOwner(
        Immatriculation.OwnerId request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteOwnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Vehicule operations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Immatriculation.VehiculeList> allVehicules(
        Immatriculation.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getAllVehiculesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Immatriculation.Vehicule> oneVehicule(
        Immatriculation.VehicleId request) {
      return futureUnaryCall(
          getChannel().newCall(getOneVehiculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Immatriculation.Vehicule> addVehicule(
        Immatriculation.Vehicule request) {
      return futureUnaryCall(
          getChannel().newCall(getAddVehiculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Immatriculation.Vehicule> editVehicule(
        Immatriculation.Vehicule request) {
      return futureUnaryCall(
          getChannel().newCall(getEditVehiculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Immatriculation.Empty> deleteVehicule(
        Immatriculation.VehicleId request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteVehiculeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALL_OWNERS = 0;
  private static final int METHODID_ONE_OWNER = 1;
  private static final int METHODID_ADD_OWNER = 2;
  private static final int METHODID_EDIT_OWNER = 3;
  private static final int METHODID_DELETE_OWNER = 4;
  private static final int METHODID_ALL_VEHICULES = 5;
  private static final int METHODID_ONE_VEHICULE = 6;
  private static final int METHODID_ADD_VEHICULE = 7;
  private static final int METHODID_EDIT_VEHICULE = 8;
  private static final int METHODID_DELETE_VEHICULE = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImmatriculationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImmatriculationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALL_OWNERS:
          serviceImpl.allOwners((Immatriculation.Empty) request,
              (io.grpc.stub.StreamObserver<Immatriculation.OwnerList>) responseObserver);
          break;
        case METHODID_ONE_OWNER:
          serviceImpl.oneOwner((Immatriculation.OwnerId) request,
              (io.grpc.stub.StreamObserver<Immatriculation.Owner>) responseObserver);
          break;
        case METHODID_ADD_OWNER:
          serviceImpl.addOwner((Immatriculation.Owner) request,
              (io.grpc.stub.StreamObserver<Immatriculation.Owner>) responseObserver);
          break;
        case METHODID_EDIT_OWNER:
          serviceImpl.editOwner((Immatriculation.Owner) request,
              (io.grpc.stub.StreamObserver<Immatriculation.Owner>) responseObserver);
          break;
        case METHODID_DELETE_OWNER:
          serviceImpl.deleteOwner((Immatriculation.OwnerId) request,
              (io.grpc.stub.StreamObserver<Immatriculation.Empty>) responseObserver);
          break;
        case METHODID_ALL_VEHICULES:
          serviceImpl.allVehicules((Immatriculation.Empty) request,
              (io.grpc.stub.StreamObserver<Immatriculation.VehiculeList>) responseObserver);
          break;
        case METHODID_ONE_VEHICULE:
          serviceImpl.oneVehicule((Immatriculation.VehicleId) request,
              (io.grpc.stub.StreamObserver<Immatriculation.Vehicule>) responseObserver);
          break;
        case METHODID_ADD_VEHICULE:
          serviceImpl.addVehicule((Immatriculation.Vehicule) request,
              (io.grpc.stub.StreamObserver<Immatriculation.Vehicule>) responseObserver);
          break;
        case METHODID_EDIT_VEHICULE:
          serviceImpl.editVehicule((Immatriculation.Vehicule) request,
              (io.grpc.stub.StreamObserver<Immatriculation.Vehicule>) responseObserver);
          break;
        case METHODID_DELETE_VEHICULE:
          serviceImpl.deleteVehicule((Immatriculation.VehicleId) request,
              (io.grpc.stub.StreamObserver<Immatriculation.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ImmatriculationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImmatriculationServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Immatriculation.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ImmatriculationService");
    }
  }

  private static final class ImmatriculationServiceFileDescriptorSupplier
      extends ImmatriculationServiceBaseDescriptorSupplier {
    ImmatriculationServiceFileDescriptorSupplier() {}
  }

  private static final class ImmatriculationServiceMethodDescriptorSupplier
      extends ImmatriculationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ImmatriculationServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImmatriculationServiceFileDescriptorSupplier())
              .addMethod(getAllOwnersMethod())
              .addMethod(getOneOwnerMethod())
              .addMethod(getAddOwnerMethod())
              .addMethod(getEditOwnerMethod())
              .addMethod(getDeleteOwnerMethod())
              .addMethod(getAllVehiculesMethod())
              .addMethod(getOneVehiculeMethod())
              .addMethod(getAddVehiculeMethod())
              .addMethod(getEditVehiculeMethod())
              .addMethod(getDeleteVehiculeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
