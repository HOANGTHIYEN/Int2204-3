/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;


public class Circle extends Shape{
  
  private int r;

  
  Circle(int x , int y, int r){
   
     super(x,y);
        this.r = r;
    }

   
 @Override
    public void vehinh() {
      
  System.out.println( this.x + "," + this.y + ")");
    }

 
   public void xoahinh(){
       
 System.out.println(  this.x + "," + this.y + ")");
    }

 
   public void moveTo(int new_x, int new_y){
   
     xoahinh();
        this.x = new_x;
        this.y = new_y;
   
     vehinh();
    }
}

