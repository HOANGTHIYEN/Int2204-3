/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.awt.Color;
import java.util.Arrays;

/**
 *
 * @author Genius
 */
//lop tam giac
public class Triangle extends Shape{
    protected coordinates[] xy = new coordinates[3];

    public Triangle(coordinates d1, coordinates d2, coordinates d3, Color cl) {
        this.cl = cl;
        xy[0] = d1;
        xy[1] = d2;
        xy[2] = d3;
        this.center.setX((xy[0].getX() + xy[1].getX() + xy[2].getX())/2);
        this.center.setY((xy[0].getY() + xy[1].getY() + xy[2].getY())/2);
    }
    
    public coordinates[] getXy() {
        return xy;
    }

    public void setXy(coordinates[] xy) {
        this.xy = xy;
    }
    
    @Override
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
        final Triangle other = (Triangle) obj;
        if (!Arrays.deepEquals(this.xy, other.xy)) {
            return false;
        }
        return true;
    }

}