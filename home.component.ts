import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor() { }

  jsonData = {  
      phy:90, 
      chem:95, 
      maths:99, 
      name:'Julie',
      age:23, 
      address:'West Avenue'
  };

  title="Welcome To Lti";
  today = new Date();
  
  ngOnInit(): void {
  }

}
