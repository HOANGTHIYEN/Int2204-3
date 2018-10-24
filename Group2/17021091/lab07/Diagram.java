/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.util.Arrays;
import java.util.Vector;

/**
 *
 * @author Genius
 */

@SuppressWarnings("serial")
class Diagram extends Vector<Layer>{

    public Diagram() {
        super(0);
    }

    public Diagram(int initialCapacity) {
        super(initialCapacity);
    }
    //ham xoa hinh tron
    public void eraseCricle(){
        for(int j = 0;j < this.size();j ++){
            for(int k = 0;k < this.elementAt(j).size();k ++)
                if(this.elementAt(j).elementAt(k) instanceof Cricle){
                    this.elementAt(j).remove(k);
                    k --;
                }
        }
    }
    //ham dich chuyen cac hinh ve tung layer
    public void transition(){
        Layer[] t = new Layer[5];
        for(int j = 0;j < 5;j ++)
            t[j] = new Layer();
        if(t[0] == null) System.out.println("null");
        for(int j = 0;j < this.size();j ++)
            for(int k = 0;k < this.elementAt(j).size();k ++){
                if(this.elementAt(j).elementAt(k) instanceof Cricle)
                    t[0].add(this.elementAt(j).elementAt(k));
                else if(this.elementAt(j).elementAt(k) instanceof Square)
                    t[1].add(this.elementAt(j).elementAt(k));
                else if(this.elementAt(j).elementAt(k) instanceof Rectangle)
                    t[2].add(this.elementAt(j).elementAt(k));
                else if(this.elementAt(j).elementAt(k) instanceof Triangle)
                    t[3].add(this.elementAt(j).elementAt(k));
                else if(this.elementAt(j).elementAt(k) instanceof Hexagon)
                    t[4].add(this.elementAt(j).elementAt(k));
            }
        this.clear();
        for(int j = 0;j < 5;j ++)
            if(t[j].size() != 0)
                this.add(t[j]);
    }
}
