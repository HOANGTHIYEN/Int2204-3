package lap07;

import java.awt.Color;

public abstract class Shape {
    protected int X=0, Y=0;
    protected Color color=Color.WHITE;

    public Shape() {
    }

    public Shape(int X, int Y, Color color, boolean isFilled) {
        this.X = X;
        this.Y = Y;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void reColor(Color color) {
        this.color = color;
    }

    public void getPos() {
        System.out.println("Current : (" + X + "," + Y + ").");
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }
    protected abstract void getInfo();
    protected abstract void setPos(int X, int Y);
    protected abstract void remove(int x, int y);
    protected abstract boolean equals(Shape shape);

}