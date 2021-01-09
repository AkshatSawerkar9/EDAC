import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		double[] values = new double[5];
		Scanner scan = new Scanner(System.in);
		System.out.println("initalizing using for loop: ");
		for (int i = 0; i < values.length; i++) {

			values[i] = scan.nextDouble();
		}

		System.out.println("initializng using for each ");
		int counter = 1;
		for (double d : values) {
			d = d * d;
			System.out.println("Intialized array contents: "+d);
		}
		System.out.println("Display using for-each loop: ");
		for (double d : values) {
			System.out.println(d);
		}
		System.out.println("to string method: ");
		System.out.println(values.toString());
	}

}
