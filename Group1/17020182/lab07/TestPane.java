package lab6;

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

	
	
	
}
