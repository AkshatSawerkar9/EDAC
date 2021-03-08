package com.app.core;

public class Customer {

	/*
	 * 2. Create a java applicstion for the following. Create a Customer class , in
	 * com.app.core package , with data members (all private : tight encapsulation)
	 * name(String),email(String),age(int), creditLimit(double)
	 */

	private String name;
	private String email;
	private int age;
	private double creditLimit;

	// 2.1 Supply a parameterized constructor to accept all details from user

	public Customer(String name, String email, int age, double creditLimit) {
		this.name = name;
		this.email = email;
		this.age = age;
		this.creditLimit = creditLimit;
	}

	// 2.2 Supply an argument less constructor to init default name to "Riya" ,
	// email to "riya@gmail.com",age=25,creditLimit=10000

	public Customer() {
		this("Riya", "riya@gmail.com", 25, 10000);
	}

	// 2.3 Supply another constructor , to init default creditLimit to 10000, taking
	// rest of the i/ps from user.

	public Customer(String name, String email, int age) {
		this(name, email, age, 10000);
	}

	/*
	 * 2.4 Write a method , getDetails to return String form of customer name &
	 * credit limit details. 2.5 Supply getter & setter for creditLimit.
	 * 
	 */

	public String getDetails() {
		return this.name + " " + this.creditLimit;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

}
