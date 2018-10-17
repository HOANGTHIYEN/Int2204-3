package JavaWeek6;

public class Square extends Rectangle {
	private double size = 5.0;

	// Constructor
	public Square() {
	}

	public Square(double size) {
		this.size = size;
	}

	public Square(double size, String color, boolean filled) {
		this.size = size;
		this.setColor(color);
		this.setFilled(filled);
	}
	
	// Getter Setter
	public double getSize() {
		return size;
	}

	public void setSize(double size) { 
		this.size = size;
	}

	@Override
	public void setWidth(double size) {
		this.size = size;
	}

	@Override
	public void setLength(double size) {
		this.size = size;
	}

	public double area() {
		return size * size;
	}
	public String getInfo() {
		return "Hình vuông có cạnh là: " + getSize();
	}
}
