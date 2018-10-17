package Lab06;

import java.util.Vector;

class Diagram extends Vector<Layer> {
    public Diagram() {
        super(0);
    }
    public Diagram(int initialCapacity) {
        super(initialCapacity);
    }
    public void eraseCricle(){
        for(int j = this.size()-1;j >=0 ;j --){
            for(int k = this.elementAt(j).size()-1;k>=0 ;k--)
                if(this.elementAt(j).elementAt(k) instanceof Circle ){
                    this.elementAt(j).remove(k);
                }
        }
    }

}