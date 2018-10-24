package lb7;

import java.util.ArrayList;

public class Diagram {

    protected ArrayList<Layer> layers;


    public ArrayList<Layer> getLayers() {
        return layers;
    }

    public void setLayers(ArrayList<Layer> layers) {
        this.layers = layers;
    }

    public Diagram() {
        layers = new ArrayList<>();
    }

    public void addLayer(Layer layer) {
        this.layers.add(layer);
    }

    public void circleDelete(){
        for(int i = 0; i < layers.size(); i++){
            layers.get(i).circleDelete();
        }
    }

    public void printf(){
        for(Layer layer: layers){
            layer.printfShape();
        }
    }
}
