package com.lab06;

import java.util.ArrayList;

public class Layer {
	    ArrayList<Shape> shape = new ArrayList<Shape>();
	    
	    public void removeTriangle() {
	    	for(int i=0;i<shape.size();i++) {
	    		if(shape.get(i) instanceof Triangle) {
	    			shape.remove(shape.get(i));
	    			i--;
	    		}
	    	}
	    	
	    }
	    
	    
}
