package tester;

import java.util.Scanner;

import com.app.core.Customer;

public class TestCustomer {

	public static void main(String[] args) {

		/*
		 * 2.6 Create a TestCustomer class , under tester package. .Use scanner to
		 * accept user i/ps. Create 3 customers using 3 different constructors(2.1 : c1
		 * ,2.2 : c2,2.3 :c3 ) Display customer details of all customers. Prompt user ,
		 * for changing creditLimit of the c3. Display new credit limit on the console.
		 *
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name, email, age, creditLimit");
		Customer c1 = new Customer(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextDouble());

		Customer c2 = new Customer(sc.nextLine(), sc.nextLine(), sc.nextInt());

		Customer c3 = new Customer();

		System.out.println(c1.getDetails());
		System.out.println(c2.getDetails());
		System.out.println(c3.getDetails());

		System.out.println("Change creditLimit ");
		c3.setCreditLimit(sc.nextDouble());

		System.out.println(c3.getCreditLimit());
	}

}
