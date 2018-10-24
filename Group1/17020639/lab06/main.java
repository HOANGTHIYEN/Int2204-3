
package Javaapllication4;


public class main {


    public static void main(String[] args) 
    {
        Circle a=new  Circle(2.5, 3,1, true, "red");
        Triangle b=new Triangle(3,4,5, 0,4,false,"blue");
        Layer layer=new Layer();
        layer.shape.add(a);
        layer.shape.add(b);
        layer.shape.add(a);
        layer.shape.add(b);
        layer.shape.add(a);
        layer.shape.add(b);
        layer.DeleteTriangle();
        layer.printShape();
         Diagram dia=new Diagram();
         dia.layer.add(layer);
         System.out.println("=============");
         dia.deleteCircle();
         dia.printLayer();
    }
        

