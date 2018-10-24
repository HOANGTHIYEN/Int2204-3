//package lab06_abtract;
//
//import java.awt.Color;
//import java.awt.Component;
//import java.awt.Dimension;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.Polygon;
//
//import javax.swing.JPanel;
//import javax.swing.JButton;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//
//public class DrawRec extends JPanel {
//	Polygon poly;
//	//Vector<Polygon> poly;
//	public DrawRec(Toado[] tmp) {
//		setLayout(null);
//		int[] list1 = new int[] {tmp[0].getX(),tmp[1].getX(),tmp[2].getX(),tmp[3].getX()};
//		int[] list2 = new int[] {tmp[0].getY(),tmp[1].getY(),tmp[2].getY(),tmp[3].getY() };
//		poly = new Polygon(list1, list2,4) ;
//		
//		//poly = new Polygon(new int[] {50,100,0}, new int[] {0,100,100}, 3);
//	}
//	@Override
//	public Dimension getPreferredSize() {
//		return new Dimension(400, 400);
//	}
//	
//	@Override
//	protected void paintComponent(Graphics g) {
//		super.paintComponent(g);
//		Graphics2D g2d = (Graphics2D) g.create();
//		g2d.setColor(Color.RED);
//		g2d.fill(poly);
//	}
//}
