/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week7;

import java.awt.Color;

public class Square extends Rectangle {

    private double side;

    public Square() {
    }

    public Square(double side, int x, int y, boolean filled, Color color) {
        super(side, side, x, y, filled, color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        this.length = side;
        this.width = side;
    }

    public void setWidth(double side) {
        setSide(side);
    }

    public void setLength(double side) {
        setSide(side);
    }

    @Override
    public String toString() {
        return "side= " + side + ", width= " + width + ", length= " + length + ", x= " + x + ", y= " + y
                + ", filled= " + filled + ", color= " + color + ", Chu vi= " + getPrimeter() + ", Dien tich= "
                + getArea();
    }

}
