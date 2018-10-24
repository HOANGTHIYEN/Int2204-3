package diagram.layer.shape;

import diagram.Position;

import java.awt.*;
import java.util.Arrays;

public class Square extends Rectangle {
    public Square(Position[] pos, Color color, boolean canMove) {
        super(pos, color, canMove);
    }

    @Override
    public String toString() {
        return "Square{" +
                "pos=" + Arrays.toString(pos) +
                ", color=" + color +
                ", canMove=" + canMove +
                '}';
    }
}
