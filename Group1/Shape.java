package com.lab06;

public  class Shape {
	protected String color;
	protected boolean filled;
	protected int pX,pY;
	public Shape() {}
	public Shape(int pX,int pY,String color,boolean filled) {
		this.pX = pX;
		this.pY = pY;
		this.color=color;
		this.filled=filled;
	}
	public Shape(String color,boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public int getpX() {
		return pX;
	}
	public void setpX(int pX) {
		this.pX = pX;
	}
	public int getpY() {
		return pY;
	}
	public void setpY(int pY) {
		this.pY = pY;
	}

}
