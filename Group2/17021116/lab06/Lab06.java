/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author 123456789
 */
public class Lab06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Diagram dg = new Diagram();
        Layer lay1 = new Layer();
        Layer lay2 = new Layer();    
        Circle cr = new Circle(2, "red", true){};
        Rectangle rec = new Rectangle(2, 2, "blue", true);
        Square sq = new Square(3, "yellow", true);
        Triangle tri = new Triangle(1, 2, 3);
        lay1.getShape().add(cr);
        lay1.getShape().add(rec);
        lay1.getShape().add(sq);
        lay1.getShape().add(tri);    
        lay2.getShape().add(sq);
        lay2.getShape().add(rec);    
        dg.getLayer().add(lay1);
        dg.getLayer().add(lay2);
        dg.delete();
        lay1.delete();    
        for(int i = 0; i < dg.getLayer().size();i++){
            for(int j = 0; j < dg.getLayer().get(i).getShape().size();j++)
                System.out.println(dg.getLayer().get(i).getShape().get(j).toString());
                
                
            }
        }
    }
    

