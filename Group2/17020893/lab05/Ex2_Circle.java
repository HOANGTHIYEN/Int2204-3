package JavaWeek5;

public class Ex2_Circle extends Ex2_Shape {
	final double PI = Math.PI;
	private double radius = 1.0;

	// Constructor
	public Ex2_Circle() {}
	
	public Ex2_Circle(double radius) {
		this.radius = radius;
	}

	public Ex2_Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	// perimeter
	public double getPerimeter() {
		double perimeter = PI * this.radius * 2;
		return perimeter;
	}

	// area
	public double getArea() {
		double area = PI * this.radius * this.radius;
		return area;
	}

	// Getter Setter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
