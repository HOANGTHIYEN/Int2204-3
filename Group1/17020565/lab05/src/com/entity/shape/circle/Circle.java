package com.entity.shape.circle;

import com.entity.shape.Shape;

public class Circle extends Shape {
    protected double radius = 1.0;
    protected final double PI = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color +
                ", filled=" + filled +
                "radius=" + radius + '\'' +
                '}';
    }

    public double getArea() {
        return PI * radius * radius;
    }
}
