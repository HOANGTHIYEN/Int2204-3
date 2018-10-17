package lab6;

public class Rectangle extends Shape{
	int a,b;

	Rectangle(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw at "+x+"  +"+y);
	}

	@Override
	public void erase() {
		// TODO Auto-generated method stub
		System.out.println("erase at " +x+"  +"+y);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Rectangle [a=" + a + ", b=" + b + "]";
	}
	

	
	}
	

