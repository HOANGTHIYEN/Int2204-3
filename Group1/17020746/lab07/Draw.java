package lb7;

import javax.swing.*;
import java.awt.*;

public class Draw extends JPanel {

    protected Rectangle rectangle;
    protected Square square;
    protected Circle circle;
    protected Triangle triangle;
    protected Hexagon hexagon;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Diagram diagrams = new Diagram();
        Layer layer = new Layer();

        diagrams.addLayer(layer);
        rectangle = new Rectangle(70, 90, 200, 300, Color.RED, true);
        square = new Square(60, 100, 300, Color.ORANGE, true);
        circle = new Circle(100, 150, 450, Color.GREEN, true);
        triangle = new Triangle(300, 200, 300, 300, 400, 300, 0, 0, Color.BLACK, true);
        hexagon = new Hexagon(550, 525, 475, 450, 475, 525, 500, 543, 543, 500, 457, 457, 800, 800, Color.BLUE, true);
        layer.addShapes(rectangle);
        layer.addShapes(square);
        layer.addShapes(circle);
        layer.addShapes(triangle);
        layer.addShapes(hexagon);
        layer.setVisible(true);


        for (int i = 0; i < layer.shapes.size(); i++) {
            if (layer.shapes.get(i).isFilled()) {
                if (layer.shapes.get(i) instanceof Circle) {
                    g.setColor(layer.shapes.get(i).color);
                    g.fillOval(layer.shapes.get(i).x, layer.shapes.get(i).y, (int) layer.shapes.get(i).getRadius(), (int) layer.shapes.get(i).getRadius());
                }

                if (layer.shapes.get(i) instanceof Rectangle) {
                    g.setColor(layer.shapes.get(i).color);
                    g.fillRect(layer.shapes.get(i).x, layer.shapes.get(i).y, (int) layer.shapes.get(i).getWidth(), (int) layer.shapes.get(i).getLength());
                }
                if (layer.shapes.get(i) instanceof Square) {
                    g.setColor(layer.shapes.get(i).color);
                    g.fillRect(layer.shapes.get(i).x, layer.shapes.get(i).y, (int) layer.shapes.get(i).getSide(), (int) layer.shapes.get(i).getSide());
                }
                if (layer.shapes.get(i) instanceof Triangle) {
                    g.setColor(layer.shapes.get(i).color);
                    g.fillPolygon(layer.shapes.get(i).getXT(), layer.shapes.get(i).getYT(), 3);

                }
                if (layer.shapes.get(i) instanceof Hexagon) {
                    g.setColor(layer.shapes.get(i).color);
                    g.fillPolygon(layer.shapes.get(i).getXH(), layer.shapes.get(i).getYH(), 6);

                }
            }
        }
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Shape");
        frame.setSize(900, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        Draw p = new Draw();
        frame.add(p);

        frame.setVisible(true);


    }
}



