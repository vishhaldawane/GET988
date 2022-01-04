package com.lti;


/*
 * 
 * 				InDoorGame				OutDoorGame
 * 					|						|
 * 			-----------------		--------------------
 * 			|		|		|		|		 |		 |
 * 		TableTennis Chess Carrom	FootBall Cricket Hockey
 * 
 * 
 */
public class AbstractTest {
	public static void main(String[] args) {
		//InDoorGame idg = new InDoorGame();
		//idg.findSunRoofing();
		//idg.getSomeMusic();
		//idg.getSomeSnacks();
		
		Chess chess = new Chess();
		chess.findSunRoofing();
		chess.getSomeMusic();
		chess.getSomeSnacks();
		chess.moveBishop();
		chess.calculateScore();
		
		System.out.println("-------");
		Carrom carrom = new Carrom();
		carrom.findSunRoofing();
		carrom.hitStriker();
		carrom.calculateScore();
		
		System.out.println("-------");
		TableTennis tt = new TableTennis();
		tt.hitRacket();
		tt.findSunRoofing();
		tt.getSomeSnacks();
		tt.calculateScore();
		
		System.out.println("-------");
		
		Cricket crik = new Cricket();
		crik.hitSixer();
		crik.findSunLight();
		crik.getSomeColdDrinks();
		crik.calculateScore();
		
		System.out.println("-------");
		
		FootBall fb = new FootBall();
		fb.hitGoal();
		fb.findSunLight();
		fb.getSomeColdDrinks();
		fb.calculateScore();
		
		System.out.println("-------");
		
		Hockey hk = new Hockey();
		hk.hitHockeyStick();
		hk.findSunLight();
		hk.getSomeColdDrinks();
		hk.calculateScore();
		
				
		
	}
}

abstract class A
{
	// no need to have any abstract method to make abstract class
}

class B {
	abstract void foo(); // not possible unless B is an abstract class
}

abstract class InDoorGame // cannot be instantiated  
{
	int score;
	int numberOfPlayers;
	
	//it is a mandate on the immediate non-abstract child to implement it
	
	//below is just a declaration
	abstract void calculateScore(); //code body is undefined
		// but now it "has to be" / "bound to be" defined by the immediate 
		//non-abstract child
//The abstract method calculateScore in type InDoorGame can only be 
	//defined by an abstract class
	
	InDoorGame() {
		System.out.println("InDoorGame() .....");
	}
	public InDoorGame(int score, int numberOfPlayers) {
		super();
		this.score = score;
		this.numberOfPlayers = numberOfPlayers;
	}
	void findSunRoofing() {
		System.out.println("Finding the sun roofing...getting a better shadow.");
	}
	void switchOnAC() {
		System.out.println("Switch on the AC");
	}
	void getSomeMusic() {
		System.out.println("Get some music on...");
	}
	void getSomeSnacks() {
		System.out.println("Get some snacks...");
	}
	
	@Override
	public String toString() {
		return "InDoorGame [score=" + score + ", numberOfPlayers=" + numberOfPlayers + "]";
	}
	
}

abstract class OutDoorGame // cannot be instantiated  
{
	int score;
	int numberOfPlayers;
	
	//it is a mandate on the immediate non-abstract child to implement it
	
	//below is just a declaration
	abstract void calculateScore(); //code body is undefined
		// but now it "has to be" / "bound to be" defined by the immediate 
		//non-abstract child
//The abstract method calculateScore in type InDoorGame can only be 
	//defined by an abstract class
	
	OutDoorGame() {
		System.out.println("OutDoorGame() .....");
	}
	public OutDoorGame(int score, int numberOfPlayers) {
		super();
		this.score = score;
		this.numberOfPlayers = numberOfPlayers;
	}
	void findSunLight() {
		System.out.println("ample sunlight..to play outdoor game....");
	}
	
	
	void getSomeColdDrinks() {
		System.out.println("Get some cold drinks / juices...");
	}
	
	@Override
	public String toString() {
		return "InDoorGame [score=" + score + ", numberOfPlayers=" + numberOfPlayers + "]";
	}
	
}
//The type TableTennis must implement the inherited abstract method
//InDoorGame.calculateScore()
class TableTennis extends InDoorGame
{
	void hitRacket() { 
		System.out.println("TableTennis : hitting..racket.");
	}
	
	void calculateScore() {
		System.out.println("Calculating tt score...");
	}
}
//The type Chess must implement the inherited abstract method 
//InDoorGame.calculateScore()
class Chess extends InDoorGame
{
	void moveBishop() { 
		System.out.println("Chess : moving the bishop..");
	}
	
	void calculateScore() {
		System.out.println("Calculating if the King is checkmate");
	}
}
//The type Carrom must implement the inherited abstract method 
//InDoorGame.calculateScore()
class Carrom extends InDoorGame
{
	void hitStriker() { 
		System.out.println("Carrom : hitting the striker..");
	}
	
	void calculateScore() {
		System.out.println("Calculating who is the carrom winner....");
	}
}


class FootBall extends OutDoorGame
{
	void hitGoal() { 
		System.out.println("FootBall : hitting..goal.");
	}
	
	void calculateScore() {
		System.out.println("Calculating FootBall score...");
	}
}

class Cricket extends OutDoorGame
{
	void hitSixer() { 
		System.out.println("Cricket : hitting sixer...");
	}
	
	void calculateScore() {
		System.out.println("Calculating cricket score..");
	}
}

class Hockey extends OutDoorGame
{
	void hitHockeyStick() { 
		System.out.println("Hockey : hitting the hockey stick..");
	}
	
	void calculateScore() {
		System.out.println("Calculating who is the Hockey winner....");
	}
}

