/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.awt.Color;

public class Circle extends Shape{
    private double radius;
    double pi = 3.14;
    public Circle() {
    }

    public Circle(double radius, int x, int y, boolean filled, Color color) {
        super(x, y, filled, color);
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPerimeter() {
		return 2 * pi * radius;
	}

	public double getArea() {
		return pi * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", pi=" + pi + ", x=" + x + ", y=" + y + ", filled=" + filled + ", color="
				+ color + ", getPerimeter()=" + getPerimeter() + ", getArea()=" + getArea() + "]";
	}
    
}
