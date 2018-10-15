/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài.lab06;

/**
 *
 * @author Administrator
 */
public class Cricle extends Shape{
    protected double radius;
    final double pi = 3.14;

    public Cricle() {
    }

    public Cricle(double radius) {
        this.radius = radius;
    }

    public Cricle(double radius, String color, boolean filled, Toado td) {
        super(color, filled, td);
        this.radius = radius;
    }
    

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return radius*radius*pi;
    }
    public double getPerimeter(){
        return 2*radius*pi;
    }
    public void info(){
        System.out.println("Hinh tron: " + radius+" "+color+" "+filled+" "+td);
    }
    
}

