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
public class Diagram {

    public ArrayList<Layer> layer ;
    
    public Diagram(){
        layer = new ArrayList<>();
    }
    public void del_Circle(){
        for (Layer l : layer) {
            for(int i = 0; i < l.shape.size() ;i++ ){
                if(l.shape.get(i) instanceof Circle) l.shape.remove(i);
            }
        }
    }
    
    public void print(){
        for (Layer l : layer) {
            for(int i = 0; i < l.shape.size() ;i++ ){
                l.shape.get(i).show(true);
            }
        }
    }
    public static void main(String[] args) {
        Diagram diagram = new Diagram();
        Layer layer1 = new Layer();
            Shape circle1 = new Circle(2, "Red");
                circle1.setLocation(0, 0);
            Shape square1 = new Square(3, "Blue");
                square1.setLocation(1, 2);
            Shape triangle1 = new Triangle("nhọn", "Black");
                triangle1.setLocation(0, 3);
            layer1.shape.add(circle1);
            layer1.shape.add(square1);
            layer1.shape.add(triangle1);
        diagram.layer.add(layer1);
        diagram.print();
        System.out.println("\n\n");
        //diagram.del_Circle();
        //diagram.print();
        
        layer1.del_Triangle();
        diagram.print();
    }
    
}
