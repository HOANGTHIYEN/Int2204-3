package lab3_3;

public class Laptop {
	String Produce;
	String Name;
	String Chip;
	int screen;
	public String getProduce() {
		return Produce;
	}
	public void setProduce(String produce) {
		Produce = produce;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getChip() {
		return Chip;
	}
	public void setChip(String chip) {
		Chip = chip;
	}
	public int getScreen() {
		return screen;
	}
	public void setScreen(int screen) {
		this.screen = screen;
	}
	public Laptop(String produce, String name, String chip, int screen) {
		super();
		Produce = produce;
		Name = name;
		Chip = chip;
		this.screen = screen;
	}
	
	
}
