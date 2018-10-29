package lb7;

import java.awt.*;

public class Circle extends Shape{

    private double radius;
    private int x;
    private int y;

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //Constructor
    public Circle(){

    }

    public Circle(double radius,int x, int y, Color color, boolean filled) {
        super(x, y, color, filled);
        this.radius = radius;
    }

}
