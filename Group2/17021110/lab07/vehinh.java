package lab072;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.BasicStroke; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Area;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
 
public class shapes extends JFrame {
 
    public shapes() {
        super("awt shapes");
 
        setSize(450, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
 
    void drawLines(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
 
        g2d.drawLine(120, 50, 123, 50);
        g2d.draw(new Line2D.Float(21.50f, 60.50f, 200.50f, 60.50f));      
 		g2d.draw(new Line2D.Float (25.90f, 60.50f, 200.50f, 100.50f));
 		
         //-----// DINH DANG DOAN THANG
 		float[] dash1 = {2f, 0f, 2f};
        float[] dash2 = {1f, 1f, 1f};
        float[] dash3 = {4f, 0f, 2f};
        float[] dash4 = {4f, 4f, 1f};
 
        BasicStroke bs1 = new BasicStroke(1, BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_ROUND, 1.0f, dash1, 2f);
 
        BasicStroke bs2 = new BasicStroke(1, BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_ROUND, 1.0f, dash2, 2f);
 
        BasicStroke bs3 = new BasicStroke(1, BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_ROUND, 1.0f, dash3, 2f);
 
        BasicStroke bs4 = new BasicStroke(1, BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_ROUND, 1.0f, dash4, 2f);

        g2d.setStroke(bs1);
        g2d.drawLine(20, 120, 200, 120);
 
        g2d.setStroke(bs2);
        g2d.drawLine(20, 140, 200, 140);
 
        g2d.setStroke(bs3);
        g2d.drawLine(20, 160, 200, 160);
 
        g2d.setStroke(bs4);
        g2d.drawLine(20, 180, 200, 180);
         //-----// CAP_BUTT, CAP_ROUND, CAP_SQUARE
        BasicStroke bs5 = new BasicStroke(8, BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_BEVEL);
        g2d.setStroke(bs5);
        g2d.drawLine(20, 200, 200, 200);
 
        BasicStroke bs6 = new BasicStroke(8, BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_BEVEL);
        g2d.setStroke(bs6);
        g2d.drawLine(20, 220, 200, 220);
 
        BasicStroke bs7 = new BasicStroke(8, BasicStroke.CAP_SQUARE,
                BasicStroke.JOIN_BEVEL);
        g2d.setStroke(bs7);
        g2d.drawLine(20, 240, 200, 240);
        //-------//JOIN_BEVEL, JOIN_MITER, JOIN_ROUND, DRAW RECT
        BasicStroke bs8 = new BasicStroke(8, BasicStroke.CAP_ROUND,
        BasicStroke.JOIN_BEVEL);
        g2d.setStroke(bs8);
        g2d.drawRect(220, 50, 100, 50);
 
        BasicStroke bs9 = new BasicStroke(8, BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_MITER);
        g2d.setStroke(bs9);
        g2d.drawRect(220, 110, 100, 50);
 
        BasicStroke bs10 = new BasicStroke(8, BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_ROUND);
        g2d.setStroke(bs10);
        g2d.drawRect(220, 170, 100, 50);
        //------//RECT, SQUARE, fillRoundRect, fillArc, fillOval
        g2d.setPaint(new Color(150, 150, 150));
        g2d.fillRect(30, 260, 50, 50);
        g2d.fillRect(120, 260, 90, 60);
        g2d.fillRoundRect(260, 260, 70, 60, 25, 25);
 
        g2d.fill(new Ellipse2D.Double(10, 335, 80, 100));
        g2d.fillArc(120, 335, 110, 100, 5, 150);
        g2d.fillOval(270, 335, 50, 50);
        //------// DA GIAC LOI
        double points[][] = { 
        { 0, 155+340 }, { 75, 145+340 }, { 100, 80+340 }, { 125, 145+340 }, 
        { 200, 155+340 }, { 150, 195+340 }, { 160, 600 }, { 100, 220+340 }, 
        { 40, 260+340 }, { 50, 195+340 }, { 0, 155+340 } };
        g2d.setPaint(Color.gray);
        g2d.translate(25, 5);
 
        GeneralPath star = new GeneralPath();
 
        star.moveTo(points[0][0], points[0][1]);
 
        for (int k = 1; k < points.length; k++)
            star.lineTo(points[k][0], points[k][1]);
 
        star.closePath();
        g2d.fill(star);    	
        //------//AREA
        g2d.setPaint(Color.RED);
         
        Area a1 = new Area(new Rectangle2D.Double(0, 610, 100, 100));
        Area a2 = new Area(new Ellipse2D.Double(30, 640, 100, 100));
         
        a1.subtract(a2);
        g2d.fill(a1);
         
        Area a3 = new Area(new Rectangle2D.Double(130, 610, 100, 100));
        Area a4 = new Area(new Ellipse2D.Double(130, 610, 100, 100));        
         
        a3.subtract(a4);
        g2d.fill(a3);
         
        Area a5 = new Area(new Rectangle2D.Double(260, 610, 100, 100));
        Area a6 = new Area(new Ellipse2D.Double(280, 630, 100, 100));        
         
        a5.add(a6);
        g2d.fill(a5);        
        //------//     
        g2d.setColor(new Color(255, 167, 116));
        g2d.fillRect(220, 420, 90, 60);
           
        g2d.setColor(new Color(125, 167, 116));
        g2d.fillRect(220, 500, 90, 60);
        //------//
        g2d.dispose();
    }
 
    public void paint(Graphics g) {
        super.paint(g);
        drawLines(g);
    }
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new shapes().setVisible(true);
            }
        });
    }
}