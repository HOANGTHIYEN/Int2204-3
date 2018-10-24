/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week7;

import java.awt.Color;

public class Circle extends Shape {

    private double radius;
    double pi = 3.1416;

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

    public double getPrimeter() {
        return 2 * pi * radius;
    }

    public double getArea() {
        return pi * radius * radius;
    }

    @Override
    public String toString() {
        return "r= " + radius + ", pi= " + pi + ", x= " + x + ", y= " + y + ", filled= " + filled + ", color= "
                + color + ", Chu vi= " + getPrimeter() + ", Dien tich= " + getArea();
    }

}
