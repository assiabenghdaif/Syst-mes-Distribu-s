import { Component, OnInit } from '@angular/core';
import {Customer} from "../../models/customer/customer.model";
import {HttpClient} from "@angular/common/http";
import {CustomerService} from "../../services/CustomerService/customer.service";
import {Bill} from "../../models/bill/bill.model";
import {BillService} from "../../services/BillService/bill.service";
import {Router, RouterLink} from "@angular/router";
import {ProductItem} from "../../models/productItems/product-item.model";

@Component({
  selector: 'app-bills',
  templateUrl: './bills.component.html',
  styleUrls: ['./bills.component.css']
})
export class BillsComponent implements OnInit {
//constructor(producti:ProductItem,public i:number, public billDat:string, public customerEmai : string,customerNam:string){
  productItem :ProductItem[]=[]
  public bill :Bill=new Bill(0 ,'','','', this.productItem);
  //=new Bill(new ProductItem( , , ' ', ''), ,'','','');
  public routelink: any=this.router.url.split("/")[2];

  public pro:ProductItem=new ProductItem(0,0,'','');
  constructor(private router: Router,private http:HttpClient, private billService:BillService) {

    this.routelink=this.router.url.split("/")[2];

  }


  ngOnInit(): void {
    console.log(this.routelink)
    this.billService.getBills(this.routelink).subscribe(
      data =>{
        this.bill=data;
        // this.pro=new ProductItem(this.bill.productItem[0].id,0,'','');
      },
      error => {}
    );
  }

}
