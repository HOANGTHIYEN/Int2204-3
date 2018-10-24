
package Javaapllication4;
import java.awt.Color;

public class Circle extends Shape{
    protected double radius;
    public Circle() {
    }

    public Circle(double radius, int x, int y , boolean filled, boolean visible, Color color) {
        super(filled, visible, color, x, y );
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
