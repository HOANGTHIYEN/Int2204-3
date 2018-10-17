package bai_tap_lap06;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Draw extends Applet{
	public void paint(Graphics g)
	{
		setBackground(Color.black);
		g.setColor(Color.red);
		g.fillRect(30, 30, 80, 80);
		g.setColor(Color.green);
		g.fillOval(90, 90, 150, 120);
		g.setColor(Color.blue);
		g.drawOval(150, 150, 200, 200);
		
	}

}
