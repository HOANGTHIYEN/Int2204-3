import Diagram.Diagram;
import Layer.Layer;

import Shape.Rectangle;
import Shape.Triangle;
import javax.swing.*;
import java.awt.*;
//import java.awt.*;

public class mainCLass{
    public static void main(String[] args) {
        Diagram diagram = new Diagram();
        Layer layer = new Layer();
        Rectangle rec = new Rectangle(0, 0, 0, 100, 100, 100, 100, 0, "blue");
        Rectangle recAfter = new Rectangle(100,0,200,0,200,100,100,100,"red");
        Triangle tri = new Triangle(0,0,400,300,0,300,"blue");
        layer.addToLayer(tri);
        layer.addToLayer(rec);
        layer.addToLayer(recAfter);
        diagram.addToDiagram(layer);
        diagram.deleteAllTriangle();
        diagram.drawAll();
    }
}
