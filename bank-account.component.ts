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
    {accountNumber:101,accountHolder:"Julie",accountBalance:5000, isActive:true},
    {accountNumber:102,accountHolder:"Janet",accountBalance:6000, isActive:true},
    {accountNumber:103,accountHolder:"Jennie",accountBalance:7000, isActive:true}
  ];

  constructor() { }

  ngOnInit(): void {
      this.baObj.accountNumber=100;
      this.baObj.accountHolder="Smith";
      this.baObj.accountBalance=5555;
  }

}
