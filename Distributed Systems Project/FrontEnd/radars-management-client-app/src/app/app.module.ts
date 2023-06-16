import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { environment } from './../environments/environment';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {RouterModule} from "@angular/router";
import {CommonModule} from "@angular/common";
import {HttpClientModule} from "@angular/common/http";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { SidenavComponent } from './components/sidenav/sidenav.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { OwnersComponent } from './components/owners/owners.component';
import { VehiclesComponent } from './components/vehicles/vehicles.component';
import { HeaderComponent } from './components/header/header.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { RadarsComponent } from './components/radars/radars.component';
import { InfractionsComponent } from './components/infractions/infractions.component'

@NgModule({
  declarations: [
    AppComponent,
    SidenavComponent,
    DashboardComponent,
    OwnersComponent,
    VehiclesComponent,
    HeaderComponent,
    RadarsComponent,
    InfractionsComponent,



  ],
  imports: [
    FontAwesomeModule,
    BrowserModule,
    AppRoutingModule,
    RouterModule,
    BrowserModule,
    CommonModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule,

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
  constructor() {
    console.log(environment.production); // Logs false for development environment
  }
}
