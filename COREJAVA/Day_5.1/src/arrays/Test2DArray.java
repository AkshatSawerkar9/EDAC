package arrays;

import java.util.Arrays;

public class Test2DArray {

	public static void main(String[] args) {

		double[][] data = new double[3][4];

		// display
		System.out.println("Address of Holder Array:");
		System.out.println(data);

		System.out.println("Address of refs: ");
		for (double[] d : data) {
			for (double d1 : d)
				System.out.println(d1);
		}

		int value = 1;
		// to display multi dim array contents

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				data[i][j] = value++;
			}
		}
		System.out.println(Arrays.deepToString(data));

	}

}
