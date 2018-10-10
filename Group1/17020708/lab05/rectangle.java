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
public class rectangle extends shape{
        protected double width ;
        protected double length;
        protected rectangle(){
            width = 1.0;
            length = 1.0;
        }
        public rectangle(double x, double y){
            width = x;
            length = y;
        }
        public rectangle(double x, double y, String a, boolean b){
            super(a,b);
            width = x;
            length = y;
        }
        public double getWidth(){
            return width;
        }
        public void setWidth(double width){
            this.width = width;
        }public double getLength(){
            return length;
        }
        public void setLength(double length){
            this.length = length;
        }
        public double getArea(){
            return this.width* this.length;
        }public double getPerimeter(){
            return 2*(this.width+this.length);
        }
        public String toString(){
            return "Rectangle:\n   Color: "+getColor()+"\n   Filled: "+ isFilled() + "\n   Width: "+
                    width+"\n   Length: "+length+"\n   Area: " +getArea()+
                    "\n   Perimeter: "+ getPerimeter()+"\n";
        }
}
