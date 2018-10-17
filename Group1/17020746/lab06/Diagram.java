package lb6;

import java.util.ArrayList;

public class Diagram {
    ArrayList<Layer> layers = new ArrayList<>();

    public void getLayers(Layer layer) {
        this.layers.add(layer);
    }

    public void circleDelete(){
        for(int i = 0; i < layers.size(); i++){
            layers.get(i).circleDelete();
        }
    }

    public void printf(){
        for(int i = 0; i < layers.size(); i ++){
            System.out.println(layers.get(i));
        }
    }
}
