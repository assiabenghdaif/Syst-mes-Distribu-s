import { Component } from '@angular/core';
import {faEdit, faSearch, faTrash} from "@fortawesome/free-solid-svg-icons";
import {Vehicle} from "../../models/vehicle";
import {ImmatriculationService} from "../../services/immatriculation.service";
import {Router} from "@angular/router";
import {Owner} from "../../models/owner";

@Component({
  selector: 'app-vehicles',
  templateUrl: './vehicles.component.html',
  styleUrls: ['./vehicles.component.css']
})
export class VehiclesComponent {

  delete=faTrash;
  edit=faEdit

  vehicles : Vehicle[]=[];
  owners : Owner[]=[];

  isPopupOpen: boolean = false;
  openPopup(vehicle: Vehicle) {
    this.isPopupOpen = true;
    this.vehicleAdd=vehicle;
  }
  closePopup() {
    this.isPopupOpen = false;
  }
  isFormPopupOpen: boolean = false;
  displayStyle = "none";
  openFormPopup() {
    this.isFormPopupOpen = true;
    this.displayStyle = "block";
    this.immaService.AllOwners().subscribe(
      data =>{
        this.owners=data;
      },
      error => {}
    )

  }

  closeFormPopup() {
    this.isFormPopupOpen = false;
    this.displayStyle = "none";
  }

  constructor(private router:Router,private immaService:ImmatriculationService) {
  }

  ngOnInit(): void {
    // this.immaService.getOwnerInVehicle(this.vehicles).subscribe(
    //
    // )
    this.immaService.AllVehicles().subscribe(
      data =>{
        this.vehicles=data._embedded.vehicles;

        for (let vehicle of this.vehicles) {
          let id=vehicle._links.owner.href.split("/");
          console.log(id)
          this.immaService.getOwnerInVehicle(id[4]).subscribe(
            data=>{
              vehicle.owner=data
            },
            error => {}
          )
        }
      },
      error => {}
    )



  }


  deleteVehicle(id:number) {
    if (confirm("Are you sure you want to delete this vehicle?")) {
      this.immaService.deleteVehicle(id).subscribe(
        data => {
          console.log("hi")
          this.ngOnInit();
        },
        error => {
        }
      )
    }
  }

  editVehicle(vehicle:Vehicle){
    this.immaService.editVehicle(vehicle.id,vehicle).subscribe(
      data=>{
        this.isPopupOpen=false;
        this.ngOnInit();
        this.vehicleAdd=new Vehicle();
      },
      error => {}
    )


  }


  public vehicleAdd:Vehicle=new Vehicle();
  public ownerId:any;
  addVehicle() {
    console.log(this.ownerId);
    this.immaService.oneOwner(this.ownerId).subscribe(
      data=>{
        this.vehicleAdd.owner=data;
      },
      error => {}
    )

    this.immaService.addVehicle(this.vehicleAdd).subscribe(
      data=>{
        this.isFormPopupOpen=false;
        this.ngOnInit();
        this.vehicleAdd=new Vehicle();
      },
      error => {}
    )

  }


}
