public abstract class Shape {
	protected String color;
	protected double x0; // toa do tam
	protected double y0;
	
	public Shape() {}
	public Shape(double x0, double y0) {
		this.x0 = x0;
		this.y0 = y0;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void size() {}
	public void move(double x, double y) {}
}
