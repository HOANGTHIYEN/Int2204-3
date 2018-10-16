/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author DELL
 */
public class Rectangle extends Shape{
    private double width;
    private double length;
    public Rectangle(){
        this.width=1.0;
        this.length=1.0;
    }
    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*(width+length);
    }
    public String toString(){
        return super.toString()+"  "+this.getArea()+" "+this.getPerimeter();
    }
}
