public class Circle extends Shape {
    protected double radius = 1.0;
    final double PI = 3.14;
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea (){
        return PI*Math.pow(radius,2);
    }
    public double getPerimeter () {
        return 2*PI*radius;
    }

    @Override
    public String toString() {
        return "Circle is " + color + ", " + ((filled == true)?"filled":"not filled")+ " and its radius is "+ radius;
    }
}
