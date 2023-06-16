import {Component, OnInit} from '@angular/core';
import {ImmatriculationService} from "../../services/immatriculation.service";
import {RadarService} from "../../services/radar.service";
import {InfractionService} from "../../services/infraction.service";
import {Router} from "@angular/router";
import {Radar} from "../../models/radar";
import {Vehicle} from "../../models/vehicle";
import {Infraction} from "../../models/infraction";

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit{

  constructor(private immaServce:ImmatriculationService,private radService:RadarService,private infService:InfractionService,private route:Router) {
  }

  radars:Radar[]=[]
  vehicles:Vehicle[]=[]
  infractions:Infraction[]=[]

  countVeh:number=0;
  countRad:number=0;
  countInf:number=0;
  ngOnInit(): void {
    this.countVehicles();
    this.countRadars();
    this.countInfractions();

  }

  countVehicles(){
    this.immaServce.AllVehicles().subscribe(
      data=>{
        this.vehicles=data._embedded.vehicles;
        for (let vehicle of this.vehicles) {
          this.countVeh++;
        }
      },
      error => {}
    )
  }

  countInfractions(){
    this.infService.AllInfractions().subscribe(
      data=>{
        this.infractions=data;
        for (let infraction of this.infractions) {
          this.countInf++;
        }
      },
      error => {}
    )
  }

  countRadars(){
    this.radService.AllRadars().subscribe(
      data=>{
        this.radars=data;
        for (let radar of this.radars) {
          this.countRad++;
        }
      },
      error => {}
    )
  }
}
