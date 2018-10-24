/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5b2;

/**
 *
 * @author CCNE
 */
import java.util.Vector;

public class Layer extends Vector<Shape> {
    boolean visible;

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    public void removeTriagle (){
        for (int i=0;i<this.size();i++){
            if (this.elementAt(i) instanceof Triagle){
                this.remove(i);
            }
        }
    }
    
}