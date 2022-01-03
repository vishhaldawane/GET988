package com.lti;

public class ClassExtensionTest {
	public static void main(String[] args) {
		Doctor d = new Doctor();
		
		if(d instanceof Doctor) {
			System.out.println("Yes d is pointing at Doctor...");
		}
		else {
			System.out.println("No d is not pointing at Doctor...");
		}
		System.out.println("---------");
		
		Surgeon s = new Surgeon();
		
		if(s instanceof Surgeon) {
			System.out.println("Yes s is pointing at Surgeon...");
		}
		else {
			System.out.println("No s is not pointing at Surgeon...");
		}
		
		
		
		if(s instanceof Doctor) {
			System.out.println("Yes s is also pointing at a Doctor...");
		}
		else {
			System.out.println("No s is not pointing at a Doctor...");
		}
		
		System.out.println("---------");
		
		HeartSurgeon hs = new HeartSurgeon();
		
		if(hs instanceof HeartSurgeon) {
			System.out.println("Yes hs is pointing at HeartSurgeon...");
		}
		else {
			System.out.println("No hs is not pointing at HeartSurgeon...");
		}
		
		
		if(hs instanceof Surgeon) {
			System.out.println("Yes hs is pointing at Surgeon...");
		}
		else {
			System.out.println("No hs is not pointing at Surgeon...");
		}
		
		
		if(hs instanceof Doctor) {
			System.out.println("Yes hs is also pointing at a Doctor...");
		}
		else {
			System.out.println("No hs is not pointing at a Doctor...");
		}
		
	}
}
class Doctor
{
	
}
class Surgeon extends Doctor
{
	
}
class HeartSurgeon extends Surgeon
{
	
}
