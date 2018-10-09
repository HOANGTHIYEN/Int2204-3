package bt;

public class apple extends Fruit {
	private String size;
	private String effect;
	
	//getter/setter
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getEffect() {
		return effect;
	}
	public void setEffect(String effect) {
		this.effect = effect;
	}
	//Constructor
	public apple() {
		// TODO Auto-generated constructor stub
		this.size = "small";
		this.effect = "to export";
		this.setColour("red");
		this.setStatus(true);
	}
	
	public apple(String s,String e,String color,boolean t) {
		// TODO Auto-generated constructor stub
		this.size = "small";
		this.effect = "export";
		this.setColour("red");
		this.setStatus(true);
	}
	
	@Override
	public String toString() {
		return "an "+this.getColour()+" "+this.size +" apple to "+ this.effect;
	}
	
}
