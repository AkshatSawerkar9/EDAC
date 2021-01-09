import java.util.Scanner;

import javax.xml.bind.PrintConversionEvent;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Food {

	public static void main(String[] args) {

		/*
		 * 3. Display food menu to user. Assign fixed prices to food items. User will
		 * select items from menu along with the quantity. (eg 1. Dosa 2. Samosa 3. Rice
		 * 4. Noodles .......10 . Generate Bill ) When user enters 'Generate Bill'
		 * option, display total bill & exit. (Can use System.exit(0) to terminate java
		 * app or simply use exit flag)
		 */

		int dosa = 50;
		int vada = 30;
		int samosa = 20;
		int bhel = 10;
		double price = 0;
		double quantity;
		while (true) {
			System.out
					.println("Select from Menu Details:\n1.dosa\n2.vada\n3.samosa\n4.bhel\n5.generate bill\n6.exit: ");
			Scanner scan = new Scanner(System.in);

			int var = scan.nextInt();

			switch (var) {
			case 1:
				System.out.println("Dosa: ");
				System.out.println("Enter the quantity: ");
				quantity = scan.nextInt();
				price = dosa * quantity + price;
				System.out.println(price);
				continue;
			case 2:
				System.out.println("Vada: ");
				System.out.println("Enter the quantity: ");
				quantity = scan.nextInt();
				price = vada * quantity + price;
				System.out.println(price);
				continue;
			case 3:
				System.out.println("Samosa: ");
				System.out.println("Enter the quantity: ");
				quantity = scan.nextInt();
				price = samosa * quantity + price;
				System.out.println(price);
				continue;
			case 4:
				System.out.println("Bhel: ");
				System.out.println("Enter the quantity: ");
				quantity = scan.nextInt();
				price = bhel * quantity + price;
				System.out.println(price);
				continue;
			case 5:
				System.out.println("Generated Bill");
				System.out.println(price);
				continue;
			case 10:
				System.out.println("Exit: ");
				System.exit(0);
				break;
			default:
				System.out.println("Enter proper value: ");
				continue;
			}

		}
	}

}
