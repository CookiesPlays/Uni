
public class Mitarbeiter {

	private String name;
	private int id;

	private static int currentID = 0;

	public Mitarbeiter(String name) {
		this.name = name;
		this.id = currentID++;
	}

	public int getID() {
		return this.id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "" + this.id + ": " + this.name;
	}

	public static void main(String[] args) {
		Mitarbeiter m1 = new Mitarbeiter("John Doe");
		Mitarbeiter m2 = new Mitarbeiter("Jonas Meier");
		Mitarbeiter m3 = new Mitarbeiter("Johannes Caesr");

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
	}
}
