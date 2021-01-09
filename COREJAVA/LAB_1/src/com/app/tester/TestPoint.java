package com.app.tester;

import java.util.Scanner;
import com.app.geometry.*;

public class TestPoint {

	public static void main(String[] args) {

		/*
		 * 3.6 Write TestPoint class , under "com.app.tester" package with a main method
		 * Accept co ordinates of 2 points from user (Scanner) --p1 & p2
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Points: ");

		Point2D p1 = new Point2D(scan.nextDouble(), scan.nextDouble());

		// 3.7 Use getDetails method to display point details.(p1's details & p2's
		// details)
		System.out.println("P1 Details: ");
		System.out.println(p1.getDetails());

		/*
		 * 3.8 Invoke isEqual & display if points are same or different (i.e p1 & p2 are
		 * located at the same position)
		 */
		System.out.println("Enter p2 Points: ");
		Point2D p2 = new Point2D(scan.nextDouble(), scan.nextDouble());
		System.out.println("P2 Details: ");
		System.out.println(p2.isEqual(p1));

		/*
		 * 3.9 Create new point p3 , with the dimensions offset from p1. I/P --x offset
		 * & y offset
		 */
		System.out.println("Enter Offset: ");
		Point2D p3 = p1.createNewPoint(scan.nextInt(), scan.nextInt());

		System.out.println(p1.getDetails());
		System.out.println(p2.getDetails());
		System.out.println(p3.getDetails());

	}

}
