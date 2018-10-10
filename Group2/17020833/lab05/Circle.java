package community.com;

public class Circle extends Shape {

	protected double radius = 1.0;
	protected final double PI=3.14;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Circle(double radius)
	{
		this.radius = radius;
	}

	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}
	public double getArea()
	{
		return PI *(Math.pow(this.radius, 2));
	}
	public double getPerimeter ()
	{
		return 2*PI*this.radius;
	}
	public String toString ()
	{
		
		return "Circle:radius = " +this.radius+super.toString();
		
	}
	
}
