package arrays;

import java.util.Arrays;
import java.util.Scanner;

import com.app.cdac.Box;

public class TestBoxArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no of boxes to make: ");

		Box[] boxes = new Box[sc.nextInt()];

		for (int i = 0; i < boxes.length; i++) {
			System.out.println("Enter Box dimemsions: ");
			boxes[i] = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

		}

		for (Box b : boxes) {
			// b = boxes[0]...
			System.out.println(b.getBoxDetails());
		}

		System.out.println("Array contents toString: " + Arrays.toString(boxes));

	}
}
