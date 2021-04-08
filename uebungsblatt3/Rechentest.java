package uebungsblatt3;

import java.util.Scanner;

public class Rechentest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
		int numOne = (int) (Math.random() * 32 + 1); // First Number between 1 and 32
		int numTwo = (int) (Math.random() * 32 + 1); // Second Number between 1 and 32
		int calculator = (int) (Math.random() * 4); // Num between 1 and 4
		int result=0;
		
		
		switch (calculator) {
		case 0:
			calculator = ('+');
			result = numOne+numTwo;
			break;
		case 1:
			calculator=(int)('-');
			result=numOne-numTwo;
			break;
		case 2:
			calculator=(int)('*');
			result=numOne*numTwo;
			break;
		case 3:
			calculator=(int)(':');
			result=numOne/numTwo;
		}
		System.out.println(numOne+" "+((char)calculator)+" "+numTwo);
		
		int input= sc.nextInt();
		if(input==result)
			System.out.println("Richtig :)");
		else
			System.out.println("Nicht richtig :(");
		}
		
		
	}
}
