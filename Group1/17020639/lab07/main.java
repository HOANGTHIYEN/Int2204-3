
package Javaapllication4;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Paint;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class main extends JPanel{
	 
	 
	 public void paint (Graphics g) {
		 Circle a=new  Circle(100, 300, 100, true,true, Color.GREEN);
                Triangle b=new Triangle(30,40,50,0,50,50,true,true,Color.BLUE,2,3);
                Rectangle c=new Rectangle(50, 100,100,100, true,true, Color.GREEN);
                Square d = new Square(80, 100, 0, true,true, Color.RED);
                Hexagon e = new Hexagon(200, 240, 260, 260,200, 150, 200, 200, 260, 400,450, 300,true,true, Color.YELLOW,0,0);

		 Layer lay = new Layer();
		 Diagram dia = new Diagram();
	     dia.addLayer(lay);   
	     lay.addShape(a);
	     lay.addShape(b);
	     lay.addShape(c);
             lay.addShape(d);
             lay.addShape(e);
	     super.paint(g);
	     this.setBackground(Color.PINK);
	  for(int i=0; i< lay.shape.size(); i++) {
	    	 if(lay.shape.get(i).visible) {
	    		 if(lay.shape.get(i) instanceof Circle) {
	    			 g.setColor(lay.shape.get(i).color);
		    		 g.fillOval(lay.shape.get(i).x, lay.shape.get(i).y, (int)lay.shape.get(i).getRadius(),(int) lay.shape.get(i).getRadius());
		    	 }

	    		 
	    		 if(lay.shape.get(i) instanceof Rectangle) {
	    			 g.setColor(lay.shape.get(i).color);
		    		 g.fillRect(lay.shape.get(i).x, lay.shape.get(i).y, (int)lay.shape.get(i).getWidth(),(int) lay.shape.get(i).getLength());
		    	 }
	    		 if(lay.shape.get(i) instanceof Square) {
	    			 g.setColor(lay.shape.get(i).color);
	    			 g.fillRect(lay.shape.get(i).x, lay.shape.get(i).y, (int)lay.shape.get(i).getSide(),(int) lay.shape.get(i).getSide());
	    		 }
	    		 if(lay.shape.get(i) instanceof Triangle) {
	    			 g.setColor(lay.shape.get(i).color);
	    			 g.fillPolygon(lay.shape.get(i).getTriangleX() , lay.shape.get(i).getTriangleY(), 3);
	    			
	    		 }
	    		 if(lay.shape.get(i) instanceof Hexagon) {
	    			 g.setColor(lay.shape.get(i).color);
	    			 g.fillPolygon( lay.shape.get(i).getHexagonX() , lay.shape.get(i).getHexagonY(), 6);
	    			
	    		 }
	    		 
	    		 
	    		 
	    	 }
	    	
	    	 
	     }
	     
	 }
	 


        	 public static void main(String[] args) {

	        JFrame frame = new JFrame();
	        frame.setTitle("Đồ họa by Dũng");
	        frame.setSize(1000, 600);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        main p = new main();
	        frame.add(p);
	        frame.setVisible(true);
	    }

         
    }
        

