package diagram.layer.shape;
import java.awt.*;

public class Circle extends Shape {
    protected double radius;
    protected int x1;
    protected int y1;


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public int getY1() {
        return y1;
    }

    public int getX1() {
        return x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public Circle(Color color, boolean filled, double radius, int x1, int y1)
    {
        super(color, filled);
        this.radius = radius;
        this.x1 = x1;
        this.y1 = y1;
    }
    public void moveShapeCir(String direction, int size)
    {
        switch (direction)
        {
            case "up": {
                y1 = y1 + size;
                break;
            }
            case "down": {
                y1 = y1 - size;
                break;
            }
            case "left": {
                x1 = x1 - size;
                break;
            }
            case "right": {
                x1 = x1 + size;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Triangle: radius: " + radius
                + " color: " + color + " filled: " + filled
                + " Toa do: (x = " + x1 + " y = " + y1 + ")";
    }
}
