package lab05;

public class Circle extends Shape{
    double radius;
    final double PI  = 3.14;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea()
    {
        return (this.radius * this.radius * PI);
    }
    public double getPerimeter()
    {
        return (this.radius * 2 * PI);
    }
    public String toString() {
        return "Area : " +getArea() + "\tPerimeter : " + getPerimeter();
    }
}