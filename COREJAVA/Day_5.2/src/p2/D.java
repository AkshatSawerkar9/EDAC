package p2;

import p1.A;

public class D extends A {

	// here we get javac error because import statemenmt is missing
	// because now we'are in different package
	// but after importing we get javac error because
	// it will check in A class constructor and it has default scope so make it
	// public

	public D() {
		// super(); implicitly added by javac
		// System.out.println("A's state " + i + "" +j + "" + k + "" + l);
		// here both i and j are gone
		System.out.println("A's state " + k + "" + l);
	}

}
