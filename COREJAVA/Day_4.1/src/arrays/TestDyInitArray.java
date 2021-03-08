package arrays;

import java.util.Arrays;

public class TestDyInitArray {

	public static void main(String[] args) {

		char[] chars = { 'a', 'k', 's' };
		// implicitly new char[] - RHS
		// rhs execute first class loading first

		// display contents using char array
		System.out.println("Arrays contents: " + Arrays.toString(chars));

		System.out.println("Loaded array contents: " + chars);

	}

}
