/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author Admin
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Paint;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPaneshape extends JPanel{
	 
	 
	 public void paint (Graphics g) {
		 Circle circle = new lab6.Circle(100, 100, 100, true, Color.GREEN);
		 Rectangle rectangle = new Rectangle(50, 70, 100,200, true, Color.pink);
		 Square square = new Square(80, 100, 300, true, Color.GREEN);
		 Triangle triangle = new Triangle(Color.black, true, 300, 200, 300, 300, 400, 300, 0, 0);
		 Hexagon hexagon = new Hexagon(550, 525, 475, 450,475, 525, 500, 543, 543, 500, 457, 457, Color.red, true, 0, 0);
		 Layer x = new Layer();
		 Diagram dia = new Diagram();
	     dia.addLayer(x);
	     
	     x.addShape(circle);
	     x.addShape(rectangle);
	     x.addShape(square);
	     x.addShape(triangle);
	     x.addShape(hexagon);
	     super.paint(g);
	     this.setBackground(Color.orange);
	     
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
	        // TODO code application logic here
	        
	        
	        
	        JFrame frame = new JFrame("abc");
	        frame.setTitle("Lab07");
	        frame.setSize(600, 600);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        JPaneshape p = new JPaneshape();
	        frame.add(p);
	        frame.setVisible(true);
	    }
    
}
