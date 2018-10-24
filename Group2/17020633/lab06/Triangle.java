/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;


public  abstract class Triangle extends Shape {


    private int x2,x3;
    
    private int y2,y3;

    
public int getX2() {
        return x2;
    }

 
   public void setX2(int x2) {
        this.x2 = x2;
    }

 
   public int getX3() {
        return x3;
    }

   
 public void setX3(int x3) {
        this.x3 = x3;
    }

 
   public int getY2() {
        return y2;
    }

   
 public void setY2(int y2) {
        this.y2 = y2;
    }

  
  public int getY3() {
        return y3;
    }

   
 public void setY3(int y3) {
        this.y3 = y3;
    }

  
  Triangle(int x1, int y1, int x2, int y2, int x3, int y3){
  
      super(x1,y1);
        this.x2 = x2;
        this.y2 = y2;
 
       this.x3 = x3;
        this.y3 = y3;
    }

   
 @Override
    public void vehinh() {
  
      System.out.println(  this.x + "," + this.y + ")");
    }

 
   public void xoahihh(){
       
 System.out.println( this.x + "," + this.y + ")");
    }

 
   public void moveTo(int new_x, int new_y){
      
        xoahinh();
       
             int distance_x = new_x - this.x;
     
                int distance_y = new_y - this.y;
       
                this.x = new_x;
                  this.y = new_y;
                this.x2 = distance_x + this.x2;
  
                    this.y2 = distance_y + this.y2;
                     this.x3 = distance_x + this.x3;
    
        this.y3 = distance_y + this.y3;
        vehinh();
    }
}

