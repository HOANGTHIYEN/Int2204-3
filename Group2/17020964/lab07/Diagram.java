package lab7;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sun.glass.events.WindowEvent;

public class Diagram extends JPanel{
	public Layer Layer;
	
	public Layer getLayer() {
		return Layer;
	}

	public void setLayer(Layer layer) {
		Layer = layer;
	}

	public void reMove() {
		for(int i =0;i<Layer.Shape.size();i++) {
			if(Layer.Shape.get(i) instanceof Crile) {
				Layer.Shape.remove(i);
			}
		}
	}
	public void sort() {
		Diagram Dia = new Diagram();
		Layer layerCrile = new Layer();
		Layer layerTriage = new Layer();
		Layer layerRectangle = new Layer();
		for(int i =0;i<Dia.Layer.Shape.size();i++) {
			if(Dia.Layer.Shape.get(i) instanceof Crile) {
				layerCrile.Shape.add(Dia.Layer.Shape.get(i));
			}else if(Dia.Layer.Shape.get(i) instanceof Triage) {
				layerTriage.Shape.add(Dia.Layer.Shape.get(i));
			} else {
				layerRectangle.Shape.add(Dia.Layer.Shape.get(i));
			}
		}
	}
	 public static void main(String[] args) {
	        // TODO code application logic here
	        
	        
	        
	        JFrame frame = new JFrame();
	        frame.setTitle("Lab7");
	        frame.setSize(600, 600);
	        frame.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent e) {
	            System.exit(0);
	         }
	        });
	        Container contentPane = frame.getContentPane();
	        contentPane.add(new Diagram());
	        frame.setVisible(true);
	    }
	
}