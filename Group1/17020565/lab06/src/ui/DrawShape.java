package ui;

import diagram.Position;
import diagram.layer.shape.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawShape extends JPanel {
    private Shape shape;
    private Polygon polygon;

    public DrawShape(Shape shape) {
        changeShape(shape);
    }

    private void changeShape(Shape shape){
        this.shape = shape;
        ArrayList<Integer> listPosX = new ArrayList<>();
        ArrayList<Integer> listPosY = new ArrayList<>();
        for(Position position : shape.pos){
            listPosX.add(position.posX);
            listPosY.add(position.posY);
        }
        int[] arrayX = DrawShape.convertIntegers(listPosX);
        int[] arrayY = DrawShape.convertIntegers(listPosY);
        polygon = new Polygon(arrayX, arrayY, arrayX.length);
    }

    @Override
    public  Dimension getPreferredSize(){
        return new Dimension(400,400);
    }

    @Override
    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics.create();
        graphics2D.setColor(shape.getColor());
        graphics2D.fill(polygon);
    }

    public static int[] convertIntegers(ArrayList<Integer> integers)
    {
        int[] ret = new int[integers.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }
}
