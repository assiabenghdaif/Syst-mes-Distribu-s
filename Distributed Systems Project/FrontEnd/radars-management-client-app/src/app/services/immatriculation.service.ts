import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {environment} from "../../environments/environment";
import {Owner} from "../models/owner";
import {Vehicle} from "../models/vehicle";

let _URLVEHICLES=environment.GATEWAY_URL+environment.IMMATRICULATION_SERVICE+environment.VEHICLES

let _URLOWNERS=environment.GATEWAY_URL+environment.IMMATRICULATION_SERVICE+environment.OWNERS
@Injectable({
  providedIn: 'root'
})
export class ImmatriculationService {

  constructor(private http: HttpClient) { }

  AllOwners():Observable<any>{
    return this.http.get(_URLOWNERS+"allOwners");
  }

  deleteOwner(id:any):Observable<any>{
    return this.http.delete(_URLOWNERS+"deleteOwner/"+id);
  }

  addOwner(owner : Owner):Observable<any>{
    return this.http.post(_URLOWNERS+"addOwner", JSON.stringify(owner),
      { headers: { "Content-Type": "application/json; charset=UTF-8"}})
  }

  editOwner(id:any,owner : Owner):Observable<any>{
    return this.http.put(_URLOWNERS+"editOwner/"+id,JSON.stringify(owner),
      { headers: { "Content-Type": "application/json; charset=UTF-8"}})
  }

  oneOwner(id:any):Observable<any>{
    return this.http.get(_URLOWNERS+"oneOwner/"+id);
  }

  // Vehicles services

  AllVehicles():Observable<any>{
    return this.http.get(_URLVEHICLES);
  }

  deleteVehicle(id:any):Observable<any>{
    return this.http.delete(_URLVEHICLES+"deleteVehicle/"+id);
  }

  addVehicle(vehicle : Vehicle):Observable<any>{
    return this.http.post(_URLVEHICLES+"addVehicle", JSON.stringify(vehicle),
      { headers: { "Content-Type": "application/json; charset=UTF-8"}})
  }

  editVehicle(id:any,vehicle : Vehicle):Observable<any>{
    return this.http.put(_URLVEHICLES+"editVehicle/"+id,JSON.stringify(vehicle),
      { headers: { "Content-Type": "application/json; charset=UTF-8"}})
  }

  oneVehicle(id:any):Observable<any>{
    return this.http.get(_URLVEHICLES+"oneVehicle/"+id);
  }

  getOwnerInVehicle(id:any):Observable<any>{
    console.log(_URLVEHICLES+id+"/owner")
    return this.http.get(_URLVEHICLES+id+"/owner")
  }
}
