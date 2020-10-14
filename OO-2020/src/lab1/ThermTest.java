package lab1;

//Student Name 	: Oisin Cawley
//Student Id Number: 
//Date 			: Nov-2015
//Purpose 			: My first class implementation

public class ThermTest
{ // begin class ThermTest
	public static void main(String args[]) 
	{ // being main method

		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		
		Thermometer thermB = new Thermometer(10.0);
		
		double tempB = thermB.getCelsius();
		
		System.out.println("Temp. of Thermometer B is " + tempB);
		tempB = thermB.getFahrenheit(); //Should be 50F is set to 10C
		
		System.out.println("Temp. of Thermometer B in Fahrenheit is " + tempB);
		
		thermB.setFahrenheit(100); //37.77 in celcius
		
		tempB = thermB.getCelsius();
		
		System.out.println("Temp. of Thermometer B is " + tempB);
	} // end main
} // end class ThermTest