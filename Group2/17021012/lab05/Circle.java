/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_lap05.shape;

/**
 *
 * @author Nguyen Thai
 */
public class Circle extends Shape                                       // lop Circle  thua ke tu lop Shape
{
    public static final float PI = 3.14f;
    public double radius;
    public double Area;
    public double Perimeter;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    
    public Circle(){
        
    }
    public Circle(double radius){
        this.radius = radius;
    }
        
    
    public Circle(String color , boolean filled , double radius)
    {
        super(color , filled);                                                      //tro toi cac thuoc tinh trong lop Shape luon
        this.radius = radius;
    }
    public double getArea(double radius)
    {
        Area = PI*radius*radius;
        return Area;
    }
    public double getPerimeter(double radius)
    {
        Perimeter = 2*PI*radius;
        return Perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", Area=" + Area + ", Perimeter=" + Perimeter + '}';
    }
    
    
    
}
