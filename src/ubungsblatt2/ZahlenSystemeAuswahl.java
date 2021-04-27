package ubungsblatt2;
import java.util.Scanner;

public class ZahlenSystemeAuswahl {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		//Eingabe der Zahlenbasis
		System.out.println("Bitte geben Sie Basis der eingegebenen Zahl ein\nDiese kann 2, 8, 10 oder 16 sein");
		int base = sc.nextInt();
		//Überprüfung ob die Basies passt
		if(base==2|base==8|base==10|base==16) {
			
			//Eingabe input
			System.out.println("Bitte geben sie die zu konvertierende Zahl ein");
			String input = sc.next();
			
			//Umwandlung der Eingabe in einen Int, Basis 10
			int dezimalZahl = Integer.parseInt(input,base);
			
			
			//Ausgabe der Zahlen
			System.out.println("Dezimal:  " + dezimalZahl);
			System.out.println("Hex:      " + Integer.toHexString(dezimalZahl));
			System.out.println("Binär:    " + Integer.toBinaryString(dezimalZahl));
			System.out.println("Octal:    " + Integer.toOctalString(dezimalZahl));
			
			sc.close();
					
		}
		//Falls Basis nicht passt, wird das Programm beendet
		else {
			System.exit(0);
		}
	
	}
}
