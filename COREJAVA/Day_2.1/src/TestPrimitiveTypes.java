
public class TestPrimitiveTypes {

	public static void main(String[] args) {

		byte b1 = 10;
		byte b2 = 20;

		// byte b3 = (b1 + b2); // here we get javac error because of int to byte

		byte b3 = (byte) (b1 + b2);

		System.out.println(b3);

	}

}
