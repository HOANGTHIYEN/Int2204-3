package community.com;

public class Rectangle extends Shape {
	protected double width = 1.0;
	protected double length =1.0;
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rectangle(String color, boolean filled, double width, double length) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	public Rectangle(double width ,double length) {
		this.width = width ;
		this.length = length;
		// TODO Auto-generated constructor stub
	}
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
	public double getArea ()
	{
		return width *length;
	}
	public double getPerimeter()
	{
		return (width+length)*2;
	}
	public String toString()
	{
		return "Rectangle : width  =" +this.width +",length = "+this.length+super.toString();
		
	}
}
