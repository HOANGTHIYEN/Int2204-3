/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Dell
 */
public class Restangle extends Shape{
    double width;
    double length;

    public Restangle() {
        this.width=1.0;
        this.length=1.0;
    }

    public Restangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Restangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

   
    
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
     public double getArea(){
        return width*length;
    }
    public double getPeirmeter(){
        return (width+length)*2;
    }

    @Override
    public String toString() {
        return "Restangle{" + "width=" + width + ", length=" + length  + '}';
    }

   
    
    
}
