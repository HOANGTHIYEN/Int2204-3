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


public class Layer<Shape> extends ArrayList<Shape>{
   protected  boolean visible; 
     public Layer() {
    }
     public Layer(Collection<? extends Shape> c) {
        super(c);
    }
     public Layer(boolean visible) {
        this.visible = visible;
    }
     public boolean isVisible() {
        return visible;
    }
     public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
    public void deleteTriangle   (){
        for (int i=0;i<this.size();i++) {
            if (this.get(i) instanceof Triangle ) {
                this.remove(this.get(i));
            }
        }
    }
    public void deleteSame(){
        for (int i=0;i<this.size()-1;i++){
            for (int j=i+1;j<this.size();j++){
                if (this.get(i) instanceof Circle ){
                    if (this.get(j) instanceof Circle ){
                        
                        if (((Circle )this.get(i)).tam==((Circle )this.get(j)).tam)
                        {
                            
                            if (((Circle )this.get(i)).radius==((Circle )this.get(j)).radius){
                                this.remove(j);
                                j--;
                            }
                        }
                    }
                }
                if (this.get(i) instanceof Triangle ){
                    if (this.get(j) instanceof Triangle ) 
                    {
                        if (((Triangle )this.get(i)).point==((Triangle )this.get(j)).point) 
                        {
                            this.remove(j);
                            j--;
                        }
                    }
                }
                if (this.get(i) instanceof Rectangle ){
                    if (this.get(j) instanceof Rectangle )
                    {
                        if (((Rectangle )this.get(i)).tam==((Rectangle )this.get(j)).tam) 
                        {
                            if (((Rectangle )this.get(i)).chieurong==((Rectangle )this.get(j)).chieurong){
                                if (((Rectangle )this.get(i)).chieudai ==((Rectangle )this.get(j)).chieudai){
                                    this.remove(j);
                                    j--;
                                }
                            }
                        }
                    }
                }
                if (this.get(i) instanceof Hexagon){
                    if (this.get(j) instanceof Hexagon ){
                        if (((Hexagon )this.get(i)).point==((Hexagon )this.get(j)).point){
                            this.remove(j);
                            j--;
                        }
                    }
                }
             }
        }
    }

    void deleteSame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
