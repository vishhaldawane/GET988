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
					|diagnose() { }
			----------------
			|isA
			Surgeon <-- ability of Surgeon to appear as HeartSurgeon
			|diagnose() { }
		----------
		|isA diagnose() { }
	HeartSurgeon <-- 
		
		b. function overloading
			ability of a function to be redefined on the following terms
			i. type of parameters
			ii. number of parameters
			iii. sequence of type of parameters
			
			
		c. function overriding
			let the child class redefine its parent's function
			with same name and arguments
			- child class is hiding the parent class's function
			
				
		d. operator overloading
			ability of an operator to play different roles
			
	
	
	4. Inheritance
	
		ability of a "business entity" to acquire properties from
		existing "business entites"
		
		- reuse of the code
		
		EVERY CONSTRUCTOR GIVES A CALL TO ITS PARENT'S CONSTRUCTOR
		USING super();
		
		class A 			// A is not inheriting to B
		{
			 private int i;
			 
			 A() { 
			 	super();
			 }
		}
		
		class B extends A   // class B is acquiring from A
		{
			private int j;
			B() { 
				super();
			}
		}
		
		there are 2 variables inside class B, ie i and j
		
		
		class C extends B   // class C is acquiring from B
		{
			private int k;
			C() { 
				super();
			}
			
		}
		
		there are 3 variables inside class C, ie i,j and k
		
		
		
		1. linear
			A  single leve
			|
			B
			
			A multi-level
			|
			B
			|
			C
			
		2. non - linear
		
				hierarchical level 
				
				InterfaceX
				|
				A		InterfaceY	InterfaceZ
				|		|			|
				B--------------------
				|
				|	InterfaceD
				]		|
				+--------
				|
				C
		
		
		
	5. Object communication
	
		ability of a business entity to talk to other business entities
		
		
		class BankAccount{
			
			void withdraw() {
			
			}
		}
		
		class Cashier
		{
			void dispenseCash(BankAccount ref, double amt) {
				ref.withdraw(amt);
			}
		}
		
		class Test {
			void main() {
				BankAccount ba = new BankAccount();
				Cashier  cashier = new Cashier();
				cashier.dispenseCash(ba,500);
			}
		}
		
	
	
	int num=190;
	
	=======================================================================			

				final				static				abstract/partial/
															incomplete
	=======================================================================			
				
	field		CONSTANT/			SHARED					NA
				immutable			FIELD ACROSS
				field				ALL THE OBJECTs
									of the class
	-----------------------------------------------------------------------
				cannot be			TO REFER			partial contract
	method		overridden			OTHER STATIC		of a class/method
				by the child		MEMBER				without code body
				class
	-----------------------------------------------------------------------
				cannot be			class within		a class that cannot
	class		extended/			a class/			be instantiated/instance
				subclassed			nested class		of it can never be prepared
	-----------------------------------------------------------------------

	
	
Abstract class
----------------


	a class with partial contract
	
	IT CAN HAVE MULTIPLE ABSTRACT METHODS
	
	AND ALL THESE ABSTRACT METHODS MUST BE
	DEFINED BY THE IMMEIDATE NON-ABSTRACT CHILD
	
	ABSTRACT CLASS MAY HAVE NON-ABSTRACT METHODS TOO
	
	IT CAN ALSO HAVE CONSTRUCTOR!!! WHATS THE USE OF IT
	
	IT IS FOR DERIVED CLASSES / CHILD 
	
	
Interfaces
-----------


		it is a pure abstract class
		
		it only has abstract methods
		
		it cannot have non-abstract methods
		
		by default all methods are public and abstract
		
		and all variables are static final
		
		
		
		In java one class can  only extend from one class
		
		class A
		{
		}
		
		class B {
		}
		
		class C extends B,A //invalid
		{
		
		}
		
		but one interface can extend from another interface(s)
		
		
=========================

	Exception handling
	 |
	 runtime error
	 
	 						Errors
	 							|
	 	--------------------------------------------------
	 		|		|		|		  |			  |
	 	compile  linker	  runtime 	fatal  		logical
	 	 |		 |			|		  |				|
	 	syntax  library  Exception	disk error		4 x or + 4 = 16 or 8
	 			missing				i/o error
	 								overflow
	 
	 
	 				Object
	 					|
	 			------------------
	 			|				|
	 						Throwable
	 							|
	 					-----------------
	 					|			|
	 					Error		Exception
	 								|  "checked" by the compiler
	 						----------------------------------------
	 						|					|				|
	 				RuntimeException			IOException  SQLException
	 						|"unchecked" by 		|
	 						| the compiler	 FileNotFoundException
	 						|
	 	-----------------------------------------------
	 	|			|  |   | 				 	| 	|
ArithmeticException |  | NullPointerException 	| RedSignalDishnouredException
	 		        | InputMismatchedException	TyrePuncturedException			
	 	IndexOutOfBoundsException
	 				|
	 	-------------------------
	 	|						|
ArrayIndexOutOfBoundsException StringIndexOutOfBoundsException			
	 						
	 						
	 	If you want to lock you house
	 	
	 		that depends upon the lock type
	 		
	 		1. Lock + Key <-- manual lock
	 		
	 		2. Lock with MemoryNumber
	 						
	 		3. AutoLockDoor <- here lock is assembled on the door
	 				and KEY must be carried by you while exiting/locking
	 		
	 		4. AutoLock + Key
	 		
	 		
	 				Car
	 				|
	 		-------------------
	 		|				| BEFORE
	 		shortDrive()	longDrive() DURING
 	 		5				25 AFTER
	 		|				|
	 	1	no stepney 		stepney check is must*
	 		check
	 		
	 	2	key				key			   - CarKeyNotFoundExeption
	 	3	DrivingLicence	DrivingLicence - DrivingLicenceExpiredExeption
	 	4.	PUC				PUC			   - PUCNotRenewedException
	 	5.	Insurance		Insurance	   - CarInsuranceNotRenewedException
	 	6.	RC Book			RC Book		   - RCBookNotFoundException
	 		
	 	7.	no fuel check	fuel check*
	 	
	 	8.  no tyre pressure  all tyres must be checked *
	 		check			  for the pressure
	 		
	 		
	 		
	 		
	 		
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
		
		
		
		
		
		
		
	
	
	
	





*/