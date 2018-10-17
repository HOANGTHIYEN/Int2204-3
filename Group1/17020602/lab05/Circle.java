/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_2;

/**
 *
 * @author Do Tuan Bac
 */
public class Circle extends Shape{
   protected  double radius=1;
    protected final double PI=3.141592653589793238462643383279502884197169399375;
    Circle()
    {
        
    }
    Circle(double radius)
    {
        this.radius=radius;    
    }
    Circle(double radius,String color,boolean filled)
    {
                  super(color,filled);

           this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea()
    {
        return this.radius*this.radius*this.PI;
    }
     public double getPerimeter()
    {
        return 2*this.radius*this.PI;
    }
    
    @Override
    public String toString()
    {
        return "Circle( Bán kính : " + this.radius+" , Chu vi : "+this.getPerimeter()+" , Diện tích : "+this.getArea()+" )";
    }
   
}
