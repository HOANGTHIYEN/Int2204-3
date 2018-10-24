package diagram.layer.shape;

import diagram.Position;

import java.awt.*;
import java.util.Arrays;

public class Rectangle extends Shape {

    public Rectangle(Position[] pos, Color color, boolean canMove) {
        super(pos, color, canMove);
    }

    @Override
    public boolean validate() {
        if (pos.length < 4) return false;
        double x1 = pos[0].posX, y1 = pos[0].posY;
        double x2 = pos[1].posX, y2 = pos[1].posY;
        double x3 = pos[2].posX, y3 = pos[2].posY;
        double x4 = pos[3].posX, y4 = pos[3].posY;
        double cx, cy;
        double dd1, dd2, dd3, dd4;
        cx = (x1 + x2 + x3 + x4) / 4;
        cy = (y1 + y2 + y3 + y4) / 4;

        dd1 = Math.sqrt(Math.abs(cx - x1)) + Math.sqrt(Math.abs(cy - y1));
        dd2 = Math.sqrt(Math.abs(cx - x2)) + Math.sqrt(Math.abs(cy - y2));
        dd3 = Math.sqrt(Math.abs(cx - x3)) + Math.sqrt(Math.abs(cy - y3));
        dd4 = Math.sqrt(Math.abs(cx - x4)) + Math.sqrt(Math.abs(cy - y4));
        return dd1 == dd2 && dd1 == dd3 && dd1 == dd4;
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
