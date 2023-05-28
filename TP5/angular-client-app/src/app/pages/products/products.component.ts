import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {ProductService} from "../../services/ProductService/product.service";
import {Product} from "../../models/product/product.model";

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  products : Product[]=[];
  constructor(private http:HttpClient,private productService : ProductService) { }

  ngOnInit(): void {

    this.productService.getAllProducts().subscribe({
      next : (data)=>{
        this.products=data._embedded.products;
      },
      error : (err)=>{}
    });

  }
}
