/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author Admin
 */
import java.awt.Color;

public class Square extends Rectangle {
    protected int side=1;
    Square()
    {
        
    }
     Square(int side)
    {
      this.side=side;  
      this.width = side;
       this.length = side;
    }
      Square(int side,Color color,boolean filled)
    {
        super(side,side,color,filled);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        
        this.width = side;
        this.length=side;
        this.side = side;
    }   
      public void setWidth(int side) {
        this.width = side;
        this.length=side;
    }
    public void setLength(int side) {
        this.length = side;
         this.width = side;
    }
    
   
 
      
}