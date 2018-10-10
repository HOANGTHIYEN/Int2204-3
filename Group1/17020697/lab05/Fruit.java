package bt;

public class Fruit {
	private String colour;
	private boolean status;
	
	
	
	//getter/setter
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	//Constructor
	public Fruit() {
		// TODO Auto-generated constructor stub
		this.colour = null;
		this.status = true;
	}
	
}
