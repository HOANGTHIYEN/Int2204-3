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
public class Circle extends Shape{
    double radius;
    final double pi = 3.14;
     public Circle() {
    }
     public Circle(double radius) {
        this.radius = radius;
    }
     public Circle(double radius, String color, boolean filled, Toadodiem td) {
        super(color, filled, td);
        this.radius = radius;
    }
    
     public double getRadius() {
        return radius;
    }
     public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return radius*radius*pi;
    }
    public double getPerimeter(){
        return 2*radius*pi;
    }
    public void Xuat(){
        System.out.println("Hinh tron: " + radius+" "+color+" "+filled+" "+td);
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
        final Circle other = (Circle) obj;
        if (Double.doubleToLongBits(this.radius) != Double.doubleToLongBits(other.radius)) {
            return false;
        }
        if (Double.doubleToLongBits(this.pi) != Double.doubleToLongBits(other.pi)) {
            return false;
        }
        return true;
    }
    
}
