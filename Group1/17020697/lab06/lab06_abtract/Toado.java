package lab06_abtract;

public class Toado {
	private Double x;
	private Double y;
	public Double getX() {
		return x;
	}
	public void setX(Double a) {
		this.x = a;
	}
	public Double getY() {
		return y;
	}
	public void setY(Double b) {
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
	
	
	
}
