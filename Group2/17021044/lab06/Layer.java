
package lab06;

import java.util.Vector;

public class Layer extends Vector<Shape> {
    boolean visible;

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    public void deleteTriagle (){
        for (int i=0;i<this.size();i++){
            if (this.elementAt(i) instanceof Triagle){
                this.remove(i);
            }
        }
    }
    
}
