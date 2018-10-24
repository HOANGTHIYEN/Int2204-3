package lab06_abtract;

import java.awt.*;
import javax.swing.*;

public class DrawCir extends JComponent{
    Toado o;
    int r;
    
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DrawCir(Toado _o, int _r) {
		// TODO Auto-generated constructor stub
		double x = _o.getX() - _r/2;
		double y = _o.getY() - _r/2;
		this.o = new Toado(x,y);
		this.r = _r*2;
	}
	
	
	@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g.create();
        g2d.setColor(Color.BLUE);
        g2d.fillOval((int)o.getX(), (int)o.getY(), r, r);
    }
}