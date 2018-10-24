package Lava;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
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
class Diagram {
     ArrayList<Layer> layer;
     public Diagram(){
        layer = new ArrayList<>();
    }
    public void addLayer(Layer lay){
        this.layer.add(lay);
    }
    public void printLayer(){
        for(int i = 0; i < layer.size(); ++i){
            layer.get(i).printShape();
        }
    }
    public void deleteAllTriangle(){
        for(int i = 0; i < layer.size(); ++i){
            layer.get(i).deleteAllTriangle();
        }
    }
    public void deleteAllCircle(){
        for(int i = 0; i < layer.size(); ++i){
            layer.get(i).deleteAllCircle();
        }
    }
}
class Layer{
    protected  ArrayList<Shape> shape;
    protected boolean visible;
     public Layer() {
        shape = new ArrayList<>();
        visible = true;
    }
    
    public void addShape(Shape s){
        this.shape.add(s);
    }
    
    public void setVisible(boolean visible) {
        this.visible = visible;
    }
     public boolean isVisible() {
        return visible;
    }
    
    public void deleteAllTriangle(){
        for(int i = 0; i < shape.size(); ++i){
            if(shape.get(i) instanceof Triangle){
                shape.remove(i);
                --i;
            }
        }
    }
    
    
    public void deleteAllCircle(){
        for(int i = 0; i < shape.size(); ++i){
            if(shape.get(i) instanceof Circle){
                shape.remove(i);
                --i;
            }
        }
    }
    public void printShape(){
        for (int i = 0; i < shape.size(); ++i){
                System.out.println(shape.get(i).toString());
        }
    }
   
}
class Shape{
    protected int x, y;
    protected boolean filled;
    protected Color color;
     
    Circle circle;
    Rectangle rectangle;
    Triangle triangle;
    Square square;
    Hexagon hexagon;
    public Shape() {
    }
     public Shape(int x, int y, boolean filled, Color color) {
        this.x = x;
        this.y = y;
        this.filled = filled;
        
        this.color = color;
    }  
     public Color getColor() {
        return color;
    }
     public void setColor(Color color) {
        this.color = color;
    }    
     public int getX() {
        return x;
    }
     public void setX(int x) {
        this.x = x;
    }
     public int getY() {
        return y;
    }
     public void setY(int y) {
        this.y = y;
    }
     public boolean isFilled() {
        return filled;
    }
     public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    
    public void move(int x, int y) {
    	this.x = this.x +x;
    	this.y = this.y +y;
    }
    @Override
    public String toString() {
        return "Shape{" + "x=" + x + ", y=" + y + ", filled=" + filled + ", color=" + color + '}';
    }
    
    public double getRadius() {
        return this.getRadius();
    }
    public double getWidth() {
        return this.getWidth();
    }
    public double getLength() {
        return this.getLength();
    }
    public double getSide() {
        return this.getSide();
    }
    public int[] getTx() {
		return getTx();
	}
    public int[] getTy() {
		return getTy();
	}
    public int[] getHX(){
        return getHX();
    }
    public int[] getHY(){
        return getHY();
    }
}
public class Rectangle extends Shape{
    protected double width, length;
    public Rectangle() {
    }
     public Rectangle(double width, double length, int x, int y, boolean filled,  Color color) {
        super(x, y, filled, color);
        this.width = width;
        this.length = length;
    }
    
    public double getWidth() {
        return width;
    }
     public void setWidth(double width) {
        this.width = width;
    }
     public double getLength() {
        return length;
    }
     public void setLength(double length) {
        this.length = length;
    }
    public double getPerimeter() {
        return 2*(width + length);
    }
     public double getArea() {
        return width*length;
    }
 	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + ", x=" + x + ", y=" + y + ", filled=" + filled
				+ ", color=" + color + ", getPerimeter()=" + getPerimeter() + ", getArea()=" + getArea() + "]";
	}
    
}
class Hexagon extends Shape{
            private int[] hx = new int[6];
	    private int[] hy = new int[6];
	public Hexagon(int a,int b,int c,int d,int e,int f, int g,int h,int i,int j,int k,int l,Color color, boolean filled, int x, int y){
	        super(x, y, filled, color);
	        this.hx[0]=a;
	        this.hx[1]=b;
	        this.hx[2]=c;
	        this.hx[3]=d;
	        this.hx[4]=e;
	        this.hx[5]=f;
	        this.hy[0]=g;
	        this.hy[1]=h;
	        this.hy[2]=i;
	        this.hy[3]=j;
	        this.hy[4]=k;
	        this.hy[5]=l;
	    }
	    public int[] getHX(){
	        return this.hx;
	    }
	    public int[] getHY(){
	        return this.hy;
	    }
}
class Circle extends Shape{
    private double radius;
    double pi = 3.14;
    public Circle() {
    }
     public Circle(double radius, int x, int y, boolean filled, Color color) {
        super(x, y, filled, color);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
     public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPerimeter() {
		return 2 * pi * radius;
	}
 	public double getArea() {
		return pi * radius * radius;
	}
 	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", pi=" + pi + ", x=" + x + ", y=" + y + ", filled=" + filled + ", color="
				+ color + ", getPerimeter()=" + getPerimeter() + ", getArea()=" + getArea() + "]";
	}
}
class Triangle extends Shape {
	private int[] tx = new int[3];
    private int[] ty = new int[3];
    
	 public int[] getTx() {
		return tx;
	}
	public void setTx(int[] tx) {
		this.tx = tx;
	}
	public int[] getTy() {
		return ty;
	}
	public void setTy(int[] ty) {
		this.ty = ty;
	}
		public Triangle(Color color, boolean filled, int x1, int y1, int x2, int y2, int x3, int y3,int x, int y)
		    {
		        super(x, y, filled, color);        
		        this.tx[0] =x1;
		        this.tx[1] = x2;
		        this.tx[2] = x3;
		        this.ty[0] = y1;
		        this.ty[1] = y2;
		        this.ty[2] = y3;
		    }
	    public void moveTri(int x, int y) {
	    	
	    	this.tx[0] = tx[0] +x;
	        this.tx[1] = tx[1]+x;
	        this.tx[2] = tx[2]+x;
	        this.ty[0] = ty[0]+y;
	        this.ty[1] = ty[1]+y;
	        this.ty[2] = ty[2]+y;
	    }
}
class Square extends Rectangle{
    private double side;
     public Square() {
    }
     public Square(double side, int x, int y, boolean filled, Color color) {
        super(side, side, x, y, filled, color);
        this.side = side;
    }
     public double getSide() {
        return side;
    }
     public void setSide(double side) {
        this.side = side;
        this.length = side;
		this.width = side;
    }
    public void setWidth(double side) {
		setSide(side);
	}
 	public void setLength(double side) {
		setSide(side);
	}
 	@Override
	public String toString() {
		return "Square [side=" + side + ", width=" + width + ", length=" + length + ", x=" + x + ", y=" + y
				+ ", filled=" + filled + ", color=" + color + ", getPerimeter()=" + getPerimeter() + ", getArea()="
				+ getArea() + "]";
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