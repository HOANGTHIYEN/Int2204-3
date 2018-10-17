/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author nguyen ngoc gioi
 */
public class Diagram {
    
    /**
     * @param args the command line arguments
     */
    protected List<Layer> listLayer;
    public Diagram() {
        this.listLayer = new ArrayList<>();
    }
    public void addLayer(Layer layer) {
        this.listLayer.add(layer);
    }
    public void removeAllCircle() {
        for (int i = 0; i < listLayer.size(); i++) {
            
            this.listLayer.get(i).removeAllCircle();
        }
    }

    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Layer layer = new Layer("Layer");
      
        Diagram diagram = new Diagram();        
        Shape circle;
        circle = new Circle(false, "blue", true, 1.0, new Diem(1.0, 1.0));
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();       
        Shape square = new Square();
        layer.addShape(circle);
        layer.addShape(rectangle);
        layer.addShape(square);
        layer.addShape(triangle);
        layer.showAllShapes();
        System.out.println("---------------------------");
        layer.removeAllTriangle();
        diagram.addLayer(layer);
        diagram.removeAllCircle();
        layer.showAllShapes();
    }
    
}
