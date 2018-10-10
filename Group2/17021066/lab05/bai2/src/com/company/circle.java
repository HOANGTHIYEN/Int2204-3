package com.company;

public class circle extends shape {
    double radius;
    final double PI=3.14;

    public circle(){

    }
    public circle(double radius){

        this.radius=radius;
    }
    public circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius=radius;

        //this.color=color;
        //this.filled=filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return PI*this.radius*this.radius;
    }
    public double getperimeter(){
        return 2*PI*this.radius;
    }

    @Override
    public String toString() {
        return "circle{" +
                "radius=" + radius +
                ", PI=" + PI +","+ color +"," + filled+
                '}';
    }
}
