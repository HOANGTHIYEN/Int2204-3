package lb6;

import java.util.ArrayList;

public class Layer {
    ArrayList<Shape> shapes = new ArrayList<>();

    public void getShapes(Shape shape){
        this.shapes.add(shape);
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
                System.out.println(shape);

        }
    }
}
