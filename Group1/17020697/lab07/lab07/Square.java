package lab06_abtract;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;

public class Square extends Shape{
	private Toado a,b,c,d;
	private double size;
	
	public Square() {
		// TODO Auto-generated constructor stub
		this.a = new Toado(0,0);
		this.b = new Toado(1,0);
		this.c = new Toado(1, 1);
		this.d = new Toado(0,1);
		this.size = 1;
	}
	
	public Square(int x1,int y1,int _size) {
		// TODO Auto-generated constructor stub
		this.a = new Toado(x1,y1);
		this.b = new Toado(x1+size,y1);
		this.c = new Toado(x1+size,y1+size);
		this.d = new Toado(x1,y1+size);
		this.size = _size;
	}
	
	public boolean isSquare() {
		if(a.distance(b)==b.distance(c) && c.distance(d)==b.distance(c) && a.distance(c)==b.distance(d)) {
			return true;
		}
		return false;
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
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	



	@Override
	Toado[] getToado() {
		// TODO Auto-generated method stub
		Toado[] tmp = new Toado[] {a,b,c,d};
		return tmp;
	}

	public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D.Double squ = new Rectangle2D.Double(a.getX(),a.getY(),a.distance(b),a.distance(c));
        
        g2d.setColor(Color.RED);
        g2d.fill(squ);
        System.out.println("squ");
    }
	
	
}
