package bai_tap_lap06;

public class Circle extends Shape{
	double radius;
    final double pi = 3.14;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled, Toadodiem td) {
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

