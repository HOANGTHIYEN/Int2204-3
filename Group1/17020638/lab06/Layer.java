/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

import java.util.ArrayList;

/**
 *
 * @author Dzung Xuan
 */
public class Layer {
    public ArrayList<Shape> shape;
    public Layer(){
        shape = new ArrayList<>();
    }
    
    public void del_Triangle(){
        for(int i = 0; i < shape.size(); i++){
            if(shape.get(i) instanceof Triangle) shape.remove(i);
        }
    }
}
