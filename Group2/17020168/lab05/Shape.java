package javaapplication3;

public class Shape {
    String color;
    boolean flied;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFlied() {
        return flied;
    }

    public void setFlied(boolean flied) {
        this.flied = flied;
    }

    public Shape(String color, boolean flied) {
        this.color = color;
        this.flied = flied;
    }

    public Shape() {
    }

    @Override
    public String toString() {
        return "Shape{" + "color=" + color + ", flied=" + flied + '}';
    }
}
