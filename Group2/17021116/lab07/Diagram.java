/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.ArrayList;
import java.util.Collection;
/**
 *
 * @author 123456789
 * @param <Shape>
 */
public class Diagram<Shape> extends ArrayList<ArrayList<Shape>>{
    public Diagram() {
    }

    public Diagram(Collection<? extends ArrayList<Shape>> o) {
        super(o);
    }
    
    public void deleteCircle (){
        this.forEach((element) -> {
            for (int i=0;i<element.size();i++){
                if (element.get(i) instanceof Circle){
                    element.remove(i);
                    i--;
                }
                
            }
        });
    }
    public void sortObject(){
        Layer layerCircle = new Layer();
        Layer layerTriangle = new Layer();
        Layer layerRectangle = new Layer();
        for (int j=0;j<this.size();j++) {
            ArrayList<Shape> element = this.get(j);
             for (int i=0;i<element.size();i++){
                 if (element.get(i) instanceof Circle)
                     layerCircle.add(element.get(i));
                 if (element.get(i) instanceof Triangle)
                     layerTriangle.add(element.get(i));
                 if (element.get(i) instanceof Rectangle)
                     layerRectangle.add(element.get(i));
             }
             this.remove(j);
        }
        this.add(layerCircle);
        this.add(layerRectangle);
        this.add(layerTriangle);
    }
}
