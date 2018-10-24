package lab06_abtract;

import java.awt.*;
import javax.swing.*;

public class DrawTri extends JComponent{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int[]x;
	int[]y;

	public DrawTri(Toado a1,Toado a2,Toado a3) {
		// TODO Auto-generated constructor stub
		this.x = new int[] {(int)a1.getX(),(int)a2.getX(),(int)a3.getX()};
		this.y = new int[] {(int)a1.getY(),(int)a2.getY(),(int)a3.getY()};
	}
	
	@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g.create();
        g2d.setColor(Color.BLUE);
        g2d.fillPolygon(x, y, x.length);
    }
}