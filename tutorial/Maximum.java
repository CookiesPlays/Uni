package tutorial;

public class Maximum {

	public static int maximum(int a, int b, int c) {
		if (a >= b) {
			if (a >= c)
				return a;
			else
				return c;
		} else if (b >= c) {
			return b;
		} else
			return c;
	}

	public static void main(String[] args) {

		int max = maximum(5, 7, 2);
		System.out.println(max);
	}
}