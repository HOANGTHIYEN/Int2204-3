package com.lab06;

public class Square extends Rectangle {
	protected int side;

	public int getSide() {
		return side;
	}
	public Square() {}
	public Square(int pX,int pY,int side,String color,boolean filled) {
		super(pX,pY,side, side, color, filled);

	}
	public void setWidth(int side) {
		super.width=side;
		super.length=side;
		
	}
	public void setLength(int side) {
		super.length=side;
		super.width=side;
	}

	public void setSide(int side) {
		this.side = side;
		this.length=side;
		this.width=side;
	}
	

}
