package ui;

import javax.swing.*;
import java.awt.*;

public class CirclePane extends JPanel {
    Polygon polygon;

    public CirclePane() {
        polygon = new Polygon(new int[]{50,100,0}, new int[] {0,100,100}, 3);
    }

    @Override
    public  Dimension getPreferredSize(){
        return new Dimension(400,400);
    }

    @Override
    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics.create();
        graphics2D.setColor(Color.RED);
        graphics2D.fill(polygon);
    }
}
