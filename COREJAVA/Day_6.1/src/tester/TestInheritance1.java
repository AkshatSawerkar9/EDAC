package tester;

import inh.Faculty;
import inh.Student;

public class TestInheritance1 {

	public static void main(String[] args) {

		// create student object
		Student student1 = new Student("Rama", "Seth", 2019, "EDAC", 123456, 80);

		System.out.println(student1.toString());

		// create faculty object
		Faculty faculty1 = new Faculty("Chetan", "Shah", 15, "Java");

		System.out.println(faculty1.toString());

		// this will give address of both 
		
		// method 
		
	}

}
