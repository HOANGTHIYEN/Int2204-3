/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;


public class Square extends Rectangle {
 
   Square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
  
  @Override
    public void vehinh() {
  
      System.out.println("Draw Square from first point at (" + this.x + "," + this.y + ")");
    }

   
 public void xoahinh(){
     
   System.out.println("Erase Square from first point at (" + this.x + "," + this.y + ")");
    }

  
  public void moveTo(int new_x, int new_y){

     
   this.xoahinh();
       
 int distance_x = new_x - this.x;
       
 int distance_y = new_y - this.y;
      
  this.x = new_x;
        this.y = new_y;
      
  this.x2 = distance_x + this.x2;
       
 this.y2 = distance_y + this.y2;
     
   this.x3 = distance_x + this.x3;
      
  this.y3 = distance_y + this.y3;
       
 this.x4 = distance_x + this.x4;
      
  this.y4 = distance_y + this.y4;
      
  this.vehinh();
    }

}

