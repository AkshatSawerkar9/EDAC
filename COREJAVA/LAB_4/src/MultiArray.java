import java.util.Scanner;

public class MultiArray {

	/*
	 * 3. Create 2D array of double , to store values from 100 to 199 (i.e actual
	 * values : 100.0,101.0......199.0) : use nested for loop Display these values
	 * using for loop for-each Arrays class method : deepToString
	 */
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		double[][] data = new double[scan.nextInt()][scan.nextInt()];

		int counter = 101;
		for (int i = 0; i < data.length; i++) {

			for (int j = 0; j < data.length; j++) {

				data[i][j] = counter++;
			}

		}
		
		for(double d[] : data)
		{
			for(double p : d)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
	}

}
