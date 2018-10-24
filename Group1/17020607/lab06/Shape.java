/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week6;

public class Shape {

    protected String color = "red";
    protected boolean filled = true;
    protected double x = 4;
    protected double y = 4;

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Shape(double x, double y, String color, boolean filled) {
		this.x = x;
		this.y = y;
        this.color = color;
        this.filled = filled;
    }
    public Shape(){
        
    }
    public void move(int x, int y) {
    	this.x = this.x +x;
    	this.y = this.y +y;
    }
    
    @Override
    public String toString() {
        return "Shape{" + "x=" + x + ", y=" + y + ", filled=" + filled + ", color=" + color + '}';
    }
}