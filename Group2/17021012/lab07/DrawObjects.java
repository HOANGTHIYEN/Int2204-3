/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_lap07;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Nguyễn Thái
 */
public class DrawObjects {
    // ve cac doi tuong trong layer
public class draw extends Canvas{  
      Layer layer = new Layer();
     public Layer getL() {
        return layer;
    }
     public void setL(Layer layer) {
        this.layer = layer;
    }
      
      @Override
    public void paint(Graphics g) {
        this.setBackground(Color.WHITE);
 
        for(int j = 0;j < layer.size();j ++){
            if(layer.elementAt(j) instanceof Circle){
                Circle circle = (Circle) layer.elementAt(j);
                int x = (int) circle.getTd().getX();
                int y = (int) circle.getTd().getY();
                int r = (int) (circle.getRadius());
                g.fillArc(x, y, r, r, 0, 360);
            }
            else if(!(layer.elementAt(j) instanceof Square)
            && layer.elementAt(j) instanceof Rectangle){
                Rectangle retangle = (Rectangle) layer.elementAt(j);
                int x = (int)(retangle.getTd().getX() - retangle.getWidth()/2);
                int y = (int)(retangle.getTd().getY() - retangle.getLength()/2);
                int h = (int)retangle.getWidth();
                int k = (int)retangle.getLength();
                g.fillRect(x, y, h, k);
            }
            else if(layer.elementAt(j) instanceof Square){
                Square square= (Square) layer.elementAt(j);
                int x = (int)(square.getTd().getX() - square.getSide()/2);
                int y = (int)(square.getTd().getY() - square.getSide()/2);
                int w = (int)square.getSide();
                g.fillRect(x, y, w, w);
            }
            else if(layer.elementAt(j) instanceof Triangle){
                Triangle triangle = (Triangle) layer.elementAt(j);
                Toadodiem[] xy = triangle.getXy();
                int[] x = new int[3];
                int[] y = new int[3];
                for(int k = 0;k < 3;k ++){
                    x[k] = (int) xy[k].getX();
                    y[k] = (int) xy[k].getY();
                }
                g.fillPolygon(x, y, 13);
            }
            else if(layer.elementAt(j) instanceof Hexagon){
                Hexagon hexagon = (Hexagon) layer.elementAt(j);
                Toadodiem[] xy = hexagon.getXy();
                int[] x = new int[6];
                int[] y = new int[6];
                for(int k = 0;k < 6;k ++){
                    x[k] = (int) xy[k].getX();
                    y[k] = (int) xy[k].getY();
                }
                g.fillPolygon(x, y, 9);
            }
        }
    }
}
}
   
