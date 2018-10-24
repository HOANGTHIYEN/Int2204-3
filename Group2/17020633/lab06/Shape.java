/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;


public abstract class Shape extends Layer{
   
 protected boolean filled;
  private int chiso;
  protected int x,y;
  

   
 //public Shape(){};
    
public Shape(int x, int y){
   
        this.x = x;
        this.y = y;
    }

   
 public int getChiso() 
{
        return chiso;
    }

  
  public void setChiso(int n) {
     
   this.chiso = n;
    }
  abstract public void xoahinh();
  
  abstract public void vehinh();
   

 abstract public void moveTo(int new_x, int new_y);

   public boolean isFilled() {
        return filled;
    }

  
  public void setFilled(boolean filled) {
       
        this.filled = filled;
    }

   
 
   


}

