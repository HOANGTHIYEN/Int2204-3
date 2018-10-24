
package Javaapllication4;
import java.awt.Color;
public class Square extends Rectangle{
      protected double side;

    public Square() {
    }

    public Square(double side, int x, int y, boolean filled, boolean visible, Color color) {
        super(side, side, x, y, filled, visible, color);
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }


    @Override
    public String toString() {
        return "Square{" + "side=" + width + ", filled=" + filled + ", color=" + color + '}';
    }
}
