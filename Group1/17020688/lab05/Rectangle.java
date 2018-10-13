/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;


public class Rectangle extends Shape {
 double width;
 double length;
 public Rectangle(double width,double length)
    {
      this.length=length;
      this.width=width;
      
    }
 public Rectangle()
 {
     
 }
  public Rectangle(double width,double length,String color, boolean filled) 
    {
        super(color, filled);
        this.length=length;
        this.width=width;
    }

   public double getLength()
   {
       return length;
       
   }
   public void setlength(double length)
   {
       this.length=length;
   }
  public double getWidth()
   {
       return width;
       
   }
   public void setWidth(double width)
   {
       this.width=width;
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
     public String toString()
    {
        return "dien tich :"+getArea()+" //chu vi : "+ getPerimeter();
    }

    void setLength(double side) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
