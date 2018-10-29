package lab06_abtract;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

public class Rectangle extends Shape {
	private Toado a,b,c,d;
	private double length;
	private double width;
	public Rectangle() {
		// TODO Auto-generated constructor stub
		this.a = new Toado(0,0);
		this.b = new Toado(1,0);
		this.c = new Toado(1, 1);
		this.d = new Toado(0,1);
		this.length =1;
		this.width =1;
	}
	
	public Rectangle(int x1,int y1,int _length,int _width) {
		// TODO Auto-generated constructor stub
		this.a = new Toado(x1,y1);
		this.b = new Toado(x1+length,y1);
		this.c = new Toado(x1+width, y1+length);
		this.d = new Toado(x1,y1+width);
		this.length = _length;
		this.width = _width;
	}
	
	
	
	public boolean isRectangle() {
		if(a.distance(b)==d.distance(c) && a.distance(d)==b.distance(c) && a.distance(c)==b.distance(d)) {
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
	
	
	boolean equals(Rectangle tmp) {
		if(this.a == tmp.getA() && this.b == tmp.getB() && this.c== tmp.getC() && this.d== tmp.getD()) {
			return true;
		}
		return false;
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
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	
	@Override
	Toado[] getToado() {
		// TODO Auto-generated method stub
		Toado[] tmp = new Toado[] {a,b,c,d};
		return tmp;
	}

	public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(4.0f));
        double xPoints[] = {a.getX(),b.getX(),c.getX(),d.getX()};
        double yPoints[] = {a.getY(),b.getY(),c.getY(),d.getY()};
        
        GeneralPath rec = new GeneralPath();
        rec.moveTo(xPoints[0] + a.getX(), yPoints[0] + a.getY());
        for (int i = 1; i < xPoints.length; i++) {
            rec.lineTo(xPoints[i] + a.getX(), yPoints[i] + a.getY());
        }
        rec.closePath();
        g2d.setColor(Color.RED);
        g2d.fill(rec);
    }

	
}
