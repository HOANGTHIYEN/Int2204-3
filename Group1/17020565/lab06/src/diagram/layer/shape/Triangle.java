package diagram.layer.shape;

import diagram.Position;

import java.awt.*;
import java.util.Arrays;

public class Triangle extends Shape {

    public Triangle(Position[] pos, Color color, boolean canMove) {
        super(pos, color, canMove);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "pos=" + Arrays.toString(pos) +
                ", color=" + color +
                ", canMove=" + canMove +
                '}';
    }
}
