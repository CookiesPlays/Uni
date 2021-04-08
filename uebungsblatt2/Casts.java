package uebungsblatt2;

public class Casts {

	public static void main(String[] args) {

		int zaehler = 14;
		int nenner = 4;
		float quotient;
		
		//a
		quotient=zaehler/nenner;
		System.out.println("a)  "+quotient);
		//b
		quotient=(float)(zaehler/nenner);
		System.out.println("b)  "+quotient);
		//c
		quotient=(float)zaehler/(float)nenner;
		System.out.println("c)  "+quotient);
	}

}
