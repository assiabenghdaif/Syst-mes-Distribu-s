import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {AppComponent} from "./app.component";
import {OwnersComponent} from "./components/owners/owners.component";
import {VehiclesComponent} from "./components/vehicles/vehicles.component";
import {DashboardComponent} from "./components/dashboard/dashboard.component";
import {RadarsComponent} from "./components/radars/radars.component";
import {InfractionsComponent} from "./components/infractions/infractions.component";

const routes: Routes = [
  {path :"dashboard" ,component: DashboardComponent},
  {path :"owners" ,component: OwnersComponent},
  {path :"vehicles" ,component: VehiclesComponent},
  {path :"radars" ,component: RadarsComponent},
  {path :"infractions" ,component: InfractionsComponent},

  // {path : "owners/addOwner", component : AddOwnerComponent}

  // {path: '', component: AppComponent, children:[
  //     {path: 'owners', component: OwnersComponent }
  //   ]}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
