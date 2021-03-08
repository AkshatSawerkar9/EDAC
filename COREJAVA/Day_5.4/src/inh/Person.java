package inh;

public class Person
// extends object added by javac
{

	private String firstName, lastName;

	public Person(String firstName, String lastName) {
		super();
		System.out.println("In Person constructor: ");
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String toString() {
		return firstName + " " + lastName;
	}

}
