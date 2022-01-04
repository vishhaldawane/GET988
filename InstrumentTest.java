package com.lti;

public class InstrumentTest {
	public static void main(String[] args) {
		Guitar guitar= new Guitar();
		guitar.tuneStrings();
		guitar.play();
		guitar.pluck();
		System.out.println("-------");
		
		Sitar sitar = new Sitar();
		sitar.tuneStrings();
		sitar.play();
		sitar.ting();
		
		System.out.println("--------");
		
		Violin vio = new Violin();
		vio.tuneStrings();
		vio.play();
		vio.bow();
		
		
		
	}
}
/*
 
 
 		MusicalInstrument
 			|play();
 	--------------------------
 	|			|			|
StringBased		AirBased	DrumBased
Musical			Musical		Musical
Instrument  	Instrument	Instrument
tuneStrings();  blowAir();	tapSurface();
    |				|				|
 ----------		-----------		------------
 |		| |		|		|		|		|
 Guitar | Sitar	Flute Saxophone Tabla	Conga
 	Violin
 		|
 		Cello
*/

abstract class MusicalInstrument // incomplete
{
	abstract void play(); //incomplete
}

/*---------------------------*/
abstract class StringBasedMusicalInstrument extends MusicalInstrument // incomplete
{
	abstract void tuneStrings(); //incomplete
}
//The type Guitar must implement the inherited abstract method 
//StringBasedMusicalInstrument.tuneStrings()

//The type Guitar must implement the inherited abstract method 
//MusicalInstrument.play()
class Guitar extends StringBasedMusicalInstrument
{
	void tuneStrings() { 
		System.out.println("Tuning Strings of ..Guitar....");
	}
	
	void play() {
		System.out.println("Playing ...Guitar....");
	}
	
	void pluck() { //exclusive to Guitar
		System.out.println("Plucking...Guitar...");
	}
}
class Sitar extends StringBasedMusicalInstrument
{
	void tuneStrings() { 
		System.out.println("Tuning Strings of ..Sitar....");
	}
	
	void play() {
		System.out.println("Playing ...Sitar....");
	}
	
	void ting() { //exclusive to Sitar
		System.out.println("Tinging...Sitar...");
	}
}


class Violin extends StringBasedMusicalInstrument
{
	void tuneStrings() { 
		System.out.println("Tuning Strings of ..Violin....");
	}
	
	void play() {
		System.out.println("Playing ...Violin....");
	}
	
	void bow() { //exclusive to Violin
		System.out.println("Bowing...Violin...");
	}
}

/*---------------------------*/

abstract class AirBasedMusicalInstrument extends MusicalInstrument // incomplete
{
	abstract void blowAir(); //incomplete
}

abstract class DrumBasedMusicalInstrument extends MusicalInstrument // incomplete
{
	abstract void tapSurface(); //incomplete
}

