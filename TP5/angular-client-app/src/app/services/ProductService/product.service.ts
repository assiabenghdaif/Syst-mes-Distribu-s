import { Injectable } from '@angular/core';
import {GATEWAY_URL} from "../../../environments/environment";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Product} from "../../models/product/product.model";

let _URI=GATEWAY_URL+"PRODUCT-SERVICE/"
//http://localhost:8888/PRODUCT-SERVICE/products
@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http: HttpClient) { }

  getAllProducts():Observable<any>{
    return this.http.get(_URI+"products")
  }
}
