package lab06_abtract;

public class Rectangle extends Shape {
	private Toado a,b,c,d;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
		this.a = new Toado(0,0);
		this.b = new Toado(1,0);
		this.c = new Toado(1, 1);
		this.d = new Toado(0,1);
	}
	@Override
	String draw() {
		// TODO Auto-generated method stub
		return "rec ";
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



	//Getter/Setter
	public Toado getA() {
		return a;
	}
	public void setA(Toado a) {
		this.a = a;
	}
	public Toado getD() {
		return d;
	}
	public void setD(Toado d) {
		this.d = d;
	}
	public Toado getC() {
		return c;
	}
	public void setC(Toado c) {
		this.c = c;
	}
	public Toado getB() {
		return b;
	}
	public void setB(Toado b) {
		this.b = b;
	}
	
}
