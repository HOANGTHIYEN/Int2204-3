package javaapplication3;

public class Square extends Rectangle{
    public double side;

    public Square() {
    }

    public Square(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }
    
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }
    public Square(double side,String color, boolean flied) {
//        this.length = length;
//       super.setLength(side);
        this.side = side;
       super.setWidth(side);
       super.setColor(color);
       super.setFlied(flied);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
