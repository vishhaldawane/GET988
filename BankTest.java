package com.lti;
public class BankTest {
	public static void main(String[] args) {
		System.out.println("Begin main");
		BankAccount baObj = new BankAccount(); // it will create data+ functions
		baObj.setBankAccount(101, "Julie", 5000);
		baObj.showBankAccount();
		baObj.withdraw(300);
		baObj.showBankAccount();
		baObj.withdraw(1300);
		baObj.showBankAccount();

		
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