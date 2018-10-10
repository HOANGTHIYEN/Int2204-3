package javaapplication3;

public class Circle extends Shape{
    protected double radius;
    final double pi = 3.14159;

    public Circle() {
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2*pi*radius;
    }

    public double getArea() {
        return pi*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius +",Perimeter="+2*radius*pi+",Area="+radius*radius*pi+'}';
    }

}
