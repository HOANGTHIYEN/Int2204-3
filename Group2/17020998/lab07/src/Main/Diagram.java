package Main;

import java.util.ArrayList;

public class Diagram {
    private ArrayList<Layer> layers;

    public Diagram() {
        layers = new ArrayList<>();
    }

    public void setLayer(Layer layer){
        layer.setIndex(layers.size());
        layers.add(layer);
    }

    public Layer getLayer(int index){
        return layers.get(index);
    }

    public void drawAllLayer(){
        for(int i = 0; i < layers.size(); i++){
            Layer layer = layers.get(i);
            if(!layer.isVisible()){
                continue;
            } else {
                layer.Draw();
            }
        }
        System.out.println("done");
    }

    public boolean deleteAllCircleInDiagram(){
        for (int i = 0; i < layers.size(); i++){
                    boolean deleteDone = layers.get(i).deleteAllCircle();
                    if(!deleteDone)
                        return false;
        }
        return true;

    }


}
