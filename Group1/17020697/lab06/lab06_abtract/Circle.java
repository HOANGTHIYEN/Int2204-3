package lab06_abtract;

public class Circle extends Shape{
	private double R;
	final double pi =3.14;
	private Toado o;
	
	
	
	//getter/setter
	public Toado getO() {
		return o;
	}
	public void setO(Toado o) {
		this.o = o;
	}
	public double getR() {
		return R;
	}
	public void setR(double r) {
		R = r;
	}
	public Circle() {
		// TODO Auto-generated constructor stub
		super();
		this.R = 1;
		this.o = new Toado(1,1);
	}

	

	@Override
	String draw() {
		// TODO Auto-generated method stub
		return "cir ";
	}

	@Override
	void moveUp() {
		// TODO Auto-generated method stub
		this.o.setX(this.o.getX()+1);
	}

	@Override
	void moveDown() {
		// TODO Auto-generated method stub
		this.o.setX(this.o.getX()-1);
	}

	@Override
	void moveLeft() {
		// TODO Auto-generated method stub
		this.o.setY(this.o.getY()-1);
	}

	@Override
	void moveRight() {
		// TODO Auto-generated method stub
		this.o.setY(this.o.getY()+1);
	}

	
}
