package menu;

import java.util.Scanner;

public class Food {

	public static void main(String[] args) {

		int dosa = 50;
		int vada = 40;
		int bhel = 30;
		int samosa = 20;

		int price = 0;
		int quantity = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("Menu\n1.Dosa\n2.Vada\n3.Bhel\n4.Samosa\n5.Generate Bill\n10.exit");

			switch (sc.nextInt()) {
			case 1:
				System.out.println("Dosa");
				System.out.println("Enter Quantity: ");
				quantity = sc.nextInt();
				price = dosa * quantity + price;
				System.out.println(price);
				continue;
			case 2:
				System.out.println("Vada");
				System.out.println("Enter Quantity: ");
				quantity = sc.nextInt();
				price = vada * quantity + price;
				System.out.println(price);
				continue;
			case 3:
				System.out.println("Bhel");
				System.out.println("Enter Quantity: ");
				quantity = sc.nextInt();
				price = bhel * quantity + price;
				System.out.println(price);
				continue;
			case 4:
				System.out.println("Samosa");
				System.out.println("Enter Quantity: ");
				quantity = sc.nextInt();
				price = samosa * quantity + price;
				System.out.println(price);
				continue;
			case 5:
				System.out.println("Generated Bill: " + price);
				break;
			case 10:
				System.exit(0);
			default:
				System.out.println("Enter proper value: ");
				break;
			}

		}
	}
}
