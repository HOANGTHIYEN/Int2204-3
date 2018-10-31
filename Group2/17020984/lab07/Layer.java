package Layer;

import Shape.Shape;
import Shape.Triangle;
import Shape.Circle;
import Shape.Rectangle;
import Shape.Square;


import java.util.ArrayList;

public class Layer {

    public ArrayList<Shape> LayersList = new ArrayList<>();
    public String visible = "true";

    public void addToLayer(Shape shape) {
        LayersList.add(shape);
    }

    public void deleteAllTriangle(){
        for(int i=0; i< LayersList.size(); i++){
            if(LayersList.get(i) instanceof Triangle){
                LayersList.remove(i);
                i--;
            }
        }
    }

    public void deleteAllCircle(){
        for(int i=0; i< LayersList.size(); i++){
            if(LayersList.get(i) instanceof Circle){
                LayersList.remove(i);
                i--;
            }
        }
    }

    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }
}
