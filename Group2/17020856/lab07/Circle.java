package lap07;

import java.awt.*;
public class Circle extends Shape{
    protected int radius=1;

    public Circle() {
        super();
    }

    public Circle(int radius) {
        this.radius=radius;
    }

    public Circle(int X, int Y, Color color, boolean isFilled) {
        super(X, Y, color, isFilled);
    }

    public Circle(int X, int Y, Color color, boolean isFilled, int radius) {
        super(X, Y, color, isFilled);
        this.radius=radius;
    }

    public void resize(int radius) {
        this.radius=radius;
    }

    public int getRadius() {
        return radius;
    }
    @Override
    public void getInfo() {
        System.out.println("Circle");
        System.out.println("radius: " + radius);
        System.out.println("Color" + color);
        getPos();

    }

    @Override
    public void setPos(int X, int Y) {
        this.X=X;
        this.Y=Y;
    }

    @Override
    public void remove(int x, int y) {
        X+=x;
        Y+=y;

    }

    @Override
    public boolean equals(Shape shape) {
        if (shape instanceof Circle) {
            if (shape.X!=this.X || shape.Y!=this.Y)
                return false;
            if (((Circle)shape).radius!=this.radius)
                return false;
            return true;
        }
        return false;
    }


}
