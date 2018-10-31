/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_lap07;

import java.util.Vector;

/**
 *
 * @author Nguyễn Thái
 */
public class Diagram extends   Vector<Layer>{
    public Diagram() {
        super(0);
    }

    public Diagram(int dia) {
        super(0);
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
    public void chuyenhinh(){
        Layer[] layer = new Layer[5];
        for(int j = 0;j < 5;j ++)
            layer[j] = new Layer();
      
        for(int j = 0;j < this.size();j ++)
            for(int k = 0;k < this.elementAt(j).size();k ++){
                if(this.elementAt(j).elementAt(k) instanceof Circle)
                    layer[0].add(this.elementAt(j).elementAt(k));
                else if(this.elementAt(j).elementAt(k) instanceof Square)
                    layer[1].add(this.elementAt(j).elementAt(k));
                else if(this.elementAt(j).elementAt(k) instanceof Rectangle)
                    layer[2].add(this.elementAt(j).elementAt(k));
                else if(this.elementAt(j).elementAt(k) instanceof Triangle)
                    layer[3].add(this.elementAt(j).elementAt(k));
                else if(this.elementAt(j).elementAt(k) instanceof Hexagon)
                    layer[4].add(this.elementAt(j).elementAt(k));
            }
        this.clear();
        for(int j = 0;j < 5;j ++)
            if(layer[j].size() != 0)
                this.add(layer[j]);
    }
}
