
package la6;

import java.util.ArrayList;

public class Diagram  {
  ArrayList<Layer> layer = new ArrayList<>();
    
public void addLayer(Layer l){
        this.layer.add(l);
    }
        
    public void deleteAllTriangle(){
        for(int i = 0; i < layer.size(); ++i){
            layer.get(i).deleteAllTriangle();
         }
    }
     public void deleteAllCircle(){
        for(int i = 0; i < layer.size(); ++i){
            layer.get(i).deleteAllCircle();
         }
    }
  
}