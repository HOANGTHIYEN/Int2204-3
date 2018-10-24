package com.lab06;

public class Rectangle extends Shape {
	protected double width;
	protected double length;
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public Rectangle() {}
	public Rectangle(double width,double length) {
		this.width=width;
		this.length=length;
	}
	public Rectangle(toado td,double width,double length,String color,boolean filled) {
		super(color,filled);
		this.width=width;
		this.length=length;
	}
	public double getArea() {
		return (width+length)*2;
	}
	public double getPerimeter() {
		return width*length;
	}
	@Override
	public String toString() {
		return "chieu rong: "+width+ "\nchieu dai: "+length+"\nchu vi hinh chu nhat: "+getArea()+"\ndien tich hinh chu nhat: "+getPerimeter();
	}

}
