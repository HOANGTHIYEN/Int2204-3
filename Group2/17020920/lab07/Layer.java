package Lab07;

import java.util.ArrayList;

public class Layer extends ArrayList<Shape>{
    private ArrayList<Shape> shape = new ArrayList<>();
    private boolean visible;

    public void setList(ArrayList<Shape> s){
        this.shape = s;
    }
    public ArrayList<Shape> getList(){
        return this.shape;
    }
    public void setVsb(boolean i){
        this.visible = i;
    }
    public boolean getVsb(){
        return this.visible;
    }
    public void removeCircle(){
        for(int i=shape.size()-1; i>=0;i--){
            if(shape.get(i) instanceof Circle){
                shape.remove(i);
            }
        }
    }
}
