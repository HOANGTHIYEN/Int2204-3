/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.util.Scanner;

/**
 *
 * @author CCNE
 */
public class Circle extends Shape{
    
    protected double radius=1.0;;
    protected double Area;
    protected double Perimeter;
    final double PI=3.14;
    public Circle() {
        
    }
    public Circle(double radius) {
        this.radius=radius;
    }
    
    public Circle(double radius,String color,boolean filled) {
        super(color,filled);
        this.radius=radius;
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * @return the Area
     */
    public double getArea() {
        return Area;
    }

    /**
     * @return the Perimeter
     */
    public double getPerimeter() {
        return Perimeter;
    }
    
    @Override
    public String toString() {
        return "bán kính:"+radius +"   "+"màu:"+color +"   "+"trạng thái:"+filled;
    }
    
    public String tinhchuvi() {
        Scanner sc= new Scanner(System.in);
        float a;
        System.out.print("nhập bán kính:");
        radius=sc.nextFloat();
        a=(float) (2*radius*PI);
        return "chu vi:"+a;
    }
    public String tinhdientich() {
        Scanner sc= new Scanner(System.in);
        float a;
        System.out.print("nhập bán kính:");
        radius=sc.nextFloat();
        a=(float) (radius*radius*PI);
        return "diện tích:"+a;
    }
    
}