package bai_tap_lap06;

import java.util.Vector;

public class Diagram extends Vector<Layer>{
	public Diagram() {
        super();
    }

    public Diagram(int initialCapacity) {
        super(initialCapacity);
    }
    
    public void eraseCricle(){
        for(int j = 0;j < this.size();j ++){
            for(int k = 0 ;  k < this.elementAt(j).size();k ++)
                if(this.elementAt(j).elementAt(k) instanceof Circle ){
                    this.elementAt(j).remove(k);
                    k --;
                }
        }
    }
}

