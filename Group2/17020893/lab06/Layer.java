package JavaWeek6;

import java.util.*;

public class Layer extends ArrayList<Shape>{

	private static final long serialVersionUID = 1L;
	
	public void eraseTriangle() {
		for (int i = 0; i < this.size(); i++)
			if (this.get(i) instanceof Triangle) {
				this.remove(i);
				i--;
			}
	}

}
