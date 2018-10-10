package bt2;

public class Rectangle extends Shape{
	protected double width;
	protected double length;
	//Constructor
	public Rectangle() {
		// TODO Auto-generated constructor stub
		this.width=1.0;
		this.length=1.0;
	}
	public Rectangle(double w,double l) {
		this.width=w;
		this.length=l;
	}
	public Rectangle(double w,double l,String a,boolean b) {
		super(a,b);
		this.width=w;
		this.length=l;
	}
	
	//getter/setter
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
	
	//function
	public double getArea() {
		return this.getLength()*this.getWidth();
	}
	public double getPerimeter() {
		return (this.getLength() + this.getWidth())*2;
	}
	
	@Override
	public String toString() {
		return width + " & " + length + "\tS= " + this.getArea() + "\tP=" + this.getPerimeter();
	}
	
	
}
