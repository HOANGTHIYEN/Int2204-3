public class Circle extends Shape {
    protected double radius;
    protected double x1;
    protected double y1;

    public Circle()
    {
        this.radius = 1.0;
    }
    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getY1() {
        return y1;
    }

    public double getX1() {
        return x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

}