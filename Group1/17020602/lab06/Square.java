/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w6;

/**
 *
 * @author Do Tuan Bac
 */
public class Square extends Rectangle {
    protected double side=1;
    Square()
    {
        
    }
     Square(double side)
    {
      this.side=side;  
      super.width = side;
       super.length = side;
    }
      Square(double side,String color,boolean filled)
    {
        super(side,side,color,filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        
        this.width = side;
        this.length=side;
        this.side = side;
    }   
    @Override
      public void setWidth(double side) {
        this.width = side;
        this.length=side;
    }
    @Override
    public void setLength(double side) {
        this.length = side;
         this.width = side;
    }
    
     @Override
    public String toString()
    {
        return "Hình vuông có cạnh : "+getSide();
        
    }
 
      
}