/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

/**
 *
 * @author Admin
 */
import java.awt.Color;

public abstract class Shape {
	protected int X=0, Y=0;
	protected Color color=Color.WHITE; 
	
	public Shape() {
	}
	
	public Shape(int X, int Y, Color color, boolean isFilled) {
		this.X = X;
		this.Y = Y;
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void reColor(Color color) {
		this.color = color;
	}
	
	public void getPos() {
		System.out.println("Current : (" + X + "," + Y + ").");
	}
	
	public int getX() {
		return X;
	}
	
	public int getY() {
		return Y;
	}
	protected abstract void getInfo();
	protected abstract void setPos(int X, int Y);
	protected abstract void remove(int x, int y);
	protected abstract boolean equals(Shape shape);     //so sánh các Shape
	
}

