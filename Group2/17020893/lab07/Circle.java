package JavaWeek7;

public class Circle extends Shape {
	private double radius;
	private final double PI = Math.PI;

	public Circle(double radius, String color, boolean filled, double pos_x, double pos_y) {
		super(color, filled, pos_x, pos_y);
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double r) {
		this.radius = r;
	}

	public double getArea() {
		return PI * this.radius * this.radius;
	}

	public double getPerimeter() {
		return 2 * PI * this.radius;
	}

	@Override
	public String toString() {
		return this.getColor() + " " + this.isFilled() + " " + this.getArea() + " " + this.getPerimeter();
	}
}