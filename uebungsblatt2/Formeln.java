package uebungsblatt2;
import java.util.Scanner;

public class Formeln {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double z;
		
		//read x,y
		System.out.println("Bitte x Wert eingeben");
		double x = sc.nextDouble();		
		
		System.out.println("Bitte y Wert eingeben");
		double y = sc.nextDouble();		
		
		//a
		z = (x*x)*(y*y)-(4*x*y)+4;
		System.out.println("1) "+ z);
		
		//b
		z=((1+x*y)*(1+x*y))/(1+(1+x*y)*(1+x*y)*(1+x*y)*(1+x*y));
		System.out.println("2) "+z);
		
		//b gekürzt
		z=1/(1+(1+x*y)*(1+x*y));
		System.out.println("2) "+z);
		
		//c
		z=x*y+(3-x)*y-y;
		System.out.println("3)" +z);
	
		
		/*c2
		z=x*y;
		System.out.println("x+y=" +z);
		z+=(3-x)*y;
		System.out.println("+(3-x)*y=" +z);
		z-=y;
		System.out.println("-y=" +z);
		System.out.println("3)" +z);
		*/
		
		
		//d
		z=2*y;
		System.out.println("4)" +z);
		
		sc.close();
	}

}
