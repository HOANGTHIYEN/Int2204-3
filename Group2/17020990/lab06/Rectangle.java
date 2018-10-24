/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Quoc
 */
public class Rectangle extends Shape {
    double width=1.0;
    double length=1.0;
    public Rectangle(){
        
    }
    public Rectangle(double width, double length ){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length, String color, boolean filled,Toadodiem td ){
        super(color,filled,td);
        this.width=width;
        this.length=length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return (length+width)*2;
    }
    public void Info() {
        System.out.println("Hinh chu nhat: " +length+" "+width+" "+color+" "+filled+" "+td);
    }
    
}
