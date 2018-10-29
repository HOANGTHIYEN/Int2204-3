/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_lap07;

/**
 *
 * @author Nguyễn Thái
 */
public class Toadodiem {
    private double x, y;
     public Toadodiem() {
    }
     public Toadodiem(double x, double y) {
        this.x = x;
        this.y = y;
    }
     public double getX() {
        return x;
    }
     public void setX(double x) {
        this.x = x;
    }
     public double getY() {
        return y;
    }
     public void setY(double y) {
        this.y = y;
    }
    public String toString()
    {
        return ("( " + x +", " + y +" )");
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
        final Toadodiem other = (Toadodiem) obj;
        if (Double.doubleToLongBits(this.x) != Double.doubleToLongBits(other.x)) {
            return false;
        }
        if (Double.doubleToLongBits(this.y) != Double.doubleToLongBits(other.y)) {
            return false;
        }
        return true;
    }
}
