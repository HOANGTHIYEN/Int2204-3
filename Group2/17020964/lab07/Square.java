package lab7;

public class Square extends Shape{
	

	protected int sideSquare;
	public Square(int sideSquare,String color, double x, double y) {
		super(color, x, y);
		this.sideSquare=sideSquare;
		// TODO Auto-generated constructor stub
	}
	public int getSideSquare() {
		return sideSquare;
	}
	public void setSideSquare(int sideSquare) {
		this.sideSquare = sideSquare;
	}

}
