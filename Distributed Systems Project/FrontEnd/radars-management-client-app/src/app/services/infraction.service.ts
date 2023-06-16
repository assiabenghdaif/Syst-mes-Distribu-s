import { Injectable } from '@angular/core';
import {Infraction} from "../models/infraction";
import {HttpClient} from "@angular/common/http";
import {environment} from "../../environments/environment";
import {Observable} from "rxjs";
let _URLINFRACTIONS=environment.GATEWAY_URL+environment.INFRACTION_SERVICE+environment.INFRACTIONS

@Injectable({
  providedIn: 'root'
})
export class InfractionService {

  constructor(private http: HttpClient) { }


  AllInfractions():Observable<any>{
    return this.http.get(_URLINFRACTIONS+"allInfractions");
  }

  deleteInfraction(id:any):Observable<any>{
    return this.http.delete(_URLINFRACTIONS+"deleteInfraction/"+id);
  }

  addInfraction(infraction : Infraction):Observable<any>{
    return this.http.post(_URLINFRACTIONS+"addInfraction", JSON.stringify(infraction),
      { headers: { "Content-Type": "application/json; charset=UTF-8"}})
  }

  editInfraction(id:any,infraction : Infraction):Observable<any>{
    return this.http.put(_URLINFRACTIONS+"editInfraction/"+id,JSON.stringify(infraction),
      { headers: { "Content-Type": "application/json; charset=UTF-8"}})
  }

  oneInfraction(id:any):Observable<any>{
    return this.http.get(_URLINFRACTIONS+"oneInfraction/"+id);
  }
}
