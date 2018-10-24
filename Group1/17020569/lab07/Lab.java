package lab;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Lab extends JPanel{
	 public void paint (Graphics g) {
		 Circle circle = new Circle(100, 100, 100, true, Color.BLUE);
		 Rectangle rectangle = new Rectangle(50, 70, 100,200, true, Color.RED);
		 Square square = new Square(80, 100, 300, true, Color.GREEN);
		 Triangle triangle = new Triangle(Color.BLACK, true, 300, 200, 300, 300, 400, 300, 0, 0);
		 Hexagon hexagon = new Hexagon(550, 525, 475, 450,475, 525, 500, 543, 543, 500, 457, 457, Color.YELLOW, true, 0, 0);
		 Layer x = new Layer();
		 Diagram d = new Diagram();
	         d.addLayer(x);
	         x.addShape(circle);
	         x.addShape(rectangle);
	         x.addShape(square);
	         x.addShape(triangle);
	         x.addShape(hexagon);
	         super.paint(g);
	         this.setBackground(Color.GRAY);
	     
	     for(int i=0; i< x.shape.size(); i++) {
	    	 if(x.shape.get(i).isFilled()) {
	    		 if(x.shape.get(i) instanceof Circle) {
	    			 g.setColor(x.shape.get(i).color);
		    		 g.fillOval(x.shape.get(i).x, x.shape.get(i).y, (int)x.shape.get(i).getRadius(),(int) x.shape.get(i).getRadius());
		    	 }
	    		 
	    		 if(x.shape.get(i) instanceof Rectangle) {
	    			 g.setColor(x.shape.get(i).color);
		    		 g.fillRect(x.shape.get(i).x, x.shape.get(i).y, (int)x.shape.get(i).getWidth(),(int) x.shape.get(i).getLength());
		    	 }
	    		 if(x.shape.get(i) instanceof Square) {
	    			 g.setColor(x.shape.get(i).color);
	    			 g.fillRect(x.shape.get(i).x, x.shape.get(i).y, (int)x.shape.get(i).getSide(),(int) x.shape.get(i).getSide());
	    		 }
	    		 if(x.shape.get(i) instanceof Triangle) {
	    			 g.setColor(x.shape.get(i).color);
	    			 g.fillPolygon(x.shape.get(i).getTx() , x.shape.get(i).getTy(), 3);
	    			
	    		 }
	    		 if(x.shape.get(i) instanceof Hexagon) {
	    			 g.setColor(x.shape.get(i).color);
	    			 g.fillPolygon( x.shape.get(i).getHX() , x.shape.get(i).getHY(), 6);
	    			
	    	         }
	         }
	     }
	 }
	 public static void main(String[] args) {
                JFrame frame = new JFrame("");
	        frame.setTitle("Lab_7");
	        frame.setSize(600, 600);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        Lab p = new Lab();
	        frame.add(p);
	        frame.setVisible(true);
	    }
}