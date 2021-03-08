package arrays;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {

		double[] values = new double[10];

		// display default array contents
		System.out.println("default array contents: ");
		for (double a : values) {
			System.out.println(a);
		}

		// init array contents: 10,20,30....
		int counter = 1;
		for (double d : values) {
			d = counter++;
		}
		System.out.println("initialized array contents: ");
		for (double a : values) {
			System.out.println(a);
		}

		System.out.println("initialized array contents again: ");

		for (int i = 0; i < values.length; i++) {
			values[i] = (i + 1) * 10;
		}

		for (double a : values) {
			System.out.println(a);
		}

		// display array contents using toString
		// Api Of Arrays class
		System.out.println("Arrays contents via ToString: ");
		System.out.println(Arrays.toString(values));

	}

}
