/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;


public class Rectangle extends Shape {
    double width=1;
    double length=1;
    
    
    public Rectangle(double width,double length,String color, boolean filled) {
        super(color, filled);
        this.length=length;
        this.width=width;
        
    }

  
   
   public double getLength()
   {
       return length;
       
   }
   public void setLength(double length)
   {
       this.length=this.length;
   }
  public double getWidth()
   {
       return width;
       
   }
   public void setWidth(double width)
   {
       this.width=this.width;
   }
   public double getArea()
   {
       double area=width*length;
       
       return area;
   }
    public double getPerimeter()
    {
        double perimeter=2*(width+length);
        return perimeter;
    }
    @Override
     public String toString()
    {
        return "dien tich :"+getArea()+" //chu vi : "+ getPerimeter();
    }
    
}
