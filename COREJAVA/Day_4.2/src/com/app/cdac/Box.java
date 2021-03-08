package com.app.cdac;

public class Box {

	// state: instance variable : tight encapsulation: private

	private double width, depth, height;

	// Add a parameterized constructor

	public Box(double w, double d, double h) {

		this.width = w;
		this.depth = d;
		this.height = h;
	}

	// add a constructor to create a cube

	public Box(double side) {
		this(side, side, side);
	}

	// Add a method to return box details in string form

	public String getBoxDetails() {
		return "Box Dims " + width + " " + depth + " " + height;
	}

	// Add a method to compute volume of a box

	public double computeVolume() {
		return width * depth * height;
	}

	// Add a method to Box class to test equality of 2 boxes

	public boolean isEqual(Box anotherBox) {
		return this.width == anotherBox.width && this.depth == anotherBox.depth && this.height == anotherBox.height;
	}

	// Add a method to return new Box with modified offset

	public Box createNewBox(double wOff, double dOff, double hOff) {
		Box tmp = new Box(this.width + wOff, depth + dOff, height + hOff);
		return tmp;
	}

}
