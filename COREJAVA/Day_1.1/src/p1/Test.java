package p1;

public class Test {

	private int i; // instance variable : heap : by default initialized = 0

	public static void main(String[] args) {

		int data = 0;

		// System.out.println(data);
		// here we get javac error because method local variable must be initialize

		System.out.println(data);

		System.out.println("in A's main");

		// display value of i

		Test t1 = new Test();

		System.out.println(t1.i);

		char ch = 'A';

		System.out.println(ch);

		// print range of byte

		System.out.println("Byte ranges from: " + Byte.MIN_VALUE + "--->" + Byte.MAX_VALUE);

		System.out.println("Integer ranges from: " + Integer.MIN_VALUE + "--->" + Integer.MAX_VALUE);
		
	}

}

class B {

	public static void main(String[] args) {

		System.out.println("in B's main");

	}

}

class C {

	public static void main(String[] args) {

		System.out.println("in C's main");

	}

}
