package lab7;
import java.awt.geom.GeneralPath;
import java.awt.*;
import javax.swing.*;
class Surface extends JPanel {
 
 
     
    private void Ve(Graphics g) {
         
        Graphics2D g2d = (Graphics2D) g.create();
 
        toaDo A = new toaDo(600,700);
        toaDo B = new toaDo(500,400);
        toaDo C = new toaDo(800,500);
        g2d.setPaint(Color.red);
        
        Hexagon hex=new Hexagon(200,200,100);
        Triangle tg = new Triangle(A, B, C);
        GeneralPath hlg = new GeneralPath();
        GeneralPath htg = new GeneralPath();
        hlg.moveTo(hex.x1,hex.y1 );
        hlg.lineTo(hex.x1,hex.y1 );
        hlg.lineTo(hex.x2,hex.y2 );
        hlg.lineTo(hex.x3,hex.y3 );
        hlg.lineTo(hex.x4,hex.y4 );
        hlg.lineTo(hex.x5,hex.y5 );
        hlg.lineTo(hex.x6,hex.y6 );
                
        htg.moveTo(tg.A.getX(), tg.A.getY());
        htg.lineTo(tg.A.getX(), tg.A.getY());
        htg.lineTo(tg.B.getX(), tg.B.getY());
        htg.lineTo(tg.C.getX(), tg.C.getY());
        htg.closePath();
        g2d.fill(hlg);
        g2d.fill(htg);        
        g2d.dispose();
    }
 
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
         
        Ve(g);
    }
}
 
public class Lab7 extends JFrame {
     
    public Lab7() {
 
        initUI();
    }    
     
    private void initUI() {
         
        add(new Surface());
         
        setTitle("Lab7");
        setSize(1000, 1000);
        setLocationRelativeTo(null);           
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     
    public static void main(String[] args) {
 
        EventQueue.invokeLater(new Runnable() {
             
            @Override
            public void run() {
                Lab7 ex = new Lab7();
                ex.setVisible(true);
            }
        });
    }    
}