package com.lti;
public class BankAccount { // "Class" is the blueprint of an "Object"	
	int accountNumber; String accountHolder; double accountBalance;	
	public void setBankAccount(int x, String y, double z) {
		System.out.println("setBankAccount(int,String,double)....");
		accountNumber = x; accountHolder = y; accountBalance = z;
	}
	public void withdraw(float amt) {
		System.out.println("withdrawing...."+amt); 
		accountBalance = accountBalance - amt;
	}
	public void deposit(float amt) {
		System.out.println("depositing...."+amt);
		accountBalance = accountBalance + amt;
	}
	public void transfer(float amt) {
		System.out.println("transferring...."+amt);
	}
	public void showBankAccount() {
		System.out.println("Account Number  : "+accountNumber);
		System.out.println("Account Name    : "+accountHolder);
		System.out.println("Account Balance : "+accountBalance);
		System.out.println("---------------------------");
	}
}
