import javafx.scene.paint.Color;

public class Triangle extends Shape {
    protected int [] points = new int[6];

    public Triangle(Point point1, Point point2, Point point3){
        this.points[0] = point1.x;
        this.points[1] = point1.y;
        this.points[2] = point2.x;
        this.points[3] = point2.y;
        this.points[4] = point3.x;
        this.points[5] = point3.y;
    }

    public Triangle(Point point1, Point point2, Point point3, String color){
        super(color);
        this.points[0] = point1.x;
        this.points[1] = point1.y;
        this.points[2] = point2.x;
        this.points[3] = point2.y;
        this.points[4] = point3.x;
        this.points[5] = point3.y;
    }

    int [] newPoint = new int[2];
    public void movingToNewLocation(Point newLocation){
        newPoint[0] = newLocation.x;
        newPoint[1] = newLocation.y;
    }
}
