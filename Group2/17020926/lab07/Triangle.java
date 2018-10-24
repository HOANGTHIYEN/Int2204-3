package lab06;

public class Triangle extends Shape{
	private double a1;
	private double a2;
	private double a3;
	
	public double getA1() {
		return a1;
	}
	public void setA1(double a1) {
		this.a1 = a1;
	}
	public double getA2() {
		return a2;
	}
	public void setA2(double a2) {
		this.a2 = a2;
	}
	public double getA3() {
		return a3;
	}
	public void setA3(double a3) {
		this.a3 = a3;
	}
	
	public Triangle() {
		this.a1 = 3.0;
		this.a2 = 4.0;
		this.a3 = 5.0;
	}
	
	public Triangle(double a1, double a2, double a3, String c, boolean f, Point point) {
		super(c,f,point);
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
	}
}
