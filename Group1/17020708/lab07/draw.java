
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class draw extends JPanel {
    private Shape shape;
    private JFrame mainMap;
    private Polygon poly;

    public draw(Shape shape) {

        initComponents(shape);

    }

    private void initComponents(Shape shape) {

//        mainMap = new JFrame();
//        mainMap.setResizable(false);
//
//        mainMap.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.shape = shape;

//        int xPoly[] = {150, 250, 325, 375, 450, 275, 100};
//        int yPoly[] = {150, 100, 125, 225, 250, 375, 300};
        ArrayList<Integer> xPoly = new ArrayList<>();
        ArrayList<Integer> yPoly = new ArrayList<>();
        for(Position position : shape.pos){
            xPoly.add(position.posX);
            yPoly.add(position.posY);
        }
        int[] arrayX = new int[xPoly.size()];
        for (int i=0; i < arrayX.length; i++)
        {
            arrayX[i] = xPoly.get(i).intValue();
        }
        int[] arrayY = new int[yPoly.size()];
        for (int i=0; i < arrayY.length; i++)
        {
            arrayY[i] = yPoly.get(i).intValue();
        }
        poly = new Polygon(arrayX, arrayY, arrayY.length);

        JPanel p = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.drawPolygon(poly);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(800, 600);
            }
        };
    }
}