import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {BillService} from "./services/BillService/bill.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular-client-app';

  countBill:any;
  constructor(private router : Router,private http:HttpClient,private billService : BillService) { }

  ngOnInit(): void {

    this.billService.countBILLS().subscribe({
      next : (data)=>{
        this.countBill=data;
        console.log(this.countBill)
      },
      error : (err)=>{}
    });

  }
  numSequence(n: number): Array<number> {
    return Array(n);
  }

  to(i:any){
    this.router.navigateByUrl("bill/"+i);
  }

}
