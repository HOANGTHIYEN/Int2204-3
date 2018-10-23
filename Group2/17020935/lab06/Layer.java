/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author DELL
 */
import java.util.ArrayList;

public class Layer{
    private int width, length;
    private int x,y;
    private ArrayList<Shape> layers = new ArrayList<>();

    public Layer(){
        width = length = x = y = 3;
    }

    public Layer(int width, int length, int x, int y){
        this.width = width;
        this.length = length;
        this.x = x;
        this.y = y;
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

    public void deleteAllShape(){
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
}
