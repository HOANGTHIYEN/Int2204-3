
package Javaapllication4;

public class Square extends Rectangle{
    protected double side;

    public Square() {
       this.width = 4;
        this.length = 4;
    }

    public Square(double side) {
        this.side=side;
    }

    public Square(double side, int x, int y, boolean filled, String color) {
        super(side, side, x, y, filled, color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + ", x=" + x + ", y=" + y + ", filled=" + filled + ", color=" + color + '}';
    }
}
