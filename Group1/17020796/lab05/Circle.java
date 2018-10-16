package bai2;

public class Circle extends shape {
    private final double PI = 3.1415926;
    private double radius;

    // constructor
    public Circle(){
        radius = 1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius,String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    // public method
    public String toString() {
        return ( "Hinh tron co ban kinh " + getRadius() + ", dien tich la " +
                getArea() + ", chu vi la " + getPerimeter()
                + "\n" + super.toString() );
    }
    public double getArea(){
        return getRadius()*getRadius()*PI;
    }

    public double getPerimeter(){
        return 2*PI*getRadius();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
