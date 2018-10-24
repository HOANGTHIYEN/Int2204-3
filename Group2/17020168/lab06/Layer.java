package lab06;

import java.util.Vector;

class Layer extends Vector<Shape> {

    public Layer() {
        super(0);
    }
    public void eraseTriangle(){
        for(int j = this.size()-1;j >=0 ;j--)
            if(this.elementAt(j) instanceof Triangle){
                this.remove(j);
            }
    }
}