package lab6;

public class Square extends Shape{

	Square(int x, int y) {
		super(x, x);
		// TODO Auto-generated constructor stub
	}

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
	public void moveTo(int x1, int y1) {
		// TODO Auto-generated method stub
		super.moveTo(x1, y1);
	}

	@Override
	public String toString() {
		return "Square [x=" + x + ", y=" + y ;
				
	}
	
	

}
