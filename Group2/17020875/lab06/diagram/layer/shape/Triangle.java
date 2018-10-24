package diagram.layer.shape;

import java.awt.*;

import static java.lang.StrictMath.sqrt;

public class Triangle extends Shape{
    protected double side1;
    protected double side2;
    protected double side3;

    protected int x1;
    protected int x2;
    protected int x3;
    protected int y1;
    protected int y2;
    protected int y3;

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

    public int getY3() {
        return y3;
    }

    public int getX1() {
        return x1;
    }

    public int getX3() {
        return x3;
    }

    public int getX2() {
        return x2;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public Triangle(Color color, boolean filled, double side1, double side2, double side3, int x1, int y1, int x2, int y2, int x3, int y3)
    {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.x1 =x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }
    public void moveShapeTri(String direction, int size)
    {
        switch (direction)
        {
            case "up": {
                y1 = y1 + size;
                y2 = y2 + size;
                y3 = y3 + size;
                break;
            }
            case "down": {
                y1 = y1 - size;
                y2 = y2 - size;
                y3 = y3 - size;
                break;
            }
            case "left": {
                x1 = x1 - size;
                x2 = x2 - size;
                x3 = x3 - size;
                break;
            }
            case "right": {
                x1 = x1 + size;
                x2 = x2 + size;
                x3 = x3 + size;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Triangle: side1: " + side1 + " side2: " + side2 + " side3: " + side3
                + " color: " + color + " filled: " + filled
                + " Toa do: (x1 = " + x1 + " y1 = " + y1 + ")"
                + " Toa do: (x1 = " + x2 + " y1 = " + y2 + ")"
                + " Toa do: (x1 = " + x3 + " y1 = " + y3 + ")";
    }
}
