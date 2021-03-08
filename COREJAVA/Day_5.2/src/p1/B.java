package p1;

public class B extends A {

	public B() {

		System.out.println("B's state " + j + "" + k + "" + l);
		// System.out.println("B's state " + i + "" + j + "" + k + "" + l);
		// here i is not accessible because i is private
	}

}
