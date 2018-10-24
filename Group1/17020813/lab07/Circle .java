/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5b2;

public class Circle extends Shape{
    double radius;
    double Pi = 3.14;
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius,String color, boolean flied){
       this.radius = radius;
       super.setColor(color);
       super.setFlied(flied);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return  super.toString()+"Circle{" + "radius=" + radius + '}';
    }
    public double getArea()
    {
        return 2*Pi*radius;
    }
    public double getPerimeter()
    {
        return Pi*radius*radius;
    }
}
