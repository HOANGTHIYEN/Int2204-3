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
public class Cricle extends Shape{
    protected double radius;
    final double pi = 3.14;

    public Cricle(double radius, Color cl, coordinates center) {
        super(cl, center);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
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
        final Cricle other = (Cricle) obj;
        if (Double.doubleToLongBits(this.radius) != Double.doubleToLongBits(other.radius)) {
            return false;
        }
        if (Double.doubleToLongBits(this.pi) != Double.doubleToLongBits(other.pi)) {
            return false;
        }
        return true;
    }
    
}
