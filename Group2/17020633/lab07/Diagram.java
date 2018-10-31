/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

/**
 *
 * @author Dell
 */

import java.util.ArrayList;
import java.util.Collection;


ppublic class Diagram<Shape> extends ArrayList<ArrayList<Shape>>{
     public Diagram() {
    }
     public Diagram(Collection<? extends ArrayList<Shape>> c) {
        super(c);
    }
    
    public void deleteCircle (){
        for (int j=0;j<this.size();j++) {
            ArrayList<Shape> element = this.get(j);
             for (int i=0;i<element.size();i++){
                 if (element.get(i) instanceof Circle){
                     element.remove(i);
                     i--;
                 }
                 
             }
        }
    }
    public void sortObject(){
        Layer layer_circle  = new Layer();
        Layer layer_triangle  = new Layer();
        Layer layer_rectangle  = new Layer();
        for (int j=0;j<this.size();j++) {
            ArrayList<Shape> element = this.get(j);
             for (int i=0;i<element.size();i++){
                 if (element.get(i) instanceof Circle )
                     layer_circle .add(element.get(i));
                 if (element.get(i) instanceof Triangle )
                     layer_triangle.add(element.get(i));
                 if (element.get(i) instanceof Rectangle )
                     layer_rectangle .add(element.get(i));
             }
             this.remove(j);
        }
        this.add(layer_circle );
        this.add(layer_rectangle );
        this.add(layer_triangle );
    }
 }