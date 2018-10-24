/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author Admin
 */
import java.awt.Color;

public class Circle extends Shape{
   protected  double radius=1;
    protected final double PI=3.141592653589793238462643383279502884197169399375;
    Circle()
    {
        
    }
    Circle(double radius)
    {
        this.radius=radius;    
    }
    Circle(double radius,Color color,boolean filled,int moveX,int moveY,int X,int Y)
    {
                  super(color,filled,moveX,moveY,X,Y);

           this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    

}