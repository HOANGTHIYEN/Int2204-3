package com.lab06;

public class Circle extends Shape {
	private double radius;
	private final double PI=3.14;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Circle(double radius) {
		this.radius=radius;
	}
	public Circle(toado td,double radius,String color,boolean filled) {
		super(color,filled);
		this.radius=radius;
	}
	public double getArea() {
		return PI*radius*radius;
	}
	public double getPerimeter() {
		return ((double)Math.round(2*PI*radius*10000)/10000);
	}
	public String toString() {
		return "ban kinh hinh tron la: "+radius+"\ndien tich hinh tron la: "+getArea()+"\nchu vi hinh tron la:  "+getPerimeter();
	}


}
