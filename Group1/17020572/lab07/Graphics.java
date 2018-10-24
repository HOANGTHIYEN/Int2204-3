import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Graphics extends JPanel {
    private Shape shape;
    private JFrame mainMap;
    private Polygon poly;

    public Graphics(Shape shape) {

        draw(shape);

    }

    private void draw(Shape shape) {
        this.shape = shape;
        ArrayList<Integer> Polx = new ArrayList<>();
        ArrayList<Integer> Poly = new ArrayList<>();
        for(Position position : shape.pos){
            Polx.add(position.posX);
            Poly.add(position.posY);
        }
        int[] arrayX = new int[Polx.size()];
        for (int i=0; i < arrayX.length; i++)
        {
            arrayX[i] = Polx.get(i).intValue();
        }
        int[] arrayY = new int[Poly.size()];
        for (int i=0; i < arrayY.length; i++)
        {
            arrayY[i] = Poly.get(i).intValue();
        }
        poly = new Polygon(arrayX, arrayY, arrayY.length);

        JPanel p = new JPanel() {
            @Override
            protected void paintComponent(java.awt.Graphics g) {
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
