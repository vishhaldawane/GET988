package com.lti;
/*
 * 
 * 				heap					stack
 * 
 * 		kiteCount
 * 		+-------+
 * 		|	4	|
 * 		+-------+
 * 
 * 								owner	color	length  kiteCount
 * 								----------------------------------
 * 								|Hemanth|Green	|50		|		|
 * 								---------------------------------
 * 		+---------------------> 100
 * 		|
 * 		|	
 * 		100
 * 		kite1							
 * 											Kite(){} showKite() { }
 * 
 * 								owner	color	length   kiteCount
 * 								--------------------------------|
 * 								|Yadnesh|Red	|80		|		|
 * 								--------------------------------|
 * 		+---------------------> 200
 * 		|
 * 		|	
 * 		200
 * 		kite2							
 * 
 * 								owner	 color	length	kiteCount
 * 								---------------------------------
 * 								|Biswajit|Black	|40		|		|
 * 								---------------------------------
 * 		+---------------------> 300
 * 		|
 * 		|	
 * 		300
 * 		kite3							
 * 
 * 								owner	   color	length kiteCount
 * 								----------------------------------
 * 								|Sudarshan|Yellow	|70	  |		|
 * 								----------------------------------
 * 		+---------------------> 400
 * 		|
 * 		|	
 * 		400
 * 		kite4							
 * 
 * 
 * 
 */
public class StaticTest {
	public static void main(String[] args) {
		
		Kite.showKiteCount();
	
		Kite kite1 = new Kite("Hemanth","Green",50);
		kite1.showKite();
		
		Kite kite2 = new Kite("Yadnesh","Red",80);
		kite2.showKite();
		
		Kite kite3 = new Kite("Biswajit","Black",40);
		kite3.showKite();
		
		Kite kite4 = new Kite("Sudarshan","Yellow",70);
		
		kite4.showKite();
		
		Kite.showKiteCount();

	}
}

class Kite
{
	private String owner;
	private String color;
	private int length;
	
	private static int kiteCount; // its not an object's data/field
						//rather it is class's data / shared data
	
	public static void showKiteCount() {
		System.out.println("Total Kites in the sky : "+kiteCount);
		//length=90;//Cannot make a static reference to the non-static field length
	}
	public Kite(String owner, String color, int length) {
		super();
		this.owner = owner;
		this.color = color;
		this.length = length;
		++kiteCount;
	}
	
	void showKite() { //non-static function can refer to static
		System.out.println("Kite owner  : "+owner);
		System.out.println("Kite color  : "+color);
		System.out.println("Kite length : "+length);
		//System.out.println("Kite count? : "+kiteCount); //static
		System.out.println("--------");
	}
	
	
	
}
