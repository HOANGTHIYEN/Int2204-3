/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Quoc
 */
public class Shape 
{
    String color ="red";
    boolean filled = true;
    Toadodiem td;
    public Shape(){
    
}
    public Shape(String color,boolean filled,Toadodiem td){
        this.color=color;
        this.filled=filled;
        this.td=td;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public Toadodiem getTd() {
        return td;
    }

    public void setTd(Toadodiem td) {
        this.td = td;
    }

   public void info(){
        System.out.println("");
   }  
}
    
   
