
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.util.*;

public class Layer extends JPanel {

   protected static ArrayList<Shape> hinh = new ArrayList<Shape>();
   public static boolean visible; 
    
    public void drawShape(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        for(int i=0; i<hinh.size(); i++){
            
            if(hinh.get(i) instanceof Rectangle){
               Rectangle r = (Rectangle) hinh.get(i);
               g2d.drawRect(r.getX(), r.getY(), r.getCd(), r.getCr());
            }
            
            if(hinh.get(i) instanceof Circle){
              Circle r = (Circle) hinh.get(i);
               g2d.drawOval(r.getX(),r.getY(), 2*r.getRadius(), 2*r.getRadius());
            }
            
            if(hinh.get(i) instanceof Square){
               Square r = (Square) hinh.get(i);
               g2d.drawRect(r.getX(), r.getY(), r.getCanh(), r.getCanh());
            }
            
            if(hinh.get(i) instanceof Triangle){
               Triangle r = (Triangle) hinh.get(i);
               g2d.drawLine(r.getX1(),r.getY1(), r.getX2(), r.getY2());
               g2d.drawLine(r.getX2(),r.getY2(), r.getX3(), r.getY3());
               g2d.drawLine(r.getX3(),r.getY3(), r.getX1(), r.getY1());
               
            }
            
        }
    }
    
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        drawShape(g);
       
    }
   
   public  void XoaHinhTrungNhau(){
       for(int i=1; i<hinh.size(); i ++){
           for(int j=i-1; j<hinh.size(); j++){
               if(hinh.get(j) instanceof Circle && hinh.get(j) instanceof Circle){
                   Circle c1 = (Circle)hinh.get(j), c2 = (Circle)hinh.get(i);
                   if(c1.ok(c2))
                       hinh.remove(hinh.get(j));
               }
               if(hinh.get(j) instanceof Rectangle && hinh.get(j) instanceof Rectangle){
                   Rectangle c1 = (Rectangle)hinh.get(j), c2 = (Rectangle)hinh.get(i);
                   if(c1.ok(c2))
                       hinh.remove(hinh.get(j));
               }
               if(hinh.get(j) instanceof Triangle && hinh.get(j) instanceof Triangle){
                   Triangle c1 = (Triangle)hinh.get(j), c2 = (Triangle)hinh.get(i);
                   if(c1.ok(c2))
                       hinh.remove(hinh.get(j));
               }
               if(hinh.get(j) instanceof Square && hinh.get(j) instanceof Square){
                   Square c1 = (Square)hinh.get(j), c2 = (Square)hinh.get(i);
                   if(c1.ok(c2))
                       hinh.remove(hinh.get(j));
               }
           }
       }
   }

    public void deleteTriangle() {
        for (int i = 0; i < hinh.size(); i++) {
            if (hinh.get(i) instanceof Triangle) {
                hinh.remove(i);
                i--;
            }
        }

    }

    public void deleteCircle() {
        for (int i = 0; i < hinh.size(); i++) {
            if (hinh.get(i) instanceof Circle) {
                hinh.remove(i);
                i--;

            }
        }

    }
  
    

}