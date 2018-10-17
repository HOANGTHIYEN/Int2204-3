package lab06_abtract;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

import javax.swing.JPanel;

public class TestPane extends JPanel {
	Polygon poly;
	public TestPane() {
		poly = new Polygon(new int[] {50,100,0}, new int[] {0,100,100}, 3);
		
	}
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(200, 200);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setColor(Color.RED);
		g2d.fill(poly);
	}
	
	
	
}
