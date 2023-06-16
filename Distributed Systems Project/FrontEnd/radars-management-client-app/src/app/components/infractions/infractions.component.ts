import { Component } from '@angular/core';
import {faEdit, faTrash} from "@fortawesome/free-solid-svg-icons";
import {ImmatriculationService} from "../../services/immatriculation.service";
import {Router} from "@angular/router";
import {InfractionService} from "../../services/infraction.service";
import {Infraction} from "../../models/infraction";
import {RadarService} from "../../services/radar.service";
import {Radar} from "../../models/radar";
import {Vehicle} from "../../models/vehicle";

@Component({
  selector: 'app-infractions',
  templateUrl: './infractions.component.html',
  styleUrls: ['./infractions.component.css']
})
export class InfractionsComponent {
  delete=faTrash;
  edit=faEdit

  infractions : Infraction[]=[];
  public radars:Radar[]=[];
  public vehicles:Vehicle[]=[];

  isPopupOpen: boolean = false;
  openPopup(infraction: Infraction) {
    this.isPopupOpen = true;
    this.infractionAdd=infraction;
  }
  closePopup() {
    this.isPopupOpen = false;
  }
  isFormPopupOpen: boolean = false;
  displayStyle = "none";
  openFormPopup() {
    this.isFormPopupOpen = true;
    this.displayStyle = "block";

  }

  closeFormPopup() {
    this.isFormPopupOpen = false;
    this.displayStyle = "none";
  }

  constructor(private router:Router,private infaService:InfractionService,private raService:RadarService,private immaService:ImmatriculationService) {
  }


  ngOnInit(): void {
    this.infaService.AllInfractions().subscribe(
      data =>{
        this.infractions=data;
      },
      error => {}
    )
    this.raService.AllRadars().subscribe(
      data => {
        this.radars=data;
      },
      error => {}
    )

    this.immaService.AllVehicles().subscribe(
      data => {
        this.vehicles=data._embedded.vehicles;
      },
      error => {}
    )

  }


  deleteInfraction(id:number) {
    if (confirm("Are you sure you want to delete this infraction?")) {
      this.infaService.deleteInfraction(id).subscribe(
        data => {
          this.ngOnInit();
        },
        error => {
        }
      )
    }
  }

  editInfraction(infraction:Infraction){
    this.infaService.editInfraction(infraction.id,infraction).subscribe(
      data=>{
        this.isPopupOpen=false;
        this.ngOnInit();
        this.infractionAdd=new Infraction();
      },
      error => {}
    )


  }


  public infractionAdd:Infraction=new Infraction();

  radarId:any;
  addInfraction() {
    this.infaService.addInfraction(this.infractionAdd).subscribe(
      data=>{

        this.isFormPopupOpen=false;
        this.ngOnInit();
        this.infractionAdd=new Infraction();
      },
      error => {}
    )

  }
}

