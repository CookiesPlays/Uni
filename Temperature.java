
public class Temperature {

	public static double toCelsius(double c) {
		double celsius = 5.0/9.0*(c-32);
		return celsius;
	}
	public static double toFahrenheit(double f) {
		double fahrenheit = 9.0/5.0*f+32;
		return fahrenheit;
	}
	
	public static void main(String[]args) {
		System.out.println(toFahrenheit(0));
		System.out.println(toCelsius(10));
	}
}

