package diagram.layer.shape;

import diagram.Position;

import java.awt.*;
import java.util.Arrays;

public class Rectangle extends Shape {

    public Rectangle(Position[] pos, Color color, boolean canMove) {
        super(pos, color, canMove);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "pos=" + Arrays.toString(pos) +
                ", color=" + color +
                ", canMove=" + canMove +
                '}';
    }
}
