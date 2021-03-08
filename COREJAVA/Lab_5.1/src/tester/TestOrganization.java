package tester;

import java.util.Scanner;

import com.app.org.Emp;
import com.app.org.Mgr;
import com.app.org.Worker;

public class TestOrganization {

	public static void main(String[] args) {

		/*
		 * Write TestOrganization in "tester" package. Create suitable array to store
		 * organization details. Provide following options
		 * 
		 * 1. Hire Manager 2. Hire Worker 3. Display information of all employees
		 * including net salary using single for-each loop.
		 * 
		 * 10 Exit
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no of employees you want to store: ");

		Emp[] e = new Emp[sc.nextInt()];

		int i = 0;

		while (true) {

			System.out.println("Menu:\n1.Hire Manager\n2.Hire Worker\n3.Display information\n10.exit");

			switch (sc.nextInt()) {
			case 1:
				System.out.println(
						"Enter manager Details: int id, String name, int deptId, double basic, double perfBonus");
				e[i] = new Mgr(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextDouble());
				i++;
				continue;
			case 2:
				System.out.println(
						"Enter Worker Details: int id, String name, int deptId, double basic, double hoursWorked, double hourlyRate");
				e[i] = new Worker(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextDouble(),
						sc.nextDouble());
				i++;
				continue;
			case 3:
				for (Emp emp : e) {
					if (emp != null) {
						System.out.println(emp);
					}
				}
				continue;
			case 10:
				System.out.println("Bye ");
				System.exit(0);
			default:
				System.out.println("Select properly: ");
				break;
			}

		}
	}

}
