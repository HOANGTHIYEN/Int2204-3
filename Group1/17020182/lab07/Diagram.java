package lab6;

import java.awt.Color;
import java.awt.Label;
import java.util.Vector;

class Diagram extends Vector<Layer>{
	private Vector<Layer> A1;

	public Vector<Layer> getA1() {
		return A1;
	}

	public void setA1(Vector<Layer> a1) {
		A1 = a1;
	}
	
    public Diagram() {
       super(0);
   }
    public Diagram(int initialCapacity) {
       super(initialCapacity);
   }
   public void eraseCricle(){
       for(int j = 0;j < this.size();j ++){
           for(int k = 0;k < this.elementAt(j).size();k ++)
               if(this.elementAt(j).elementAt(k) instanceof Circle ){
                   this.elementAt(j).remove(k);
                   k --;
               }
       }
   }
   public void eraseSameCricle(){
       for(int j = 0;j < this.size();j ++){
           for(int k = 0;k < this.elementAt(j).size();k ++)
               if(this.elementAt(j).elementAt(k) instanceof Circle ){
                   this.elementAt(j+1).remove(k+1);
                   k --;
               }
       }
   }
   
	

}
	
	

