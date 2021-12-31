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














*/