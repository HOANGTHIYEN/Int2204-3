package com.lab06;

public class Main {
	public static void main(String[] args) {
    Diagram diagram = new Diagram();
    diagram.layer.shape.add(new Rectangle(new toado (1,2),3,4,"red",true));
    diagram.layer.shape.add(new Square(new toado(10,10),4,"white",true));
    diagram.layer.shape.add(new Triangle(new toado(-15,20),3,4,5,"blue",true));
    diagram.layer.shape.add(new Circle(new toado(5,15),5,"red",true));
    for(int i=0;i<diagram.layer.shape.size();i++) {
    	System.out.println(diagram.layer.shape.get(i));
    	System.out.println("------------------------------");
    }
    diagram.layer.removeTriangle();
    diagram.removeCircle();
    System.out.println("=================================================");
    for(int i=0;i<diagram.layer.shape.size();i++) {
    	System.out.println(diagram.layer.shape.get(i));
    	System.out.println("--------------------------------");
    }  
	}

}
