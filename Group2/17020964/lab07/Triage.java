package lab7;

public class Triage extends Shape{
	
	protected double sideTri1;
	protected double sideTri2;
	public Triage(double sideTri1,double sideTri2,String color, double x, double y) {
		super(color, x, y);
		this.sideTri1=sideTri1;
		this.sideTri2=sideTri2;
		// TODO Auto-generated constructor stub
	}
	public double getSideTri1() {
		return sideTri1;
	}
	public void setSideTri1(double sideTri1) {
		this.sideTri1 = sideTri1;
	}
	public double getSideTri2() {
		return sideTri2;
	}
	public void setSideTri2(double sideTri2) {
		this.sideTri2 = sideTri2;
	}
	

	
}
