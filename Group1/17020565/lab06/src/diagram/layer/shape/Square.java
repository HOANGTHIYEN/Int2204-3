package diagram.layer.shape;

import java.awt.*;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    public Square(double posX, double posY, Color color, boolean canMove, double width, double length) {
        super(posX, posY, color, canMove, width, length);
    }

    public double getSize() {
        return super.getWidth();
    }

    public void setSize(double size) {
        setWidth(size);
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    @Override
    public void setLength(double length) {
        this.width = length;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                ", posX=" + posX +
                ", posY=" + posY +
                ", color=" + color +
                ", canMove=" + canMove +
                '}';
    }
}
