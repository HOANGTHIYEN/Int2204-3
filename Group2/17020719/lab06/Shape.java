import java.util.Vector;

public abstract class Shape{
    protected String color;
    protected boolean filled;
    protected Point point;
    protected int index;

    public Shape(){
        color = "red";
        filled = true;
        point = new Point(0, 0);
    }

    public Shape(String color, boolean filled, Point center){
        this.color = color;
        this.filled = filled;
        this.point = center;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled(){
        return true;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Point getCenter(){
        return point;
    }
    public void setCenter(Point center){
        this.point = center;
    }

    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }

    public String toString() {
        return "Color: " + color + "\nFilled: " + filled;
    }
}
