package ui;

import javax.swing.*;
import java.awt.*;

public class RectanglePane extends JPanel {
    Polygon polygon;

    public RectanglePane() {
        int[] recXp = new int[] { 0, 200, 200, 0 };
        int[] recYp = new int[] { 0, 0, 200, 200 };
        polygon = new Polygon(recXp, recYp, 4);
    }
    @Override
    public  Dimension getPreferredSize(){
        return new Dimension(1080,720);
    }

    @Override
    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics.create();
        graphics2D.setColor(Color.RED);
        graphics2D.fill(polygon);
    }
}
