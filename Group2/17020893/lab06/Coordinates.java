package JavaWeek6;

public class Coordinates {
	private double x, y;
	
	
	// setter getter
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
	
	public void setHeart(double _x, double _y) {
		this.x = _x;
		this.y = _y;
	}
	public String getHeart() {
		return "( " + x + ", " +  y + " ) ";
	}
}
