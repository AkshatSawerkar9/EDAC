package p2;

public class Loops {

	public static void main(String[] args) {

		int[] data = new int[10];

		System.out.println("Using for loop: ");

		for (int i = 0; i < data.length; i++) {

			System.out.print(data[i]);
		}

		System.out.println("Using for-each loop: ");

		for (int i : data) {
			System.out.print(i);

		}

	}

}
