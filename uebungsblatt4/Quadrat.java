package uebungsblatt4;

import java.util.Scanner;

public class Quadrat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte n eingeben");
		int eingelesen = sc.nextInt();

		//2<n<10 überprüfung
		while (eingelesen < 3 ^ eingelesen > 10) {
			System.out.println("Bitte n eingeben");
			eingelesen = sc.nextInt();
		}

		int n = eingelesen;
		System.out.println(n);

		int[][] quad = new int[n][n];
		
		int zeile = n/2;
		int spalte = n/2+1;
		int m=0;
		
		do {
			m++;
			quad[zeile][spalte]=m;
			zeile--;
			spalte++;
			if(zeile<0)
				zeile=n-1;
			if(spalte>n-1)
				spalte=0;
			if(quad[zeile][spalte]>0)
			{
				spalte++;
				zeile++;
				if(zeile>n-1)
					zeile=0;
				if(spalte>n-1)
					spalte=0;
			}
			
		}while(m<n*n);
		
		for(int i =0;i<quad.length;i++) {
			for(int j =0;j<quad[i].length;j++) {
				System.out.print("  "+quad[i][j]);
			}
			System.out.println();
		}
	}

}
