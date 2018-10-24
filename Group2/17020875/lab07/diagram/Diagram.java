package diagram;

import diagram.layer.Layer;
import diagram.layer.shape.*;

import java.util.ArrayList;

public class Diagram
{
    public ArrayList<Layer> getListLayer() {
        return listLayer;
    }

    protected ArrayList<Layer> listLayer;



    public Diagram() {
        listLayer = new ArrayList<>();
    }

    public void addLayer(Layer layer) {
        this.listLayer.add(layer);
    }

    public void removeAllCircle(){
        for(int i = 0; i < listLayer.size(); i++)
        {
            listLayer.get(i).removeAllCircle();
            i--;
        }
    }

    public void removeAllTriangle() {
        for (int i = 0; i < listLayer.size(); i++) {
            listLayer.get(i).removeAllTriangle();
            i--;
        }
    }
    public void phanLoai(){
        Layer layerRec = new Layer();
        Layer layerTri = new Layer();
        Layer layerSqua = new Layer();
        Layer layerCircle = new Layer();
        Layer layerHex = new Layer();
        for (int i = 0; i < listLayer.size(); i++) {
                for (int j = 0; j < listLayer.get(i).getListShape().size(); j++)
                {
                    if(listLayer.get(i).getListShape().get(j) instanceof Rectangle)
                    {
                        layerRec.addShape(listLayer.get(i).getListShape().get(j));

                    }
                    if(listLayer.get(i).getListShape().get(j) instanceof Square)
                    {
                        layerSqua.addShape(listLayer.get(i).getListShape().get(j));

                    }
                    if(listLayer.get(i).getListShape().get(j) instanceof Triangle)
                    {
                        layerTri.addShape(listLayer.get(i).getListShape().get(j));

                    }
                    if(listLayer.get(i).getListShape().get(j) instanceof Circle)
                    {
                        layerCircle.addShape(listLayer.get(i).getListShape().get(j));

                    }
                    if(listLayer.get(i).getListShape().get(j) instanceof Hexagon)
                    {
                        layerHex.addShape(listLayer.get(i).getListShape().get(j));

                    }

                }
            listLayer.remove(i);
        }

        listLayer.add(layerRec);
        listLayer.add(layerSqua);
        listLayer.add(layerTri);
        listLayer.add(layerCircle);
        listLayer.add(layerHex);
    }
    public void printAll() {
        for(Layer layer: listLayer){
            layer.printShape();
        }
    }
}
