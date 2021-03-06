/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;
import java.util.ArrayList;


public class Layer{
    ArrayList<Shape> shape;

    public Layer() {
        shape = new ArrayList<>();
    }
    
    public void addShape(Shape s){
        this.shape.add(s);
    }
    
    public void deleteAllTriangle(){
        for(int i = 0; i < shape.size(); ++i){
            if(shape.get(i) instanceof Triangle){
                shape.remove(i);
                --i;
            }
        }
    }
    public void deleteCircle(){
        for(int i = 0; i < shape.size(); ++i){
            if(shape.get(i) instanceof Circle){
                shape.remove(i);
                --i;
            }
        }
    }
    public void printShape(){
        for (int i = 0; i < shape.size(); ++i){
                System.out.println(shape.get(i).toString());
        }
    }
   
}
