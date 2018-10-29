import javafx.scene.paint.Color;

public class Circle extends Shape{
    protected double radius;
    final double PI = 3.14;

    public Circle(){
        radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, Point point){
        super(color, point);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

//    public void drawCircle(Graphics circle){
//
//    }

    int [] newPoint = new int[2];
    public void movingToNewLocation(Point newLocation){
        newPoint[0] = newLocation.x;
        newPoint[1] = newLocation.y;
    }


}
