package JavaWeek6;

public class Shape extends Coordinates{
	private String color = "red";
	private boolean filled = true;

	// Constructor
	public Shape() {}

	public Shape(String color, boolean filled) {
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
	
	// hàm di chuyển
		public void Move(String dic, double length) {
			switch(dic) {
				case "up":{
					setHeart(getX(), getY() + length);
				break;
				}
				case "down":{
					setHeart(getX(), getY() - length);
					break;
				}
				case "left":{
					setHeart(getX() - length, getY());
					break;
				}
				case "right":{
					setHeart(getX() + length, getY());
					break;
				}
			}
		}
	public String getInfo() {
		return "";
	}
}
