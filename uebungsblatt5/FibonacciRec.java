package uebungsblatt5;
import java.util.Scanner;

public class FibonacciRec {

	public static long fib(int n) {

		// Für welche Werte der Parameter kennen wir das Resultat sofort?
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		// Basisfälle, damit keine Endlosrekursion ensteht

		
		//Eingabemenge muss reduziert werden um auf Basisfälle zu kommen
		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte Index eingeben");
		int n = sc.nextInt();

		System.out.println("f" + n + " = " + fib(n));

		sc.close();
	}
}
