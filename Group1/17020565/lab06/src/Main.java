import diagram.Diagram;
import diagram.Position;
import diagram.layer.Layer;
import diagram.layer.shape.Circle;
import diagram.layer.shape.Rectangle;
import diagram.layer.shape.Square;
import diagram.layer.shape.Triangle;
import ui.DrawShape;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Position[]{
                new Position(0,0),
                new Position(200,0),
                new Position(200,200),
                new Position(0,200)
        }, Color.BLUE, false);

        Layer layer = new Layer();
        Square square = new Square(new Position[]{
                new Position(0,0),
                new Position(400,0),
                new Position(400,200),
                new Position(0,200)
        }, Color.BLUE, false);
        Triangle triangle = new Triangle(
                new Position[]{
                        new Position(50,0),
                        new Position(100,100),
                        new Position(0,100),
                }, Color.RED, false
        );
        layer.addShape(rectangle);
        layer.addShape(square);
        layer.addShape(triangle);
//        layer.removeAllTriangle();
        Diagram diagram = new Diagram();
        diagram.addShape(layer);
        diagram.removeAllCircle();
        diagram.printAll();




    }
}
