public class Retangle extends Shape {
	protected double width;
	protected double length;	
	public Retangle() {}	
	public Retangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
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
	
	@Override
	public void size() {	
		System.out.println(width*length);
	}

	@Override
	public void move(double x, double y) {
		super.x0 = x;
		super.y0 = y;
	}
	@Override
	public String toString() {
		return "Retangle";
	}
}
