/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

/**
 *
 * @author Việt Hoàng
 */
class Circle extends Shape{
    public double radius;
    final double PI = 3.14;
    public Circle() {
        radius=1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled, Location d) {
        super(color, filled, d);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*PI;
    }
    public double getPerimeter(){
        return 2*radius*PI;
    }

    @Override
    public void showInfo() {
        System.out.println("Hình tròn: "+ "\n" + radius + "\n" + PI + "\n" + color + "\n" + "\n" + filled + "\n" +"("+ mid.getX() + "\n"+mid.getY());
    }
}