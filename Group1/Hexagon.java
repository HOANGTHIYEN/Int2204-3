package com.lab06;

import java.awt.Polygon;

public class Hexagon extends Shape {
    protected int pX1,pX2,pX3,pX4,pX5,pX6;
	protected int pY1,pY2,pY3,pY4,pY5,pY6;
	protected Polygon polygon;
	
	public Hexagon() {}
	public Hexagon(int pX1,int pX2,int pX3,int pX4,int pX5,int pX6,
			int pY1,int pY2,int pY3,int pY4,int pY5,int pY6) {

		int[] pX = {pX1,pX2,pX3,pX4,pX5,pX6};
		int[] pY = {pY1,pY2,pY3,pY4,pY5,pY6};
		polygon = new Polygon(pX,pY,pX.length);
	}
	
	public int getpX1() {
		return pX1;
	}
	public void setpX1(int pX1) {
		this.pX1 = pX1;
	}
	public int getpX2() {
		return pX2;
	}
	public void setpX2(int pX2) {
		this.pX2 = pX2;
	}
	public int getpX3() {
		return pX3;
	}
	public void setpX3(int pX3) {
		this.pX3 = pX3;
	}
	public int getpX4() {
		return pX4;
	}
	public void setpX4(int pX4) {
		this.pX4 = pX4;
	}
	public int getpX5() {
		return pX5;
	}
	public void setpX5(int pX5) {
		this.pX5 = pX5;
	}
	public int getpX6() {
		return pX6;
	}
	public void setpX6(int pX6) {
		this.pX6 = pX6;
	}
	public int getpY1() {
		return pY1;
	}
	public void setpY1(int pY1) {
		this.pY1 = pY1;
	}
	public int getpY2() {
		return pY2;
	}
	public void setpY2(int pY2) {
		this.pY2 = pY2;
	}
	public int getpY3() {
		return pY3;
	}
	public void setpY3(int pY3) {
		this.pY3 = pY3;
	}
	public int getpY4() {
		return pY4;
	}
	public void setpY4(int pY4) {
		this.pY4 = pY4;
	}
	public int getpY5() {
		return pY5;
	}
	public void setpY5(int pY5) {
		this.pY5 = pY5;
	}
	public int getpY6() {
		return pY6;
	}
	public void setpY6(int pY6) {
		this.pY6 = pY6;
	}
	public Polygon getPolygon() {
		return polygon;
	}
	public void setPolygon(Polygon polygon) {
		this.polygon = polygon;
	}
	
	

}
