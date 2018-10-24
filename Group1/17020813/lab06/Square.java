/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5b2;

public class Square extends Rectangle{
    public double side;

    public Square() {
    }

    public Square(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }
    
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }
    public Square(double side,String color, boolean flied) {
        super.setLength(side);
        this.side = side;
        super.setWidth(side);
        super.setColor(color);
        super.setFlied(flied);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
