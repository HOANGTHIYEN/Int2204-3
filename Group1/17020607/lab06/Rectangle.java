/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week6;

public class Rectangle extends Shape {
    protected double width = 1.0;
    protected double length = 1.0;

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public Rectangle(double width, double length, double x, double y, String color, boolean filled){
        super(x , y, color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle() {
    }
    

	@Override
	public String toString() {
		return "x: " + x + " y: " + y + " color: " + color + " filled: " + filled + " width: " + width + " length: " + length;
	}
}
