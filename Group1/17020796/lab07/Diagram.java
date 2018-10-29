
import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Diagram extends JFrame{
        ArrayList<Layer> So_Do = new ArrayList<Layer>();
        public Diagram(){
            initUI();
        }
 private void initUI() {
            JFrame jframe = new JFrame();
            Layer layer = new Layer();
            jframe.add(layer);
            jframe.setTitle("Basic shapes");
            jframe.setSize(700, 700);
            jframe.setLocationRelativeTo(null);
            jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jframe.setVisible(true);
        }

      public void deleteCircle(){
          for(int i=0; i<So_Do.size(); i++){
              So_Do.get(i).deleteCircle();
          }
      }
}