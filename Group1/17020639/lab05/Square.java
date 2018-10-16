package javaapplication3;

public class Square extends Rectangle{
    protected double side;

    public Square() {
       this.width = 4;
        this.length = 4;
    }

    public Square(double side) {
        this.width = side;
        this.length = side;  
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
 
    public double getSide() {
        return side;
    }
    
    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }
    
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public String toString() {
        return "Square{" + "width=" + width + ", length=" + length +",Perimeter="+2*(width+length)+",Area="+width*length+'}';
    }

}
