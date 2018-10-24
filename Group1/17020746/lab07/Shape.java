package lb7;

import java.awt.*;

public abstract class Shape {
    protected Color color;
    protected boolean filled;
    protected int x, y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor(){
        return color;
    }
    public void setColor(Color color){
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    //Constructor
    public Shape(int x, int y, Color color, boolean filled) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.filled = filled;
    }

    public Shape(){
        //Emty
    }

    public double getRadius() {
        return this.getRadius();
    }
    public double getWidth() {
        return this.getWidth();
    }
    public double getLength() {
        return this.getLength();
    }
    public double getSide() {
        return this.getSide();
    }
    public int[] getXT() {
        return getXT();
    }
    public int[] getYT() {
        return getYT();
    }
    public int[] getXH(){
        return getXH();
    }
    public int[] getYH(){
        return getYH();
    }
}
