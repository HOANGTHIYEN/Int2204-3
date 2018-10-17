package JavaWeek6;

import java.util.ArrayList;

public class Diagram extends ArrayList<Shape>{

	private static final long serialVersionUID = 1L;

	public void eraseCircle() {
		for (int i = 0; i < this.size(); i++)
			if (this.get(i) instanceof Circle) {
				this.remove(i);
				i--;
			}
	}
}
