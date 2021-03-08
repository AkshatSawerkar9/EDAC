package com.app.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st point in x and y");

		Point2D firstPoints = new Point2D(sc.nextInt(), sc.nextInt());

		System.out.println("Enter 2nd point: ");

		Point2D secondPoints = new Point2D(sc.nextInt(), sc.nextInt());

		System.out.println(firstPoints.getDetails());

		System.out.println(secondPoints.getDetails());

		System.out.println(firstPoints.isEqual(secondPoints));

		System.out.println("Enter offset for x and y: ");

		System.out.println(firstPoints.calcDistance(secondPoints));

	}

}
