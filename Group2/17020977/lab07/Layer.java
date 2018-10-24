package lap_06;
import java.util.ArrayList;
import java.util.Collection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Layer<Shape> extends ArrayList<Shape>{
    boolean visible; 

    public Layer() {
    }

    public Layer(Collection<? extends Shape> c) {
        super(c);
    }

    public Layer(boolean visible) {
        this.visible = visible;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
    public void deleteTriangleObject (){
        for (int i=0;i<this.size();i++) {
            if (this.get(i) instanceof TriangleObject) {
                this.remove(this.get(i));
            }
        }
    }
    public void removeDuplicateObject(){
        for (int i=0;i<this.size()-1;i++){
            for (int j=i+1;j<this.size();j++){
                if (this.get(i) instanceof CircleObject){
                    if (this.get(j) instanceof CircleObject){
                        if (((CircleObject)this.get(i)).center==((CircleObject)this.get(j)).center){
                            if (((CircleObject)this.get(i)).radius==((CircleObject)this.get(j)).radius){
                                this.remove(j);
                                j--;
                            }
                        }
                    }
                }
                if (this.get(i) instanceof TriangleObject){
                    if (this.get(j) instanceof TriangleObject){
                        if (((TriangleObject)this.get(i)).top==((TriangleObject)this.get(j)).top){
                            this.remove(j);
                            j--;
                        }
                    }
                }
                if (this.get(i) instanceof RectangleObject){
                    if (this.get(j) instanceof RectangleObject){
                        if (((RectangleObject)this.get(i)).center==((RectangleObject)this.get(j)).center){
                            if (((RectangleObject)this.get(i)).width==((RectangleObject)this.get(j)).width){
                                if (((RectangleObject)this.get(i)).length==((RectangleObject)this.get(j)).length){
                                    this.remove(j);
                                    j--;
                                }
                            }
                        }
                    }
                }
                if (this.get(i) instanceof HexagonObject){
                    if (this.get(j) instanceof HexagonObject){
                        if (((HexagonObject)this.get(i)).top==((HexagonObject)this.get(j)).top){
                            this.remove(j);
                            j--;
                        }
                    }
                }

            }
        }
    }
}
