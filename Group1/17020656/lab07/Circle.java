/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap7;

import java.awt.Color;

/**
 *
 * @author Admin
 */
public class Circle extends Shape{
    final double Pi=3.14159;
    protected double radius;
    
    public Circle(double radius, int x, int y, boolean filled, Color color) 
    {
        super(x, y, filled, color);
        this.radius = radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public double getArea()
    {
        return 2*Pi*radius;
    }
    public double getPerimeteter()
    {
        return Pi*radius*radius;
    }
    @Override
    public String toString()
    {
        return "Circle getRadius" + getRadius() +" , getPerimeter" +getPerimeteter()+ " getArea"+ getArea();
    }
}
