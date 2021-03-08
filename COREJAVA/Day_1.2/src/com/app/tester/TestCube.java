package com.app.tester;

import java.util.Scanner;

import com.app.cdac.Box;

public class TestCube {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// System.out.println("Enter side of the cube: ");

		// Box cube = new Box(sc.nextDouble());

		// System.out.println(cube.getBoxDetails());

		// System.out.println("Volume: " + cube.computeVolume());

		System.out.println("Enter 1st box dimensions: ");

		Box b1 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

		System.out.println("Enter 2nd box dimensions: ");

		Box b2 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

		System.out.println(b2.isEqual(b1) ? "SAME" : "DIFFERENT");
		sc.close();

	}

}
