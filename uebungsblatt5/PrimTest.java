package uebungsblatt5;
import java.util.Scanner;
public class PrimTest {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte Obergrenze eingeben");
		int n = sc.nextInt();
		System.out.println(isPrime(n));
	}
	
	public static boolean isPrime(int n) {
		if(n<=1)
			return false;
		if(n>=2)
		{
			int t = n-1;
			while(t>=2)
			{
				int rest = n%t;
				
				if(rest>0)
					;
				else
					isPrime(t);
			}
		}
		return false;
	}
	/* Scanner
	 * Eingabe muss >=2 sein
	 * Probiere alle Teiler t von n
	 * n ist Primzahl, wenn es kein t mit 1<t<n gibt, dass n ohne Rest teilt
	 * n modulo t--
	 * solange bis t=2
	 */
}
