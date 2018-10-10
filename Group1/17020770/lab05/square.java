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
public class square extends rectangle{
        double side;
               
        public square(){
        side = 1.0;
              
        }
        public square(double width){
            super(width,width);
            side = width;
            
            
        }
        public square(double width, String color, boolean filled){
            super(width,width,color,filled);
            side = width;
            
        }
        public double getSide(){
            return side;
      
        }
        public void setSide(double side){
            this.side = side;
            this.width = side;
            this.length = side;
        }
        @Override
        public void setWidth(double side){
            this.side = side;
            this.width = side;
            this.length = side;
        }
        @Override
        public void setLength(double side){
            this.side = side;
            this.length = side;
            this.width = side;
        }
        
        
        @Override
        public String toString(){
            return "Square:\n   Color: "+getColor()+"\n   Filled: "+ isFilled() + "\n   Width: "+getWidth()+
                    "\n   Length: "+getLength()+"\n   Area: " +getArea()+"\n   Perimeter: "+ getPerimeter()+"\n";
        }
    }