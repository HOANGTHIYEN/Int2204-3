
package Javaapllication4;

import java.awt.Color;

public class Shape{
    protected boolean filled,visible;
    protected Color color;
    protected int x,y;

    public Shape() {
    }

    public Shape(boolean filled, boolean visible, Color color, int x, int y) {
        this.filled = filled;
        this.visible = visible;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{"  + "filled=" + filled + ", color=" + color + '}';
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
    public int[] getTriangleX() {
		return getTriangleX();
	}
    public int[] getTriangleY() {
		return getTriangleY();
	}
    public int[] getHexagonX(){
        return getHexagonX();
    }
    public int[] getHexagonY(){
        return getHexagonY();
    }

}
