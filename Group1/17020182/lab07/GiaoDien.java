package lab6;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GiaoDien extends Canvas {

	  public void paint(Graphics g) {  
	       
	        setBackground(Color.green);  
	        g.drawRect(0, 30,170, 80);
	        g.fillRect(0, 30,170, 80);  
	        setForeground(Color.BLUE); 
	        g.drawArc(0,130,60, 60,50,1000);  
	        g.fillArc(0,130,60, 60,50,1000);  
	        g.drawRect(250, 30,80, 80);
	        g.fillRect(250, 30,80, 80);  
	    }  
	 
		

}

	       