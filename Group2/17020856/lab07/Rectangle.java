package lap07;

import java.awt.*;

class Rectangle extends Shape{

    protected int width =1, length=1;

    public Rectangle() {
        super();
    }

    public Rectangle(int X, int Y, Color color, boolean isFilled) {
        super(X, Y, color, isFilled);
    }

    public Rectangle(int width, int length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(int X, int Y, Color color, boolean isFilled, int width, int length) {
        super(X, Y, color, isFilled);
        this.width = width;
        this.length = length;
    }

    public void resizeWidth(int width) {
        this.width = width;
    }

    public void resizeLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void getInfo() {
        System.out.println("Rectangle");
        System.out.println("width: " + width);
        System.out.println("length: " + length);
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
        if (shape instanceof Rectangle) {
            if (shape.X!=this.X || shape.Y!=this.Y)
                return false;
            if (((Rectangle)shape).getWidth()!=this.getWidth()|| ((Rectangle)shape).getLength()!=this.getLength())
                return false;
            return true;
        }
        return false;
    }
}