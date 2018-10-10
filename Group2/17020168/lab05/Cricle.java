package javaapplication3;

public class Cricle extends Shape{
    double radius;
    double pi = 3.14;
    public Cricle() {
    }
    public Cricle(double radius) {
        this.radius = radius;
    }
    public Cricle(double radius,String color, boolean flied){
       this.radius = radius;
       super.setColor(color);
       super.setFlied(flied);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return  super.toString()+"Cricle{" + "radius=" + radius + '}';
    }
    public double getArea()
    {
        return 2*pi*radius;
    }
    public double getPerimeter()
    {
        return pi*radius*radius;
    }
}
