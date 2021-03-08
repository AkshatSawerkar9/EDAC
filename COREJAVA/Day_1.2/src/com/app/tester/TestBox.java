package com.app.tester;

import java.util.Scanner;

import com.app.cdac.Box;

public class TestBox {

	public static void main(String[] args) {

		// create sc instance to wrap std input stream : System.in
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Box Dimensions: w, d, h");

		Box b1 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

		System.out.println(b1.getBoxDetails());

		System.out.println(b1.computeVolume());

		// close Scanner
		sc.close();

	}

}
