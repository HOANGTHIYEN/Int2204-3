import javafx.scene.paint.Color;

public class Square extends Rectangle{
    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, Point point){
        super(side, side, color, point);
    }

    public double getSide(){
        return super.getLength();
    }
    public void setSide(double side){
        width = side;
        length = side;
    }

    @Override
    public void movingToNewLocation(Point newLocation){
        newPoint[0] = newLocation.x;
        newPoint[1] = newLocation.y;
    }
}
