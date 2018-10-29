package com.lab06;

public class Circle extends Shape {
	protected int radius;
	protected final double PI=3.14;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public Circle(int radius) {
		this.radius=radius;
	}
	public Circle(int pX,int pY,int radius,String color,boolean filled) {
		super(pX,pY,color,filled);
		this.radius=radius;
	}
	

}
