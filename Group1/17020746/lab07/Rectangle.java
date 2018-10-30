package lb7;

import java.awt.*;

public class Rectangle extends Shape{
    protected double width, length;

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

    //Constructor
    public Rectangle() {
        //Emty
    }

    public Rectangle(double width, double length, int x, int y, Color color, boolean filled) {
        super(x, y, color, filled);
        this.width = width;
        this.length = length;

    }


    @Override
    public String toString(){
        return super.toString() + "Width = " + width + "Length" + length;
    }

}
