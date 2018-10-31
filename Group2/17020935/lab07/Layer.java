/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.ArrayList;


/**
 *
 * @author admin
 */
public class Layer extends ArrayList<Shape>{
    private ArrayList<Shape> shape = new ArrayList<>();
    private boolean visible;
    
    public void setShapes(ArrayList<Shape> s){
        this.shape = s; 
    }
    public ArrayList<Shape> getShapes(){
        return this.shape;
    }
    public void setVisible(boolean i){
        this.visible = i;
    }
    public boolean getVisible(){
        return this.visible;
    }
    public void removeCircle(){
        for(int i=shape.size()-1; i>=0;i--){
            if(shape.get(i) instanceof Circle){
                shape.remove(i);
            }
        }
    }
}