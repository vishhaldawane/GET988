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

		System.out.println("--------");

		Cutter cutter = new Cutter();
		cutter.sterilize();
		cutter.cut();
		cutter.operate();
		
		System.out.println("--------");

		Needle needle = new Needle();
		needle.sterilize();
		needle.poke();
		needle.operate();
		
		
		
	}
}
/*
 
 
 		MusicalInstrument							MedicalInstrument
 			|play();										|operate();
 	--------------------------						--------------------------
 	|			|			|						|			|			|
StringBased		AirBased	DrumBased		  Surgical     NonSurgical	Pathological
Musical			Musical		Musical			  Medical	   Medical		Medical
Instrument  	Instrument	Instrument		  Instrument   Instrument	Instrument
tuneStrings();  blowAir();	tapSurface();	   sterilize();  sanitize();  readAccuracy();  						
    |				|				|				|			|			|
 ----------		-----------		------------	-----------	 ---------	-------------
 |		| |		|		|		|		|		|		|	 |		|	|		   |
 Guitar | Sitar	Flute Saxophone Tabla	Conga  Cutter Needle Tray Plier GlucoMeter ECGMachine
 	Violin
 		|
 		Cello
*/

abstract class MusicalInstrument // incomplete
{
	abstract void play(); //incomplete
}

abstract class MedicalInstrument // incomplete
{
	abstract void operate(); //incomplete
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

/*---------------------------*/


abstract class SurgicalMedicalInstrument extends MedicalInstrument
{
	abstract void sterilize();
}

class Cutter extends SurgicalMedicalInstrument
{

	@Override
	void sterilize() {
		System.out.println("Sterilizing the cutter....");
		
	}

	@Override
	void operate() {
		// TODO Auto-generated method stub
		System.out.println("Operating the cutter....");
	}
	
	void cut() {
		System.out.println("Cutting...via the cutter....");
	}
	
}


class Needle extends SurgicalMedicalInstrument
{

	@Override
	void sterilize() {
		System.out.println("Sterilizing the Needle....");
		
	}

	@Override
	void operate() {
		// TODO Auto-generated method stub
		System.out.println("Operating the Needle....");
	}
	
	void poke() {
		System.out.println("Poking the needle...");
	}
	
}





