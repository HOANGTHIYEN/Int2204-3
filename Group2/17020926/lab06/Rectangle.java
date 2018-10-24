package lab06;

public class Rectangle extends Shape {
	protected double width;
	protected double length;
	public Rectangle() {
		this.length = 2.0;
		this.width = 1.0;
	}
	public Rectangle(double w,double l, String c, boolean f, Point point) {
		super(c,f,point);
		this.width = w;
		this.length = l;
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
	public double getArea() {
		return this.length*this.width;
	}
	public double getPerimeter() {
		return this.length*2+this.width*2;
	}
	@Override
	public String toString() {
		return "Mau : " + this.getColor() + " Filled : " + this.isFilled() +  " Dien tich : " + this.getArea() + " Chu vi : " + this.getPerimeter() ;
	}
	
}
