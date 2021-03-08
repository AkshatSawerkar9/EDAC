package p1;

public class C {

	public C() {
		// System.out.println("A's state " + i + "" + j + "" + k + "" + l);
		// here if we try to access all the data members we will get compiler error
		// because c and a is not related so we to create object of A first
		A ref = new A();
		// System.out.println("A's state " + ref.i + "" +ref.j + "" + ref.k + "" +
		// ref.l);
		System.out.println("A's state " + ref.j + "" + ref.k + "" + ref.l);
		// here we we get javac error i is not accessible because it is private
	}

}
