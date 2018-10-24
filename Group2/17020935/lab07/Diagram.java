/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author admin
 */
public class Diagram extends JPanel{
    private ArrayList<Layer> layers = new ArrayList<>();
    
    public void setLayer(ArrayList<Layer> layers) {
        this.layers = layers;
    }
    
    public ArrayList<Layer> getLayer() {
        return layers;
    }

   
    public void removeTriangle(){
       
        for(int i=layers.size()-1; i>=0;i--){
            for(int j =layers.get(i).getShapes().size()-1; j>=0;j--){
                if(layers.get(i).getShapes().get(j) instanceof Triangle){
                    layers.get(i).getShapes().remove(i);
                }
            
            }
        }
    }
    
    
    
    public void paint(Graphics g) {
        Diagram d = new Diagram();
        
        Layer lay1 = new Layer();
        Layer lay2 = new Layer();
        Circle c = new Circle(60,"blue",true,45,53);
        Triangle t = new Triangle(300,100,200,200,200,34,"green",true,40,20);
        Rectangle r = new Rectangle(200,130,"red",true,100,45);
        Square s = new Square(111,"red",true,34,300);
        Hexagon h =new Hexagon(250,400,500,540,350,240,234,150,200,300,456,400,"green",true,56,78);
        
        
        
        lay1.getShapes().add(c);
        lay1.getShapes().add(t);
        lay1.getShapes().add(r);
        lay1.getShapes().add(s);
        
        lay1.setVisible(true);
        
        d.getLayer().add(lay1);
        
        
        super.paint(g);
 
        if(lay1.getVisible()){
            
            if(c.isFilled()){
                g.setColor(Color.blue);
                g.fillOval((int)c.getX(), (int)c.getY(), (int)c.getRadius(), (int)c.getRadius());
            }
            else g.drawOval((int)c.getX(), (int)c.getY(), (int)c.getRadius(), (int)c.getRadius());
            if(r.isFilled()){
                g.setColor(Color.green);
                g.fillRect((int)r.getX(), (int)r.getY(), (int)r.getLength(), (int)r.getWidth());
            }
            else g.drawRect((int)r.getX(), (int)r.getY(), (int)r.getLength(), (int)r.getWidth());
            if(s.isFilled()){
                g.setColor(Color.red);
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
                g.fillPolygon(h.getHexagon_x(), h.getHexagon_y(), 6);
            }
            else g.drawPolygon(h.getHexagon_x(), h.getHexagon_y(), 6);
        }
   
     
   }
    
    
    
    public void sortLayer(){
        Diagram d = new Diagram();
        Layer layers_circle = new Layer();
        Layer layers_triangle = new Layer();
        Layer layers_rectangle = new Layer();
        
        
        
        for (int j=0;j<layers.size();j++) {
            ArrayList<Shape> element = layers.get(j);
             for (int i=0;i<element.size();i++){
                 if (element.get(i) instanceof Circle)
                     layers_circle.add(element.get(i));
                 if (element.get(i) instanceof Triangle)
                     layers_triangle.add(element.get(i));
                 if (element.get(i) instanceof Rectangle)
                     layers_rectangle.add(element.get(i));
             }
             this.remove(j);
        }
        layers.add(layers_circle);
        layers.add(layers_rectangle);
        layers.add(layers_triangle);
    }
    public static void main(String[] args) {
       
        
        JFrame frame = new JFrame();
        frame.setTitle("Lab7");
        frame.setSize(700, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        contentPane.add(new Diagram());
        frame.setVisible(true);
    }
}