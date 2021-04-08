package uebungsblatt2;
import java.util.Scanner;

public class faculity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte n eingeben");
		long input=sc.nextLong();
		long result=1;
		
		System.out.print(input+"! = ");
		
		while (input>0)
		{
			result*=input--;
		}
		
		System.out.println(result);
		sc.close();
		
	}

}
