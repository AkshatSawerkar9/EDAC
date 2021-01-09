package com.cdac.core;

public class Student {

	// 2.1 Every student must have --- id(int) --, name (String), email(String),
	// age(int),gpa(double)

	private int id;
	private String name;
	private String email;
	private int age;
	private double gpa;

	/*
	 * 2.2 Add suitable parameterized constructor. Accept --id name,email,age only
	 * from user.
	 */

	public Student(int id, String name, String email, int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		
	}
	/*
	 * 2.3 Add a method fetchDetails to fetch student details (ret type -- String)
	 */

	public String fetchDetails() {
		return id + " " + name + " " + email + " " + age + " " + gpa;
	}

	/*
	 * 2.4 Add computeGPA method in Student class Accept 3 method arguments for :
	 * scores for quiz , test & assignments gpa should be computed on 20 % of quiz
	 * score, 50% of test score & 30% of assignment score. (Normalize it to 1-10
	 * scale)
	 */

	public double computeGPA(double quiz, double test, double assignments) {
		double quiz1 = (20f / 100) * quiz;
		double test1 = (50f / 100) * test;
		double assignments1 = (20f / 100) * assignments;

		return (((quiz1 + test1 + assignments1) * 10) / 100);

	}

	public boolean isGreater(Student anotherStudent) {

		return (this.gpa > anotherStudent.gpa) ? true : false;
	}

}
