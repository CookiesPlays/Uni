package uebungsblatt5;

public class Employee {
	
	public String firstName;
	public String lastName;
	
	
	
	public Employee(String first, String last) {		//Konstruktor muss genau so heißen wie Klasse
		this.firstName = first;
		this.lastName=last;
	}

//Generate getter/setter by using alt+shift+s/Pulldown - Source "Generate Getter and Setter"
	public static String getFirstName() {
		return firstName;
	}
	public void setFirstName(String s) {
		this.firstName=s;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String s) {
		this.lastName=s;
	}


public static void main(String[] args) {
	
	Employee employee1 = new Employee("Jonas","Meyer");
	System.out.println(getFirstName());
	
	
	
	}
}
