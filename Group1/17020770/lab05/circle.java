/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Việt Hoàng
 */
public class circle extends shape {

    public double radius = 1.0;
    public final float PI = 3.14f;

    public circle() {
        radius = 1.0;

    }

    public circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = PI * radius * radius;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * PI * radius;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle:\n Color: " + getColor() + "\n   Filled: " + isFilled() + "\n   Radius: " + radius
                + "\n   Area: " + getArea() + "\n   Perimeter: " + getPerimeter() + "\n";
    }

}
