package com.app.geometry;

public class Point2D {

	/*
	 * 3. Create Point class Point2D , under package com.app.geometry : for
	 * representing a point in x-y co-ordinate system. eg : day1_lab \src com \ app
	 * \geometry --- Point2D.java package com.app.geometry;
	 * 
	 */

	private int x, y;

	// 3.1 Create a parameterized constructor to accept x & y co-ords.

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 3.2 Add public String getDetails()) --to return string form point's x & y
	// co-ords

	public String getDetails() {
		return "Points: " + x + " " + y;
	}

	public boolean isEqual(Point2D anotherPoint) {
		return (this.x == anotherPoint.x) && (this.y == anotherPoint.y);
	}

	public Point2D createNewPoint(int xOff, int yOff) {
		return new Point2D((x + xOff), (y + yOff));
	}

	public double calcDistance(Point2D p2) {
		return Math.sqrt((Math.pow(((p2.x - x)), 2)) + (Math.pow(((p2.y - y)), 2)));
	}
}
