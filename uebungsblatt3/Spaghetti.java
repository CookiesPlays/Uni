package uebungsblatt3;

import java.util.Scanner;

public class Spaghetti {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte x eingeben");
		double x = sc.nextDouble();

		if (x == 0)
			System.out.println(x);
		else if (x > 2005) {
			x = Math.sqrt(x);
			x *= x;
			System.out.println(x);
		} else {
			x *= (x + x);
			x *= x;
			System.out.println(x);
		}
		sc.close();
	}

}
