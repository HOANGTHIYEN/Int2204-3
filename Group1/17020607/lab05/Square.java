package Week5_2;

public class Square extends Rectangle {

    protected double side;

    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setSide(double side) {
        this.setWidth(side);
        this.setLength(side);
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
        this.width = side;
        this.length = side;
    }

    public Square(double side, String color, boolean filled) {
        super();
        this.side = side;
    }

    @Override
    public String toString() {
        return "Chu vi hình vuông là: " + getPerimeter() + "    Diện tích hình vuông là: " + getArea();
    }
}
