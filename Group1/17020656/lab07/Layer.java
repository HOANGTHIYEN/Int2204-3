/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap7;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Layer {
    protected  ArrayList<Shape> Shape;
    protected boolean visible;

    public void setVisible(boolean visible) 
    {
        this.visible = visible;
    }
    public boolean isVisible() 
    {
        return visible;
    }
    public void addShape(Shape Shape){
        this.Shape.add(Shape);
    }
    
    public void deleteCircle()
    {
        for(int i=0; i<Shape.size(); i++)
        {
            if(Shape.get(i) instanceof Circle)
            {
                Shape.remove(i);
                i--;
            }
        }
    }
    
}
