import { Component, OnInit } from '@angular/core';
import { BankAccount } from './BankAccount';

@Component({
  selector: 'app-bank-account',
  templateUrl: './bank-account.component.html',
  styleUrls: ['./bank-account.component.css']
})
export class BankAccountComponent implements OnInit {
  baObj: BankAccount = new BankAccount();

  baObjArray: BankAccount[] = [
      {
        accountNumber:101,
        accountHolder:"Bruce",
        accountBalance:5000, 
        isActive:true,

        show:false,
        buttonLabel:'Show Balance',

        image:'assets/bruce.jpeg',
        address:{
          area:"Ram Mahal",
          street:"West Avenue",
          city:"Mumbai",
          state:"Maharashtra",
          country:"India",
          pin:"401501"
        }

      },

      {
        accountNumber:102,
        accountHolder:"James",
        accountBalance:6000, 
        isActive:true,

        show:false,
        buttonLabel:'Show Balance',

        image:'assets/james.jpeg',
        address:{
          area:"Raheem Mnzil",
          street:"East Avenue",
          city:"Pune",
          state:"Maharashtra",
          country:"India",
          pin:"501601",
        },

      },

      {
        accountNumber:103,
        accountHolder:"Steve",
        accountBalance:7000, 
        isActive:true,

        show:false,
        buttonLabel:'Show Balance',

        image:'assets/steve.jpeg',
        address:{
          area:"Happy Home",
          street:"North Avenue",
          city:"Chennai",
          state:"Tamilnadu",
          country:"India",
          pin:"601701"
        },
      }
  ];

  constructor() { }

  ngOnInit(): void {
      this.baObj.accountNumber=100;
      this.baObj.accountHolder="Smith";
      this.baObj.accountBalance=5555;
  }
  
  showBalance(x : BankAccount) {
    if(!x.show) {
      x.show = true;
      x.buttonLabel="Hide Balance";
    } 
    else {
      x.show = false;
      x.buttonLabel="Show Balance";
    }
    console.log(x.show);
  }
}
