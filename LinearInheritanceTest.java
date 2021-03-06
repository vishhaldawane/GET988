package com.lti;
/*
 * 
 * 			Person*
 * 				|
 * 		------------------
 * 		|			|
 * 	Student*		Magician
 * 		|			 some datamembers + some member functions
 * --------------
 * |			|
 * Employee*	MedicalStudent
 * 					| some data members
 * 					| some member functions
 * 					|
 * 				  Doctor
 * 					| some data members
 * 					| some member functions
 * 
 */
public class LinearInheritanceTest {
	public static void main(String[] args) {
		
		Person p = new Person();
		p.setPerson('F',22,"Julia");
		p.show();
		
		System.out.println("--------");
		
		Student s = new Student();
		
		s.setStudent('F',23,"Rita", 123,'A', 95.9f);
		s.show();
		
		System.out.println("--------");
		
		Employee e = new Employee();
		e.setEmployee('F', 27, "Jane", 125, 'B', 85.4f, 7575, "Analyst",  5000);
		e.show();
		System.out.println("--------");
		
		Magician magician = new Magician();
		magician.setMagician('M', 33, "Ritesh Kumar", 52, "AbraCaDabra", 90000);
		magician.showMagic();
	}
}

class Person {
	private char   gender;
	private int    age;
	private String name;
	
	public Person() {
		System.out.println("Person() constructor..");
	}

	public void setPerson(char gender, int age, String name) {
	     this.gender  = gender; //The assignment to variable gender has no effect
	     this.age = age;
	     this.name = name;
	}
	public void show() {
		System.out.println("Gender : "+gender);
		System.out.println("Age    : "+age);
		System.out.println("name   : "+name);
		
	}
}

class Magician extends Person { //every Magician isA Person

	private int    numberOfMagics;
	private String magicShowName;
	private float  hiringCost;
	
	public Magician() {
		System.out.println("\tMagician() constructor..");
	}

	public void setMagician(char gender, int age, String name, int numberOfMagics, String magicShowName, float hiringCost) {  
		 super.setPerson(gender, age, name); //forward it to the super class
	     this.numberOfMagics = numberOfMagics;
	     this.magicShowName = magicShowName;
	     this.hiringCost = hiringCost;
	}
	
	public void showMagic() {
		
		super.show();
		System.out.println("Number Of Magics   : "+numberOfMagics);
		System.out.println("Magic Show Name    : "+magicShowName);
		System.out.println("Hiring cost        : "+hiringCost);
		
	}
}


class Student extends Person { //every Student isA Person

	private int    roll;
	private char   grade;
	private float  total;
	
	public Student() {
		System.out.println("\tStudent() constructor..");
	}

	public void setStudent(char gender, int age, String name, int roll, char grade, float total) {  
		 super.setPerson(gender, age, name); //forward it to the super class
	     this.roll = roll;
	     this.grade = grade;
	     this.total = total;
	}
	
	public void show() {
		
		super.show();
		System.out.println("Roll   : "+roll);
		System.out.println("Grade  : "+grade);
		System.out.println("Total  : "+total);
		
	}
}

class Employee extends Student  { //every Employee -> isA Student -> isA Person

	private int    empno;
	private String job;
	private float  salary;
	
	public Employee() {
		System.out.println("\t\tEmployee() constructor..");
	}

	public void setEmployee(char gender, int age, String name, int roll, char grade, float total, int empno, String job, float salary) {  
		 super.setStudent(gender, age, name,roll,grade,total); //forward it to the super class
		 this.empno = empno;
		 this.job = job;
		 this.salary = salary;
	}
	
	public void show() {
		
		super.show();
		System.out.println("Empno  : "+empno);
		System.out.println("Job    : "+job);
		System.out.println("Salary : "+salary);
		
	}
}


/*class Student {
	private char   gender;
	private int    age;
	private String name;
	
	private int    roll;
	private char   grade;
	private float  total;
	
	public Student() {
		System.out.println("Student() constructor..");
	}

	public void setStudent(char gender, int age, String name, int roll, char grade, float total) {
	     this.gender  = gender; //The assignment to variable gender has no effect
	     this.age = age;
	     this.name = name;
	     this.roll = roll;
	     this.grade = grade;
	     this.total = total;
	}
	
	public void show() {
		System.out.println("Gender : "+gender);
		System.out.println("Age    : "+age);
		System.out.println("name   : "+name);
		
		System.out.println("Roll   : "+roll);
		System.out.println("Grade  : "+grade);
		System.out.println("Total  : "+total);
		
	}
}*/
