package fsm.miaad.immatriculationservice.web.grpc.stubs;

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
    comments = "Source: immatriculation.proto")
public final class ImmatriculationServiceGrpc {

  private ImmatriculationServiceGrpc() {}

  public static final String SERVICE_NAME = "ImmatriculationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty,
      fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerList> getAllOwnersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "allOwners",
      requestType = fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty.class,
      responseType = fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty,
      fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerList> getAllOwnersMethod() {
    io.grpc.MethodDescriptor<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty, fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerList> getAllOwnersMethod;
    if ((getAllOwnersMethod = ImmatriculationServiceGrpc.getAllOwnersMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getAllOwnersMethod = ImmatriculationServiceGrpc.getAllOwnersMethod) == null) {
          ImmatriculationServiceGrpc.getAllOwnersMethod = getAllOwnersMethod = 
              io.grpc.MethodDescriptor.<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty, fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "allOwners"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerList.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("allOwners"))
                  .build();
          }
        }
     }
     return getAllOwnersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerId,
      fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner> getOneOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "oneOwner",
      requestType = fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerId.class,
      responseType = fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerId,
      fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner> getOneOwnerMethod() {
    io.grpc.MethodDescriptor<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerId, fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner> getOneOwnerMethod;
    if ((getOneOwnerMethod = ImmatriculationServiceGrpc.getOneOwnerMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getOneOwnerMethod = ImmatriculationServiceGrpc.getOneOwnerMethod) == null) {
          ImmatriculationServiceGrpc.getOneOwnerMethod = getOneOwnerMethod = 
              io.grpc.MethodDescriptor.<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerId, fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "oneOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("oneOwner"))
                  .build();
          }
        }
     }
     return getOneOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner,
      fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner> getAddOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addOwner",
      requestType = fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner.class,
      responseType = fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner,
      fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner> getAddOwnerMethod() {
    io.grpc.MethodDescriptor<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner, fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner> getAddOwnerMethod;
    if ((getAddOwnerMethod = ImmatriculationServiceGrpc.getAddOwnerMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getAddOwnerMethod = ImmatriculationServiceGrpc.getAddOwnerMethod) == null) {
          ImmatriculationServiceGrpc.getAddOwnerMethod = getAddOwnerMethod = 
              io.grpc.MethodDescriptor.<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner, fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "addOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("addOwner"))
                  .build();
          }
        }
     }
     return getAddOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner,
      fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner> getEditOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "editOwner",
      requestType = fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner.class,
      responseType = fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner,
      fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner> getEditOwnerMethod() {
    io.grpc.MethodDescriptor<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner, fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner> getEditOwnerMethod;
    if ((getEditOwnerMethod = ImmatriculationServiceGrpc.getEditOwnerMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getEditOwnerMethod = ImmatriculationServiceGrpc.getEditOwnerMethod) == null) {
          ImmatriculationServiceGrpc.getEditOwnerMethod = getEditOwnerMethod = 
              io.grpc.MethodDescriptor.<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner, fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "editOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("editOwner"))
                  .build();
          }
        }
     }
     return getEditOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerId,
      fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty> getDeleteOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteOwner",
      requestType = fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerId.class,
      responseType = fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerId,
      fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty> getDeleteOwnerMethod() {
    io.grpc.MethodDescriptor<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerId, fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty> getDeleteOwnerMethod;
    if ((getDeleteOwnerMethod = ImmatriculationServiceGrpc.getDeleteOwnerMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getDeleteOwnerMethod = ImmatriculationServiceGrpc.getDeleteOwnerMethod) == null) {
          ImmatriculationServiceGrpc.getDeleteOwnerMethod = getDeleteOwnerMethod = 
              io.grpc.MethodDescriptor.<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerId, fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "deleteOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("deleteOwner"))
                  .build();
          }
        }
     }
     return getDeleteOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty,
      fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehiculeList> getAllVehiculesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "allVehicules",
      requestType = fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty.class,
      responseType = fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehiculeList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty,
      fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehiculeList> getAllVehiculesMethod() {
    io.grpc.MethodDescriptor<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty, fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehiculeList> getAllVehiculesMethod;
    if ((getAllVehiculesMethod = ImmatriculationServiceGrpc.getAllVehiculesMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getAllVehiculesMethod = ImmatriculationServiceGrpc.getAllVehiculesMethod) == null) {
          ImmatriculationServiceGrpc.getAllVehiculesMethod = getAllVehiculesMethod = 
              io.grpc.MethodDescriptor.<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty, fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehiculeList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "allVehicules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehiculeList.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("allVehicules"))
                  .build();
          }
        }
     }
     return getAllVehiculesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehicleId,
      fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule> getOneVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "oneVehicule",
      requestType = fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehicleId.class,
      responseType = fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehicleId,
      fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule> getOneVehiculeMethod() {
    io.grpc.MethodDescriptor<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehicleId, fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule> getOneVehiculeMethod;
    if ((getOneVehiculeMethod = ImmatriculationServiceGrpc.getOneVehiculeMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getOneVehiculeMethod = ImmatriculationServiceGrpc.getOneVehiculeMethod) == null) {
          ImmatriculationServiceGrpc.getOneVehiculeMethod = getOneVehiculeMethod = 
              io.grpc.MethodDescriptor.<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehicleId, fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "oneVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehicleId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("oneVehicule"))
                  .build();
          }
        }
     }
     return getOneVehiculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule,
      fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule> getAddVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addVehicule",
      requestType = fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule.class,
      responseType = fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule,
      fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule> getAddVehiculeMethod() {
    io.grpc.MethodDescriptor<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule, fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule> getAddVehiculeMethod;
    if ((getAddVehiculeMethod = ImmatriculationServiceGrpc.getAddVehiculeMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getAddVehiculeMethod = ImmatriculationServiceGrpc.getAddVehiculeMethod) == null) {
          ImmatriculationServiceGrpc.getAddVehiculeMethod = getAddVehiculeMethod = 
              io.grpc.MethodDescriptor.<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule, fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "addVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("addVehicule"))
                  .build();
          }
        }
     }
     return getAddVehiculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule,
      fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule> getEditVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "editVehicule",
      requestType = fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule.class,
      responseType = fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule,
      fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule> getEditVehiculeMethod() {
    io.grpc.MethodDescriptor<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule, fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule> getEditVehiculeMethod;
    if ((getEditVehiculeMethod = ImmatriculationServiceGrpc.getEditVehiculeMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getEditVehiculeMethod = ImmatriculationServiceGrpc.getEditVehiculeMethod) == null) {
          ImmatriculationServiceGrpc.getEditVehiculeMethod = getEditVehiculeMethod = 
              io.grpc.MethodDescriptor.<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule, fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "editVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("editVehicule"))
                  .build();
          }
        }
     }
     return getEditVehiculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehicleId,
      fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty> getDeleteVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteVehicule",
      requestType = fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehicleId.class,
      responseType = fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehicleId,
      fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty> getDeleteVehiculeMethod() {
    io.grpc.MethodDescriptor<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehicleId, fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty> getDeleteVehiculeMethod;
    if ((getDeleteVehiculeMethod = ImmatriculationServiceGrpc.getDeleteVehiculeMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getDeleteVehiculeMethod = ImmatriculationServiceGrpc.getDeleteVehiculeMethod) == null) {
          ImmatriculationServiceGrpc.getDeleteVehiculeMethod = getDeleteVehiculeMethod = 
              io.grpc.MethodDescriptor.<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehicleId, fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "deleteVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehicleId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty.getDefaultInstance()))
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
    public void allOwners(fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty request,
        io.grpc.stub.StreamObserver<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerList> responseObserver) {
      asyncUnimplementedUnaryCall(getAllOwnersMethod(), responseObserver);
    }

    /**
     */
    public void oneOwner(fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerId request,
        io.grpc.stub.StreamObserver<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner> responseObserver) {
      asyncUnimplementedUnaryCall(getOneOwnerMethod(), responseObserver);
    }

    /**
     */
    public void addOwner(fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner request,
        io.grpc.stub.StreamObserver<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner> responseObserver) {
      asyncUnimplementedUnaryCall(getAddOwnerMethod(), responseObserver);
    }

    /**
     */
    public void editOwner(fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner request,
        io.grpc.stub.StreamObserver<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner> responseObserver) {
      asyncUnimplementedUnaryCall(getEditOwnerMethod(), responseObserver);
    }

    /**
     */
    public void deleteOwner(fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerId request,
        io.grpc.stub.StreamObserver<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteOwnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Vehicule operations
     * </pre>
     */
    public void allVehicules(fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty request,
        io.grpc.stub.StreamObserver<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehiculeList> responseObserver) {
      asyncUnimplementedUnaryCall(getAllVehiculesMethod(), responseObserver);
    }

    /**
     */
    public void oneVehicule(fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehicleId request,
        io.grpc.stub.StreamObserver<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule> responseObserver) {
      asyncUnimplementedUnaryCall(getOneVehiculeMethod(), responseObserver);
    }

    /**
     */
    public void addVehicule(fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule request,
        io.grpc.stub.StreamObserver<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule> responseObserver) {
      asyncUnimplementedUnaryCall(getAddVehiculeMethod(), responseObserver);
    }

    /**
     */
    public void editVehicule(fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule request,
        io.grpc.stub.StreamObserver<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule> responseObserver) {
      asyncUnimplementedUnaryCall(getEditVehiculeMethod(), responseObserver);
    }

    /**
     */
    public void deleteVehicule(fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehicleId request,
        io.grpc.stub.StreamObserver<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteVehiculeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAllOwnersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty,
                fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerList>(
                  this, METHODID_ALL_OWNERS)))
          .addMethod(
            getOneOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerId,
                fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner>(
                  this, METHODID_ONE_OWNER)))
          .addMethod(
            getAddOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner,
                fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner>(
                  this, METHODID_ADD_OWNER)))
          .addMethod(
            getEditOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner,
                fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner>(
                  this, METHODID_EDIT_OWNER)))
          .addMethod(
            getDeleteOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerId,
                fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty>(
                  this, METHODID_DELETE_OWNER)))
          .addMethod(
            getAllVehiculesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty,
                fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehiculeList>(
                  this, METHODID_ALL_VEHICULES)))
          .addMethod(
            getOneVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehicleId,
                fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule>(
                  this, METHODID_ONE_VEHICULE)))
          .addMethod(
            getAddVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule,
                fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule>(
                  this, METHODID_ADD_VEHICULE)))
          .addMethod(
            getEditVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule,
                fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule>(
                  this, METHODID_EDIT_VEHICULE)))
          .addMethod(
            getDeleteVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehicleId,
                fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty>(
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

    @java.lang.Override
    protected ImmatriculationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Owner operations
     * </pre>
     */
    public void allOwners(fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty request,
        io.grpc.stub.StreamObserver<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllOwnersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void oneOwner(fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerId request,
        io.grpc.stub.StreamObserver<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOneOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addOwner(fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner request,
        io.grpc.stub.StreamObserver<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editOwner(fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner request,
        io.grpc.stub.StreamObserver<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteOwner(fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerId request,
        io.grpc.stub.StreamObserver<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Vehicule operations
     * </pre>
     */
    public void allVehicules(fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty request,
        io.grpc.stub.StreamObserver<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehiculeList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllVehiculesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void oneVehicule(fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehicleId request,
        io.grpc.stub.StreamObserver<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOneVehiculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addVehicule(fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule request,
        io.grpc.stub.StreamObserver<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddVehiculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editVehicule(fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule request,
        io.grpc.stub.StreamObserver<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditVehiculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteVehicule(fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehicleId request,
        io.grpc.stub.StreamObserver<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty> responseObserver) {
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

    @java.lang.Override
    protected ImmatriculationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Owner operations
     * </pre>
     */
    public fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerList allOwners(fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty request) {
      return blockingUnaryCall(
          getChannel(), getAllOwnersMethod(), getCallOptions(), request);
    }

    /**
     */
    public fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner oneOwner(fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerId request) {
      return blockingUnaryCall(
          getChannel(), getOneOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner addOwner(fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner request) {
      return blockingUnaryCall(
          getChannel(), getAddOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner editOwner(fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner request) {
      return blockingUnaryCall(
          getChannel(), getEditOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty deleteOwner(fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerId request) {
      return blockingUnaryCall(
          getChannel(), getDeleteOwnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Vehicule operations
     * </pre>
     */
    public fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehiculeList allVehicules(fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty request) {
      return blockingUnaryCall(
          getChannel(), getAllVehiculesMethod(), getCallOptions(), request);
    }

    /**
     */
    public fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule oneVehicule(fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehicleId request) {
      return blockingUnaryCall(
          getChannel(), getOneVehiculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule addVehicule(fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule request) {
      return blockingUnaryCall(
          getChannel(), getAddVehiculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule editVehicule(fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule request) {
      return blockingUnaryCall(
          getChannel(), getEditVehiculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty deleteVehicule(fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehicleId request) {
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

    @java.lang.Override
    protected ImmatriculationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Owner operations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerList> allOwners(
        fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getAllOwnersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner> oneOwner(
        fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerId request) {
      return futureUnaryCall(
          getChannel().newCall(getOneOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner> addOwner(
        fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner request) {
      return futureUnaryCall(
          getChannel().newCall(getAddOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner> editOwner(
        fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner request) {
      return futureUnaryCall(
          getChannel().newCall(getEditOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty> deleteOwner(
        fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerId request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteOwnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Vehicule operations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehiculeList> allVehicules(
        fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getAllVehiculesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule> oneVehicule(
        fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehicleId request) {
      return futureUnaryCall(
          getChannel().newCall(getOneVehiculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule> addVehicule(
        fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule request) {
      return futureUnaryCall(
          getChannel().newCall(getAddVehiculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule> editVehicule(
        fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule request) {
      return futureUnaryCall(
          getChannel().newCall(getEditVehiculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty> deleteVehicule(
        fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehicleId request) {
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

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALL_OWNERS:
          serviceImpl.allOwners((fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty) request,
              (io.grpc.stub.StreamObserver<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerList>) responseObserver);
          break;
        case METHODID_ONE_OWNER:
          serviceImpl.oneOwner((fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerId) request,
              (io.grpc.stub.StreamObserver<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner>) responseObserver);
          break;
        case METHODID_ADD_OWNER:
          serviceImpl.addOwner((fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner) request,
              (io.grpc.stub.StreamObserver<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner>) responseObserver);
          break;
        case METHODID_EDIT_OWNER:
          serviceImpl.editOwner((fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner) request,
              (io.grpc.stub.StreamObserver<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Owner>) responseObserver);
          break;
        case METHODID_DELETE_OWNER:
          serviceImpl.deleteOwner((fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.OwnerId) request,
              (io.grpc.stub.StreamObserver<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty>) responseObserver);
          break;
        case METHODID_ALL_VEHICULES:
          serviceImpl.allVehicules((fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty) request,
              (io.grpc.stub.StreamObserver<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehiculeList>) responseObserver);
          break;
        case METHODID_ONE_VEHICULE:
          serviceImpl.oneVehicule((fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehicleId) request,
              (io.grpc.stub.StreamObserver<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule>) responseObserver);
          break;
        case METHODID_ADD_VEHICULE:
          serviceImpl.addVehicule((fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule) request,
              (io.grpc.stub.StreamObserver<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule>) responseObserver);
          break;
        case METHODID_EDIT_VEHICULE:
          serviceImpl.editVehicule((fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule) request,
              (io.grpc.stub.StreamObserver<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Vehicule>) responseObserver);
          break;
        case METHODID_DELETE_VEHICULE:
          serviceImpl.deleteVehicule((fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.VehicleId) request,
              (io.grpc.stub.StreamObserver<fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.Empty>) responseObserver);
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

  private static abstract class ImmatriculationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImmatriculationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation.getDescriptor();
    }

    @java.lang.Override
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

    @java.lang.Override
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
