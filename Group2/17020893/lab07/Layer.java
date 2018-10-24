package JavaWeek7;

import java.util.*;

public class Layer extends ArrayList<Shape> {

	private static final long serialVersionUID = 1L;

	private ArrayList<Shape> shape = new ArrayList<>();
	private boolean visible;

	public ArrayList<Shape> getShape() {
		return shape;
	}

	public void setShape(ArrayList<Shape> shape) {
		this.shape = shape;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void eraseTriangle() {
		for (int i = 0; i < this.size(); i++)
			if (this.get(i) instanceof Triangle) {
				this.remove(i);
				i--;
			}
	}

	public ArrayList<Shape> getList() {
		return this.shape;
	}
}
