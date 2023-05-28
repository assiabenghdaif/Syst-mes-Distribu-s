import { Injectable } from '@angular/core';
import {GATEWAY_URL} from "../../../environments/environment";
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";

let _URI=GATEWAY_URL+"CUSTOMER-SERVICE/"
//http://localhost:8888/CUSTOMER-SERVICE/customers
@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private http: HttpClient) { }

  getAllCustomers():Observable<any>{
    return this.http.get(_URI+"customers")
  }
}
