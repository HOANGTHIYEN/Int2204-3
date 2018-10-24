package lab06;

public class Square extends Rectangle {
	public Square() {
		this.length = 1.0;
		this.width = 1.0;
	}
	public Square(Double s,String c,boolean f,Point point) {
		super(s,s,c,f,point);
	}
	public double getSide() {
		return this.getWidth();
	}
	public void setSide(double s) {
		super.setWidth(s);
		super.setLength(s);
	}
	public void setWidth(double s) {
		this.setSide(s);;
	}
	public void setLength(double s) {
		this.setSide(s);
	}
	@Override
	public String toString() {
		return "Mau : " + this.getColor() + " Filled : " + this.isFilled() +  " Dien tich : " + this.getArea() + " Chu vi : " + this.getPerimeter() ;
	}
}
