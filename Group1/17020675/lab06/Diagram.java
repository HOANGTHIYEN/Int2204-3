
public class Diagram {
    Layer layer  = new Layer();
    public void removeCircle(){
        for (int i=0; i<layer.listShape.size();i++){
            if( layer.listShape.get(i) instanceof Circle){
                layer.listShape.remove(layer.listShape.get(i));
                i--;
            }
        }
    }
}
