package lab06;

public class Shape {
    String color = "red";
    boolean filled = true;
    XY xy;
    public Shape() {
    }
    public Shape (String color, boolean filled,XY xy){
        this.color= color;
        this.filled= filled;
        this.xy = xy;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public XY getXy() {
        return xy;
    }

    public void setXy(XY xy) {
        this.xy = xy;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" + "color=" + color + ", filled=" + filled + ", xy=" + xy + '}';
    }
}
