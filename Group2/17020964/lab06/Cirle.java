package lab6;

public class Cirle extends Shape{
	Cirle(int x, int y,double r) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.r=r;
	}

	double r;

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw at" +x +"    "+ y);

	}

	@Override
	public void erase() {
		// TODO Auto-generated method stub
		System.out.println("erase at "+x +"     +" +y);

	}

	@Override
	public String toString() {
		return "Cirle [r=" + r + "]";
	};
	

}
