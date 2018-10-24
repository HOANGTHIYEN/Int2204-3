package lab7;

import javafx.scene.input.PickResult;

public class Crile extends Shape{
	protected double r;
	protected final double Pi = Math.PI;
	public Crile(double r,double x,double y,String color) {
		super(color,x,y);
		this.r = r;
	}
	public double getArea() {
		return Pi*this.r*this.r;
	}
	public double getPerimeter() {
		return Pi*this.r*2;
	}

}
