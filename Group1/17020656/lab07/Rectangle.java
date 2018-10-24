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
public class Rectangle extends Shape{
    protected double width,length;
 
    public Rectangle(double width, double length, int x, int y, boolean filled,  Color color) 
    {
        super(x, y, filled, color);
        this.width = width;
        this.length = length;
    }

    
    public double getWidth()
    {
        return width;
    }
    public void setWidth(double width)
    {
        this.width=width;
    }
    public double getLength()
    {
        return length;
    }
    public void setLength(double length)
    {
        this.length=length;
    }
    public double getPerimeter()
    {
        return 2*(width+length);
    }
    public double getArea()
    {
        return width*length;
    }
    
}
