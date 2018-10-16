package bt2;

public class Circle extends Shape{
	private double radius;
	final double pi = 3.14;
	//Constructor
	public Circle() {
		// TODO Auto-generated constructor stub
		this.setRadius(1);
	}
	public Circle(double r) {
		this.setRadius(r);
	}
	public Circle(double r, String c, boolean f) {
		this.setRadius(r);
		this.setColor(c);
		this.setFilled(f);
	}
	
	//Getter/setter
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//function
	public double getArea() {
		return this.radius*this.radius*pi;
	}
	public double getPerimeter() {
		return this.radius*pi*2 ;
	}
	@Override
	public String toString() {
		return "radius:" + radius +"\t S= "+ this.getArea() + " P= "+ this.getPerimeter();
	}
}
