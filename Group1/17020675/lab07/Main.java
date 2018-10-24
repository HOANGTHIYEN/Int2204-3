import java.awt.*;
import javax.swing.*;
class Surface extends JPanel {
 
 
     
    private void doDrawing(Graphics g) {
         
        Graphics2D g2d = (Graphics2D) g.create();
 
        
 
        g2d.setPaint(Color.RED);
        
        Hexagon hex=new Hexagon(200,200,100);
        Triangle triang = new Triangle(600,200,700,300,800,200);
        GeneralPath st = new GeneralPath();
        GeneralPath tri = new GeneralPath();
        st.moveTo(hex.x1,hex.y1 );
       
        st.lineTo(hex.x1,hex.y1 );
        st.lineTo(hex.x2,hex.y2 );
        st.lineTo(hex.x3,hex.y3 );
        st.lineTo(hex.x4,hex.y4 );
        st.lineTo(hex.x5,hex.y5 );
        st.lineTo(hex.x6,hex.y6 );
                
        tri.moveTo(triang.x1, triang.y1);
        tri.lineTo(triang.x1, triang.y1);
        tri.lineTo(triang.x2, triang.y2);
        tri.lineTo(triang.x3, triang.y3);
        st.closePath();
        g2d.fill(st);
        g2d.fill(tri);        
        g2d.dispose();
    }
 
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
         
        doDrawing(g);
    }
}
 
public class Main extends JFrame {
     
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
 
        EventQueue.invokeLater(()->{
           
                Main ex = new main();
                ex.setVisible(true);
        });
    }    
}