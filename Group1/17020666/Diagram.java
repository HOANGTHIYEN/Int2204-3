package com.lab06;

public class Diagram {
  Layer layer = new Layer();
  public void removeCircle() {
	  for(int i=0;i<layer.shape.size();i++) {
		  if(layer.shape.get(i) instanceof Circle) {
			  layer.shape.remove(layer.shape.get(i));
			  i--;
		  }
	  }
	  
  }
}
    
    
