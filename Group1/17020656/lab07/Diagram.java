/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap7;

import java.util.Vector;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class Diagram {
    protected ArrayList<Layer> Layer=new ArrayList<Layer>();
    
    public void addLayer(Layer layer){
        this.Layer.add(layer);
    }
    public void deleteAllTriangle()
    {
        for(int i=0; i<Layer.size(); i++){
            Layer.get(i).deleteTriangle();
        }
    }
    public void deleteCircle()
    {
        for(int i=0; i<Layer.size(); i++){
            Layer.get(i).deleteCircle();
        }
    }
}
