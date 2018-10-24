package w6;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.GeneralPath;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
class Surface extends JPanel {
 
 
     
    private void doDrawing(Graphics g) {
         
        Graphics2D g2d = (Graphics2D) g.create();
 
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                             RenderingHints.VALUE_ANTIALIAS_ON);
 
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING,
                             RenderingHints.VALUE_RENDER_QUALITY);
 
        g2d.setPaint(Color.RED);
        
         Hexagon giac=new Hexagon(200,200,100);
         Triangle tam = new Triangle(600,200,700,300,800,200);
        GeneralPath star = new GeneralPath();
        GeneralPath tri = new GeneralPath();
        star.moveTo(giac.x1,giac.y1 );
       
            star.lineTo(giac.x1,giac.y1 );
              star.lineTo(giac.x2,giac.y2 );
                star.lineTo(giac.x3,giac.y3 );
                    star.lineTo(giac.x4,giac.y4 );
                star.lineTo(giac.x5,giac.y5 );
                   star.lineTo(giac.x6,giac.y6 );
                
         tri.moveTo(tam.x1, tam.y1);
         tri.lineTo(tam.x1, tam.y1);
         tri.lineTo(tam.x2, tam.y2);
         tri.lineTo(tam.x3, tam.y3);
        star.closePath();
        g2d.fill(star);
                g2d.fill(tri);        
        g2d.dispose();
    }
 
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
         
        doDrawing(g);
    }
}
 





public class main extends JFrame {
     
    public main() {
 
        initUI();
    }    
     
    private void initUI() {
         
        add(new Surface());
         
        setTitle("Shape");
        setSize(1200, 600);
        setLocationRelativeTo(null);           
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     
    public static void main(String[] args) {
 
        EventQueue.invokeLater(new Runnable() {
             
            @Override
            public void run() {
                main ex = new main();
                ex.setVisible(true);
            }
        });
    }    
}