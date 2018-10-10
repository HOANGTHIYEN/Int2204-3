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
public class circle extends shape{
        protected double radius = 1.0;
        public final float PI = (float) Math.PI;
        protected circle(){
           // radius = 1.0;
           
        }public circle(double x){
            radius = x;
        }public circle(double x, String a, boolean b){
            super(a, b);
            radius =x ;
        }
        public double getRadius(){
            return radius;
        }
        public void setRadius(double radius){
            this.radius = radius;
        }
        public double getArea(){
            double area = PI*radius*radius;
            return area;
        }
        public double getPerimeter(){
            double perimeter = 2*PI*radius;
            return perimeter;
        } public String toString(){
            return "Circle:\n   Color: "+getColor()+"\n   Filled: "+ isFilled() + "\n   Radius: "+radius
                    +"\n   Area: " +getArea()+"\n   Perimeter: "+ getPerimeter()+"\n";
        }
 
}
