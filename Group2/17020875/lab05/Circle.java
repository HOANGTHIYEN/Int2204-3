public class Circle extends Shape {
    protected double radius;
    final double PI = 3.14; // chi duoc gan gia tri khoi tao mot lan, khong thay doi duco gia tri
    public Circle()
    {

        this.radius = 1.0;
    }
    public Circle(double radius)
    {

        this.radius = radius;
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

    public double getArea()
    {
        return radius*radius * PI;
    }
    public double getPerimeter()
    {
        return 2 * radius * PI;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
