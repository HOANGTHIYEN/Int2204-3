package lab06;

public class Hexagon extends Shape {
	Point[] s = new Point[6];
	
	
	public Hexagon(Point p1,Point p2,Point p3,Point p4,Point p5,Point p6,String c,boolean f, Point point) {
		super(c,f,p1);
		this.s[0] = p1;
		this.s[1] = p2;
		this.s[2] = p3;
		this.s[3] = p4;
		this.s[4] = p5;
		this.s[5] = p6;
	}


	public Point[] getS() {
		return s;
	}
	public void setS(Point[] s) {
		this.s = s;
	}

	
	
}
