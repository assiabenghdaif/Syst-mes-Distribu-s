import { Component } from '@angular/core';
import {faSearch,faHome} from "@fortawesome/free-solid-svg-icons";
import {ActivatedRoute, Router} from '@angular/router';
@Component({
  selector: 'app-sidenav',
  templateUrl: './sidenav.component.html',
  styleUrls: ['./sidenav.component.css']
})
export class SidenavComponent {
  faDashboard=faHome
  isClickedowners:boolean=false;
  isClickedradars:boolean=false;
  isClickeddashboard:boolean=false;
  isClickedvehicles:boolean=false;
  isClickedinfractions:boolean=false;
  constructor(private route : ActivatedRoute,private router:Router) {
  }



  owners(){
    this.router.navigateByUrl("owners");
    this.isClickedowners=true;
    this.isClickedradars=false;
    this.isClickeddashboard=false;
    this.isClickedvehicles=false;
    this.isClickedinfractions=false;
  }

  radars(){
    this.router.navigateByUrl("radars");
    this.isClickedradars=true;
    this.isClickedowners=false;
    this.isClickeddashboard=false;
    this.isClickedvehicles=false;
    this.isClickedinfractions=false;
  }

  dashboard(){
    this.router.navigateByUrl("dashboard");
    this.isClickeddashboard=true;
    this.isClickedowners=false;
    this.isClickedradars=false;
    this.isClickedvehicles=false;
    this.isClickedinfractions=false;
  }

  vehicles(){
    this.router.navigateByUrl("vehicles");
    this.isClickedvehicles=true;
    this.isClickedowners=false;
    this.isClickedradars=false;
    this.isClickeddashboard=false;
    this.isClickedinfractions=false;
  }

  infractions(){
    this.router.navigateByUrl("infractions");
    this.isClickedinfractions=true;
    this.isClickedowners=false;
    this.isClickedradars=false;
    this.isClickeddashboard=false;
    this.isClickedvehicles=false;
  }

}
