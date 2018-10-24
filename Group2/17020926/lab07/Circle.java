package lab06;

public class Circle extends Shape {
	private double radius;
	private final double PI = Math.PI;
	public Circle() {
		radius = 1.0; 
	}
	
	public Circle(double r,String c,boolean f,Point point) {
		super(c,f,point);
		this.radius = r;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double r) {
		this.radius = r;
	}
	public double getArea() {
		return this.radius*this.radius*PI;
	}
	public double getPerimeter() {
		return this.radius*2*PI;
	}
	@Override
	public String toString() {
		return "Mau : " + this.getColor() + " Filled : " + this.isFilled() +  " Dien tich : " + this.getArea() + " Chu vi : " + this.getPerimeter() ;
	}
}
