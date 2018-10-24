package lab06_abtract;

import java.util.Vector;

public class Diagram {
	private Vector<Layer> A1;

	public Vector<Layer> getA1() {
		return A1;
	}

	public void setA1(Vector<Layer> a1) {
		A1 = a1;
	}
	
	
	//Contructor
	public Diagram() {
		// TODO Auto-generated constructor stub
		this.A1 = new Vector<>();
		Layer a1 = new Layer(3,"t");
		Layer a2 = new Layer(4,"cir");
		Layer a3 = new Layer(2,"r");
		this.A1.addElement(a1);
		this.A1.addElement(a2);
		this.A1.addElement(a3);
	}
	
	public void DeteleCircle() {
		if(this.A1.isEmpty()==true) {
			System.out.println("ko co layer!");
			return;
		}
		int k = this.A1.size();
		for(int i=0;i<k;i++) {
			this.A1.get(i).DeleteCircle();
		}
	}
	
	public void AddLayer(Layer a) {
		this.A1.addElement(a);
	}
	
	public String toString() {
//		return "Tong so layer= " + this.A1.size() + "\n Layer 1 co "+ this.A1.get(0).getTexture1().size() + "\n Layer 2 co "+ this.A1.get(1).getTexture1().size() + "\n Layer 3 co "+ this.A1.get(2).getTexture1().size();
		
		String tmp = "";
		for(int i=0;i<this.A1.size();i++) {
			tmp = tmp + this.A1.get(i).toString() + "\n";
		}
		return tmp;
	}
}
