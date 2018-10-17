package tuan5.bai2;

import java.awt.geom.Area;

public class Circle extends Shape {
    private double radius ;
    private double PI = 3.14;

    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
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
        return radius*radius*PI;
    }

    public double getPerimeter(){
        return 2*radius*PI;
    }

    @Override
    public String toString() {
        return  "Circle{" + "radius=" + radius + ", area=" + getArea() + ", perimeter=" + getPerimeter() +'}';
    }
}
