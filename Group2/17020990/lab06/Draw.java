/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Quoc
 */
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Draw extends Applet{
        @Override
	public void paint(Graphics g)
	{
		setBackground(Color.yellow);
		g.setColor(Color.orange);
		g.fillRect(20, 20, 50, 50);
		g.setColor(Color.blue);
		g.fillOval(30, 30, 80, 60);
		g.setColor(Color.red);
		g.drawOval(50, 50, 100, 100);
		
	}

}
