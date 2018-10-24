
package Javaapllication4;

import java.util.ArrayList;

public class Layer {
    public ArrayList<Shape> shape=new ArrayList<Shape>();
    public boolean visible;
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
    public void deleteDuplicateShape(){
        ArrayList<Shape> s = new ArrayList<>();
        for(Shape temp : shape){
            if(!s.contains(temp)){
                s.add(temp);
            }
        }
        shape = s;
    }
    
    public void printShape(){
        for (int i = 0; i < shape.size(); ++i){
            if (shape.get(i).visible)
                System.out.println(shape.get(i).toString());
        }
    }
}
