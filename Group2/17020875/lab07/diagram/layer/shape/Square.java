package diagram.layer.shape;

import java.awt.*;

public class Square extends Rectangle{

    public Square(Color color, boolean filled, double side, int x1, int y1, int x2, int y2)
        {

        super(color,filled,side, side, x1, y1, x2, y2 );
    }
    public void setSide(double side)
    {

        width = side;
        length = side;
    }
    public double getSide()
    {
        return super.width;
    }


    @Override
    public void setLength(double side) {
        setSide(side);
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public void moveShape(String direction, int size) {
        super.moveShape(direction, size);
    }

    @Override
    public String toString() {
        return "Square: side: " + getSide()
                + " color: " + color + " filled: " + filled
                + " Toa do (x1 = " + x1 + " y1 = " + y1 + ")"
                + " ;(x2 = " + x2 + " y1 = " + y1 + ")"
                + " ;(x2 = " + x2 + " y2 = " + y2 + ")"
                + " ;(x1 = " + x1 + " y2 = " + y2 + ")";
    }
}