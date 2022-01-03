package com.lti;

public class InheritanceTest {
	public static void main(String[] args) {
		GrandFather gf = new GrandFather();
		gf.farming();
	
		System.out.println("------------");
		
		Father father = new Father();
		father.farming();
		father.banking();
		
		System.out.println("------------");
		Child child = new Child();
		child.farming();
		child.banking();
		child.coding();
		
	}
}
class GrandFather
{
	
	GrandFather() {
		System.out.println("GrandFather() constructor...");
	}
	void farming() {
		System.out.println("GrandFather is farming...in his style..");
	}
	
}

class Father extends GrandFather
{
	Father() {
		//super();
		System.out.println("\tFather() constructor...");
	}
	void banking() {
		System.out.println("Father is banking...");
	}
	void farming() {
		System.out.println("Father is farming...via tractor");
	}
	
}

class Child extends Father 
{
	Child() {
		//super();
		System.out.println("\t\tChild() constructor...");
	}
	void banking() {
		System.out.println("Child is netbanking.....");
	}
	void farming() {
		System.out.println("Child is farming...via robo tractor");
	}
	void coding() {
		System.out.println("Child is coding in java...");
	}
	
}
