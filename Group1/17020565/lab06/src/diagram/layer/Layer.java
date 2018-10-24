package diagram.layer;

import diagram.Diagram;
import diagram.layer.shape.Circle;
import diagram.layer.shape.Rectangle;
import diagram.layer.shape.Shape;
import diagram.layer.shape.Triangle;

import java.util.ArrayList;

public class Layer extends Diagram {
    public ArrayList<Shape> listShape;

    public Layer() {
        listShape = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        this.listShape.add(shape);
    }

    public void removeAllTriangle(){
        ArrayList<Shape> shapes = (ArrayList<Shape>) listShape.clone();
        for(Shape shape : shapes){
            if(shape instanceof Triangle){
                listShape.remove(shape);
            }
        }
    }

    public void removeAllCircle(){
        ArrayList<Shape> shapes = (ArrayList<Shape>) listShape.clone();
        for(Shape shape : shapes){
            if(shape instanceof Circle){
                listShape.remove(shape);
            }
        }
    }

    public int sizeOfList(){
        return listShape.size();
    }

    public void printShape(){
        for(Shape shape: listShape){
            System.out.println(shape.toString());
        }
    }
}
