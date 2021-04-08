
public class Test {

	public static void main(String[] args) {
		int n = 2310031;
		umdrehen(n);
		
	}

	public static void umdrehen(int n) {
			int zahl = n / 10;
		int zahl2 = n % 10;
	
		if (zahl > 0) {
			System.out.print(zahl2);
			// System.out.println(zahl +"+");
			umdrehen(zahl);
		} else
			System.out.println(zahl2);

	}

}
