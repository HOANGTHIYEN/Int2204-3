
package la6;




import java.util.ArrayList;

public class Layer {
     ArrayList<Shape> shape=new ArrayList<>();
      
 
    
    public void addShape(Shape s){
        this.shape.add(s);
    }
    
    public void deleteAllTriangle(){
        for(int i = 0; i < shape.size(); ++i){
            if(shape.get(i) instanceof Triangle){
                shape.remove(i);
                i--;
            }
        }
    }
     public void deleteAllCircle(){
        for(int i = 0; i < shape.size(); ++i){
            if(shape.get(i) instanceof Circle){
                shape.remove(i);
                i--;
            }
        }
    }
    
}