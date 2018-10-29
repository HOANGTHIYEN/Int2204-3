package com.lab06;

public class Rectangle extends Shape {
	protected int  width;
	protected int length;
	
	public int  getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Rectangle() {}
	public Rectangle(int width,int length) {
		this.width=width;
		this.length=length;
	}
	public Rectangle(int pX,int pY,int width,int length,String color,boolean filled) {
		super(pX,pY,color,filled);
		this.width=width;
		this.length=length;
	}

}
