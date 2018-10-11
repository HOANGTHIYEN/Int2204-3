/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author thang
 */
public class Circle extends Shape {                                             
    double radius = 1.0;
    final double PI;

    public Circle() {
        this.PI = 3.14;
    }
    public Circle (double radius){
        this.PI = 3.14;
        this.radius= radius;
    }
    public Circle (double radius, String color, boolean filled){
        super(color,filled);
        this.PI = 3.14;
        this.radius= radius;
        
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return PI*radius*radius;
    }
    public double getPerimeter (){
        return 2*PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
    
}