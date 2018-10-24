/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author 123456789
 */
public class Circle extends Shape{
    private double radius = 1.0;
    private double pi = Math.PI;
    public Circle(){};
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
//        this.color = color;
//        this.filled = filled;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return pi*radius*radius;
    }
    public double getPerimeter(){
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", pi=" + pi + '}';
    }
    
}
