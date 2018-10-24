package lab06_abtract;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

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
	
	//Contructor
	public Circle() {
		// TODO Auto-generated constructor stub
		super();
		this.R = 1;
		this.o = new Toado(1,1);
	}
	public Circle(int x1,int y1,int _r) {
		super();
		this.o = new Toado(x1,y1);
		this.R = _r;
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
	
	
	@Override
	Toado[] getToado() {
		// TODO Auto-generated method stub
		Toado tmp = new Toado(this.R,0);
		Toado[] list = new Toado[] {o,tmp};
		return list;
	}

	public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D.Double circle = new Ellipse2D.Double(o.getX()-R/2, o.getY()-R/2, R*2, R*2);

        g2d.setColor(Color.GREEN);
        g2d.fill(circle);
        System.out.println("cir");
    }
	
}
