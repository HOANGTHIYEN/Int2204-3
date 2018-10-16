package community.com;

public class Square extends Rectangle {

	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Square(double side ) {
		super(side,side);
		// TODO Auto-generated constructor stub
	}

	public Square(String color, boolean filled, double side) {
		super(color, filled, side,side);
		// TODO Auto-generated constructor stub
	}
	public double getSide ()
	{
		return super.getWidth();
	}
	public void setSide (double side)
	{
		width = side;
		length =side;
	}
	public void setWidth(double side)
	{
		setSide(side);
	}
	public void setLength(double side)
	{
		setSide(side);
	}
	public String toString()
	{
		return "Square:side= "+this.width+super.toString();
	}
	}
