import { Injectable } from '@angular/core';
import {GATEWAY_URL} from "../../../environments/environment";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

let _URI=GATEWAY_URL+"BILLING-SERVICE/"
@Injectable({
  providedIn: 'root'
})
export class BillService {

  constructor(private http: HttpClient) { }

  getBills(id:any):Observable<any>{
    return this.http.get(_URI+"fullbill/"+id);
  }

  countBILLS():Observable<any>{
    return this.http.get(_URI+"billcount");
  }
}
