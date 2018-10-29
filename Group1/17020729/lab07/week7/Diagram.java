package week7;

import java.util.ArrayList;
 public class Diagram {
	ArrayList<Layer> diagram = new ArrayList<>();
	public void addDiagram(String shape, int index) {
		if(this.diagram.size() <= index) {
			Layer l = new Layer();
			this.diagram.add(l);
		}
		Layer browse = this.diagram.get(index);
	}
	public void deleteCircle() {
            this.diagram.forEach((l) -> { l.deleteCircle(); });
	}
} 