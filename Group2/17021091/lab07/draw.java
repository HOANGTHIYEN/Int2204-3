/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Genius
 */
//lop de ve cac doi tuong trong layer
public class draw extends Canvas{  
      Layer l = new Layer();

    public Layer getL() {
        return l;
    }

    public void setL(Layer l) {
        this.l = l;
    }
      
      @Override//ve cac doi tuong Layer
    public void paint(Graphics g) {
        this.setBackground(Color.WHITE);
        if(l.isVisiable())
        for(int j = 0;j < l.size();j ++){
            if(l.elementAt(j) instanceof Cricle){
                Cricle c = (Cricle) l.elementAt(j);
                int x = (int) c.getCenter().getX();
                int y = (int) c.getCenter().getY();
                int r = (int) (c.getRadius());
                g.setColor(c.getCl());
                g.fillArc(x, y, r, r, 0, 360);
            }
            else if(!(l.elementAt(j) instanceof Square)
            && l.elementAt(j) instanceof Rectangle){
                Rectangle c = (Rectangle) l.elementAt(j);
                int x = (int)(c.getCenter().getX() - c.getWidth()/2);
                int y = (int)(c.getCenter().getY() - c.getLength()/2);
                int w = (int)c.getWidth();
                int le = (int)c.getLength();
                g.setColor(c.getCl());
                g.fillRect(x, y, w, le);
            }
            else if(l.elementAt(j) instanceof Square){
                Square c = (Square) l.elementAt(j);
                int x = (int)(c.getCenter().getX() - c.getSide()/2);
                int y = (int)(c.getCenter().getY() - c.getSide()/2);
                int w = (int)c.getSide();
                g.setColor(c.getCl());
                g.fillRect(x, y, w, w);
            }
            else if(l.elementAt(j) instanceof Triangle){
                Triangle c = (Triangle) l.elementAt(j);
                coordinates[] xy = c.getXy();
                int[] x = new int[3];
                int[] y = new int[3];
                for(int k = 0;k < 3;k ++){
                    x[k] = (int) xy[k].getX();
                    y[k] = (int) xy[k].getY();
                }
                g.setColor(c.getCl());
                g.fillPolygon(x, y, 3);
            }
            else if(l.elementAt(j) instanceof Hexagon){
                Hexagon c = (Hexagon) l.elementAt(j);
                coordinates[] xy = c.getXy();
                int[] x = new int[6];
                int[] y = new int[6];
                for(int k = 0;k < 6;k ++){
                    x[k] = (int) xy[k].getX();
                    y[k] = (int) xy[k].getY();
                }
                g.setColor(c.getCl());
                g.fillPolygon(x, y, 6);
            }
        }
    }
}
