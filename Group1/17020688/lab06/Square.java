public class Square extends Retangle {
	public Square() {
		super();
	}
	public Square(double side) {
		super(side, side);
	}
	
	public void setSide(double side) {
		super.width=side;
		super.length=side;
	}
	
	@Override
	public void setWidth(double side) {
		setSide(side);
	}
	@Override
	public void setLength(double side) {
		setSide(side);
	}
        @Override
	public void move(double x, double y) {
		super.x0 = x;
		super.y0 = y;
	}
	@Override
	public String toString() {
		return "Square";
	}
}
