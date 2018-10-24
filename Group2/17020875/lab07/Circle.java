package diagram.layer.shape;

import java.awt.*;

public class Circle extends Shape {
    protected double radius = 1.0;
    protected final double PI = 3.14;

    public Circle(double posX, double posY, Color color, boolean canMove, double radius) {
        super(posX, posY, color, canMove);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * radius * PI;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI +
                ", posX=" + posX +
                ", posY=" + posY +
                ", color=" + color +
                ", canMove=" + canMove +
                '}';
    }
}
