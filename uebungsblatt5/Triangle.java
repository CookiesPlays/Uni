package uebungsblatt5;
import java.util.Scanner;
public class Triangle {

	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Bitte a eingeben");
		double a = sc.nextDouble();
		System.out.println("Bitte b eingeben");
		double b = sc.nextDouble();
		
		System.out.println("Hypotenuse c= "+hypotenuse(a,b));
		
	}
	
	public static double hypotenuse(double a, double b) {
		double result = Math.sqrt(a*a+b*b);
		return result;
		
	}
}
