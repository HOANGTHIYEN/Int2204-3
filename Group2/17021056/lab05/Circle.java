/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package câu.pkg2.lab05;

/**
 *
 * @author Administrator
 */
public class Circle extends Shape {
    double radius;   //bán kính hình tròn
    final double PI=3.1415926535897 ;   

    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Circle()
    {   
        this.radius=1.0;
    }
    public Circle(double radius)
    {   
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled)
    {   
        super(color,filled);
        this.radius=radius;
        
    }
     public double getArea() { // chu vi hình tròn
        return this.PI*this.getRadius()*this.getRadius();
    }
    public double getPerimeter(){ // dien tích hình tròn
        return 2*this.PI*this.getRadius();
    }
    @Override
     public String toString() //xuất
    {
        return radius + "\t" + super.toString();
    }
}
