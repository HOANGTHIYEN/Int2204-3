package Shape_type;

import ShapePackage.Shape;

public class Rectangle extends Shape {
    private int rectangleWidth;
    private int rectangleLength;

    public int getRectangleWidth() {
        return rectangleWidth;
    }

    public int getRectangleLength() {
        return rectangleLength;
    }

    public void setRectangleLength(int rectangleLength) {
        this.rectangleLength = rectangleLength;
    }

    public void setRectangleWidth(int rectangleWidth) {
        this.rectangleWidth = rectangleWidth;
    }
    public Rectangle(){
        super();
        rectangleLength = rectangleWidth = 0;
    }
    public Rectangle(int rectangleLength, int rectangleWidth){
        super();
        this.rectangleLength = rectangleLength;
        this.rectangleWidth = rectangleWidth;
    }
    public Rectangle(int width, int length, int x, int y, String color, int Lx, int Ly, int rectangleWidth, int rectangleLength){
        super(x, y, width, length, color);
        this.rectangleWidth = rectangleWidth;
        this.rectangleLength = rectangleLength;
    }

    public void drawRectangle(){
        System.out.println("Rectangle Length: " + this.rectangleLength);
        System.out.println("Rectangle Width: " + this.rectangleWidth);
        this.drawShape();
    }
}