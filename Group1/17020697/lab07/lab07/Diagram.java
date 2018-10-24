package lab06_abtract;

import java.util.Vector;

public class Diagram {
	private Layer Rectangle;
	private Layer Triangle;
	private Layer Square;
	private Layer Circle;
	
	
	//Contructor
	public Diagram() {
		// TODO Auto-generated constructor stub
		this.Rectangle = new Layer(0, "r");
		this.Triangle  = new Layer(0, "t");
		this.Square = new Layer(0,"sq");
		this.Circle = new Layer(0,"cir");
	}
	
	
	public void DeteleCircle() {
		if(this.Circle.getTexture1().isEmpty()==true) {
			System.out.println("ko co circle nao!");
			return;
		} else {
			this.Circle.DeleteCircle();
		}
	}
	
	public void MergeDiagram() {
		
		for(int i=0;i<this.Rectangle.getTexture1().size(); i++) {
			for(int j=i+1;j<this.Rectangle.getTexture1().size();j++) {
				Toado[] a = this.Rectangle.getTexture1().get(j).getToado();
				Toado[] b = this.Rectangle.getTexture1().get(i).getToado();
				if(a[0].equals(b[0]) && a[1].equals(b[1]) && a[2].equals(b[2]) && a[3].equals(b[3])) {
					this.Rectangle.getTexture1().remove(j);
					j--;
					
				}
			}
		}
		for(int i=0;i<this.Triangle.getTexture1().size(); i++) {
			for(int j=i+1;j<this.Triangle.getTexture1().size();j++) {
				Toado[] a = this.Triangle.getTexture1().get(j).getToado();
				Toado[] b = this.Triangle.getTexture1().get(i).getToado();
				if(a[0].equals(b[0]) && a[1].equals(b[1]) && a[2].equals(b[2])) {
					this.Triangle.getTexture1().remove(j);
					j--;
				}
			}
		}
		for(int i=0;i<this.Circle.getTexture1().size(); i++) {
			for(int j=i+1;j<this.Circle.getTexture1().size();j++) {
				Toado[] a = this.Circle.getTexture1().get(j).getToado();
				Toado[] b = this.Circle.getTexture1().get(i).getToado();
				if(a[0].equals(b[0]) && a[1].equals(b[1])) {
					this.Circle.getTexture1().remove(j);
					j--;
				}
			}
		}
		for(int i=0;i<this.Square.getTexture1().size(); i++) {
			for(int j=i+1;j<this.Square.getTexture1().size();j++) {
				Toado[] a = this.Rectangle.getTexture1().get(j).getToado();
				Toado[] b = this.Rectangle.getTexture1().get(i).getToado();
				if(a[0].equals(b[0]) && a[1].equals(b[1]) && a[2].equals(b[2]) && a[3].equals(b[3])) {
					this.Square.getTexture1().remove(j);
					j--;
				}
			}
		}
	}
	
	
	//Add
	public void AddRect(Rectangle a) {
		this.Rectangle.getTexture1().add(a);
	}
	public void AddSqur(Square a) {
		this.Square.getTexture1().add(a);
	}
	public void AddCir(Circle a) {
		this.Circle.getTexture1().add(a);
	}
	public void AddTri(Triangle a) {
		this.Triangle.getTexture1().add(a);
	}
	
	
	//Getter/Setter
	public Layer getRectangle() {
		return Rectangle;
	}
	public void setRectangle(Layer rectangle) {
		Rectangle = rectangle;
	}
	public Layer getCircle() {
		return Circle;
	}
	public void setCircle(Layer circle) {
		Circle = circle;
	}
	public Layer getSquare() {
		return Square;
	}
	public void setSquare(Layer square) {
		Square = square;
	}
	public Layer getTriangle() {
		return Triangle;
	}
	public void setTriangle(Layer triangle) {
		Triangle = triangle;
	}



}
