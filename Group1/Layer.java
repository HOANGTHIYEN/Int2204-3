package com.lab06;
/*
import java.awt.Color;
import java.awt.Graphics;*/
import java.util.ArrayList;

public class Layer extends Shape {
	    ArrayList<Shape> shape = new ArrayList<Shape>();
	    Triangle tgiac = new Triangle();
	    
	    boolean visible = true;
	    
	    public void removeTriangle() {
	    	for(int i=0;i<shape.size();i++) {
	    		if(shape.get(i) instanceof Triangle) {
	    			shape.remove(shape.get(i));
	    			i--;}
	    	}}
	    public void xoa_gnhau() {
	    	for(int i=0;i<shape.size();i++) {
	    		for(int j=i+1;j<shape.size();i++) {
	    			if(shape.get(i) instanceof Triangle && shape.get(j) instanceof Triangle) {
	    				if(((Triangle)shape.get(i)).pX1 ==((Triangle)shape.get(j)).pX1 &&
	    						((Triangle)shape.get(i)).pX2==((Triangle)shape.get(i)).pX2 &&
	    						((Triangle)shape.get(i)).pX3==((Triangle)shape.get(i)).pX3 &&
	    						((Triangle)shape.get(i)).pY1==((Triangle)shape.get(i)).pY1 &&
	    						((Triangle)shape.get(i)).pY2==((Triangle)shape.get(i)).pY2 &&
	    						((Triangle)shape.get(i)).pY3==((Triangle)shape.get(i)).pY3) {
	    					shape.remove(j);
	    					j--;
	    					
	    				}
	    			}

	    			if(shape.get(i) instanceof Rectangle && shape.get(j) instanceof  Rectangle ) {
	    				if(((Rectangle)shape.get(i)).pX ==((Rectangle)shape.get(j)).pX &&
	    						((Rectangle)shape.get(i)).pY==((Rectangle)shape.get(i)).pY &&
	    						((Rectangle)shape.get(i)).width==((Rectangle)shape.get(i)).width &&
	    						((Rectangle)shape.get(i)).length==((Rectangle)shape.get(i)).length) {
	    					shape.remove(j);
	    					j--;
	    					
	    				}
	    			}

	    			if(shape.get(i) instanceof Square && shape.get(j) instanceof Square) {
	    				if(((Square)shape.get(i)).pX ==((Square)shape.get(j)).pX &&
	    						((Square)shape.get(i)).pY==((Square)shape.get(i)).pY &&
	    						((Square)shape.get(i)).side==((Square)shape.get(i)).side) {
	    					shape.remove(j);
	    					j--;
	    					
	    				}
	    			}

	    			if(shape.get(i) instanceof Circle && shape.get(j) instanceof Circle) {
	    				if(((Circle)shape.get(i)).pX ==((Circle)shape.get(j)).pX &&
	    						((Circle)shape.get(i)).pY==((Circle)shape.get(i)).pY &&
	    						((Circle)shape.get(i)).radius==((Circle)shape.get(i)).radius) {
	    					shape.remove(j);
	    					j--;
	    					
	    				}
	    			}
	    			
	    		}
	    	}
	    }
	    
	    

}
