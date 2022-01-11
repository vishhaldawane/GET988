import { Component, OnInit } from '@angular/core';
import { BankAccount } from 
'./BankAccount';
@Component({
  selector: 'app-bank-account',
  templateUrl: './bank-account.component.html',
  styleUrls: ['./bank-account.component.css']
})
export class BankAccountComponent implements OnInit {
  baObj: BankAccount = new BankAccount();

  constructor() { }

  ngOnInit(): void {
  }

}
