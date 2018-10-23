/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author admin
 */
public class Diagram extends JPanel{
    private ArrayList<Layer> layer = new ArrayList<>();
    
    public ArrayList<Layer> getLayer() {
        return layer;
    }

    public void setLayer(ArrayList<Layer> layer) {
        this.layer = layer;
    }
    public void removeTriangle(){
       
        for(int i=layer.size()-1; i>=0;i--){
            for(int j =layer.get(i).getList().size()-1; j>=0;j--){
                if(layer.get(i).getList().get(j) instanceof Triangle){
                    layer.get(i).getList().remove(i);
                }
            
            }
        }
    }
    public void sort(){
        Diagram d = new Diagram();
        Layer layer_circle = new Layer();
        Layer layer_triangle = new Layer();
        Layer layer_rectangle = new Layer();
        for (int j=0;j<layer.size();j++) {
            ArrayList<Shape> element = layer.get(j);
             for (int i=0;i<element.size();i++){
                 if (element.get(i) instanceof Circle)
                     layer_circle.add(element.get(i));
                 if (element.get(i) instanceof Triangle)
                     layer_triangle.add(element.get(i));
                 if (element.get(i) instanceof Rectangle)
                     layer_rectangle.add(element.get(i));
             }
             this.remove(j);
        }
        layer.add(layer_circle);
        layer.add(layer_rectangle);
        layer.add(layer_triangle);
    }
    public void paintComponent(Graphics g) {
        Diagram d = new Diagram();
        
        Layer lay1 = new Layer();
        Layer lay2 = new Layer();
        Circle c = new Circle(100,"red",true,40,50);
        Triangle t = new Triangle(200,120,300,300,200,34,"blue",true,45,12);
        Rectangle r = new Rectangle(100,150,"red",true,400,34);
        Square s = new Square(150,"black",true,34,300);
        Hexagon h =new Hexagon(250,400,500,540,350,240,234,150,200,300,456,400,"green",true,56,78);
        lay1.getList().add(c);
        lay1.getList().add(t);
        lay1.getList().add(r);
        lay1.getList().add(s);
        
        lay1.setVsb(true);
        
        d.getLayer().add(lay1);
        
        
        super.paintComponent(g);
 
        if(lay1.getVsb()){
            
            if(c.isFilled()){
                g.setColor(Color.red);
                g.fillOval((int)c.getX(), (int)c.getY(), (int)c.getRadius(), (int)c.getRadius());
            }
            else g.drawOval((int)c.getX(), (int)c.getY(), (int)c.getRadius(), (int)c.getRadius());
            if(r.isFilled()){
                g.setColor(Color.blue);
                g.fillRect((int)r.getX(), (int)r.getY(), (int)r.getLength(), (int)r.getWidth());
            }
            else g.drawRect((int)r.getX(), (int)r.getY(), (int)r.getLength(), (int)r.getWidth());
            if(s.isFilled()){
                g.setColor(Color.black);
                g.fillRect((int)s.getX(), (int)s.getY(), (int)s.getLength(), (int)s.getWidth());
            }
            else g.fillRect((int)s.getX(), (int)s.getY(), (int)s.getLength(), (int)s.getWidth());
            if(t.isFilled()){
                g.setColor(Color.yellow);
                g.fillPolygon(t.getTX(), t.getTY(), 3);
            }
            else g.drawPolygon(t.getTX(), t.getTY(), 3);
            if(h.isFilled()){
                g.setColor(Color.green);
                g.fillPolygon(h.getHX(), h.getHY(), 6);
            }
            else g.drawPolygon(h.getHX(), h.getHY(), 6);
        }
   
     
   }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        JFrame frame = new JFrame();
        frame.setTitle("Lab7");
        frame.setSize(600, 600);
        frame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent e) {
            System.exit(0);
         }
        });
        Container contentPane = frame.getContentPane();
        contentPane.add(new Diagram());
        frame.setVisible(true);
    }
}
