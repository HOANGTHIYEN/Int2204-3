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
public class square extends rectangle{
        double side =1.0;
               
        public square(){
        //side = 1.0;
              
        }
        public square(double x){
            super(x,x);
            side = x;
            
            
        }
        public square(double x, String a, boolean b){
            super(x,x,a,b);
            side = x;
            
        }public double getSide(){
            return side;
      
        }public void setSide(double side){
            this.side = side;
            this.width = side;
            this.length = side;
        }public void setWidth(double side){
            this.side = side;
            this.width = side;
            this.length = side;
        }public void setLength(double side){
            this.side = side;
            this.length = side;
            this.width = side;
        }
        
        
        public String toString(){
            return "Square:\n   Color: "+getColor()+"\n   Filled: "+ isFilled() + "\n   Width: "+getWidth()+
                    "\n   Length: "+getLength()+"\n   Area: " +getArea()+"\n   Perimeter: "+ getPerimeter()+"\n";
        }
    }