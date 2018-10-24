package lab7;

import java.util.ArrayList;



public class Layer {
	protected ArrayList<Shape> Shape;
	protected boolean visible;
	public ArrayList<Shape> getShape() {
		return Shape;
	}
	public void setShape(ArrayList<Shape> shape) {
		Shape = shape;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public void reMove() {
		for(int i =0;i<Shape.size();i++) {
			if(Shape.get(i) instanceof Crile) {
				Shape.remove(i);
			}
		}
	}
}
