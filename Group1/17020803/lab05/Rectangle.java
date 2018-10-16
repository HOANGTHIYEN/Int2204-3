/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

import java.util.Scanner;

/**
 *
 * @author MANH HOANG
 */
public class Rectangle extends Shape {

    protected double width=1.0;
    protected double length=1.0;
    protected double Area;
    protected double Perimeter;
    
    public Rectangle() {
        
    }
    
    public Rectangle(double width,double length) {
        this.width=width;
        this.length=length;
    }
    
    public Rectangle(double width,double length,String color,boolean filled) {
        super(color,filled);
        this.width=width;
        this.length=length;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
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
        return "chiều rộng:"+width +"   "+"chiều cao:"+length +"   "+"màu:"+color +"   "+"trạng thái:"+filled;
    }
    
    public String tinhchuvi() {
        Scanner sc= new Scanner(System.in);
        float a;
        System.out.print("nhập chiều dài:");
        length=sc.nextFloat();
        System.out.print("nhập chiều rộng:");
        width=sc.nextFloat();
        a=(float) (2*(length*width));
        return "chu vi:"+a;
    }
    public String tinhdientich() {
        Scanner sc= new Scanner(System.in);
        float a;
        System.out.print("nhập chiều dài:");
        length=sc.nextFloat();
        System.out.print("nhập chiều rộng:");
        width=sc.nextFloat();
        a=(float) (length*width);
        return "dientich:"+a;
    }
    
}
