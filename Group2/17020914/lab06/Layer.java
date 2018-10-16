/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.List;

/**
 *
 * @author admin
 */
public class Layer {
    List<Shape> l = null;
    
    public void removeCircle(){
        for(int i=l.size(); i>=0;i--){
            if(l.get(i) instanceof Circle){
                l.remove(i);
            }
        }
    }
}
