/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author admin
 */
public class Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Diagram d = new Diagram();
        d.l.add(new Circle(3,"red",true,4,5));
        d.l.add(new Triangle(3,4,5,"blue",true,45,12));
        d.l.add(new Rectangle(5,7,"red",true,12,34));
        d.l.add(new Square(3,"black",true,34,23));
        
        d.removeTriangle();
        d.removeCircle();
    }
    
}
