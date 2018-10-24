package diagram.layer.shape;

import diagram.Position;

import java.awt.*;
import java.util.Arrays;

public class Circle extends Shape {
    protected double radius = 1.0;
    protected final double PI = 3.14;

    public Circle(Position[] pos, Color color, boolean canMove, double radius) {
        super(pos, color, canMove);
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
                ", pos=" + Arrays.toString(pos) +
                ", color=" + color +
                ", canMove=" + canMove +
                '}';
    }

    @Override
    public boolean validate() {
        return false;
    }
}
