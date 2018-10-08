package lab3_3;

public class TheDesk {
	String Material;
	String Shape;
	int NumberOfFeet;
	String Color;
	
	public String getMaterial() {
		return Material;
	}
	public void setMaterial(String material) {
		Material = material;
	}
	public String getShape() {
		return Shape;
	}
	public void setShape(String shape) {
		Shape = shape;
	}
	public int getNumberOfFeet() {
		return NumberOfFeet;
	}
	public void setNumberOfFeet(int numberOfFeet) {
		NumberOfFeet = numberOfFeet;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public TheDesk(String material, String shape, int numberOfFeet, String color) {
		super();
		Material = material;
		Shape = shape;
		NumberOfFeet = numberOfFeet;
		Color = color;
	}
	
	
	
}
