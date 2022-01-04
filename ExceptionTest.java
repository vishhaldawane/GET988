package com.lti;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("Enter first  number : ");
		int num1 = scan1.nextInt();
		
		System.out.println("Enter second number : ");
		int num2 = scan2.nextInt();
		
		System.out.println("Trying to divide "+num1+" / "+num2);
		if(num2!=0) {
			int div = num1 / num2;
			System.out.println("Division : "+div);
		}
		else {
			System.out.println("Cannot divide by zero");
		}
	}
}
