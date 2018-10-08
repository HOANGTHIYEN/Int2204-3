package JavaWeek5;

public class Ex2_Square extends Ex2_Ractangle{
	private double size;
	// Constructor
	
	public Ex2_Square() {}
	
	public Ex2_Square(double size) {
		this.size = size;
	}
	
	public Ex2_Square(double size, String color, boolean filled) {
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
		return size*size;
	}
	
}
