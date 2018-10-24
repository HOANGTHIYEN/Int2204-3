package JavaWeek7;

public class Rectangle extends Shape {
	private double width;
	private double length;

	public Rectangle(double width, double length, String color, boolean filled, double x, double y) {
		super(color, filled, x, y);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return this.width;
	}

	public double getLength() {
		return this.length;
	}

	public void setWidth(double w) {
		this.width = w;
	}

	public void setLength(double l) {
		this.length = l;
	}

	public double getArea() {
		return this.length * this.width;
	}

	public double getPerimeter() {
		return this.length * 2 + this.width * 2;
	}

	@Override
	public String toString() {
		return this.getColor() + " " + this.isFilled() + " " + this.getArea() + " " + this.getPerimeter();
	}
}