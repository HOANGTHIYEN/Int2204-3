package lap6;

import java.util.Vector;

@SuppressWarnings("serial")
class Diagram extends Vector<Layer> {

    public Diagram() {
        super(0);
    }

    public Diagram(int initialCapacity) {
        super(initialCapacity);
    }
    public void removeCricle(){
        for(int j = 0;j < this.size();j ++){
            for(int k = 0;k < this.elementAt(j).size();k ++)
                if(this.elementAt(j).elementAt(k) instanceof Cricle){
                    this.elementAt(j).remove(k);
                    k --;
                }
        }
    }
}
