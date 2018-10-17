package lab06;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hoangson
 * @param <Shape>
 */
public class Layer<Shape> extends ArrayList<Shape>{

    public Layer() {
    }
    
    public void deleteTriangleObject (){
        for (Shape element : this) {
            if (element instanceof TriangleObject) {
                this.remove(element);
            }
        }
    }

}
