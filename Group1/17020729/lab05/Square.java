/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author Administrator
 */
public class Square extends Rectangle{
    private double Side;
    public Square(double Side, String color, boolean filled) {
        super(Side, Side, color, filled);
        
    }

    public double getSide() {
        return Side;
    }

    public void setSide(double Side) {
        this.Side = Side;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(Side);
        super.setLength(Side);
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public void setLength(double length) {
       super.setWidth(Side);
        super.setLength(Side);
    }
    
    @Override
    public String toString() {
        return super.toString();   
     
}
}
