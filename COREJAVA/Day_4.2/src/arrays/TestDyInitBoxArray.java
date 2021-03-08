package arrays;

import com.app.cdac.Box;

public class TestDyInitBoxArray {

	public static void main(String[] args) {

		Box[] sample = { new Box(1, 2, 3), new Box(8, 9, 10) };

		// 3 objects are created 1 holder and 2 boc class instance

		for (Box b : sample) {
			System.out.println(b.getBoxDetails());
		}

		
	}

}
