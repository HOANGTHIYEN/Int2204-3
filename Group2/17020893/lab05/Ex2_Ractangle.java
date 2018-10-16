package JavaWeek5;

public class Ex2_Ractangle extends Ex2_Shape {
	private double width = 1.0;
	private double length = 1.0;

	// Constructor
	public Ex2_Ractangle() {}
	
	public Ex2_Ractangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public Ex2_Ractangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;	
	}

	// Getter Setter
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	// area
	public double area() {
		return width*length;
	}
	// perimeter
	public double perimeter() {
		return 2*(width+length);
	}
}
