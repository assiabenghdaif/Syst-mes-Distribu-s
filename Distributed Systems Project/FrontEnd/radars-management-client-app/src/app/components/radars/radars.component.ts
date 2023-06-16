import { Component } from '@angular/core';
import {faEdit, faTrash} from "@fortawesome/free-solid-svg-icons";
import {Radar} from "../../models/radar";
import {ImmatriculationService} from "../../services/immatriculation.service";
import {Router} from "@angular/router";
import {RadarService} from "../../services/radar.service";

@Component({
  selector: 'app-radars',
  templateUrl: './radars.component.html',
  styleUrls: ['./radars.component.css']
})
export class RadarsComponent {

  delete=faTrash;
  edit=faEdit

  radars : Radar[]=[];

  isPopupOpen: boolean = false;
  openPopup(radar: Radar) {
    this.isPopupOpen = true;
    this.radarAdd=radar;
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

  constructor(private router:Router,private radService:RadarService) {
  }

  ngOnInit(): void {
    this.radService.AllRadars().subscribe(
      data =>{
        this.radars=data;
      },
      error => {}
    )

  }


  deleteRadar(id:number) {
    if (confirm("Are you sure you want to delete this radar?")) {
      this.radService.deleteRadar(id).subscribe(
        data => {
          this.ngOnInit();
        },
        error => {
        }
      )
    }
  }

  editRadar(radar:Radar){
    this.radService.editRadar(radar.id,radar).subscribe(
      data=>{
        this.isPopupOpen=false;
        this.ngOnInit();
        this.radarAdd=new Radar();
      },
      error => {}
    )


  }


  public radarAdd:Radar=new Radar();
  addRadar() {
    this.radService.addRadar(this.radarAdd).subscribe(
      data=>{
        this.isFormPopupOpen=false;
        this.ngOnInit();
        this.radarAdd=new Radar();
      },
      error => {}
    )

  }
}
