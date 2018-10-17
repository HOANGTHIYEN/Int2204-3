/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Dell
 */
public class circle extends Shape{
    double radius;
    final float pi=3.14F;
    float Area;

    public circle() {
        this.radius=1.0;
    }

    public circle(String color, boolean filled,double radius) {
        super(color, filled);
        this.radius=radius;
       
    }
    public circle(double radius) {
        this.radius=radius;
    }
    

   
    
    
    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius*radius*pi;
    }
    public double getPeirmeter(){
        return 2*radius*pi;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "circle{" + "radius=" + radius + ", pi=" + pi +", color= "+color+", filled="+filled+'}';
    }
    
    
   
    
  
    
}
