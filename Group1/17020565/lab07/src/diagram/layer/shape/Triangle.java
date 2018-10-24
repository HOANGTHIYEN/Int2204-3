package diagram.layer.shape;

import diagram.Position;

import java.awt.*;
import java.util.Arrays;

public class Triangle extends Shape {

    public Triangle(Position[] pos, Color color, boolean canMove) {
        super(pos, color, canMove);
    }

    @Override
    public boolean validate() {
        if(pos.length < 3) return  false;
        Point vertex1 = new Point(pos[0].posX, pos[0].posY);
        Point vertex2 = new Point(pos[1].posX, pos[1].posY);
        Point vertex3 = new Point(pos[2].posX, pos[2].posY);

        double side1 = Math.abs(vertex1.distance(vertex2));
        double side2 = Math.abs(vertex2.distance(vertex3));
        double side3 = Math.abs(vertex3.distance(vertex1));

        boolean valid = side1 + side2 > side3
                && side2 + side3 > side1
                && side3 + side1 > side2;
        return valid;
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
