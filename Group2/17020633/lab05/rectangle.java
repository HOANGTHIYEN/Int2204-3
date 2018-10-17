/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05bai2;

/**
 *
 * @author Dell
 */
public class rectangle extends shape{
    protected double width;
    protected double length;
    
    public double getWidth()
    {
        return width;
    }
    public void setWidth(double n)
    {
        width=n;
    }
     public double getLength()
    {
        return length;
    }
    public void setLength(double n)
    {
        length=n;
    }
    public rectangle()
    {
        this.width=1.0;
        this.length=1.0;
    }
    public rectangle(double width,double length)
    {
        this.width=width;
        this.length=length;
    }
    public rectangle(double width,double length,String mausac,boolean filled)
    {
        super(mausac,filled);
        this.width=width;
        this.length=length;
        
    }
    public double getArea()
    {
        return this.width*this.length;
    }
    public double getPerimeter()
    {
        return 2*(this.width+this.length);
    }
    public String toString()
    {
        return "width : "+width+" length : "+length;
    }
}
