package lab5_2;

public class Retangle extends Shape {

	protected double width;
	protected double length;
	
	//set get
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
	public Retangle(String color, boolean filled, double width, double length) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	
	//constructor
	public Retangle()
	{
		this.width = 1.0;
		this.length=1.0;
	}
	//function
	public double getArea() {
		return this.getLength()*this.getWidth();
	}
	public double getPerimeter() {
		return (this.getLength() + this.getWidth())*2;
	}
	@Override
	public String toString() {
		return width + " & " + length + "\t Area = " + this.getArea() + "\t Perimater = " + this.getPerimeter();
	}
	

}
