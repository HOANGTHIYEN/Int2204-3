package week7;

import java.awt.Color;

class Square extends Rectangle{
    protected double side;
    public Square(){

    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, double width, double length, int x, int y, Color color, boolean filled) {
        super(width, length, x, y, color, filled);
        this.side = side;
    }
  

    @Override
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
        this.width = side;
        this.length = side;
    }
    public void showInfo() {
        System.out.println( side + "\n" + color  + "\n" + filled );
    }
}