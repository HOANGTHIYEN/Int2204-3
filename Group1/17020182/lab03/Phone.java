package lab3_3;

public class Phone {
	String	Name;
	String Shape;
	String Color;
	int Money;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getShape() {
		return Shape;
	}
	public void setShape(String shape) {
		Shape = shape;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getMoney() {
		return Money;
	}
	public void setMoney(int money) {
		Money = money;
	}
	public Phone(String name, String shape, String color, int money) {
		super();
		Name = name;
		Shape = shape;
		Color = color;
		Money = money;
	}
	
	
}
