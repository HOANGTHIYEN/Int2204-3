package tuan5_2;

public class Shape {
	private String color="red";
	private Boolean filled=true;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Boolean isFilled() {
		return filled;
	}

	public void setFilled(Boolean filled) {
		this.filled = filled;
	}

	public Shape() {
		this.color = "red";
		this.filled = true;
	}
	
	 public Shape(String color, Boolean filled) {
		
		this.color = color;
		this.filled = filled;
	}

	@Override
	public String toString() {
		return "Shape [ getColor()=" + getColor() + ", isFilled()=" + isFilled() + "]";
	}

	

}
