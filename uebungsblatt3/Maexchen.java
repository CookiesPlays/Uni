package uebungsblatt3;

import java.util.Scanner;
public class Maexchen {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Bitte 1. W�rfelzahl eingeben");
		int x = sc.nextInt();
		System.out.println("Bitte 2. W�rfelzahl eingeben");
		int y = sc.nextInt();
		int point=0;
		
		if(x==2&y==1|y==2&x==1)		//M�xchen
			point=1000;
		else if (x==y)				//Pasch
			point=x*100;
		else if(x>y)				//normal	
			point = x*10+y;
		else if (x<y)
			point = y*10+x;

		System.out.print(point);
		sc.close();
	}

}
