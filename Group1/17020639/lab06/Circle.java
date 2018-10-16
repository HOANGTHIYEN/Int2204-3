
package Javaapllication4;


public class Circle extends Shape{
    protected double radius;

    public Circle() {
    }

    public Circle(double radius, int x, int y, boolean filled, String color) {
        super(x, y, filled, color);
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", x=" + x + ", y=" + y + ", filled=" + filled  + ", color=" + color + '}';
    }
}
