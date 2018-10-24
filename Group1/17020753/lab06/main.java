/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;


public class main {

    public static void main(String[] args) {
       
        
        Shape a = new Rectangle(1, 2, 3, 4, true, "red");
       
        Shape b = new Square(1, 3, 4, true, "red");
        Shape c = new Circle (1, 2, 3, true, "red");
        Shape d = new Rectangle(1, 2, 3, 4, true,  "red");
        Shape e = new Triangle(1, 2, 3, 4, 5, true,  "black");
       
        Layer x = new Layer();
        Diagram dia = new Diagram();
        dia.addLayer(x);
        x.addShape(a);
        x.addShape(b);
        x.addShape(c);
        x.addShape(d);
        x.addShape(e);
        dia.printLayer();
        
        dia.deleteAllTriangle();
        dia.deleteCircle();
        System.out.println(" \n danh sach sau khi xoa Triangle va Circle()\n");
        dia.printLayer();
        
       
        
        
      
    }    
}
