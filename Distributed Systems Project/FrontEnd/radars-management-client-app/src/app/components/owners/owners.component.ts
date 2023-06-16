import {Component, OnInit} from '@angular/core';
import {faEdit, faTrash} from "@fortawesome/free-solid-svg-icons";
import {Router} from "@angular/router";
import {ImmatriculationService} from "../../services/immatriculation.service";
import {Owner} from "../../models/owner";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Vehicle} from "../../models/vehicle";

@Component({
  selector: 'app-owners',
  templateUrl: './owners.component.html',
  styleUrls: ['./owners.component.css']
})
export class OwnersComponent implements OnInit{
  delete=faTrash;
  edit=faEdit;
  owners : Owner[]=[];

  isPopupOpen: boolean = false;
  openPopup(owner: Owner) {
    this.isPopupOpen = true;
    this.ownerAdd=owner;
    console.log(this.ownerAdd.birthDate)
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

  constructor(private router:Router,private immaService:ImmatriculationService) {
  }

  ngOnInit(): void {
    this.immaService.AllOwners().subscribe(
      data =>{
        this.owners=data;
      },
      error => {}
    )

  }


  deleteOwner(id:number) {
    if (confirm("Are you sure you want to delete this owner?")) {
      this.immaService.deleteOwner(id).subscribe(
        data => {
          this.ngOnInit();
        },
        error => {
        }
      )
    }
  }

  editOwner(owner:Owner){
    this.immaService.editOwner(owner.id,owner).subscribe(
      data=>{
        this.isPopupOpen=false;
        this.ngOnInit();
        this.ownerAdd=new Owner();
      },
      error => {}
    )


  }


  public newOwnerForm!: FormGroup;
  public ownerAdd:Owner=new Owner();
  addOwner() {
      this.immaService.addOwner(this.ownerAdd).subscribe(
      data=>{
        console.log(this.ownerAdd.email)
        this.isFormPopupOpen=false;
        this.ngOnInit();
        this.ownerAdd=new Owner();
      },
      error => {}
    )

  }
}
