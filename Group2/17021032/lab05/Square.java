/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author thang
 */
public class Square extends Rectangle {                                         
    double side;
    public Square() {
    }

    public Square(double side) {
        super(side, side);
        this.side=side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
        this.side= side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        super.length= side;
        super.width = side;
    }
    @Override
    public void setWidth (double side){
        super.length= side;
        super.width = side;
    }

    @Override
    public void setLength(double side) {
        super.length= side;
        super.width = side;
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }
    
}