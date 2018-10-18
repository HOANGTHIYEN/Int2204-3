/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5b2;

/**
 *
 * @author CCNE
 */
public class Lab06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Diagram diagram = new Diagram();
        Layer layer = new Layer();
        layer.add(new Rectangle(10, 2));
        layer.add(new Circle(2.4));
        for (int i=0;i<layer.size();i++){
            System.out.println(layer.elementAt(i).toString());
        }
        System.out.println("Before");
        diagram.add(layer);
        for (int i=0;i<layer.size();i++){
            System.out.println(diagram.elementAt(0).elementAt(i).toString());
        }
        diagram.removeCircle();
        System.out.println("Aftet");
        for (int i=0;i<layer.size();i++){
            System.out.println(diagram.elementAt(0).elementAt(i).toString());
        }


    }
    
}