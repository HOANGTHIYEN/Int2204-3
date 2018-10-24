
package Javaapllication4;

import java.util.ArrayList;

public class Diagram {
    public ArrayList<Layer> layer=new ArrayList<Layer>();
     
    public void addLayer(Layer l)
    {
        this.layer.add(l);
    }
    public void deleteCircle(){
        for(int i = 0; i < layer.size(); ++i){
            layer.get(i).deleteCircle();
        }
    }
    public void printLayer()
    {
         for(int i=0;i<layer.size();i++)
        {
            System.out.println(layer.get(i).toString());
        }
    }
}
