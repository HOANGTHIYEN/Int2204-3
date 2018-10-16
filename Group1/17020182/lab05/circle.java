package lab5_2;

public class circle extends Shape {
	private double radius;
	final double pi = 3.14;
	
	//get set
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//constructor
	public circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.setRadius(radius);
	}
	
	public circle(double radius)
	{
		this.setRadius(radius);
	}
	
	public circle()
	{
		this.setRadius(1);
	}
	
	public double getArea() {
		return this.radius * this.radius*pi;
	}
	
	public double getPerimeter() {
		return this.radius*pi*2 ;
	}
	@Override
	public String toString() {
		return "Radius: " + radius +"\t Area = "+ this.getArea();
	}
	



}
