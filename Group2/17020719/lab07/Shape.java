import java.util.ArrayList;

public abstract class Shape {
    protected String color;
    protected Point point;

    public Shape(){
        color = "blue";
    }
    public Shape(String color){
        this.color = color;
    }

    public Shape(String color, Point point){
        this.color = color;
        this.point = point;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Color: " + color ;
    }
}
