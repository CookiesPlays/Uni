package uebungsblatt2;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Scan the variables
		int a = -4;
		int b = -5;
		int c = 3;
		int d = -2;
		boolean result;

		if ((a < 0) ^ (b < 0) ^ (c < 0) ^ (d < 0))
			result = true;
		else
			result = false;
		System.out.println("Aussage 3:  " + result);	//result=true
		
		sc.close();
	}

}
