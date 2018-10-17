/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.util.ArrayList;

/**
 *
 * @author CCNE
 */
public class Diagram {
    private ArrayList<Layer> layer = new ArrayList<>();

    public ArrayList<Layer> getLayer() {
        return layer;
    }

    public void setLayer(ArrayList<Layer> layer) {
        this.layer = layer;
    }
    
    public void delete (){
        for(int i = layer.size() - 1; i >= 0;i--){
            for(int j = 0; j < getLayer().get(i).getShape().size();j++)
            if(layer.get(i).getShape().get(j)instanceof Circle){
                layer.get(i).getShape().remove(j);
            }
        }
    }
}
