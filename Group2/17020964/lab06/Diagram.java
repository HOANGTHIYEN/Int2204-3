package lab6;

import java.util.List;

public class Diagram {
	List<Shape> listDia=null;
	public void eraseCirle() {
		for(int i=0;i<listDia.size();i++) {
			if(listDia.get(i) instanceof Cirle) {
				listDia.remove(i);
			}
		}
	}

}
