package com.lab05.bai02;

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
	public Circle(double radius,String color,boolean filled) {
		super(color,filled);
		this.radius=radius;
	}
	public double getArea() {
		return PI*radius*radius;
	}
	public double getPerimeter() {
		return 2*PI*radius;
	}
	public String toString() {
		return radius+" "+getArea()+" "+getPerimeter();
	}

}
