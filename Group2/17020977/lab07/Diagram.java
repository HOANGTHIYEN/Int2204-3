package lap_06;
import java.util.ArrayList;
import java.util.Collection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Diagram<Shape> extends ArrayList<ArrayList<Shape>>{

    public Diagram() {
    }

    public Diagram(Collection<? extends ArrayList<Shape>> c) {
        super(c);
    }
    
    public void deleteCircleObject (){
        for (int j=0;j<this.size();j++) {
            ArrayList<Shape> element = this.get(j);
             for (int i=0;i<element.size();i++){
                 if (element.get(i) instanceof CircleObject){
                     element.remove(i);
                     i--;
                 }
                 
             }
        }
    }
    public void sortObject(){
        Layer layer_circleObject = new Layer();
        Layer layer_triangleObject = new Layer();
        Layer layer_rectangleObject = new Layer();
        for (int j=0;j<this.size();j++) {
            ArrayList<Shape> element = this.get(j);
             for (int i=0;i<element.size();i++){
                 if (element.get(i) instanceof CircleObject)
                     layer_circleObject.add(element.get(i));
                 if (element.get(i) instanceof TriangleObject)
                     layer_triangleObject.add(element.get(i));
                 if (element.get(i) instanceof RectangleObject)
                     layer_rectangleObject.add(element.get(i));
             }
             this.remove(j);
        }
        this.add(layer_circleObject);
        this.add(layer_rectangleObject);
        this.add(layer_triangleObject);
    }

}
