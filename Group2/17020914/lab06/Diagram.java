/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author admin
 */
public class Diagram extends Layer{
    public void removeTriangle(){
        for(int i=l.size(); i>=0;i--){
            if(l.get(i) instanceof Triangle){
                l.remove(i);
            }
        }
    }
}
