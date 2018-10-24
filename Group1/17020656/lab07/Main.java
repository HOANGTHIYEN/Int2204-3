/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap7;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.GeneralPath;

import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Admin
 */
class paint extends JPanel{
    
    private void doDrawing(Graphics g) {
         
        Graphics2D graphic = (Graphics2D) g.create();
        graphic.setPaint(Color.RED);
        
        Triangle triangle = new Triangle(600,200,700,300,800,200);
        GeneralPath generalPath = new GeneralPath();
        
        generalPath.moveTo(triangle.x1, triangle.y1);
        generalPath.lineTo(triangle.x1, triangle.y1);
        generalPath.lineTo(triangle.x2, triangle.y2);
        generalPath.lineTo(triangle.x3, triangle.y3);
        generalPath.closePath();
        graphic.fill(generalPath);        
        graphic.dispose();
    }
 
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
         
        doDrawing(g);
    }
}
 
public class Main extends JFrame {
     
    public Main() {
 
        paintForFrame();
    }    
    private void paintForFrame() {
         
        add(new paint());
        setSize(1500, 700);
        setLocationRelativeTo(null);           
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
 
        EventQueue.invokeLater(()->{
                Main paint=new Main();
                paint.setVisible(true);
        });
    }    
}
