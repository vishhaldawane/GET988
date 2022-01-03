package com.lti;

//in .java file (source code) only one class can be public 
// and that must be the "file name" of the source code too

// the public class must be saved in its "own file"

public class Greeting { // Greeting.java
	public static void main(String[] args) {
		System.out.println("Hello World of Java");
		System.out.println("Hello Java");
		System.out.println("Java Is Powerful");
	}
}
class Greeting2 {
	public static void main(String[] args) {
		System.out.println("Hello World of Java2");
		System.out.println("Hello Java2");
		System.out.println("Java Is Powerful2");
	}
}
/*
 

					Java Technology
							|
				----------------------------
				|			|			|
				JSE			JEE			JME
				|			|enterprise	  |  [Android]
			Standard/	---------------	  mobile application development 
			Desktop		|			|
			|			WEB			EJB
	-----------			|			|
	|					servlet		--------------------------
language fundamentals	JSP			|			|			|
oops concepts			|			Session		Entity		Message
packages				Angular		|			|				|
exception handling			-----------		  ---------		  ----------
#multithreading				|		  |		  |		|		  |		|
generics     airindia.com Stateless Stateful DML  Automate	  SMS	Mail
collection				  <-----Spring----->   <-Hibernate->		
#file handling
jdbc


stored procedure/function

create or replace function fundTransfer(.....) ---> methods in java 
as
begin
end;


						Java Programs
								|
				----------------------------------
				|				|				|
				application		applets		servlets
				|				|				|
		---------------			<---life cycle methods--->
		|
		main()
		
But what if the main method is not there?????
		

		
	Object = data + methods (functions/behaviour)
	|			|		|		
real time	breed		chaseMice() { }
entity		color		drinkMilk() { }
  Cat		height		eatFish() { }
  			weight		snooze() { }
  			sound		
  			
		
1. BankTest.java
	class BankTest
	{
		public static void main(String args[]) {
			// Create "an object" of "that class"
			 
			 BankAccount baObj = new BankAccount();
			 
		}
	}

2. BankAccount.java
	class BankAccount
	{
		void withdraw(float amt) {
		}
		void deposit(float amt) {
		}
		void transfer(float amt) {
		}
	}
	
	class BankAccount
	{
		int accountNumber;
		String accountHolder;
		double accountBalance;
		
		void setBankAccount(int an, String ahn, double ab) {
			accountNumber = an;
			accountHolder = ahn;
			accountBalance = ab;
		}
	
		void withdraw(float amt) {
			accountBalance = accountBalance - amt;
		}
		
		void deposit(float amt) {
			accountBalance = accountBalance + amt;
		
		}
		
		void transfer(float amt) {
			accountBalance = accountBalance - amt;
	
		}
	}

				
	class ClassName
	{
			DATA SECTION - data members - fields - instance varables
			+
			METHOD SECTION - member methods - functions - instance functions
	}



	Constructor
	------------
	
				1. is a special code block that has the "same name"
				   as of the "enclosing class"
				   
				   class BankAccount
				   {
				   		BankAccount()
				   		{
				   		
				   		}
				   }
				   
				2. it is automatically invoked during the instance creation time

				3. A constructor does not have a return type
				
				
				4. But it can take parameters/arguments
				
				5. hence it can be overloaded
				
				6. initialize the state of the object
				
				7. A constructor is called once per object
				
				
	Constructor overloading
	
	
	
	OOPs concepts
	--------------
	
	1. Abstraction
		
		Hiding the complexity of an object
		and providing its usage via simple accessible functions
		
		
		It is the "what is?" part of an object
		
		"What is" an ATM? - dispense cash is the concern of a layman 
		
		a. data abstraction
			how much cash inside atm?
			how many customers accessed the atm till date?
			how much average cash dispensed each day?
			
		b. procedural abstraction
			logging(), scanning(), securityCheck()
		
		
		
			System.out.println("Hello");
			
			
	2. Encapsulation
	
		It is the "How is it?" part of an object
		
		"How does it dispense?" - internal working of it is known to the
								ATM engineer.
								
		binding of the data and code together in such a way that
		the data is kept as private and is available to
		the outside world via simple accessible public functions
		
		class BankAccount
		{
			private double balance; // DATA AND FUNCTION IS ENCAPSULATED HERE
			
			public BankAccount(double b) { balance = b; }
			
			public void withdraw(float amt) {
				balance = balance - amt;
			}
		}
		class BankTest
		{
			main() {
				BankAccount ba = new BankAccount(5000);
				ba.withdraw(400); //WE ARE USING THE DATA AND FUNCTION
				ba.balance = 44444444; // invalid
			}
		}
		
	
								
	
	3. Poly-morphism
	
		ability of a "business entity" to acquire multiple forms
		
		a. class extension
		
					Doctor <-- ability of Doctor to appear as Surgeon
					|
			----------------
			|isA
			Surgeon <-- ability of Surgeon to appear as HeartSurgeon
			|
		----------
		|isA
	HeartSurgeon <-- 
		
		b. function overloading
		c. function overriding
		d. operator overloading
		
	
	
	4. Inheritance
	
		ability of a "business entity" to acquire properties from
		existing "business entites"
		
		- reuse of the code
		
	5. Object communication
	
		ability of a business entity to talk to other business entities
		
	
	
	






*/