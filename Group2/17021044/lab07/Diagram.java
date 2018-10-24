/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;


public class Diagram extends Layer{
   protected ArrayList<Layer> layer=new ArrayList<Layer>();
    protected void deleteCircle()
   {
     for(int i=0;i<layer.size();i++)
     {
          int j=0;
      while(j!=layer.get(i).shape.size())
      {
          
           if(layer.get(i).shape.get(j) instanceof Circle)
           {
              layer.get(i). shape.remove(j);
               j=0;
           }
           else j++;
          }
     }
}
     protected void addLayer()
     {
         Layer layer1 =new Layer();
              Layer layer2 =new Layer();
                   Layer layer3 =new Layer();
        for(int i=0;i<layer1.shape.size();i++)
        {
            if(!(layer1.shape.get(i) instanceof Circle)) layer1.shape.remove(i);
        }
         for(int i=0;i<layer2.shape.size();i++)
        {
            if(!(layer2.shape.get(i) instanceof Triangle)) layer2.shape.remove(i);
        }
          for(int i=0;i<layer3.shape.size();i++)
        {
            if(!(layer3.shape.get(i) instanceof Rectangle)) layer3.shape.remove(i);
        }
          layer.add(layer1);
            layer.add(layer2);
              layer.add(layer3);
     }
}