/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.awt.Color;

/**
 *
 * @author Genius
 */
//lop hinh vuong
public class Square extends Rectangle{
    protected double side;

    public Square(double side, Color cl, coordinates center) {
        super(side, side, cl, center);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override//so sanh hai square
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Square other = (Square) obj;
        if (Double.doubleToLongBits(this.side) != Double.doubleToLongBits(other.side)) {
            return false;
        }
        return true;
    }
    
}