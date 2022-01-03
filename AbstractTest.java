package com.lti;

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
