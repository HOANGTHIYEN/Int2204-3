package JavaWeek7;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Diagram extends JPanel {

	private static final long serialVersionUID = 1L;
	private final ArrayList<Layer> layer = new ArrayList<>();

	public ArrayList<Layer> getLayer() {
		return layer;
	}

	public void eraseTriangle() {

		for (int i = layer.size() - 1; i >= 0; i--) {
			for (int j = layer.get(i).getList().size() - 1; j >= 0; j--) {
				if (layer.get(i).getList().get(j) instanceof Triangle) {
					layer.get(i).getList().remove(i);
				}
			}
		}
	}
	public void paintComponent(Graphics g) {
		Diagram d = new Diagram();
		Layer lay1 = new Layer();
		Circle c = new Circle(100, "red", true, 50, 50);
		Square s = new Square(150,"black",true,34,300);
		lay1.getList().add(c);
		lay1.setVisible(true);
		d.getLayer().add(lay1);
		super.paintComponent(g);

		if (lay1.isVisible()) {

			if (c.isFilled()) {
				g.setColor(Color.BLACK);
				g.fillOval((int) c.getPos_x(), (int) c.getPos_y(), (int) c.getRadius(), (int) c.getRadius());
			} else {
				g.drawOval((int) c.getPos_x(), (int) c.getPos_y(), (int) c.getRadius(), (int) c.getRadius());
			}
			if(s.isFilled()){
                g.setColor(Color.BLUE);
                g.fillRect((int)s.getPos_x(), (int)s.getPos_y(), (int)s.getLength(), (int)s.getWidth());
            }
            else g.fillRect((int)s.getPos_x(), (int)s.getPos_y(), (int)s.getLength(), (int)s.getWidth());
		}

	}

}