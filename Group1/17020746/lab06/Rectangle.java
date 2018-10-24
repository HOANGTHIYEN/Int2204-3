package lb6;

public class Rectangle extends Shape{
    protected double width, length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //Constructor
    public Rectangle() {

    }

    public Rectangle(double width, double length, int x, int y, int moveX, int moveY, String color, boolean filled, boolean pos) {
        super(x, y, moveX, moveY, color, filled, pos);
        this.width = width;
        this.length = length;
        name = "Rectangle";
    }

    @Override
    public String toString(){
        return super.toString() + "Width = " + width + "Length" + length;
    }

}
