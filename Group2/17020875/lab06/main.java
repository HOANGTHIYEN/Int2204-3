import diagram.Diagram;
import diagram.layer.Layer;
import diagram.layer.shape.Circle;
import diagram.layer.shape.Rectangle;
import diagram.layer.shape.Square;
import diagram.layer.shape.Triangle;

import java.awt.*;

public class main
{
    public static void main(String args[]) {
        Layer layer1 = new Layer();

        Rectangle rectangle1 = new Rectangle(Color.cyan, true, 10, 5, 0, 50, 100, 100);
        Square square1 = new Square(Color.RED, true, 5, 150, 50, 200, 200);
        Circle circle1 = new Circle(Color.ORANGE, true, 4, 300, 50);
        Triangle triangle1 = new Triangle(Color.GREEN, true, 6, 6, 6, 400, 0, 450, 90, 500, 0);
        layer1.addShape(rectangle1);
        layer1.addShape(square1);
        layer1.addShape(circle1);
        layer1.addShape(triangle1);

        Diagram diagram = new Diagram();
        diagram.addLayer(layer1);
        System.out.println("Before: ");
        diagram.printAll();

        diagram.removeAllCircle();
        diagram.removeAllTriangle();
        System.out.println("After: ");
        diagram.printAll();

    }

}