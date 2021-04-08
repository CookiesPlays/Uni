package uebungsblatt4;

import java.util.Scanner;

public class Tabellenkalkulation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte Zeilenanzahl angeben");
		int zeilenCount = sc.nextInt();
		System.out.println("Bitte Spaltenzahl angeben");
		int spaltenCount = sc.nextInt();

		// Generate 2D Array with input measures
		int[][] array = new int[zeilenCount][spaltenCount];

		// Befüllung Array mit random werten
		for (var i = 0; i < array.length; i++) {
			for (var j = 0; j < array[i].length; j++) {
				int randomNumber = ((int) (Math.random() * 10));
				array[i][j] = randomNumber;
			}
		}

		// Berechnung Zeilensummen
		int[] zeilenSummen = new int[zeilenCount];
		for (int h = 0; h < zeilenCount; h++) {
			int zeilenSumme = 0;
			for (int g = 0; g < spaltenCount; g++) {
				zeilenSumme += array[h][g];
			}
			zeilenSummen[h] = zeilenSumme;
		}
		// Berechnung SpaltenSummen
		int[] spaltenSummen = new int[spaltenCount];
		for (int u = 0; u < spaltenCount; u++) {
			int spaltenSumme = 0;
			for (int j = 0; j < zeilenCount; j++) {
				spaltenSumme += array[j][u];
			}
			spaltenSummen[u] = spaltenSumme;
		}

		// Ausgabe des 2D Array
		for (int k = 0; k < array.length; k++) {
			for (int j = 0; j < array[k].length; j++)
				System.out.print(array[k][j] + "   ");

			// Ausgabe ZeilenSumme
			System.out.println("||" + zeilenSummen[k]);
		}

		// Divider
		for (int k = 0; k < spaltenSummen.length; k++)
			System.out.print("====");
		System.out.println();

		for (int element : spaltenSummen) // Für alle Elemente aus der Spaltensumme (nimmt alle Elemente von 0 bis
											// .length)
			System.out.print(element + "  ");
		sc.close();
	}

}
