package Week6;

public class Triangle extends Shape {
	protected double canh1, canh2, canh3;
	public double getCanh1() {
		return canh1;
	}

	public void setCanh1(double canh1) {
		this.canh1 = canh1;
	}

	public double getCanh2() {
		return canh2;
	}

	public void setCanh2(double canh2) {
		this.canh2 = canh2;
	}

	public double getCanh3() {
		return canh3;
	}

	public void setCanh3(double canh3) {
		this.canh3 = canh3;
	}
	public Triangle(double canh1, double canh2, double canh3, double x, double y, String color, boolean filled) {
		super(x, y, color, filled);
		this.canh1 = canh1;
		this.canh2 = canh2;
		this.canh3 = canh3;
	}
	public Triangle(double canh1, double canh2, double canh3)
	{
		this.canh1 = canh1;
		this.canh2 = canh2;
		this.canh3 = canh3;
	}
	public Triangle() {
	}
	public String toString() {
		return "x: " + x + " y: " + y + " color: " + color + " filled: " + filled + " canh1: " + canh1 + " canh2: " + canh2 + " canh3: " + canh3;
	}
}
