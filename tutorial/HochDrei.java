package tutorial;

public class HochDrei {

	
	public static int hochDrei(int x) {
		int cubicX = x*x*x;
		
		return cubicX;
	}
	
	public static void main(String[]args) {
		System.out.println(hochDrei(2));
		System.out.println(hochDrei(3));
	}
}
