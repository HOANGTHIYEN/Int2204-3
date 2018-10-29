/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_lap07;

import static java.lang.Math.sqrt;
import java.util.Arrays;

/**
 *
 * @author Nguyễn Thúy
 */
public class Hexagon extends Shape{
    protected Toadodiem xy[] = new Toadodiem[100];
    protected double side;//do dai cac canh 
    //tu tam hinh suy ra 6 dinh con lai
    public Hexagon(double side, String color, Toadodiem td) {
        super(color, td);
        this.side = side;
        double height = side*sqrt(3)/2;
        xy[0] = new Toadodiem(td.getX() - side, td.getY());
        xy[1] = new Toadodiem(td.getX() - side/2, td.getY() + height);
        xy[2] = new Toadodiem(td.getX() + side/2, td.getY() + height);
        xy[3] = new Toadodiem(td.getX() + side, td.getY());
        xy[4] = new Toadodiem(td.getX() + side/2, td.getY() - height);
        xy[5] = new Toadodiem(td.getX() - side/2, td.getY() - height);
    }
     public Toadodiem[] getXy() {
        return xy;
    }
     public void setXy(Toadodiem[] xy) {
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
        final Hexagon other = (Hexagon) obj;
        if (!Arrays.deepEquals(this.xy, other.xy)) {
            return false;
        }
        return true;
    }
}
