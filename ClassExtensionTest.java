package com.lti;

public class ClassExtensionTest {
	public static void main(String[] args) {
		Doctor d = new Doctor();
		
		if(d instanceof Doctor) {
			System.out.println("Yes d is pointing at Doctor...");
			d.diagnose();
		}
		else {
			System.out.println("No d is not pointing at Doctor...");
		}
		System.out.println("---------");
		
		Surgeon s = new Surgeon();
		
		if(s instanceof Surgeon) {
			System.out.println("Yes s is pointing at Surgeon...");
			s.diagnose(); //inherited method to the Surgeon via the Doctor
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
			hs.diagnose(); //inherited from Surgeon, and Surgeon inherited it	
							// from the Doctor
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
	void diagnose() {
		System.out.println("Doctor is diagnosing...ENT");
	}
}
class Surgeon extends Doctor
{
	void diagnose() {//redefinition / overriding
		System.out.println("Surgeon is diagnosing...CT SCAN");
	}
}
class HeartSurgeon extends Surgeon
{
	void diagnose() { //redefinition / overriding
		System.out.println("HeartSurgeon is diagnosing...ECG Report");
	}
}
