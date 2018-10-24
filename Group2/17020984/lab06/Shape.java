package ShapePackage;

import Layer.Layer;

public class Shape extends Layer {
    private String color;
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape(){
        super();
        color = "Blue";
    }
    public Shape(String color){
        super();
        this.color = color;
    }
    public Shape(int x, int y, int width, int length, String color){
        super(width, length, x, y);
        this.color = color;
    }

    public void drawShape(){
        System.out.println("Color: " + color);
        this.drawLayer();
    }
}