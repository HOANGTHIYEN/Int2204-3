/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

/**
 *
 * @author nguyen ngoc gioi
 */
public class Circle extends Shape{
    protected double radius;
    Diem I;
    public final float PI = (float) Math.PI;
        
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public Circle(){
        radius =1.0;
        I =  new Diem(0.0, 0.0);
    }public Circle(double bk, Diem x){
        radius = bk;
        I = x;
    }public Circle(boolean dc, String ms, boolean f, double bk, Diem x){
        super(dc, ms, f);
        radius =bk ;
        I = x;
    }
    public double getArea(){
        double area = PI*radius*radius;
        return area;
    }
    public double getPerimeter(){
        double perimeter = 2*PI*radius;
        return perimeter;
    } public String toString(){
        return "Circle:\n   Di Chuyen: "+ diChuyen+
                "\n   Color: "+getColor()+"\n   Filled: "+ isFilled() + "\n   Radius: "+radius
                +"\n   Area: " +getArea()+"\n   Perimeter: "+ getPerimeter()+"\n";
    }
 
}
