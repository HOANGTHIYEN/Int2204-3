package Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.util.ArrayList;
import java.util.Random;

public class Diagram{
	private JFrame mainFrame;
	private Layer layer;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Diagram frame = new Diagram();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Diagram() {
		constructor();
	}
	
	private void constructor() {
		layer = new Layer();
		layer.setShapeCount(5);
		mainFrame = new JFrame();
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(500,500);
		mainFrame.setLayout(new BorderLayout());
		mainFrame.add(layer);
		mainFrame.addKeyListener(new KeyListener() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            // TODO Auto-generated method stub
	        }
	        @Override
	        public void keyReleased(KeyEvent e) {
	            // TODO Auto-generated method stub
	        }
	        @Override
	        public void keyPressed(KeyEvent e) {
	            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
	                layer.addShape();
	            } 
	        }
	    });
		this.deleteCircle();
		layer.startAnimation();
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
	}

	
	public void deleteCircle() {
		layer.deleteCircle();
	}
}

class Layer extends JPanel implements ActionListener{
    private ArrayList<Shape> shapes = new ArrayList<Shape>();
    private Timer timer = new Timer(40, this);
    public void setShapeCount(int count){
        for (int i = 0; i < count; i++) {
            Shape shape1 = new Circle();
            Shape shape2 = new Square();
            Shape shape3 = new Rectangle();
            Shape shape4 = new Triangle();
            Shape shape5 = new Hexagon();
            shapes.add(shape1);
            shapes.add(shape2);
            shapes.add(shape3);
            shapes.add(shape4);
            shapes.add(shape5);
        }
        
    }
    
    public void addShape() {
    	Shape shape1 = new Circle();
        Shape shape2 = new Square();
        Shape shape3 = new Rectangle();
        Shape shape4 = new Triangle();
        Shape shape5 = new Hexagon();
        shapes.add(shape1);
        shapes.add(shape2);
        shapes.add(shape3);
        shapes.add(shape4);
        shapes.add(shape5);
    }
    
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      for (Shape shape: shapes){
          shape.draw(g);
      }
      
  }

    public void startAnimation(){
    		timer.start();
    }
    
    public void actionPerformed(ActionEvent e){
    	for (Shape shape : shapes){
            shape.move(this);
        }
        repaint();
    }
    
    public void deleteTriangle() {
    	int i = 0;
    	while (i < shapes.size()) {
    		if (shapes.get(i) instanceof Triangle) {
    			shapes.remove(i);
    		} else i++;
    	}
    }
    
    public void deleteCircle() {
    	int i = 0;
    	while (i < shapes.size()) {
    		if (shapes.get(i) instanceof Circle) {
    			shapes.remove(i);
    		} else i++;
    	}
    }
    public void deleteSameObject(){
        for (int i=0;i<shapes.size()-1;i++){
            for (int j=i+1;j<shapes.size();j++){
                if (shapes.get(i) instanceof Circle){
                    if (shapes.get(j) instanceof Circle){
                        if (((Circle)shapes.get(i))==((Circle)shapes.get(j))){
                                this.remove(j);
                                j--;
                            }
                    }
                }
                if (shapes.get(i) instanceof Triangle){
                    if (shapes.get(j) instanceof Triangle){
                        if (((Triangle)shapes.get(i))==((Triangle)shapes.get(j))){
                            this.remove(j);
                            j--;
                        }
                    }
                }
                if (shapes.get(i) instanceof Rectangle){
                    if (shapes.get(j) instanceof Rectangle){
                        if (((Rectangle)shapes.get(i))==((Rectangle)shapes.get(j))){
                            if (((Rectangle)shapes.get(i)).height==((Rectangle)shapes.get(j)).height){
                                if (((Rectangle)shapes.get(i)).weight==((Rectangle)shapes.get(j)).weight){
                                    this.remove(j);
                                    j--;
                                }
                            }
                        }
                    }
                }
                if (shapes.get(i) instanceof Hexagon){
                    if (shapes.get(j) instanceof Hexagon){
                        if (((Hexagon)shapes.get(i))==((Hexagon)shapes.get(j))){
                            this.remove(j);
                            j--;
                        }
                    }
                }

            }
        }
    }
    
}

class Shape{
	protected int x;
    protected int y;
    protected int dx;
    protected int dy;
    protected Random rm;
    protected Color randomColor;
    
    private void Random() {
    	rm = new Random();
    	x = rm.nextInt(595);
    	y = rm.nextInt(595);
    	dx = rm.nextInt(5)+1;
    	dy = rm.nextInt(5)+1;
    	int red = rm.nextInt(256);
		int green = rm.nextInt(256);
		int blue = rm.nextInt(256);
		int yellow = rm.nextInt(256);
		randomColor = new Color(red,green,blue,yellow);
    }
    
	public Shape() {
		Random();
	}
	
	public Shape(boolean bool) {
		if (bool = true) 
			Random();
	}
	
	public void move(JPanel jpanel) {};
	public void draw(Graphics g) {};
	
}

class Circle  extends Shape{
	protected int radius;
	
	public Circle() {
		radius = rm.nextInt(50);
	}
	
	public void move(JPanel jpanel) {
		x += dx;
		y += dy;
		if ( x + (radius *2) > jpanel.getWidth()) {
			x = (int) (jpanel.getWidth() - (radius *2));
			dx *= -1;
		} else if (x<0) {
			x = 0;
			dx *= -1;
		} else if (y + (radius *2) >jpanel.getHeight()) {
			y = (int) (jpanel.getHeight() - (radius *2));
			dy *= -1;
		} else if (y<0) {
			y = 0;
			dy *= -1;
		}
	}
	
	public void draw(Graphics g) {
		g.setColor(randomColor);
		g.fillOval(x, y, radius * 2, radius * 2);
	}
}

class Square extends Circle{
	
	public void draw(Graphics g) {
		g.setColor(randomColor);
		g.fillRect(x, y, radius * 2, radius * 2);
	}
}

class Rectangle extends Shape{
	protected int weight;
	protected int height;
	
	public Rectangle(){
		weight = rm.nextInt(100);
		height = rm.nextInt(100);
	}
	
	public void move(JPanel jpanel) {
		x += dx;
		y += dy;
		if ( x + weight > jpanel.getWidth()) {
			x = (int) (jpanel.getWidth() - weight);
			dx *= -1;
		} else if (x<0) {
			x = 0;
			dx *= -1;
		} else if (y + height >jpanel.getHeight()) {
			y = (int) (jpanel.getHeight() - height);
			dy *= -1;
		} else if (y<0) {
			y = 0;
			dy *= -1;
		}
	}
	
	public void draw(Graphics g) {
		g.setColor(randomColor);
		g.fillRect(x, y, weight, height);
	}
}

class Triangle extends Shape{
	protected int xVal[]= {0,0,0};
	protected int yVal[]= {0,0,0};
	
	public Triangle() {
		xVal[0]=x; yVal[0]=y;
		xVal[1]=x+10; yVal[1]=y+20;
		xVal[2]=x+20; yVal[2]=y+10;
	};
	
	public void move(JPanel jpanel) {
		x += dx;
		y += dy;
		if ( x +20 > jpanel.getWidth()) {
			x = (int) (jpanel.getWidth()-20);
			dx *= -1;
		} else if (x<0) {
			x = 0;
			dx *= -1;
		} else if (y +20>jpanel.getHeight()) {
			y = (int) (jpanel.getHeight()-20);
			dy *= -1;
		} else if (y<0) {
			y = 0;
			dy *= -1;
		}
	}
	
	public void draw(Graphics g) {
		g.setColor(randomColor);
		Polygon pol = new Polygon(xVal,yVal,3);
		g.fillPolygon(pol);
	}
}
class Hexagon extends Shape{
	protected int xVal[]= {0,0,0,0,0,0};
	protected int yVal[]= {0,0,0,0,0,0};
	
	public Hexagon() {
		xVal[0]=x; yVal[0]=y;
		xVal[1]=x+10; yVal[1]=y+17;
		xVal[2]=x+30; yVal[2]=y+17;
		xVal[3]=x+40; yVal[3]=y;
		xVal[4]=x+30; yVal[4]=y-17;
		xVal[5]=x+10; yVal[5]=y-17;
	};
	
	public void move(JPanel jpanel) {
		x += dx;
		y += dy;
		if ( x +40 > jpanel.getWidth()) {
			x = (int) (jpanel.getWidth()-40);
			dx *= -1;
		} else if (x<0) {
			x = 0;
			dx *= -1;
		} else if (y +17>jpanel.getHeight()) {
			y = (int) (jpanel.getHeight()-17);
			dy *= -1;
		} else if (y<0) {
			y = 0;
			dy *= -1;
		}
	}
	
	public void draw(Graphics g) {
		g.setColor(randomColor);
		Polygon poly = new Polygon(xVal,yVal,6);
		g.fillPolygon(poly);
	}
}
