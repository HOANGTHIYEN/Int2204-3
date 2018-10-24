package lab06;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hoangson
 */
public class Diagram<Shape> extends ArrayList<ArrayList<Shape>>{

    public Diagram() {
    }
    
    public void deleteCircleObject (){
        for (ArrayList<Shape> element : this) {
             for (int i=0;i<element.size();i++){
                 if (element.get(i) instanceof CircleObject){
                     element.remove(i);
                     i--;
                 }
                 
             }
        }
    }

}
