package JavaWeek5;

public class Ex2_Shape {
	private String color = "red";
	private boolean filled = true;

	// Constructor
	public Ex2_Shape() {}

	public Ex2_Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	// Getter Setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	// toString
	@Override
	public String toString() {
		return "\ncolor: " + this.color + "\nfilled: " + this.filled;
	}
}