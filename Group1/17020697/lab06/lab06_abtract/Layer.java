package lab06_abtract;

import java.util.List;
import java.util.Vector;

public class Layer {
	private Vector<Shape> texture1;

	public List<Shape> getTexture1() {
		return texture1;
	}

	public void setTexture1(Vector<Shape> texture1) {
		this.texture1 = texture1;
	}
	
	//Contructor
	public Layer(int amount,String a) {
		// TODO Auto-generated constructor stub
		this.texture1 = new Vector<>();
		if(a=="r") {
			for(int i=0;i<amount;i++) {
				Shape tmp = new Rectangle();
				this.texture1.addElement(tmp);
			}
		}
		if(a=="t") {
			for(int i=0;i<amount;i++) {
				Shape tmp = new Triangle();
				this.texture1.addElement(tmp);
			}
		}
		if(a=="sq") {
			for(int i=0;i<amount;i++) {
				Shape tmp = new Square();
				this.texture1.addElement(tmp);
			}
		}
		if(a=="cir") {
			for(int i=0;i<amount;i++) {
				Shape tmp = new Circle();
				this.texture1.addElement(tmp);
			}
		}
		
	}
	
	public Layer() {
		// TODO Auto-generated constructor stub
		this.texture1 = new Vector<>();
		Shape tmp1 = new Rectangle();
		Shape tmp2 = new Triangle();
		Shape tmp3 = new Circle();
		this.texture1.addElement(tmp1);
		this.texture1.addElement(tmp2);
		this.texture1.addElement(tmp3);
	}


	public void DeleteTriangle() {
		if(this.texture1.isEmpty()==true) {
			System.out.println("ko co hinh nao");
			return;
		}
		int k = this.texture1.size();
		
		for(int i=0;i<k;i++) {
			if(this.texture1.get(i) instanceof Triangle == true) {
				this.texture1.remove(i);
				k--;
				i--;
			}
		}
	}
	
	public void DeleteCircle() {
		if(this.texture1.isEmpty()==true) {
			System.out.println("ko co hinh nao");
			return;
		}
		int k = this.texture1.size();
		
		for(int i=0;i<k;i++) {
			if(this.texture1.get(i) instanceof Circle == true) {
				this.texture1.remove(i);
				k--;
				i--;
			}
		}
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String tmp = "";
		for(int i=0;i<this.texture1.size();i++) {
			tmp = tmp + this.texture1.get(i).draw();
		}
		return tmp;
	}
}
