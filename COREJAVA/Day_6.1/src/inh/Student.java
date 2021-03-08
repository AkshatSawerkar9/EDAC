package inh;

public class Student extends Person {

	// as we extend this from super class we will get javac error because
	// in student class till we not provide constructor
	// javac automatically provide argument less constructor
	// then it will go to super class constructor and find no matching constructor

	private int gradYear;
	private String courseName;
	private double fees;
	private int marks;

	public Student(String fn, String ln, int gradYear, String courseName, double fees, int marks) {
		super(fn, ln); // to invoke immediate super class constructor
		System.out.println("In Student constructor: ");
		this.gradYear = gradYear;
		this.courseName = courseName;
		this.fees = fees;
		this.marks = marks;
	}

	public String toString() {
		return "Student_details " + super.toString() + " " + "passed in " + gradYear + " course " + courseName + " "
				+ "feespaid " + fees;
	}

	public void study() {
		System.out.println(getFirstName() + "Studying in course " + courseName);

		// super.getFirstName()
	}

}
