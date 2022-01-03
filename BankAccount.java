package com.lti;
public class BankAccount { // "Class" is the blueprint of an "Object"	
	int accountNumber=9; String accountHolder="Jack"; double accountBalance=9.9;	
	//there is a default constructor in this class
	BankAccount() {
		System.out.println("BankAccount()...explicit constructor...");
		accountNumber=18;  accountHolder="Jacky"; accountBalance=18.18;
	}
	public BankAccount(int x, String y, double z) { //set all the values...
		System.out.println("BankAccount(int,String,double)...constructor....");
		accountNumber = x; accountHolder = y; accountBalance = z;
	}
	public BankAccount(int x, double z,String y) { //set all the values...
		System.out.println("BankAccount(int,double,String)...constructor....");
		accountNumber = x; accountHolder = y; accountBalance = z;
	}
	public BankAccount(String y, double z,int x) { //set all the values...
		System.out.println("BankAccount(String,double,int)...constructor....");
		accountNumber = x; accountHolder = y; accountBalance = z;
	}
	public BankAccount(String y, int x, double z) { //set all the values...
		System.out.println("BankAccount(String,int,double)...constructor....");
		accountNumber = x; accountHolder = y; accountBalance = z;
	}
	public BankAccount(int x, String y) { //set 2 values...
		System.out.println("BankAccount(int,String)...constructor....");
		accountNumber = x; accountHolder = y;
	}
	public BankAccount(int x) { //set 2 values...
		System.out.println("BankAccount(int)...constructor....");
		accountNumber = x; 
	}
	public BankAccount( String y) { //set 2 values...
		System.out.println("BankAccount(int,String)...constructor....");
		accountHolder = y;
	}
	public BankAccount(int x, double z) { //set all the values...
		System.out.println("BankAccount(int,double)...constructor....");
		accountNumber = x;  accountBalance = z;
	}
	public BankAccount( double z,int x) { //set all the values...
		System.out.println("BankAccount(double,int)...constructor....");
		accountNumber = x;  accountBalance = z;
	}
	public BankAccount(String y, double z) { //set all the values...
		System.out.println("BankAccount(String,double)...constructor....");
		accountHolder = y; accountBalance = z;
	}
	public BankAccount(double z) { //set all the values...
		System.out.println("BankAccount(double)...constructor....");
		 accountBalance = z;
	}
	public BankAccount( double z,String y) { //set all the values...
		System.out.println("BankAccount(double,String)...constructor....");
		accountHolder = y; accountBalance = z;
	}
	
	public void setBankAccount(int x, String y, double z) { //set all the values...
		System.out.println("setBankAccount(int,String,double)....");
		accountNumber = x; accountHolder = y; accountBalance = z;
	}
	public void withdraw(float amt) { //change the balance
		System.out.println("withdrawing...."+amt); 
		if(amt<0) {
			System.out.println("Withdraw amount cannot be in negative...");
		}
		else if(amt>accountBalance) {
			System.out.println("Insufficient funds...cannot withdraw...");
		}
		else
			accountBalance = accountBalance - amt;
	}
	public void deposit(float amt) { // change the balance
		System.out.println("depositing...."+amt);
		if(amt<0) {
			System.out.println("Deposit amount cannot be in negative....");
		}
		else if(amt>50000) {
			System.out.println("Please show the income proof of this "+amt);
		}
		else
			accountBalance = accountBalance + amt;
	}
	public void transfer(float amt) {
		System.out.println("transferring...."+amt);
	}
	public void showBankAccount() { //just to show it , not to change it
		System.out.println("Account Number  : "+accountNumber);
		System.out.println("Account Name    : "+accountHolder);
		System.out.println("Account Balance : "+accountBalance);
		System.out.println("---------------------------");
	}
}
