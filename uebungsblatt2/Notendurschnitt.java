package uebungsblatt2;
import java.util.Scanner;

public class Notendurschnitt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int pointsOfOneStudent = 0;
		// int currentSumOfAllStudents = 0;
		int counter = 0;
		float summeNoten = 0;
		int note;

		while (pointsOfOneStudent != -1) {
			System.out.print("Bitte Punkte eingeben(-1 abbrechen): ");
			pointsOfOneStudent = sc.nextInt();
			// currentSumOfAllStudents += pointsOfOneStudent;
			counter++;

			if (pointsOfOneStudent >= 90)
				note = 1;
			else if (pointsOfOneStudent >= 80)
				note = 2;
			else if (pointsOfOneStudent >= 70)
				note = 3;
			else if (pointsOfOneStudent >= 60)
				note = 4;
			else if (pointsOfOneStudent == -1)
				note = -1;
			else
				note = 5;
			if (note != -1) {
				System.out.println("Note: " + note);
				summeNoten += note;
			}
			switch (note) {
			case 1:
				System.out.println("Super!! Dein Lehrer erhält einen Bonus!");
				break;
			case 2:
				System.out.println("Gut gemacht");
				break;
			case 3:
				System.out.println("Weiter so! Schau dir nochmal die Fehler an!");
				break;
			case 4:
				System.out.println("Das kann man noch verbessern...");
				break;
			case -1:
				break;
			default:
				System.out.println("Das musst du wohl nochmal schreiben");
			}

		}
		System.out.println("Notendurschnitt: " + summeNoten / --counter);
		sc.close();
	}

}
