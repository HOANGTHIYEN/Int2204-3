/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Quoc
 */
public class Circle extends Shape
{
    double radius=1.0;
    double pi=3.14;
    public Circle(){
        
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return radius*radius*pi;
    }
    public double getPerimeter(){
        return 2*radius*pi;
    }
    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", pi=" + pi + '}';
    }
     
    
}
