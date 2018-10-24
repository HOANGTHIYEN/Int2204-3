package Shape;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Field;

public class DrawShape extends JPanel{
        private Shape newShape;
        private Polygon polygon;

        public DrawShape(Shape shape) {
            changeShape(shape);
        }

        private void changeShape(Shape shape){
            this.newShape = shape;
            int length = newShape.listPoint.size();
            int listOx[] = new int[length];
            int listOy[] = new int[length];
            for(int i=0 ; i< length; i++) {
                listOx[i] = newShape.listPoint.get(i).getOx();
                listOy[i] = newShape.listPoint.get(i).getOy();
            }
            polygon = new Polygon(listOx, listOy, length);
        }

        @Override
        public  Dimension getPreferredSize(){
            return new Dimension(400,400);
        }

        @Override
        public void paintComponent(Graphics graphics){
            Color color;
            try {
                Field field = Class.forName("java.awt.Color").getField(newShape.getColor());
                color = (Color)field.get(null);
            } catch (Exception e) {
                color = null; // Not defined
            }
            super.paintComponent(graphics);
            Graphics2D graphics2D = (Graphics2D) graphics.create();
            graphics2D.setColor(color);
            graphics2D.fill(polygon);
        }
    }
