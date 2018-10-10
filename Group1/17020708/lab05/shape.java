/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2_lab05;

/**
 *
 * @author nguyen ngoc gioi
 */
public class shape{
        protected String color ;
        public String getColor(){
            return color;
        }
        public void setColor(String color){
            this.color = color;
        }
        protected boolean filled;
        public boolean isFilled(){
            return filled;
        }
        public void setFilled(boolean filled){
            this.filled = filled;
        }
        public shape(){
            color = "red";
            filled = true;
        }
        public shape(String a, boolean b){
            color = a;
            filled = b;
        }
        public String toString(){
            return "Shape:\n   Color: "+color+"\n   Filled: "+ filled+"\n";
                    
        }
    }
