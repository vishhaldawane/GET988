package com.lti;
public class BankTest {
	public static void main(String[] args) {
		System.out.println("Begin main");
		BankAccount baObj1 = new BankAccount(101,"Jack",5000); // it will create data+ functions
		BankAccount baObj2 = new BankAccount(102,"Jill",6000);
		BankAccount baObj3 = new BankAccount(103,"Jane",7000);
		BankAccount baObj4 = new BankAccount(104,"Janet",8000);
		BankAccount baObj5 = new BankAccount(105,"Smith",9000);
		
		BankAccount baObj6 = new BankAccount("Miller", 5555.0, 106);
		
		baObj6.showBankAccount();
		
		baObj1.showBankAccount();
		baObj2.showBankAccount();
		baObj3.showBankAccount();
		baObj4.showBankAccount();
		baObj5.showBankAccount();
		
//		
//		baObj.setBankAccount(101, "Julie", 5000);
//		
//		baObj.showBankAccount();
//
//		baObj.setBankAccount(102, "Julia", 6000);
//		
//		baObj.showBankAccount();
//		
//		baObj.deposit(-52000);
//		baObj.showBankAccount();
//		
//		baObj.withdraw(800);
//		baObj.showBankAccount();
//		
//		baObj.withdraw(700);
//		baObj.showBankAccount();
		
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