package uebungsblatt3;

import java.util.Scanner;

public class DreierSumme {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sumA, sumB, sumC;
		int numA, numB, numC;

		System.out.println("Eingabe:" + n);

		// A
		System.out.print("A)Summe von: ");
		sumA = 0;
		for (int counter = 0; counter <= n; counter += 3) {
			numA = counter;
			sumA += counter;
			System.out.print(numA + " ");
		}
		System.out.println("= " + sumA);

		// B
		System.out.print("B)Summe von: ");
		sumB = 0;
		int counterBrauchtMotivation = 0;
		while (counterBrauchtMotivation <= n) {
			numB = counterBrauchtMotivation;
			sumB += counterBrauchtMotivation;
			System.out.print(numB + " ");
			counterBrauchtMotivation += 3;
		}
		System.out.println("= " + sumB);

		// C
		System.out.print("C)Summe von: ");
		sumC = 0;
		int counterWillSchlafen = 0;
		do {
			numC = counterWillSchlafen;
			sumC += counterWillSchlafen;
			System.out.print(numC + " ");
			counterWillSchlafen += 3;
		} while (counterWillSchlafen <= n);
		System.out.println("= " + sumC);
		sc.close();
	}

}
