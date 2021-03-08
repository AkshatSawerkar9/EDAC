package tester;

import inh.Person;
import inh.Student;

public class TestInheritance3 {

	public static void main(String[] args) {
		
		Person ref = new Student("Rama", "Seth", 2019, "edac", 123456, 80);

		System.out.println(ref);
		
		((Student)ref).study(); // down casting
	
		// compiler goes by the type of refence
		// and ref is of person type ans study does'nt have study method
		
	}

}
