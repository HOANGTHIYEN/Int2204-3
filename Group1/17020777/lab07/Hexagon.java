/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

/**
 *
 * @author MANH HOANG
 */
public class Hexagon extends Shape{
    
    double wide;

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    public Hexagon() {
    }

    public Hexagon(String color, boolean filled, VitriTam vitri, double wide) {
        super(color, filled, vitri);
        this.wide = wide;
    }
}

