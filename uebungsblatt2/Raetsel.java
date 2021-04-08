package uebungsblatt2;

public class Raetsel {
//Umwandlung von Fahrenheit zu Celsius
	public static void main(String[] args) {

		
		int fahrenheit=Integer.parseInt(args[0]); //Einlesen von Fahrenheit
		double celsius;
		
		
		System.out.println( "Input: "+fahrenheit); //Ausgabe eingelesener Wert
		
		
		//Umrechnen zu Celsius
		celsius = (fahrenheit - 32)*(5.0/9);
		
		
		System.out.println( "Output: "+celsius);
	}

}
