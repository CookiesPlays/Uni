package w3BP1;
import java.util.Scanner;

public class A5 {
//Write a Java program that takes two numbers as input and display the product of two numbers
	
	public static void main(String[]args) {

	Scanner in = new Scanner(System.in);
	
	System.out.println("Input first number:");
	int firstNumber = in.nextInt();
	System.out.println("Input second number:");
	int secondNumber = in.nextInt();
	int result= firstNumber*secondNumber;
	System.out.println("Result:\n"+firstNumber+" x "+secondNumber+" = " +result);
	
	
	in.close();
	
	}
}
