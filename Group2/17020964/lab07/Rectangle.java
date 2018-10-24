package lab7;

public class Rectangle extends Shape{
	protected int width;
	protected int height;
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Rectangle(int width,int height, String color, double x, double y) {
		super(color, x, y);
		this.height=height;
		this.width=width;
		// TODO Auto-generated constructor stub
	}
	

}
