/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5_2;

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
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(){};
    
    public double getPerimeter() {
        return 2*(width + length);
    }

    public double getArea() {
        return width*length;
    }

	@Override
	public String toString() {
		return "Chu vi hcn là: "+ getPerimeter() + "     Diện tích hcn là= " + getArea();
	}
}
