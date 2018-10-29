package week7;

public class Circle extends Shape {
	double r;
	private final double PI = Math.PI;
	
	public Circle() {}
	public Circle(double r) {
		
		this.r = r;
	}
	
	public double getR() {
		return r;
	}
 	public void setR(double r) {
		this.r = r;
	}
	
	public void size() {
		System.out.println(r*r*PI);
	}
	public void move(double x, double y) {
		super.x=(int) x;
		super.y=(int) y;
	}
	@Override
	public String toString() {
		return "Circle";
	}
}