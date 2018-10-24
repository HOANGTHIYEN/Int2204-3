package diagram.layer.shape;

import diagram.Position;

import java.awt.*;
import java.util.Arrays;

public class Square extends Rectangle {
    public Square(Position[] pos, Color color, boolean canMove) {
        super(pos, color, canMove);
    }

    @Override
    public boolean validate() {
        if (pos.length < 4) return false;
        double x1 = pos[0].posX, y1 = pos[0].posY;
        double x2 = pos[1].posX, y2 = pos[1].posY;
        double x3 = pos[2].posX, y3 = pos[2].posY;
        double dx12 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        double dx23 = Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));

        super.validate();
        return dx12 == dx23;
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
