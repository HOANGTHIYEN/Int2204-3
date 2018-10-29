/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class toaDo {

    private double x, y;

    public toaDo() {
    }

    public toaDo(double x, double y) {
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
    public double dodai(toaDo x){ // do dai tu diem dang xet (this) den diem x
        return sqrt( pow((this.getX()-x.getX()),2) +pow((this.getY()-x.getY()),2)   );
    }
}