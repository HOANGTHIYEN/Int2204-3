import java.util.ArrayList;
import java.util.Collection;

public class Diagram<Shape> extends ArrayList<ArrayList<Shape>> {
    ArrayList<Layer> layers = new ArrayList<Layer>();

    public Diagram(){
    }

    public Diagram(Collection<? extends ArrayList<Shape>> c) {
        super(c);
    }

    public Layer getLayer(int index){
        return layers.get(index);
    }

    public void setLayer(Layer layer){
        layer.setIndex(layers.size());
        layers.add(layer);
    }

    public boolean deleteAllCircleInDiagram(){
        for(int i = 0; i < layers.size(); i++){
            for(int j = 0; j < layers.get(i).shapes.size(); j++){
                boolean check = layers.get(i).deleteAllCircle();
                if(check == false)
                    return false;
            }
        }
        return true;
    }

    public void sortSameObjectInLayer(){
        Layer layerOfRectangle = new Layer();
        Layer layerOfTriangle = new Layer();
        Layer layerOfCircle = new Layer();
        for(int i = 0; i < layers.size(); i++){
            ArrayList<Shape> shapes = this.get(i);
            for(int j = 0; j < shapes.size(); j++){
                if(shapes.get(j) instanceof Circle)
                    layerOfRectangle.add((Circle)shapes.get(j));
                if (shapes.get(j) instanceof Triangle)
                    layerOfTriangle.add((Triangle)shapes.get(j));
                if (shapes.get(j) instanceof Rectangle)
                    layerOfRectangle.add((Rectangle)shapes.get(j));
            }
            this.remove(i);
        }
        layers.add(layerOfCircle);
        layers.add(layerOfTriangle);
        layers.add(layerOfRectangle);
    }
}

