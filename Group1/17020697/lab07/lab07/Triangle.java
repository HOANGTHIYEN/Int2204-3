package lab06_abtract;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;

public class Triangle extends Shape{
	private Toado a,b,c;
	
	
	//Constructor
	public Triangle() {
		// TODO Auto-generated constructor stub
		this.a = new Toado(0,0);
		this.b = new Toado(0,1);
		this.c = new Toado(1,1);
	}
	public Triangle(double x1,double x2,double x3,double y1,double y2,double y3) {
		// TODO Auto-generated constructor stub
		this.a = new Toado(x1,y1);
		this.b = new Toado(x2,y2);
		this.c = new Toado(x3,y3);
	}
	
	
	
	public boolean isTriangle() {
		if(a.distance(b)+b.distance(c)>a.distance(c) && Math.abs(a.distance(b)-b.distance(c)) <a.distance(c)) {
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
	}

	@Override
	void moveDown() {
		// TODO Auto-generated method stub
		this.a.setX(this.a.getX()-1);
		this.b.setX(this.b.getX()-1);
		this.c.setX(this.c.getX()-1);
	}

	@Override
	void moveLeft() {
		// TODO Auto-generated method stub
		this.a.setY(this.a.getY()-1);
		this.b.setY(this.b.getY()-1);
		this.c.setY(this.c.getY()-1);
	}

	@Override
	void moveRight() {
		// TODO Auto-generated method stub
		this.a.setY(this.a.getY()+1);
		this.b.setY(this.b.getY()+1);
		this.c.setY(this.c.getY()+1);
	}

	
	//getter/setter
	public Toado getA() {
		return a;
	}

	public void setA(Toado a) {
		this.a = a;
	}

	public Toado getB() {
		return b;
	}

	public void setB(Toado b) {
		this.b = b;
	}

	public Toado getC() {
		return c;
	}

	public void setC(Toado c) {
		this.c = c;
	}

	@Override
	Toado[] getToado() {
		// TODO Auto-generated method stub
		Toado[] tmp = new Toado[] {a,b,c,};
		return tmp;
	}
	
	public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        double xPoints[] = {a.getX(),b.getX(),c.getX()};
        double yPoints[] = {a.getY(),b.getY(),c.getY()};
        
        GeneralPath tri = new GeneralPath();
        tri.moveTo(xPoints[0] + a.getX(), yPoints[0] + a.getY());
        for (int i = 1; i < xPoints.length; i++) {
            tri.lineTo(xPoints[i] + a.getX(), yPoints[i] + a.getY());
        }
        tri.closePath();
        g2d.setColor(Color.YELLOW);
        g2d.fill(tri);
    }
	
	
}
