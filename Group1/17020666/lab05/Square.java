package com.lab05.bai02;

public class Square extends Rectangle {
	protected double side;

	public double getSide() {
		return side;
	}
	public Square() {}
	public Square(double side,String color,boolean filled) {
		super(side, side, color, filled);

	}
	public void setWidth(double side) {
		super.width=side;
		super.length=side;
		
	}
	public void setLength(double side) {
		super.length=side;
		super.width=side;
	}

	public void setSide(double side) {
		this.side = side;
		this.length=side;
		this.width=side;
	}

	@Override
	public String toString() {
		return side+"\nchu vi hinh vuong: "+ super.getArea() +"\ndien tich hinh vuong: " +super.getPerimeter();
	}
	
}
