package lap6;
import javax.swing.*;
import java.awt.*;
import java.awt.Shape;
import java.awt.color.ColorSpace;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

import static javax.swing.text.StyleConstants.setBackground;
import static javax.swing.text.StyleConstants.setForeground;


public class Mainlap7 extends Canvas {
       public void paint  (Graphics g) {
           Layer layer = new Layer();
           int x[] = {30, 50, 30, 10};
           int y[] = {0, 20, 40, 20};
           int a[] = {70, 100, 80, 50};
           int b[] = {0, 30, 50, 20};
           layer.add(new Triangle());
           layer.add(new Rectangle(a, b));
           layer.add(new Cricle());
           layer.add(new Square(x, y));
           layer.add(new Hexagon());
           layer.add(new Cricle());
           layer.add(new Square(x, y));
           layer.add(new Hexagon());
           layer.get(4).dichuyen(200, "phai");
           layer.get(3).setColor(Color.GREEN);
           layer.removesame();
           Layer layer1 = new Layer();
           layer1.add(new Rectangle());
           layer1.add(new Cricle());
           layer1.add(new Square());
           layer1.add(new Hexagon());
           layer1.add(new Rectangle());
           layer1.add(new Cricle());
           layer1.add(new Square());
           layer1.get(0).setColor(Color.cyan);
           layer1.removesame();
           layer1.get(0).dichuyen(200,"duoi");
           Diagram diagram = new Diagram();
           diagram.add(layer);
           diagram.add(layer1);
           diagram.sort();
           for (int j = 0; j < diagram.size(); j++) {
               layer = diagram.get(j);
               //if(j==1) layer.setVisible(false);
               if (layer.visible) {
                   for (int i = 0; i < layer.size(); i++) {
                       if (layer.elementAt(i) instanceof Rectangle) {
                           if (layer.elementAt(i).filled) {
                               g.setColor(layer.elementAt(i).color);
                               g.fillPolygon(layer.elementAt(i).x, layer.elementAt(i).y, 4);

                           }
                       } else if (layer.elementAt(i) instanceof Triangle) {
                           Triangle triangle = (Triangle) layer.get(i);
                           if (triangle.filled) {
                               g.setColor(triangle.color);
                               g.fillPolygon(triangle.x, triangle.y, 3);
                           }
                       } else if (layer.elementAt(i) instanceof Cricle) {
                           Cricle cricle = (Cricle) layer.get(i);
                           if (cricle.filled) {
                               g.setColor(cricle.color);
                               g.fillOval(cricle.center.getX(), cricle.center.getY(), cricle.radius, cricle.radius);
                           }
                       } else if (layer.elementAt(i) instanceof Hexagon) {
                           Hexagon hexagon = (Hexagon) layer.get(i);
                           if (hexagon.filled) {
                               g.setColor(hexagon.color);
                               g.fillPolygon(hexagon.x, hexagon.y, hexagon.x.length);
                           }
                       }

                   }

               }
           }
       }

    public static void main(String[] args) {
        Mainlap6 m=new Mainlap6();
        JFrame f=new JFrame();
        f.add(m);
        f.setSize(400,400);
        //f.setLayout(null);
        f.setVisible(true);
    }
}

