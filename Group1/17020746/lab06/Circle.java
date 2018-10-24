package lb6;

public class Circle extends Shape{

    private double radius;

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Constructor
    public Circle(){

    }

    public Circle(double radius, int x, int y, int moveX, int moveY, String color, boolean filled, boolean pos) {
        super(x, y, moveX, moveY, color, filled, pos);
        this.radius = radius;
        name = "Circle";
    }


    @Override
    public String toString(){
        return super.toString() + "\tRadius: " + radius;
    }
}
