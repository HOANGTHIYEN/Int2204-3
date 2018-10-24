package lab06_abtract;

public class Square extends Shape{
	private Toado a,b,c,d;

	
	public boolean isSquare() {
		
		
		
		return false;
		
	}
	
	@Override
	String draw() {
		// TODO Auto-generated method stub
		return "squ ";
	}

	@Override
	void moveUp() {
		// TODO Auto-generated method stub
		this.a.setX(this.a.getX()+1);
		this.b.setX(this.b.getX()+1);
		this.c.setX(this.c.getX()+1);
		this.d.setX(this.d.getX()+1);
		
	}

	@Override
	void moveDown() {
		// TODO Auto-generated method stub
		this.a.setX(this.a.getX()-1);
		this.b.setX(this.b.getX()-1);
		this.c.setX(this.c.getX()-1);
		this.d.setX(this.d.getX()-1);
	}

	@Override
	void moveLeft() {
		// TODO Auto-generated method stub
		this.a.setY(this.a.getY()-1);
		this.b.setY(this.b.getY()-1);
		this.c.setY(this.c.getY()-1);
		this.d.setY(this.d.getY()-1);
	}

	@Override
	void moveRight() {
		// TODO Auto-generated method stub
		this.a.setY(this.a.getY()+1);
		this.b.setY(this.b.getY()+1);
		this.c.setY(this.c.getY()+1);
		this.d.setY(this.d.getY()+1);
	}

	
	//getter/setter
	public Toado getB() {
		return b;
	}

	public void setB(Toado b) {
		this.b = b;
	}

	public Toado getD() {
		return d;
	}

	public void setD(Toado d) {
		this.d = d;
	}

	public Toado getA() {
		return a;
	}

	public void setA(Toado a) {
		this.a = a;
	}

	public Toado getC() {
		return c;
	}

	public void setC(Toado c) {
		this.c = c;
	}
	
	
	
}
