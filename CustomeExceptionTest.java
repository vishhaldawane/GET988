package com.lti;

public class CustomeExceptionTest {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.startTheCar();
	}
}
class RedSignalDishnouredException extends RuntimeException{ //unchecked : user defined exception
	RedSignalDishnouredException(String msg) {
		super(msg);
	}
}
class TyrePuncturedException extends RuntimeException{ //unchecked
	TyrePuncturedException(String msg) {
		super(msg);
	}
}

class StepneyFailedException extends Exception  //checked
{
	StepneyFailedException(String str) {
		super(str);
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
		catch(StepneyFailedException sfEx) {
			System.out.println("Probelm 3 : "+sfEx.getMessage());
		}
//		catch(TyrePuncturedException e) {
//			System.out.println("Problem1 : "+e.getMessage());
//		}
//		catch(RedSignalDishnouredException e) {
//			System.out.println("Problem2 : "+e.getMessage());
//		}
	}
	
	// checked exceptions must be declared in the THROWS clause of the method
	
	void longDrive() throws StepneyFailedException 
	{
		
		
		for(int i=1;i<=25;i++) {
			double value = Math.random()%10;
			if(value<0.012) {
				StepneyFailedException sfEx = new StepneyFailedException("Oh No!!! spare tyre is punctured....");
				throw sfEx;
			}
			
			System.out.println(i+" Km completed");
			
			//System.out.println("value "+value);
			if(value > 0.75 && value < 0.80 ) {
			//	Exception rte = new Exception("Oh No!!! Red Signal is dishonoured...");
			//	RuntimeException rte = new RuntimeException("Oh No!!! Red Signal is dishonoured...");
				RedSignalDishnouredException rsdhEx = new RedSignalDishnouredException("Oh No!!! Red SIGNAL is dishonoured...");
				
				throw rsdhEx;
			}
	
			if(value > 0.10 && value < 0.15) {
			//	Exception rte = new Exception("Oh No!!! One of the tyre is punctured ..");
			//	RuntimeException rte = new RuntimeException("Oh No!!! One of the tyre is punctured ..");
				TyrePuncturedException tpEx = new TyrePuncturedException("Oh No!!! One of the tyre is punctured ..");
				throw tpEx;
			}
			
		}
		stopTheCar();
	}
	void stopTheCar() {
		System.out.println("Car is stopped...");
	}
}
