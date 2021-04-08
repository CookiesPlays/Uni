package uebungsblatt2;
import java.util.Scanner;

public class Zahlensysteme {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// read an int value
		System.out.println("Bitte Integer eingeben");
		int i = sc.nextInt();
		System.out.println("Integer=" + i);

		// turn int to String and convert it
		String binary = Integer.toBinaryString(i);
		String hex = Integer.toHexString(i);
		String oct = Integer.toOctalString(i);
		// Could also just scan for String

		// Ausgabe des Ergebnis
		System.out.println("Binary=" + binary);
		System.out.println("Hex=" + hex);
		System.out.println("Octal=" + oct);
		sc.close();

	}

}
