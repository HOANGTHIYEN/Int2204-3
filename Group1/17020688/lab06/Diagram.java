import java.util.ArrayList;

public class Diagram {
	ArrayList<Layer> diagram = new ArrayList<>();
	public void addDiagram(String shape, int index) {
		if(this.diagram.size() <= index) {
			Layer l = new Layer();
			this.diagram.add(l);
		}
		Layer browse = this.diagram.get(index);
		browse.addShape(shape);
	}
	public void delCircle() {
            this.diagram.forEach((l) -> { l.deleteCircle(); });
	}
}
