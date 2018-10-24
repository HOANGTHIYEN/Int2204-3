package lap6;

import java.util.Vector;

@SuppressWarnings("serial")
class Layer extends Vector <Shape> {

    public Layer(int initialCapacity) {
        super(initialCapacity);
    }

    public Layer() {
        super(0);
    }
    public void removeTriangle(){
        for(int j = 0;j < this.size();j ++)
            if(this.elementAt(j) instanceof Triangle){
                this.remove(j);
                j --;
            }
    }
}
