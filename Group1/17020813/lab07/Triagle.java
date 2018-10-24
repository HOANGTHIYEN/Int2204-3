/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5b2;

/**
 *
 * @author CCNE
 */
public class Triagle extends Shape {
    ToaDo vertice1,vertice2,vertice3;

    public double x;
    public double y;
    public double egde1;
    public double egde2;
    public double egde3;

    public Triagle(ToaDo vertice1, ToaDo vertice2, ToaDo vertice3, String color, boolean flied, ToaDo xy) {
        super(color, flied, xy);
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }

    public Triagle(ToaDo vertice1, ToaDo vertice2, ToaDo vertice3) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }

    Triagle(int i, int i0, int i1, int i2, int i3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ToaDo getVertice1() {
        return vertice1;
    }

    public void setVertice1(ToaDo vertice1) {
        this.vertice1 = vertice1;
    }

    public ToaDo getVertice2() {
        return vertice2;
    }

    public void setVertice2(ToaDo vertice2) {
        this.vertice2 = vertice2;
    }

    public ToaDo getVertice3() {
        return vertice3;
    }

    public void setVertice3(ToaDo vertice3) {
        this.vertice3 = vertice3;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return flied;
    }

    public void setFilled(boolean flied) {
        this.flied = flied;
    }

    public ToaDo getXy() {
        return xy;
    }

    public void setXy(ToaDo xy) {
        this.xy = xy;
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

    public double getEgde1() {
        return egde1;
    }

    public void setEgde1(double egde1) {
        this.egde1 = egde1;
    }

    public double getEgde2() {
        return egde2;
    }

    public void setEgde2(double egde2) {
        this.egde2 = egde2;
    }

    public double getEgde3() {
        return egde3;
    }

    public void setEgde3(double egde3) {
        this.egde3 = egde3;
    }

    @Override
    public String toString() {
        return "Triagle{" + "x=" + x + ", y=" + y + ", egde1=" + egde1 + ", egde2=" + egde2 + ", egde3=" + egde3 + '}';
    }
    
}