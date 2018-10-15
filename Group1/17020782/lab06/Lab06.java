/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.util.ArrayList;

 class Diagram {
        public ArrayList<Layer> d = new ArrayList<Layer>();
        public void DeleteCircle(){
            for(int i=0; i<d.size(); i++){
            for(int j=0; j < d.get(i).sp.size(); j++){
            if(d.get(i).sp.get(j) instanceof Circle){
            d.get(i).sp.remove(j);
            j--;
            }
            }
            }
            }
        
}

 class Layer {
   ArrayList<Shape> sp = new ArrayList<Shape>();
public void DeleteTriangle(ArrayList a) {
for (int i = 0; i < a.size(); i++) {
if (a.get(i) instanceof Triangle) {
a.remove(i);
i--;
}
}
}
   
   
}


 abstract class Shape {
public abstract void draw();

}


 class Location {
    private double x,y;

    public void setX(double x) {
    this.x = x;
    }

    public void setY(double y) {
    this.y = y;
    }

    public double getX() {
    return x;
    }

    public double getY() {
    return y;
    }
}
 

 

 class Rectangle extends Shape {
    private final double width, length;
    Location a = new Location();

    public Rectangle() {
        this(1,1);
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    @Override
    public void draw(){
    System.out.println("Ve chu nhat");
    }

}

 class Triangle extends Shape {
    private final double a, b, c;
    Location td1 = new Location();
    Location td2 = new Location();
    Location td3 = new Location();
    public Triangle() {
        this(1,1,1);
    }
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void draw(){
    System.out.println("Ve Hinh Tam Giac");
}

}
 class Circle extends Shape {
    private final double radius;
    final double pi = Math.PI;
    
    Location a = new Location();
    public void setLocation (double x, double y){
    a.setX(x);
    a.setY(y);
    }
    public Circle() {
     this(1);
    }
    public Circle(double radius) {
    this.radius = radius;
    }
    @Override
    public void draw(){
    System.out.println("Ve Hinh tron");
    }

}


public class Lab06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
