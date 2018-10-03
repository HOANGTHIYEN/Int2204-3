package lab3_3;

public class ConGa {
	String Name;
	String Color;
	int Weight;
	String Food;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		this.Color = color;
	}
	public int getWeight() {
		return Weight;
	}
	public void setWeight(int weight) {
		this.Weight = weight;
	}
	public String getFood() {
		return Food;
	}
	public void setFood(String food) {
		this.Food = food;
	}
	//constructor

	public ConGa(String name, String color, int weight, String food) {
		super();
		Name = name;
		Color = color;
		Weight = weight;
		Food = food;
	}
	public void MakeNoise()
	{
		System.out.println("cu tac cu tac ^^");
	}
}
