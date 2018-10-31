package ui;

import javax.swing.*;
import java.awt.*;

public class ShapePane extends JPanel {
    Polygon polygonCircle;
    Polygon polygonRactangle;
    Polygon polygonSquare;
    Polygon polygonTriangle;

    public ShapePane() {
        int[] recXp = new int[] { 350, 450, 450, 350 };
        int[] recYp = new int[] { 200, 200, 250, 250 };
        polygonRactangle = new Polygon(recXp, recYp, 4);

        polygonTriangle = new Polygon(new int[]{50,100,0}, new int[] {0,100,100}, 3);

        int[] squXp = new int[] { 150, 250, 250, 150 };
        int[] squYp = new int[] { 150, 150, 250, 250 };

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
        graphics2DTri.setColor(Color.RED);
        Graphics2D graphics2DRec = (Graphics2D) graphics.create();
        graphics2DRec.setColor(Color.GREEN);
        Graphics2D graphics2DSqu = (Graphics2D) graphics.create();
        graphics2DSqu.setColor(Color.BLUE);

        graphics2DTri.fill(polygonTriangle);
        graphics2DRec.fill(polygonRactangle);
        graphics2DSqu.fill(polygonSquare);
    }
}
