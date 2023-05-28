import { Component, OnInit } from '@angular/core';
import {Customer} from "../../models/customer/customer.model";
import {HttpClient} from "@angular/common/http";
import {CustomerService} from "../../services/CustomerService/customer.service";

@Component({
  selector: 'app-customers',
  templateUrl: './customers.component.html',
  styleUrls: ['./customers.component.css']
})
export class CustomersComponent implements OnInit {

  customers :Customer[]=[];
  constructor(private http:HttpClient, private customerService:CustomerService) { }


  ngOnInit(): void {
    this.customerService.getAllCustomers().subscribe(
      data =>{
        this.customers=data._embedded.customers;
      },
      error => {}
    );
  }

}
