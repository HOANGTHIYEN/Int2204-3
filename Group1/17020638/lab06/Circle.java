/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

/**
 *
 * @author Dzung Xuan
 */
public class Circle extends Shape{
    protected double radius;
    public final float PI = (float) 3.14;
    
    public Circle(double radius, String color) {
        this.color = color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

     public Double getArea() {
        return this.radius * this.radius * PI;
    }

    public Double getPerimeter() {
        return this.radius * 2 * PI;
    }
    
    @Override
    public void show(boolean tf) {
        if(!tf) System.out.println("Removed Circle");
        else System.out.println("Circle in x = " + this.x + " and y = " + this.y);
    }

}
