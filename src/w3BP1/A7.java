package w3BP1;
import java.util.Scanner;

public class A7 {
//Write a Java program that takes a number as input and prints its multiplication table up to 10
	
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Input a number:");
		int number=scanner.nextInt();
		
		for(int i=1;i<=10;i++) {
			int result= number*i;
			System.out.println(number+ " x "+ i +" = "+ result);
		}
		
		
		
		scanner.close();
	}
}
