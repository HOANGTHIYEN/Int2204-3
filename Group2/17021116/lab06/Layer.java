/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.util.ArrayList;

/**
 *
 * @author CCNE
 */
public class Layer {
    private ArrayList<Shape> shape = new ArrayList<>();

    public ArrayList<Shape> getShape() {
        return shape;
    }

    public void setShape(ArrayList<Shape> sha) {
        this.shape = sha;
    }
    
    
    public void delete() {
        for(int i= getShape().size() -1 ; i >=0;i--){
            if(getShape().get(i) instanceof Triangle ){
                getShape().remove(i);
              }
        }
    }

   
    
}
