import java.util.Arrays;
import java.util.Scanner;

public class TestBox {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size: ");
		Box[] boxes = new Box[scan.nextInt()];
		System.out.println("initalizing using for loop: ");
		for (int i = 0; i < boxes.length; i++) {
			System.out.println("enter w,d,h: ");
			boxes[i] = new Box(scan.nextDouble(), scan.nextDouble(), scan.nextDouble());

		}
		System.out.println("Display using for loop: ");
		for (Box b : boxes) {
			System.out.println(b.getBoxDetails());
		}
		
		System.out.println(Arrays.toString(boxes));

	}

}
