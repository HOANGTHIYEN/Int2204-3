public class Triangle extends Shape{
	private double c;
	private double cd;
	private double h;
	public Triangle() {
		
	}
	public Triangle(double c1, double c2, double h) {
		super();
		this.c = c1;
		this.cd = c2;
		this.h = h;
	}
	
	public double getC1() {
		return c;
	}
	public void setC1(double c1) {
		this.c = c1;
	}
	public double getC2() {
		return cd;
	}
	public void setC2(double c2) {
		this.cd = c2;
	}
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	
	@Override
	public void size() {
			System.out.println(h*cd/2);	
	}
	@Override
	public void move(double x, double y) {
		super.x0 = x;
		super.y0 = y;
	}
	@Override
	public String toString() {
		return "Triangle";
	}
	
}
