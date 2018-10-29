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
public class Layer extends Vector<Shape>{
    public Layer(int lay) {
        super();
    }
     public Layer() {
        super();
    }
     private boolean visiable;
     public boolean isVisiable() {
        return visiable;
     };
     public void setVisiable(boolean visiable) {
        this.visiable = visiable;
     }
    public void eraseTriangle(){
        for(int i = 0 ; i < this.size()  ; i ++)
            if(this.elementAt(i) instanceof Triangle){
                this.remove(i);
                i--;
            }
    };
    
     //xoa cac hinh giong nhau
    public void XoaGiongNhau(){
        for(int j = 0;j < this.size() - 1;j ++)
            for(int t = j + 1;t < this.size();t ++)
                if(this.elementAt(j).equals(this.elementAt(t))){
                    this.remove(t);
                    t --;
                }
    }
    
    
}
