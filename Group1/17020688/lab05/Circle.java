/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author My PC
 */
public class Circle extends Shape{
  private double radius;
  final double pi=3.14;

   
    

    
     public double getRadius()
   {
       return radius;
       
   }
   public void setRadius(double radius)
   {
       this.radius=radius;
   }

    public Circle(double radius,String color, boolean filled) {
        super(color, filled);
        this.radius=radius;
    }
        
    
        public Circle(double radius)
        {
           this.radius=radius;
        }
  
   public double getArea(double radius)
   {
       double area=radius*radius*pi;
       return area;
   }
    public double getPerimeter(double radius)
    {
        double perimeter=2*radius*pi;
        return perimeter;
    }
    public String toString()
    {
        return "dientich : "+getArea(radius)+"  // chu vi : "+ getPerimeter(radius);
    }

}
