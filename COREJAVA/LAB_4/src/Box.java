
public class Box {
	// state : instance vars : tight encapsulation : private
	private double width, height, depth;

	// add parameterized constr to init complete state of a box
	public Box(double w, double d, double height) {
		this.width = w;
		depth = d;
		this.height = height;
	}

	// Add a method to return box details in a string form
	public String getBoxDetails() {
		return "Box Dims " + width + " " + depth + " " + height;
	}

	// Add a method to return computed volume of a box
	public double computeVolume() {
		return width * height * depth;
	}

	public String toString() {
		return "Box Dims " + width + " " + depth + " " + height;
	}

	public double getwidth() {
		return width;
	}
	public void setwidth(double width)
	{
		this.width =  width;
	}
}
