package lb7;

import java.util.ArrayList;

public class Layer extends Diagram {
    protected ArrayList<Shape> shapes;
    protected boolean visible;

    public Layer() {
        shapes = new ArrayList<>();
        visible = true;
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void addShapes(Shape shapes){
        this.shapes.add(shapes);
    }

    public void triangleDelete(){
        for(int i = 0; i < shapes.size(); i ++){
            if(shapes.get(i) instanceof Triangle){
                shapes.remove(i);
                i--;
            }
        }
    }

    public void circleDelete(){
        for(int i = 0; i < shapes.size(); i ++){
            if(shapes.get(i) instanceof Circle){
                shapes.remove(i);
                i--;
            }
        }
    }

    public void printfShape(){
        for(Shape shape : shapes){
                System.out.println(shape.toString());

        }
    }
}

