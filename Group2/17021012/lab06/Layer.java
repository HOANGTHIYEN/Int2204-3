package bai_tap_lap06;

import java.util.Vector;

public class Layer extends Vector<Shape>{
	public Layer(int initialCapacity) {
        super(initialCapacity);
    }

    public Layer() {
        super();
    }
    public void eraseTriangle(){
        for(int j = 0;j < this.size();j ++)
            if(this.elementAt(j) instanceof Triangle){
                this.remove(j);
                j--;
            }
    }
}

