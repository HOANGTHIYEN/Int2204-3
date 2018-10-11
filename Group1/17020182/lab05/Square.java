package lab5_2;

public class Square extends Retangle{
	//set get
	public double getSide() {
		return length;
	}
	public void setSide(double side) {

		length = side;
		width = side;
	}
	public void setlength(double a)
	{
		setSide(a);
	}
	public void setwidth(double b)
	{
		setSide(b);
	}
	
	//constructor
	public Square(String color,boolean filled,double size)
	{
		super(color, filled, size, size);
		this.setSide(size);
	}
	
	public Square(String color, boolean filled, double width, double length, double side) {
		super(color, filled, side, side);
		this.length = side;
	}
	public Square()
	{
		this.setColor("gray");
		this.setFilled(false);
		this.setLength(6.0);
		this.setWidth(6.0);
		this.setSide(6.0);
	}
	
	public Square(double side) {
		this.setLength(side);
		this.setWidth(side);
		this.setSide(side);
	}
	
	
	@Override
	public String toString() {
		return " Side: " + this.getSide() + "\t S = " + this.getArea();
	}
	
}
