package ubungsblatt2;
import java.util.Scanner;

public class ZahlenSysteme {
	
	public static void main(String[]args) {
		//Eröffnung des Scanners
		Scanner sc = new Scanner(System.in);
		
		//Einlesen der ersten Zahl als Dezimal
		System.out.println("Bitte geben sie eine Zahl dezimal ein");
		String inputDezi = sc.next();
		
		//Umwandlung der Eingabe in Integer
		int deziInput = Integer.parseInt(inputDezi);
		
		//DezimalZahl in Hex und Binär umwandeln
		String hex = Integer.toHexString(deziInput);
		String binar = Integer.toBinaryString(deziInput);
				
				
		//Ausgabe der Konvertierten Zahlen
		System.out.println("Dezimal:  "  + deziInput);
		System.out.println("Hex:  "  + hex);
		System.out.println("Binär:  " + binar);
	
		
		//Einlesen der Hexadezimalzahl
		System.out.println("Bitte geben Sie eine Zahl hexadezimal ein");
		String inputHex = sc.next();
		
		//Umwandlung Der Eingabe zu DezimalInteger und Ausgabe
		int hexInput = Integer.parseInt(inputHex, 16);
		System.out.println("Dezimal:  "+hexInput);
		
		//DezimalZahl in Binär umwandeln und ausgeben
		System.out.println("Binär:  "+ Integer.toBinaryString(hexInput));
		
		
		sc.close();
	}
	
}
