/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

public class Rectangle extends Shape{
    protected double width, length;
    public Rectangle() {
    }

    public Rectangle(double width, double length, int x, int y, boolean filled,  String color) {
        super(x, y, filled, color);
        this.width = width;
        this.length = length;
    }
    
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
    public double getPerimeter() {
        return 2*(width + length);
    }

    public double getArea() {
        return width*length;
    }

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + ", x=" + x + ", y=" + y + ", filled=" + filled
				+ ", color=" + color + ", getPerimeter()=" + getPerimeter() + ", getArea()=" + getArea() + "]";
	}
    
}
