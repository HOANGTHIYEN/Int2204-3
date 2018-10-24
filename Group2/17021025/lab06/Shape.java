import java.awt.*;

abstract class Shape {
    protected Color color;
    protected Point velocity;

    public abstract void draw(Graphics g);
    public abstract void move();
}
