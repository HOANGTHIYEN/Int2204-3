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
 * @author Nguyễn Thái
 */
public class Triangle extends Shape{
    protected double a, b, c;
   
     public Triangle() {
    }
     public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
     public Triangle(double a, double b, double c, String color, boolean filled, Toadodiem td) {
        super(color, filled, td);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getA() {
        return a;
    }
     public void setA(double a) {
        this.a = a;
    }
     public double getB() {
        return b;
    }
     public void setB(double b) {
        this.b = b;
    }
     public double getC() {
        return c;
    }
     public void setC(double c) {
        this.c = c;
    }
    public double getArea(){
        double p = (a + b + c)/2;
        return sqrt(p*(p - a)*(p - b)*(p - c));
    }
    
	public double getPerimeter(){
        return (a + b + c);
    }
    public void Xuat(){
        System.out.println("Hinh tam giac: " + a + " " + b + " " + c  +" "+color+" "+filled+"  "+td);
    }
    protected Toadodiem[] xy = new Toadodiem[3];
     public Triangle(Toadodiem g, Toadodiem h, Toadodiem i) {
        xy[0] = g;
        xy[1] = h;
        xy[2] = i;
        this.td.setX((xy[0].getX() + xy[1].getX() + xy[2].getX())/2);
        this.td.setY((xy[0].getY() + xy[1].getY() + xy[2].getY())/2);
    };
    
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
        final Triangle other = (Triangle) obj;
        if (!Arrays.deepEquals(this.xy, other.xy)) {
            return false;
        }
        return true;
    }

}