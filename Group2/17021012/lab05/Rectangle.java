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
public class Rectangle extends Shape
{
    public double width = 2.5;
    public double length = 3.6;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public Rectangle(){
        
    }
    public Rectangle(double width , double length){
        this.width = width;
        this.length = length;
    }
    
    public Rectangle(String color , boolean filled , double width , double length)
    {
        super(color , filled);
        this.width = width;
        this.length = length;
    }
    
    public double getArea()
    {
        return this.width*this.length;
    }
    
    public double getPerimeter( )
    {
        return  2*(this.width+this.length);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }
    
    
}
