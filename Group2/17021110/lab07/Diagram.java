import java.util.ArrayList;

public class Diagram {
    final static public double pi = Math.PI;
    private ArrayList<Layer> layerList = new ArrayList<>();
    private int shapeNumber = 4;

    public int getShapeNumber() {
        return shapeNumber;
    }

    void layerClassify() {
        //Create new tempo blank list of layer
        /**
         * layer [0] : Circle layer
         * layer [1] : Triangle layer
         * layer [2] : Rectangle layer
         * layer [3] : Square layer
         */
        ArrayList<Layer> tempoLayerList = new ArrayList<>();
        for (int i = 0;i<shapeNumber ; i++ ){
            tempoLayerList.add(new Layer());
        }

        for (Layer curLayer:layerList) {
            for (Shape curShape:curLayer.getShapeList()) {
                //If shape is a Circle
                if (curShape instanceof Circle) {
                    tempoLayerList.get(0).addShape(curShape);
                }
                //If shape is a Triangle
                if (curShape instanceof  Triangle) {
                    tempoLayerList.get(1).addShape(curShape);
                }
                //If shape is a Rectangle
                if (curShape instanceof  Rectangle && !(curShape instanceof Square) ) {
                    tempoLayerList.get(2).addShape(curShape);
                }
                //If shape is a Square
                if (curShape instanceof  Square) {
                    tempoLayerList.get(3).addShape(curShape);
                }
            }
        }

        layerList.clear();
        layerList = (ArrayList<Layer>) tempoLayerList.clone();
    }

    public ArrayList<Layer> getLayerList() {
        return layerList;
    }

    public void addLayer(Layer newLayer) {
        this.layerList.add(newLayer);
    }

    public void deleteCircle(Layer layer) {
        for (Shape curShape: layer.getShapeList()) {
            if (curShape instanceof Circle) {
                layer.getShapeList().remove(curShape);
            }
        }
    }
}