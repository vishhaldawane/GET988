package com.lti;

public class FinalFirledTest {
	public static void main(String[] args) {
		
		
		final float PI = 3.14f;
		
		System.out.println("PI : "+PI);
		
//	The final local variable PI cannot be assigned. 
	//It must be blank and not using a compound assignment
		
		//PI=3.18f;
		
		System.out.println("PI : "+PI);
		
		Cricketer cricketer = new Cricketer();
		cricketer.totalScore();
		cricketer.hitSixer();
		cricketer.hitFourRuns();
		cricketer.hitSixer();
		cricketer.hitFourRuns();
		cricketer.hitFourRuns();
		cricketer.hitSixer();
		cricketer.hitSixer();

		cricketer.totalScore();
		System.out.println("-----");
		Batsman sachin = new Batsman();
		sachin.hitFourRuns();
		sachin.hitSixer();
		sachin.totalScore();
	}
}

class Cricketer
{
	int score;
	
	final void hitSixer() { //cannot be overridden
		System.out.println("Hitting sixer..");
		score = score + 6;
	}
	final void hitFourRuns() {
		System.out.println("Hitting boundry..");
		score = score + 4;
	}
	void totalScore() {
		System.out.println("Total Score :"+score);
	}
}

final class Batsman extends Cricketer
{
	//int score;
	
	/*void hitSixer() {//overriding
		System.out.println("Batsman Hitting sixer..");
		score = score + 5;
	}
	void hitFourRuns() {//overriding
		System.out.println("Batsman Hitting boundry..");
		score = score + 3;
	}*/
	void totalScore() {
		System.out.println("Batsman Total Score :"+score);
	}
}

class HockyPlayer extends Batsman
{
	
}

