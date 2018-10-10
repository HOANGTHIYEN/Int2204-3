/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Việt Hoàng
 */
public class rectangle extends shape {

    public double width;
    public double length;

    public rectangle() {
        width = 1.0;
        length = 1.0;
    }

    public rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
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
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString() {
        return "Rectangle:\n   Color: " + getColor() + "\n   Filled: " + isFilled() + "\n   Width: "
                + width + "\n   Length: " + length + "\n   Area: " + getArea()
                + "\n   Perimeter: " + getPerimeter() + "\n";
    }
}
