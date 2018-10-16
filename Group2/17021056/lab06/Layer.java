/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài.lab06;

import java.util.Vector;

/**
 *
 * @author Administrator
 */
class Layer extends Vector<Shape> {

    public Layer(int initialCapacity) {
        super(initialCapacity);
    }

    public Layer() {
        super(0);
    }
    public void eraseTriangle(){
        for(int j = 0;j < this.size();j ++)
            if(this.elementAt(j) instanceof Triangle){
                this.remove(j);
                j--;
            }
    }
}

