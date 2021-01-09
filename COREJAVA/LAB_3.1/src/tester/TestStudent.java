package tester;

import java.util.Scanner;

import com.cdac.core.Student;

public class TestStudent {

	public static void main(String[] args) {

		/*
		 * 2.5 Write a TestStudent class in tester package 1. Admit 2 new Students ,
		 * using scanner I/P student details (id name,email,age)
		 * 
		 * 2. Assign scores for 2 students(quiz , test , assignment all out of 100)
		 * 
		 * 3. Display name of topper(having higher GPA)
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter details of student 1: ");
		Student s1 = new Student(scan.nextInt(), scan.next(), scan.next(), scan.nextInt());
		System.out.println("Enter details of student 2: ");
		Student s2 = new Student(scan.nextInt(), scan.next(), scan.next(), scan.nextInt());

		System.out.println("Assign score for quiz,test,assignment of student1: ");
		System.out.println(s1.computeGPA(scan.nextDouble(), scan.nextDouble(), scan.nextDouble()));
		System.out.println("Assign score for quiz,test,assignment of student2: ");
		System.out.println(s2.computeGPA(scan.nextDouble(), scan.nextDouble(), scan.nextDouble()));

		System.out.println(s1.isGreater(s2));

	}

	//101 jksjkasc sakcjkncdsa 25 
	//102 skjcsjkc cnjkjascask 36
}
