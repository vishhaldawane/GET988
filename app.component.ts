import { Component } from '@angular/core';
import { MyCalculationService } from './calculation/my-calculation.service';
import { LunchService } from './food/lunch.service';

//decorator in angular | annotation in
@Component({
  selector: 'xyz',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Vishhal';
  phy = 90;
  chem = 98;
  maths = 99;
  total = this.phy + this.chem + this.maths;

  constructor(private mcs: MyCalculationService, private ls: LunchService ) {

  }
  runMe() {
    //alert('called on button click');
    //this.total = this.phy + this.chem + this.maths;
    this.mcs.calculateCompoundInterest();
    this.mcs.calculateCurrencyRate();
    this.mcs.calculateSimpleInterest();
  }
  eat() {
    this.ls.feelingHungryLetsHaveLunch();
  }
  navbarOpen=false;

  toggleNavbar() {
    this.navbarOpen = !this.navbarOpen;
  }
}
