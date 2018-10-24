package diagram.layer;

import diagram.Diagram;
import diagram.layer.shape.*;

import java.util.ArrayList;
import java.util.Vector;

public class Layer extends Diagram {

    protected ArrayList<Shape> listShape;
    protected boolean visible;


    public Layer() {
        listShape = new ArrayList<>();
        visible = true;
    }

    public void setListShape(ArrayList<Shape> listShape) {
        this.listShape = listShape;
    }

    public ArrayList<Shape> getListShape() {
        return listShape;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isVisible() {
        return visible;
    }

    public void addShape(Shape shape) {
        this.listShape.add(shape);
    }

    public void removeAllTriangle(){
        int i;
        for(i = 0; i < listShape.size();i++)
        {
            if(listShape.get(i) instanceof Triangle)
            {
                listShape.remove(listShape.get(i));
                i--;
            }
        }
    }

    public void removeAllCircle() {
        int i;
        for (i = 0; i < listShape.size(); i++) {
            if (listShape.get(i) instanceof Circle)
            {
                listShape.remove(listShape.get(i));
                i--;
            }

        }
    }

    public int sizeOfList(){
        return listShape.size();
    }

    public void printShape(){
        for(Shape shape: listShape){
            System.out.println(shape.toString());

        }
    }
}
