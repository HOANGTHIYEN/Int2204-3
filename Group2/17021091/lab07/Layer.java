/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.util.Vector;

/**
 *
 * @author Genius
 */
@SuppressWarnings("serial")
class Layer extends Vector <Shape>{

    private boolean visiable;

    public boolean isVisiable() {
        return visiable;
    }

    public void setVisiable(boolean visiable) {
        this.visiable = visiable;
    }
    
    public Layer(int initialCapacity) {
        super(initialCapacity);
    }

    public Layer() {
        super(0);
    }
    //xoa tam giac
    public void eraseTriangle(){
        for(int j = 0;j < this.size();j ++)
            if(this.elementAt(j) instanceof Triangle){
                this.remove(j);
                j --;
            }
    }
    //xoa cac hinh giong nhau
    public void eraseSame(){
        for(int j = 0;j < this.size() - 1;j ++)
            for(int k = j + 1;k < this.size();k ++)
                if(this.elementAt(j).equals(this.elementAt(k))){
                    this.remove(k);
                    k --;
                }
    }
}
