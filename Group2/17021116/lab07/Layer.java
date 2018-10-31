/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;
import java.util.Collection;
import java.util.ArrayList;

/**
 *
 * @author 123456789
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
            if (this.get(i) instanceof Triangle) {
                this.remove(this.get(i));
            }
        }
    }
    public void deleteSameObject(){
        for (int i=0;i<this.size()-1;i++){
            for (int j=i+1;j<this.size();j++){
                if (this.get(i) instanceof Circle){
                    if (this.get(j) instanceof Circle){
                        if (((Circle)this.get(i)).center==((Circle)this.get(j)).center){
                            if (((Circle)this.get(i)).radius==((Circle)this.get(j)).radius){
                                this.remove(j);
                                j--;
                            }
                        }
                    }
                }
                if (this.get(i) instanceof Triangle){
                    if (this.get(j) instanceof Triangle){
                        if (((Triangle)this.get(i)).points==((Triangle)this.get(j)).points){
                            this.remove(j);
                            j--;
                        }
                    }
                }
                if (this.get(i) instanceof Rectangle){
                    if (this.get(j) instanceof Rectangle){
                        if (((Rectangle)this.get(i)).center==((Rectangle)this.get(j)).center){
                            if (((Rectangle)this.get(i)).width==((Rectangle)this.get(j)).width){
                                if (((Rectangle)this.get(i)).length==((Rectangle)this.get(j)).length){
                                    this.remove(j);
                                    j--;
                                }
                            }
                        }
                    }
                }
                if (this.get(i) instanceof Hexagon){
                    if (this.get(j) instanceof Hexagon){
                        if (((Hexagon)this.get(i)).points==((Hexagon)this.get(j)).points){
                            this.remove(j);
                            j--;
                        }
                    }
                }

            }
        }
    }
    
}
