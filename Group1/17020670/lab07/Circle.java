package lab7;

public class Circle extends Shape {

    protected double radius = 1.0;
    protected final double PI = 3.14;

    public Circle() {
        super();
    }

    public Circle(toaDo tam, double radius) {
        this.radius = radius;
        this.Tam = tam;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled, toaDo Tam) {
        super(color, filled, Tam);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * getRadius() * getRadius();
    }

    public double getPerimeter() {
        return 2 * PI * this.radius;
    }

    public void getinfo() {
        System.out.println("Circle:\tR = " + radius);
    }

    public void Move(toaDo t) {
        this.Tam = t;
    }

    
}
