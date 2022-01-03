package com.lti;
public class BankTest {
	public static void main(String[] args) {
		System.out.println("Begin main");
		BankAccount baObj1 = new BankAccount(101,"Jack",5000); // it will create data+ functions
	
		baObj1.showBankAccount();
		//baObj1.accountBalance=9999999;
		baObj1.showBankAccount();
		
		
		baObj1.withdraw(400);
		baObj1.showBankAccount();
		
		baObj1.deposit(9000);
		baObj1.showBankAccount();
		
		
		System.out.println("End main");
	}
}

/*
  
 "Object" is an instance of the "Class"
 
	BankAccount baObj = new BankAccount(); 
	|			 |		 |			|
	classname refName allocator	constructor(); 
			
	
	baObj -> reference to an object [ it is not at all an object ]
	
		stack						heap
		|							<--------------fields of the object ------------>
									-------------------------------------------------		
									|accountNumber	|accountHolder|	accountBalance	|
									-------------------------------------------------
									|				|			  |					|
									-------------------------------------------------
		+-------------------------->100 <-- address of this object
		|
		100 <-- value of baObj
		baObj		
									Method area
	
									BankAccount() <-- default constructor in each class
									withdraw()
									deposit()
									transfer()
										
*/