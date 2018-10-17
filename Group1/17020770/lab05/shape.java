/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Việt Hoàng
 */
public class shape{
        public String color ;
        public boolean filled;
        public shape(){
            color = "red";
            filled = true;
        }
        public shape(String color, boolean filled){
            this.color = color;
            this.filled = filled;
        }
        public String getColor(){
            return color;
        }
        public void setColor(String color){
            this.color = color;
        }
        public boolean isFilled(){
            return filled;
        }
        public void setFilled(boolean filled){
            this.filled = filled;
        }
        
        
        @Override
        public String toString(){
            return "Shape:\n   Color: "+color+"\n   Filled: "+ filled+"\n";
                    
        }
    }