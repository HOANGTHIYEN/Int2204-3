package lab7;

public class Shape extends Layer{
	protected String color;
	protected double x,y;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void moveTo(double _x,double _y) {
		this.x=_x;
		this.y=_y;
	}
	public Shape(String color, double x, double y) {
		super();
		this.color = color;
		this.x = x;
		this.y = y;
	}
	

}
