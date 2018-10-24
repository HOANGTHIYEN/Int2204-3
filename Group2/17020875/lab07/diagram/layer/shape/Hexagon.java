package diagram.layer.shape;

import java.awt.*;

public class Hexagon extends Shape{
    protected double size;
    protected int x1;
    protected int x2;
    protected int x3;
    protected int x4;
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

    public int getX4() {
        return x4;
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

    public void setX4(int x4) {
        this.x4 = x4;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public Hexagon(Color color, boolean filled, double size, int x1, int y1, int x2, int y2, int x3, int y3, int x4)
    {
        super(color, filled);
        this.size = size;
        this.x1 =x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.x4 = x4;
    }

    @Override
    public String toString() {
        return "Triangle: side: " + size
                + " color: " + color + " filled: " + filled
                + " Toa do: (x1 = " + x1 + " y2 = " + y2 + ")"
                + " (x2 = " + x2 + " y1 = " + y1 + ")"
                + " (x3= " + x3 + " y1 = " + y1 + ")"
                + " (x4= " + x4 + " y2 = " + y2 + ")"
                + " (x3= " + x3 + " y3 = " + y3 + ")"
                + " (x2= " + x2 + " y2 = " + y2 + ")";

    }
}
