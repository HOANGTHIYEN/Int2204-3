public class Circle extends Shape{
    protected double radius = 1.0;
    final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        name = "tron";
    }

    public Circle(ToaDo toaDo, boolean filled, double radius) {
        super(toaDo, filled);
        this.radius = radius;
        name = "tron";
    }

    public Circle() {
        name = "tron";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setSize(){
        size = PI*Math.pow(radius,2);
    }
    public double getSize() {
        return size;
    }
}
