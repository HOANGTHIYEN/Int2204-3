package Main;

import java.util.ArrayList;

public class Diagram {
    private ArrayList<Layer> layers;

    public Diagram() {
        layers = new ArrayList<>();
    }

    public void setLayer(Layer layer) {
        layer.setIndex(layers.size());
        layers.add(layer);
    }

    public Layer getLayer(int index) {
        return layers.get(index);
    }

    public void drawAllLayer() {
        for (int i = 0; i < layers.size(); i++) {
            Layer layer = layers.get(i);
            if (!layer.isVisible()) {
                continue;
            } else {
                layer.Draw();
            }
        }
        System.out.println("done");
    }

    public boolean deleteAllCircleInDiagram() {
        for (int i = 0; i < layers.size(); i++) {
            boolean deleteDone = layers.get(i).deleteAllCircle();
            if (!deleteDone)
                return false;
        }
        return true;

    }

    public void filterLayer() {
        Layer layerCircle = new Layer();
        Layer layerRectangle = new Layer();
        Layer layerTriangle = new Layer();
        Layer layerSquare = new Layer();
        Layer layerHexagon = new Layer();
        for (int i = 0; i < layers.size(); i++) {
            for (int j = 0; j < layers.get(i).shapes.size(); j++) {
                Shape shape = layers.get(i).shapes.get(j);
                if (shape instanceof Circle) {
                    layerCircle.addCircle(layers.get(i).shapes.get(j));
                }
                else if (shape instanceof Triangle) {
                    layerTriangle.addTriangle(layers.get(i).shapes.get(j));
                }
                else if (shape instanceof Rectangle) {
                    layerRectangle.addRectangle(layers.get(i).shapes.get(j));
                }
                else if (shape instanceof Square) {
                    layerSquare.addSquare(layers.get(i).shapes.get(j));
                }
                else if(shape instanceof Hexagon){
                    layerSquare.addHexagon(layers.get(i).shapes.get(j));
                }
            }
        }

        layers.removeAll(layers);

        layers.add(layerCircle);
        layers.add(layerSquare);
        layers.add(layerRectangle);
        layers.add(layerHexagon);
    }


}
