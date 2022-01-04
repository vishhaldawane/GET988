package com.lti;

public class CustomeExceptionTest {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.startTheCar();
	}
}

class Car
{
	void startTheCar() {
		System.out.println("Car is started...");
	
		try
		{
			longDrive(); //Unhandled exception type Exception
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// checked exceptions must be declared in the THROWS clause of the method
	
	void longDrive()  throws Exception //
	{
		for(int i=1;i<=25;i++) {
			System.out.println(i+" Km completed");
			double value = Math.random()%10;
			//System.out.println("value "+value);
			if(value > 0.75 && value < 0.80 ) {
				Exception rte = new Exception("Oh No!!! Red Signal is dishonoured...");
			//	RuntimeException rte = new RuntimeException("Oh No!!! Red Signal is dishonoured...");
				throw rte;
			}
			
			
			if(value > 0.10 && value < 0.15) {
				Exception rte = new Exception("Oh No!!! One of the tyre is punctured ..");
			//	RuntimeException rte = new RuntimeException("Oh No!!! One of the tyre is punctured ..");
				throw rte;
			}
			
		}
		stopTheCar();
	}
	void stopTheCar() {
		System.out.println("Car is stopped...");
	}
}
