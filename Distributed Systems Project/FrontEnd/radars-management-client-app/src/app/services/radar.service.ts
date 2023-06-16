import { Injectable } from '@angular/core';
import {environment} from "../../environments/environment";
import {Radar} from "../models/radar";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";


let _URLIRADAR=environment.GATEWAY_URL+environment.RADAR_SERVICE+environment.RADARS

@Injectable({
  providedIn: 'root'
})
export class RadarService {

  constructor(private http: HttpClient) { }


  AllRadars():Observable<any>{
    return this.http.get(_URLIRADAR+"allRadars");
  }

  deleteRadar(id:any):Observable<any>{
    return this.http.delete(_URLIRADAR+"deleteRadar/"+id);
  }

  addRadar(radar : Radar):Observable<any>{
    return this.http.post(_URLIRADAR+"addRadar", JSON.stringify(radar),
      { headers: { "Content-Type": "application/json; charset=UTF-8"}})
  }

  editRadar(id:any,radar : Radar):Observable<any>{
    return this.http.put(_URLIRADAR+"editRadar/"+id,JSON.stringify(radar),
      { headers: { "Content-Type": "application/json; charset=UTF-8"}})
  }


}
