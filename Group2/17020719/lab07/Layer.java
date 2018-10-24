import java.util.ArrayList;
import java.util.Collection;

public class Layer extends ArrayList<Shape>{
    ArrayList<Shape> shapes = new ArrayList<Shape>();

    protected int index;
    protected boolean visible;

    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isVisible(){
        return visible;
    }
    public void setVisible(boolean visible){
        this.visible = visible;
    }

    public Layer(){
    }

    public Layer(Collection<? extends Shape> c) {
        super(c);
    }
//    public Layer(){
//        shapes = new ArrayList<Shape>();
//    }

    public Layer(boolean visible){
        this.visible = visible;
    }

    public boolean deleteAllTriangle(){
        for(int i = 0; i < shapes.size(); i++){
            if(shapes.get(i) instanceof Triangle) {
                shapes.remove(i);
            }
        }
        for(int i = 0; i < shapes.size(); i++){
            if(shapes.get(i) instanceof Triangle) {
                System.out.println("Still have Triangle");
                return false;
            }
        }
        return true;
    }

    public boolean deleteAllCircle(){
        for(int i = 0; i < shapes.size(); i++){
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(i);
            }
        }
        for(int i = 0; i < shapes.size(); i++){
            if(shapes.get(i) instanceof Circle){
                System.out.println("Still have circle");
                return false;
            }
        }
        return true;
    }

    public void deleteSameObjectInSameLayer(){
        for(int i = 0; i < shapes.size() - 1; i++){
            for(int j = i+1; j < shapes.size(); j++){
                if((shapes.get(j) instanceof Circle) && (shapes.get(i) instanceof Circle)){
                    if((shapes.get(j)).point == (shapes.get(i)).point){
                        if(((Circle)shapes.get(j)).radius == ((Circle)shapes.get(i)).radius){
                            shapes.remove(j);
                        }
                    }
                }
                if((shapes.get(j) instanceof Rectangle) && (shapes.get(i) instanceof Rectangle)){
                    if((shapes.get(j)).point == (shapes.get(i)).point){
                        if(((Rectangle)shapes.get(j)).width == ((Rectangle)shapes.get(i)).width){
                            if(((Rectangle)shapes.get(j)).length == ((Rectangle)shapes.get(i)).length){
                                shapes.remove(j);
                            }
                        }
                    }
                }
                if((shapes.get(j) instanceof Triangle) && (shapes.get(i) instanceof Triangle)){
                    if(((Triangle)shapes.get(j)).points == ((Triangle)shapes.get(i)).points){
                        shapes.remove(j);
                    }
                }
                if((shapes.get(j) instanceof Hexagon) && (shapes.get(i) instanceof Hexagon)){
                    if(((Hexagon)shapes.get(j)).points == ((Hexagon)shapes.get(i)).points){
                        shapes.remove(j);
                    }
                }
            }
        }
    }
}
