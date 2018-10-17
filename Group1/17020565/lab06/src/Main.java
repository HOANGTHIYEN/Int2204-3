import diagram.Diagram;
import diagram.layer.Layer;
import diagram.layer.shape.Circle;
import diagram.layer.shape.Rectangle;
import diagram.layer.shape.Square;
import diagram.layer.shape.Triangle;
import ui.RectanglePane;
import ui.TestPane;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Layer layer = new Layer();
        Rectangle rectangle = new Rectangle(10,20);
        Rectangle rectangle2 = new Rectangle(10,20);
        Circle circle = new Circle(2);
        Square square = new Square(20);
        layer.addShape(rectangle);
        layer.addShape(rectangle2);
        layer.addShape(square);
        layer.addShape(circle);
//        System.out.println(layer.sizeOfList());
//        layer.removeAllTriangle();
//        System.out.println(layer.sizeOfList());
        Diagram diagram = new Diagram();
        diagram.addShape(layer);
        diagram.removeAllCircle();
        diagram.printAll();

//        JFrame jFrame = new JFrame();
//        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jFrame.setLayout(new BorderLayout());
//        jFrame.add(new TestPane());
//        jFrame.pack();
//        jFrame.setVisible(true);
    }
}
