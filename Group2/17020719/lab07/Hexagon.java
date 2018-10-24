import static java.lang.Math.sqrt;
import javafx.scene.paint.Color;

public class Hexagon extends Shape{
    protected double [] points = new double[12];
    protected double side;

    public Hexagon(double side){
        this.side = side;
        double H = (sqrt(3)/2) * side;
        this.points[0] = point.x;
        this.points[1] = point.y - side;
        this.points[2] = point.x + H;
        this.points[3] = point.y - side/2;
        this.points[4] = point.x + H;
        this.points[5] = point.y + side/2;
        this.points[6] = point.x;
        this.points[7] = point.y + side;
        this.points[8] = point.x - H;
        this.points[9] = point.y + side/2;
        this.points[10] = point.x - H;
        this.points[11] = point.y - side/2;
    }

    public Hexagon(Double side, Point point, String color){
        super(color, point);
        this.side = side;
        double H = (sqrt(3)/2) * side;
        this.points[0] = point.x;
        this.points[1] = point.y - side;
        this.points[2] = point.x + H;
        this.points[3] = point.y - side/2;
        this.points[4] = point.x + H;
        this.points[5] = point.y + side/2;
        this.points[6] = point.x;
        this.points[7] = point.y + side;
        this.points[8] = point.x - H;
        this.points[9] = point.y + side/2;
        this.points[10] = point.x - H;
        this.points[11] = point.y - side/2;
    }

    public void movingToNewLocation(Point newLocation){
        point.x = newLocation.x;
        point.y = newLocation.y;
    }
}
