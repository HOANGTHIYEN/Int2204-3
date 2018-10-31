/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

import java.util.Vector;

class Diagram extends Vector<Layer> {
    public Diagram() {
        super(0);
    }
    public Diagram(int initialCapacity) {
        super(initialCapacity);
    }
    public void eraseCricle(){
        for(int i = this.size()-1;i >=0 ;i --){
            for(int l = this.elementAt(i).size()-1;l>=0 ;l--)
                if(this.elementAt(i).elementAt(l) instanceof Circle ){
                    this.elementAt(i).remove(l);
                }
        }
    }

}