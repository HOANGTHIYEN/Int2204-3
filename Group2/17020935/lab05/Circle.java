/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author DELL
 */
public class Circle extends Shape{
    private double radius;
    private final double PI=3.14;

    public Circle() {
        radius=1.0;
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius , String color, boolean filled){
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
        return PI*radius*radius;
    }
    public double getPerimeter(){
        return PI*2*radius;
    }
    public String toString(){
        return super.toString()+" "+this.getArea()+" "+this.getPerimeter();
    }
}
