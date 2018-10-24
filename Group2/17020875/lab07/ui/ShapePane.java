package ui;

import diagram.Diagram;
import diagram.layer.Layer;
import diagram.layer.shape.Circle;
import diagram.layer.shape.Rectangle;
import diagram.layer.shape.Square;
import diagram.layer.shape.Triangle;

import javax.swing.*;
import java.awt.*;

public class ShapePane extends JPanel {
    Polygon polygonCircle;
    Diagram diagram = new Diagram();
    Layer layer1 = new Layer();
    Layer layer2 = new Layer();

    protected  Polygon polygonRactangle;
    protected  Polygon polygonSquare;
    protected Polygon polygonTriangle;

    protected Rectangle rectangle1;
    protected Square square1;
    protected Circle circle1;
    protected Triangle triangle1;

    public ShapePane() {

        rectangle1 = new Rectangle(Color.cyan, true, 10, 5, 0, 50, 100, 100);
        square1 = new Square(Color.RED, true, 5, 150, 50, 200, 100);
        circle1 = new Circle(Color.ORANGE, true, 4, 300, 50);
        triangle1 = new Triangle(Color.GREEN, true, 6, 6, 6, 250, 200, 300, 300, 200, 300);
        layer1.addShape(rectangle1);
        layer1.addShape(square1);
        layer2.addShape(circle1);
        layer2.addShape(triangle1);
        //diagram.addLayer(layer);
        //diagram.phanLoai();


        int[] recXp = new int[] { rectangle1.getX1(), rectangle1.getX2(),rectangle1.getX2(), rectangle1.getX1()};
        int[] recYp = new int[] { rectangle1.getY1(), rectangle1.getY1(), rectangle1.getY2(), rectangle1.getY2() };
        polygonRactangle = new Polygon(recXp, recYp, 4);

        int[] trXp = new int[] {triangle1.getX1(),triangle1.getX2(),triangle1.getX3()};
        int[] trYp = new int[] {triangle1.getY1(),triangle1.getY2(),triangle1.getY3()};
        polygonTriangle = new Polygon(trXp, trYp, 3);

        int[] squXp = new int[] { square1.getX1(), square1.getX2(), square1.getX2(), square1.getX1() };
        int[] squYp = new int[] { square1.getY1(), square1.getY1(), square1.getY2(), square1.getY2() };
        polygonSquare = new Polygon(squXp, squYp, 4);


    }
    @Override
    public  Dimension getPreferredSize(){
        return new Dimension(700,500);
    }

    @Override
    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);

        Graphics2D graphics2DTri = (Graphics2D) graphics.create();
        graphics2DTri.setColor(triangle1.getColor());
        Graphics2D graphics2DRec = (Graphics2D) graphics.create();
        graphics2DRec.setColor(rectangle1.getColor());
        Graphics2D graphics2DSqu = (Graphics2D) graphics.create();
        graphics2DSqu.setColor(square1.getColor());


//        for(int i = 0; i < diagram.getListLayer().size(); i++)
//        {
//            diagram.getListLayer().get(i).setVisible(true);
//        }
        layer1.setVisible(true);
        layer2.setVisible(false);
        if(layer1.isVisible()) {
            graphics2DRec.fill(polygonRactangle);
            graphics2DSqu.fill(polygonSquare);
        }
        if(layer2.isVisible()) {
            graphics2DTri.fill(polygonTriangle);
        }


    }
}
