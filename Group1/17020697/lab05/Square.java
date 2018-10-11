package bt2;

public class Square extends Rectangle{
	//Constructor
	
	public Square() {
		super();
	}
	public Square(double side) {
		super(side,side);
	}
	public Square(double side, String c, boolean f) {
		super(side,side,c,f);
	}
	//
	
	public double getSide() {
		return this.getLength();
	}
	public void setSide(double side) {
		length = side;
		width = side;
	}
	
	@Override
	public void setWidth(double s) {
		setSide(s);
	}
	@Override
	public void setLength(double l) {
		setSide(l);
	}
	@Override
	public String toString() {
		return "Side: " + this.getSide() + "\tS= " + this.getArea()+"\tP= "+ this.getPerimeter();
	}
}
