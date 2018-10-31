import javafx.scene.paint.Color;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        width = 1.0;
        length = 2.0;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, Point point){
        super(color, point);
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }

    int [] newPoint = new int[2];
    public void movingToNewLocation(Point newLocation){
        newPoint[0] = newLocation.x;
        newPoint[1] = newLocation.y;
    }
}
