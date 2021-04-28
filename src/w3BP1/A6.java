package w3BP1;
import java.util.Scanner;

public class A6 {
//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers
	
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input first number:\n");
		int firstNumber=in.nextInt();
		System.out.print("Input second Number:\n");
		int secondNumber=in.nextInt();
		
		System.out.println( firstNumber+" + "+secondNumber+" = "+(firstNumber+secondNumber)+"\n"+
							firstNumber+" - "+secondNumber+" = "+(firstNumber-secondNumber)+"\n"+
							firstNumber+" x "+secondNumber+" = "+(firstNumber*secondNumber)+"\n"+
							firstNumber+" / "+secondNumber+" = "+(firstNumber/secondNumber)+"\n"+
							firstNumber+" mod "+secondNumber+" = "+(firstNumber%secondNumber)	);
		
		
		
		in.close();
	}
}
