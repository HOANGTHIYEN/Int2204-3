/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.awt.Color;

public class Shape{
    protected int x, y;
    protected boolean filled;
    protected Color color;
     
    Circle circle;
    Rectangle rectangle;
    Triangle triangle;
    Square square;
    Hexagon hexagon;
    public Shape() {
    }

    public Shape(int x, int y, boolean filled, Color color) {
        this.x = x;
        this.y = y;
        this.filled = filled;
        
        this.color = color;
    }  


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }    

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    
    public void move(int x, int y) {
    	this.x = this.x +x;
    	this.y = this.y +y;
    }
    @Override
    public String toString() {
        return "Shape{" + "x=" + x + ", y=" + y + ", filled=" + filled + ", color=" + color + '}';
    }
    
    public double getRadius() {
        return this.getRadius();
    }
    public double getWidth() {
        return this.getWidth();
    }
    public double getLength() {
        return this.getLength();
    }
    public double getSide() {
        return this.getSide();
    }
    public int[] getTx() {
		return getTx();
	}
    public int[] getTy() {
		return getTy();
	}
    public int[] getHX(){
        return getHX();
    }
    public int[] getHY(){
        return getHY();
    }
}
