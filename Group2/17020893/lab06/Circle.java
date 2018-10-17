package JavaWeek6;

public class Circle extends Shape{
	final double PI = Math.PI;
	private double radius = 1.0;

	// Constructor
	public Circle() {}
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
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
	public String getInfo() {
    	return "Hình tròn có bán kính là: " + getRadius();
    }
}
