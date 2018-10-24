package diagram.layer.shape;

import java.awt.*;

public class Rectangle extends Shape {
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle(double posX, double posY, Color color, boolean canMove, double width, double length) {
        super(posX, posY, color, canMove);
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    public double getArea() {
        return width * length;
    }


    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", posX=" + posX +
                ", posY=" + posY +
                ", color=" + color +
                ", canMove=" + canMove +
                '}';
    }
}
