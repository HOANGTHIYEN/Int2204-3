/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.util.ArrayList;


public class Diagram {
     private ArrayList<Layer> layers;


 Diagram() {
        layers = new ArrayList<>();
    }

   
 public void setLayer(Layer layer){
        
   layer.setChiso(layers.size());
        
    layers.add(layer);
    }

   
 public Layer getLayer(int chiso){
       
        return layers.get(chiso);
    }

   
 public boolean deleteAllCircleInDiagram(){
    
        for (int i = 0; i < layers.size(); i++){
                
            for (int j = 0; j < layers.get(i).shapes.size(); i++){
  
                 boolean deleteDone = layers.get(i).deleteAllCircle();
 
                                if(!deleteDone)
                   
                        return false;
                }

      
  }
        return true;

    }


}


