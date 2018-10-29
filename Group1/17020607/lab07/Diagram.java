package Week7;

import java.util.ArrayList;

public class Diagram {

    ArrayList<Layer> layer;

    public Diagram() {
        layer = new ArrayList<>();
    }

    public void addLayer(Layer lay) {
        this.layer.add(lay);
    }

    public void printLayer() {
        for (int i = 0; i < layer.size(); ++i) {
            layer.get(i).printShape();
        }
    }

    public void deleteAllTriangle() {
        for (int i = 0; i < layer.size(); ++i) {
            layer.get(i).deleteAllTriangle();
        }
    }

    public void deleteAllCircle() {
        for (int i = 0; i < layer.size(); ++i) {
            layer.get(i).deleteAllCircle();
        }
    }

}
