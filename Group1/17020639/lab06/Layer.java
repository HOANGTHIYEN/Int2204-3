
package Javaapllication4;

import java.util.ArrayList;

public class Layer {
    public ArrayList<Shape> shape=new ArrayList<Shape>();
    
    public void DeleteTriangle()
    {
        for(int i=0;i<shape.size();i++)
        {
            if(shape.get(i)instanceof Triangle){shape.remove(i);}
        }
    }
     public void deleteCircle(){
        for(int i = 0; i < shape.size(); ++i){
            if(shape.get(i)instanceof Circle){shape.remove(i);}
        }
    }
    public void addShape(Shape s)
    {
        this.shape.add(s);
    }
    public void printShape()
    {
         for(int i=0;i<shape.size();i++)
        {
            System.out.println(shape.get(i).toString());
        }
    }
}
