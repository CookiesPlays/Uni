package uebungsblatt2;
import java.util.Scanner;

public class Wochentage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Input of Day
		System.out.println("Bitte Tag eingeben");
		int d = sc.nextInt();

		// Input of Month
		System.out.println("Bitte Monat eingeben");
		int m = sc.nextInt();

		// Input of Year
		int c; // Jahrhundert
		int y; // Jahr im Jahrhundert
		System.out.println("Bitte Jahr eingeben");
		int j = sc.nextInt(); // Jahr

		c = j / 100;
		y = j % 100;

		// Januar als Monat 13 des Vorjahres
		if (m == 1) {
			m = 13;
			y--;
		}

		// Februar als Monat 14 des Vorjahres
		if (m == 2) {
			m = 14;
			y -= 2;
		}

		String[] w = // Wochentag
				{ // array mit Sonntag=0 und Samstag=6
						"Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag" };
		// Testing if values are in range
		if (d < 1 || d > 31 || m < 1 || m > 14 || y < 0 || y > 99) {
			System.out.print("Wrong input");
		} else {
			int formel = (d + (26 * (m + 1) / 10) + (5 * y / 4) + (c / 4) + 5 * c - 1) % 7;
			String datum = d + "." + m + "." + c + y;
			System.out.println("Datum:" + datum);
			System.out.println("Wochentag:" + w[formel]);
		}
		sc.close();

	}

}
