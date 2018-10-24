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
        Layer layer2 = new Layer();

        Rectangle rectangle1 = new Rectangle(Color.cyan, true, 10, 5, 0, 50, 100, 100);
        Square square1 = new Square(Color.RED, true, 5, 150, 50, 200, 200);
        Square square2 = new Square(Color.GREEN, true, 3, 250,150,300,300);
        Circle circle1 = new Circle(Color.ORANGE, true, 4, 300, 50);
        Circle circle2 = new Circle(Color.RED, true, 7, 400, 100);
        Circle circle3 = new Circle(Color.BLUE, true, 3, 400, 200);
        Triangle triangle1 = new Triangle(Color.GREEN, true, 6, 6, 6, 400, 0, 450, 90, 500, 0);

        layer1.addShape(rectangle1);
        layer1.addShape(circle2);
        layer1.addShape(square2);
        layer1.addShape(circle1);

        layer1.addShape(circle3);
        layer2.addShape(square1);
        layer2.addShape(triangle1);

        Diagram diagram = new Diagram();
        diagram.addLayer(layer1);
        diagram.addLayer(layer2);
        System.out.println("Before: ");
        diagram.printAll();


        diagram.phanLoai();
        diagram.removeAllCircle();
        diagram.removeAllTriangle();
        System.out.println("After: ");
        diagram.printAll();

    }

}