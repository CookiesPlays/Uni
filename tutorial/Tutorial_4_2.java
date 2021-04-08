package tutorial;

import java.util.Arrays;
import java.util.Scanner;

public class Tutorial_4_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte Anzahl der Spalten eingeben");
		int spaltenAnzahl = sc.nextInt();

		System.out.println("Bitte Anzahl der Zeilen eingeben");
		int zeilenAnzahl = sc.nextInt();

		int num = 0;
		int[][] matrix = new int[zeilenAnzahl][spaltenAnzahl];

		for (int y = 0; y < zeilenAnzahl; y++) {
			for (int x = 0; x < spaltenAnzahl; x++) {
				matrix[y][x] = num++;
			}
		}

		for (int[] row : matrix) 
			System.out.println(Arrays.toString(row));
			
			
		int num2 = 0;	
		int[][]rotated = new int[spaltenAnzahl][zeilenAnzahl];	
		
		for(int y = 0;y<zeilenAnzahl;y++) {
			for(int x=0;x<spaltenAnzahl;x++) {
				rotated[x][y]=num2++;
			}
		}
		for(int[]row2 : rotated)
			System.out.println(Arrays.toString(row2));
		}
	}


