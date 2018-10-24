package Layer;

import ShapePackage.Shape;
import Shape_type.Circle;
import Shape_type.Rectangle;
import Shape_type.Triangle;


import java.util.ArrayList;

public class Layer{
    private int width, length;
    private int x,y;
    private ArrayList<Shape> layers = new ArrayList<>();

    public Layer(){
        width = length = x = y = 0;
    }

    public Layer(int width, int length, int x, int y){
        this.width = width;
        this.length = length;
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void addShape(Shape shape){
        this.layers.add(shape);
    }

    public void drawListLayer(){
        int lengthLayer = layers.size();
        for(int i=0; i<lengthLayer;i++){
            if(layers.get(i) instanceof Rectangle){
                ((Rectangle) layers.get(i)).drawRectangle();
            }
            if(layers.get(i) instanceof Triangle){
                ((Triangle) layers.get(i)).drawTriangle();
            }
            if(layers.get(i) instanceof Circle){
                ((Circle) layers.get(i)).drawCircle();
            }
        }
        }

    public void drawLayer(){
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Toa do Ox: " + x);
        System.out.println("Toa do Oy: " + y);
    }

    public void deleteAllShale(){
        int lengthLayer = layers.size();
        int i=0;
        while(i<lengthLayer){
            if(layers.get(i) instanceof Circle){
                layers.remove(i);
                System.out.println(lengthLayer);
                lengthLayer--;
            }
            else{
                i++;
            }

        }
    }
}