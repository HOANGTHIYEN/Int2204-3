/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5b2;

/**
 *
 * @author CCNE
 */
import java.util.Vector;

public class Diagram extends Vector<Layer> {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void removeCircle (){
        for (int i=0;i<this.size();i++){
            for (int j=0;j<this.elementAt(i).size();j++)
            if (this.elementAt(i).elementAt(j) instanceof Circle){
                this.elementAt(i).remove(j);
                j--;
            }
        }
    }

}