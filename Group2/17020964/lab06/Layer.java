package lab6;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Layer extends Diagram{
	
	List<Shape> listLayer=null;
		
	public void erase(List<Shape>list) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i) instanceof Cirle) {
				list.remove(i);
				i--;
			}
		}
	}

}
