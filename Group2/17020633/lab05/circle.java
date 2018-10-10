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
public class circle extends shape {
    public double radius;
    public final double PI=3.1415926535897;
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double n)
    {
        radius=n;
    }
    public circle()
    {
        this.radius=1.0;
    }
    public circle(double radius)
    {
        this.radius=radius;
    }
    public circle(double radius,String mausac,boolean filled)
    {
        super(mausac,filled);
        this.radius=radius;
         
    }
    public double getArea()
    {
        return this.PI*this.getRadius()*this.getRadius();
    }
    public double getPerimeter()
    {
        return 2*this.PI*this.getRadius();
    }
    public String toString()
    {
        return radius+" ";
    }
    
}
