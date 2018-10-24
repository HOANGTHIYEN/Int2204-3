package lab06_abtract;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Polygon;
import java.awt.Shape;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.CardLayout;
import javax.swing.JButton;

public class DrawDiagram extends JFrame {

	private JPanel contentPane;

	
	/**
	 * Create the frame.
	 */
	public DrawDiagram(Diagram mainDia) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		getContentPane().setLayout(null);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		if(mainDia.getRectangle().isVisible()) {
			for(int i=0;i<mainDia.getRectangle().getTexture1().size();i++) {
				Canvas canvas = new Canvas();
				canvas.setBackground(Color.GRAY);
				Rectangle tmp = (Rectangle) mainDia.getRectangle().getTexture1().get(i);
				Toado a = tmp.getToado()[0];
				canvas.setBounds((int)a.getX(),(int)a.getY(),(int)tmp.getLength(),(int)tmp.getWidth());
				getContentPane().add(canvas);
				
			}
		}
		
		if(mainDia.getSquare().isVisible()) {
			for(int i=0;i<mainDia.getSquare().getTexture1().size();i++) {
				Canvas canvas = new Canvas();
				canvas.setBackground(Color.RED);
				Square tmp = (Square) mainDia.getSquare().getTexture1().get(i);
				Toado a = tmp.getToado()[0];
				canvas.setBounds((int)a.getX(),(int)a.getY(),(int)tmp.getSize(),(int)tmp.getSize());
				getContentPane().add(canvas);
				
			}
		}
		
//		
//		
		if(mainDia.getCircle().isVisible()) {
			for(int i=0;i<mainDia.getCircle().getTexture1().size();i++) {
				Toado o = mainDia.getCircle().getTexture1().get(i).getToado()[0];
				int r = (int)mainDia.getCircle().getTexture1().get(i).getToado()[1].getX();
				DrawCir a =new DrawCir(o,r);
				getContentPane().add(a);
				//setContentPane(a);
			}
		}
		
		if(mainDia.getTriangle().isVisible()) {
			for(int i=0;i<mainDia.getTriangle().getTexture1().size();i++) {
				Toado[] tmp = mainDia.getTriangle().getTexture1().get(i).getToado();
				DrawTri tri = new DrawTri(tmp[0], tmp[1], tmp[2]);
				
				
				getContentPane().add(tri);
			}
		}
//		
		
//		DisplayGraphics m=new DisplayGraphics();  
//		
//		m.paints(contentPane);
//		
//		Canvas canvas = new Canvas();
//		canvas.setBackground(Color.GREEN);
//		canvas.setBounds(95, 125, 296, 165);
//		getContentPane().add(canvas);
//		
//		
//		Canvas canvas_1 = new Canvas();
//		canvas_1.setBackground(Color.MAGENTA);
//		canvas_1.setBounds(177, 204, 100, 100);
//		getContentPane().add(canvas_1);
//	
	
	
	
	
	
	}
}
