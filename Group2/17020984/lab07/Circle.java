package Shape;

public class Circle extends Shape {

    private double radius;

    public Circle(int x1, int y1, int radius, String color) {
       super(x1, y1, color);
       this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
