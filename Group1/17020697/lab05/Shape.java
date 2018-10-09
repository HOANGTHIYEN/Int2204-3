package bt2;

public class Shape {
	private String color;
	private boolean filled;
	
	//Constructor
	public Shape() {
		// TODO Auto-generated constructor stub
		this.color="red";
		this.filled=true;
	}
	public Shape(String c, boolean f) {
		this.color=c;
		this.filled=f;
	}
	
	//getter/setter
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
	
	@Override
	public String toString() {
		return  color + "/" + filled;
	}
}
