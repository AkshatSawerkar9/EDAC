package tester;

import java.util.Scanner;

import inh.Faculty;
import inh.Person;
import inh.Student;

public class EventOrganizer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter max no of participants: ");

		Person[] participants = new Person[sc.nextInt()];

		boolean exit = false;

		int counter = 0;

		while (!exit) {
			System.out.println("Menu: 1.Register Student 2. Register Faculty 3. Display 10. Exit");

			switch (sc.nextInt()) {
			case 1:
				if (counter < participants.length) {
					System.out.println("Enter Student details: fn, ln, gradYear, courseName, fees, marks");
					participants[counter++] = new Student(sc.next(), sc.next(), sc.nextInt(), sc.next(),
							sc.nextDouble(), sc.nextInt());
				} else {
					System.out.println("Event full");
				}

				break;

			case 2:
				if (counter < participants.length) {
					System.out.println("Enter Faculty details: fn, ln, experince, sme");
					participants[counter++] = new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.next());

				} else {
					System.out.println("Event full");
				}

				break;
			case 3:
				System.out.println("Participants Details: ");
				for (Person p : participants) {
					if (p != null) {
						System.out.println(p); // run time poly
					}

				}
				break;
			case 10:
				System.out.println("Bye!!!");
				System.exit(0);
			default:
				System.out.println("Enter properly: ");
				break;
			}
		}

	}

}
