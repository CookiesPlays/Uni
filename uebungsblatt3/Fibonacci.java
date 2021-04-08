package uebungsblatt3;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Index n eingeben");
		int n = sc.nextInt();

		// Berechnung Fibonacci
		long[] Fibonacci = new long[n+1];
		Fibonacci[0] = 0;
		Fibonacci[1] = 1;
		for (int c = 2; c <= n; c++)
			Fibonacci[c] = Fibonacci[c - 1] + Fibonacci[c - 2];

		System.out.print("Fibonacci Zahl:"+"f"+n+" = "+Fibonacci[n]);
		
		
		
		//Mit Schleife lösen und zwischenwerte als variable, anstatt von array
		//Bei n=95 => Overflow
	}
}
