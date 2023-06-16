import { Component } from '@angular/core';
import {faFacebook} from "@fortawesome/free-brands-svg-icons";
import {faSearch,faDashboard} from "@fortawesome/free-solid-svg-icons";
@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {
  search = faSearch;

}
