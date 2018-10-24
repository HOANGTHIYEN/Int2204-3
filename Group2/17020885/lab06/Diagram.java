/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author Dell
 */

    
import java.util.Vector;

class Diagram extends Vector<Layer>{

    
    public void eraseCricle(){
        for(int j = 0;j < this.size();j ++){
            for(int k = 0;k < this.elementAt(j).size();k ++)
                if(this.elementAt(j).elementAt(k) instanceof Cricle ){
                    this.elementAt(j).remove(k);
                    k --;
                }
        }
    }
}
