package com.lti;

class Cashier
{
	void dispenseCash(BankAccount baRef, float amt) {
		System.out.println("Cashier is dispensing cash..");
		baRef.withdraw(amt);
	}
}
public class ObjectCommunicationTest {
	public static void main(String[] args) {
		
		BankAccount baObj = new BankAccount(101,"Julie",5000);
		baObj.showBankAccount();
		
		Cashier cashier = new Cashier();
		cashier.dispenseCash(baObj, 500);
		
		baObj.showBankAccount();

		/*BankAccount baRef = baObj;
		baRef.withdraw(400);
		baRef.showBankAccount();
		
		
		BankAccount x = baRef;
		x.withdraw(300);
		x.showBankAccount();
		
		BankAccount y = baObj;
		y.withdraw(200);
		y.showBankAccount();
		
		System.out.println("baObj : "+baObj);
		System.out.println("baRef : "+baRef);
		System.out.println("x     : "+x);
		System.out.println("y     : "+y);
		
		baObj.showBankAccount();*/
		
	}
}
