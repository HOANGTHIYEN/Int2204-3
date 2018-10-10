package tuan5.bai2;

public class Square extends Rectangle {
    private double side;
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double width, double length, double side) {
        super(color, filled, width, length);
        this.side = side;
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setLength( double side){
        super.length = side;
        super.width = side;
    }
    public void setWidth(double side){
        super.width = side;
        super.length=side;
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + ", area=" + getArea() + ", perimeter="+ getPerimeter()+'}';
    }
}
