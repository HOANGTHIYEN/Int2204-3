package Week6;

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

    public Square(double side, double x, double y, String color, boolean filled) {
        super(side, side, x, y, color, filled);
        this.side = side;
    }

    @Override
    public String toString() {
        return "x: " + x + " y: " + y + " color: " + color + " filled: " + filled + " side: " + side;
    }
}
