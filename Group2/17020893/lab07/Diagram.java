package JavaWeek7;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;
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
		this.setBackground(Color.GREEN);
		Layer lay = new Layer();
		Circle c = new Circle(100, "red", true, 50, 50);
		Square s = new Square(150, "black", true, 34, 300);
		Triangle tg = new Triangle(300, 200, 150, 102, 100, 310, "blue", true, 0, 0);
		Hexagon h = new Hexagon(560, 535, 485, 460, 485, 535, 510, 553, 553, 510, 467, 467, "black", true, 60, 80);
		lay.setVisible(true);
		super.paintComponent(g);

		if (lay.isVisible()) {

			if (c.isFilled()) {
				g.setColor(Color.BLACK);
				g.fillOval((int) c.getPos_x(), (int) c.getPos_y(), (int) c.getRadius(), (int) c.getRadius());
			} else {
				g.drawOval((int) c.getPos_x(), (int) c.getPos_y(), (int) c.getRadius(), (int) c.getRadius());
			}
			if (s.isFilled()) {
				g.setColor(Color.BLUE);
				g.fillRect((int) s.getPos_x(), (int) s.getPos_y(), (int) s.getLength(), (int) s.getWidth());
			} else
				g.fillRect((int) s.getPos_x(), (int) s.getPos_y(), (int) s.getLength(), (int) s.getWidth());
			if(h.isFilled()) {
				g.setColor(Color.PINK);
				g.fillPolygon(h.getHx(), h.getHy(), 6);
			}
			if(tg.isFilled()) {
				g.setColor(Color.cyan);
				g.fillPolygon(tg.getTX(), tg.getTY(), 3);
			}
		}

	}

}