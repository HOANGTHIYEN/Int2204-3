import java.util.ArrayList;

public class Layer {


    ArrayList<Shape> listShape = new ArrayList<Shape>();

    public void removeTriangle(){
        for(int i=0; i<listShape.size();i++){
            if(listShape.get(i) instanceof Triangle){
                listShape.remove(listShape.get(i));
                i--;
            }
        }
    }
    //1 2 3 4
    //1 3 4


}
