package diagram.layer.shape;

import java.awt.*;

public class Rectangle extends Shape{

    double width;
    double length;

    protected int x1;
    protected int y1;


    protected int x2;
    protected int y2;

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }


    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }


    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public Rectangle(Color color, boolean filled, double width, double length, int x1, int y1,int x2, int y2)
    {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.x1 = x1;
        this.x2 = x2;

        this.y1 = y1;
        this.y2 = y2;

    }
    public void moveShape(String direction, int size)
    {
        switch (direction)
        {
            case "up": {
                y1 = y1 + size;
                y2 = y2 + size;
                break;
            }
            case "down": {
                y1 = y1 - size;
                y2 = y2 - size;
                break;
            }
            case "left": {
                x1 = x1 - size;
                x2 = x2 - size;
                break;
            }
            case "right": {
                x1 = x1 + size;
                x2 = x2 + size;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Rectangle: width: " + width + " length: " + length
                + " color: " + color + " filled: " + filled
                + " Toa do: (x1 = " + x1 + " y1 = " + y1 + ")"
                + " ;(x2 = " + x2 + " y1 = " + y1 + ")"
                + " ;(x2 = " + x2 + " y2 = " + y2 + ")"
                + " ;(x1 = " + x1 + " y2 = " + y2 + ")";
    }
}