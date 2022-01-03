package com.lti;

public class PhoneTest {
	public static void main(String[] args) {
		Phone myPhone = new Phone();
		myPhone.dial("Anjali",22);
		myPhone.dial(11,"Divya");
		myPhone.dial(9.5f);
		myPhone.dial("Vishhal");
		myPhone.dial(33, 454545);
		myPhone.dial(111);
	}
}
class Phone
{
	void dial(int i) {
		System.out.println("dial(int) ...."+i);
	}
	void dial(int code,int num) {
		System.out.println("dial(int,int) ....("+code+")"+num);
	}
	
	void dial(int code,String name) {
		System.out.println("dial(int,String) ....("+code+")"+name);
	}
	
	void dial(String name,int code) {
		System.out.println("dial(String,int) ...."+name+"("+code+")");
	}
	
	void dial(String name) {
		System.out.println("dial(String) ...."+name);
	}
	void dial(float number) {
		System.out.println("dial(float) ...."+number);
			
	}
	void dial(double number) {
		System.out.println("dial(double) ...."+number);	
	}
}
