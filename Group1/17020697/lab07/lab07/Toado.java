package lab06_abtract;

public class Toado implements Comparable<Toado>{
	private double x;
	private double y;
	
	
	public double getX() {
		return x;
	}
	public void setX(double a) {
		this.x = a;
	}
	public double getY() {
		return y;
	}
	public void setY(double b) {
		this.y = b;
	}
	
	public Toado() {
		// TODO Auto-generated constructor stub
		this.x = (double) 1;
		this.y =(double) 1;
	}
	public Toado(double _a, double _b) {
		// TODO Auto-generated constructor stub
		this.x = _a;
		this.y = _b;
	}
	
	public double distance(Toado a) {
		double tmp = ((this.x - a.getX())*(this.x - a.getX()) + (this.y - a.getY())*(this.y - a.getY()));
		return Math.sqrt(tmp);
		
	}
	
	public boolean equals(Toado tmp) {
		if(this.x == tmp.getX() && this.y==tmp.getY()) {
			return true;
		}
		return false;
	}
	
	@Override
	public int compareTo(Toado tmp) {
		// TODO Auto-generated method stub
		int value =(int) (this.x+this.y - tmp.getX() - tmp.getY());
		return value;
	}
	
}
