package Shape_type;

import ShapePackage.Shape;

public class Circle extends Shape {
    private int x, y;
    private int radius;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(){
        super();
        x = y = 0;
        radius = 1;
    }

    public Circle(int x, int y, int radius){
        super();
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(int width, int length, int x, int y, String color, int Lx, int Ly, int X, int Y, int radius){
        super(x, y, width, length, color);
        this.radius = radius;
        this.x = X;
        this.y = Y;
    }

    public void drawCircle(){
        System.out.println("Toa do tam: " + x + ":" + y );
        System.out.println("Ban kinh: " + radius);
        drawShape();
    }
}
