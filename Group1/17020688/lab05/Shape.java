/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

public class Shape {
  private  String color;
  private  boolean filled;
   public String getColor()
  {
      return color;
  }
  public boolean isFilled()
  {
      return filled;
      
  }
  
       public void setColor(String color)
  {
      this.color=color;
  }
  public void setFilled(boolean filled)
  {
      this.filled=filled;
  }
  
   public Shape(String color,boolean  filled)
    {
        this.color=color;
        this.filled=filled;
        
    }
 
 
  public Shape()
  {
      this.color="red";
      this.filled=true;
  }
    @Override
  public String toString()
  {
      return "color : "+color+" boolean : "+filled;
  }
          
}
