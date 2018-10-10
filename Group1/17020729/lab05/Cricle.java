/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

class Circle extends Shape{
   double radius=1.0;
  final double pi=3.14;

   
    

    
   

    public Circle(double radius,String color, boolean filled) {
        super(color, filled);
        this.radius=radius;
        
    }
  
   public double getRadius()
   {
       return radius;
       
   }
   public void setRadius(double radius)
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
   @Override
    public String toString()
    {
        return "dientich :"+getArea(radius)+" chu vi"+ getPerimeter(radius);
    }

}
