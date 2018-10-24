package lab6;

public class Triage extends Shape{
	int a,b,c;
	

	public Triage(int x, int y, int a, int b, int c) {
		super(x, y);
		this.a = a;
		this.b = b;
		this.c = c;
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

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	Triage(int x, int y,int z) {
		super(x, y);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void erase() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Triage [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	

}
