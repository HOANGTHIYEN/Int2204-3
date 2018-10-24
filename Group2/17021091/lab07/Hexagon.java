/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.awt.Color;
import static java.lang.Math.sqrt;
import java.util.Arrays;

/**
 *
 * @author Genius
 */
//lop luc giac deu
public class Hexagon extends Shape{
    protected coordinates xy[] = new coordinates[6];
    protected double side;//do dai cac canh hinh
    //tu tam hinh suy ra 6 dinh con lai
    public Hexagon(double side, Color cl, coordinates center) {
        super(cl, center);
        this.side = side;
        double height = side*sqrt(3)/2;
        xy[0] = new coordinates(center.getX() - side, center.getY());
        xy[1] = new coordinates(center.getX() - side/2, center.getY() + height);
        xy[2] = new coordinates(center.getX() + side/2, center.getY() + height);
        xy[3] = new coordinates(center.getX() + side, center.getY());
        xy[4] = new coordinates(center.getX() + side/2, center.getY() - height);
        xy[5] = new coordinates(center.getX() - side/2, center.getY() - height);
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
        final Hexagon other = (Hexagon) obj;
        if (!Arrays.deepEquals(this.xy, other.xy)) {
            return false;
        }
        return true;
    }
    @Override
    public void move(coordinates t){
        this.center.setX(t.getX() + center.getX());
        this.center.setY(t.getY() + center.getY());
        this.xy[0].setX(t.getX() + xy[0].getX());
        this.xy[0].setY(t.getY() + xy[0].getY());
        this.xy[1].setX(t.getX() + xy[1].getX());
        this.xy[1].setY(t.getY() + xy[1].getY());
        this.xy[2].setX(t.getX() + xy[2].getX());
        this.xy[2].setY(t.getY() + xy[2].getY());
        this.xy[3].setX(t.getX() + xy[3].getX());
        this.xy[3].setY(t.getY() + xy[3].getY());
        this.xy[4].setX(t.getX() + xy[4].getX());
        this.xy[4].setY(t.getY() + xy[4].getY());
        this.xy[5].setX(t.getX() + xy[5].getX());
        this.xy[5].setY(t.getY() + xy[5].getY());
    }
}
