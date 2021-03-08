package tester;

import inh.Faculty;
import inh.Person;
import inh.Student;

public class TestInheritance2 {

	public static void main(String[] args) {

		Student student1 = new Student("Rama", "Seth", 2019, "EDAC", 123456, 80);

		// type of reference and object is same i.e direct referencing

		System.out.println(student1.toString());

		Person ref;

		ref = student1; // no error because javac goes by the type of reference every student is person

		// up-casting automatically done by compiler

		System.out.println(ref.toString());

		// above give toString of Student

		// same for faculty

		Faculty faculty1 = new Faculty("Chetan", "Shah", 15, "java");

		ref = faculty1;

		System.out.println(ref.toString());
	}

}
