package lab06;

public class Shape {
	protected String color;
	protected boolean filled;
	protected Point point;
	protected int index;
	public Shape() {
		this.color = "white";
		this.filled = true;
		point = new Point(0,0);
	}
	public Shape(String c, boolean f, Point point) {
		this.color = c;
		this.filled = f;
		this.point = point;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String c) {
		this.color = c;
	}
	public boolean isFilled() {
		return this.filled;
	}
	public void setFilled(boolean f) {
		this.filled = f;
	}
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public String toString() {
		return "Mau : " + color + " Filled : " + filled;
	}
	
}
