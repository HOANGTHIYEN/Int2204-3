package diagram;

import diagram.layer.Layer;
import diagram.layer.shape.Shape;
import diagram.layer.shape.Triangle;

import java.util.ArrayList;

public class Diagram {
    public ArrayList<Layer> getListLayer() {
        return listLayer;
    }

    protected ArrayList<Layer> listLayer;

    public Diagram() {
        listLayer = new ArrayList<>();
    }

    public void addShape(Layer layer) {
        this.listLayer.add(layer);
    }

    public void removeAllCircle(){
        ArrayList<Layer> layers = (ArrayList<Layer>) listLayer.clone();
        for(Layer layer : layers){
            layer.removeAllCircle();
        }
    }

    public void removeAllTriangle(){
        ArrayList<Layer> layers = (ArrayList<Layer>) listLayer.clone();
        for(Layer layer : layers){
            layer.removeAllTriangle();
        }
    }

    public void printAll() {
        for(Layer layer: listLayer){
            layer.printShape();
        }
    }
}
