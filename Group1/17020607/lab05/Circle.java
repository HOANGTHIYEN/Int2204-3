/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5_2;

/**
 *
 * @author CCNE
 */
public class Circle extends Shape {

    protected double r;
    final double pi = 3.1416;

    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public Circle(double r, String color, boolean filled){
        super(color, filled);
        this.r = r;
//        super.setColor(color);
    }
    public double getArea(){
        return r*r*pi;
    }
    public double getPrimeter(){
        return r*2*pi;
    }
    public String toString(){
        return super.toString() + "\nChu vi hình tròn là: " + getPrimeter() + "      Diện tích hình tròn là: " + getArea();
    }
}