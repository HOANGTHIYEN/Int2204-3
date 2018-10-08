/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author 123456789
 */




public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle cir = new Circle(2,"red",true);
        System.out.println(cir.toString() + " Area: "+cir.getArea());
        Rectangle rec = new Rectangle(2,4,"blue",false);
        System.out.println(rec.toString() + " Area: "+rec.getArea());
        Square squ = new Square(4,"pink",true);
//        squ.setSide(6);
        System.out.println(squ.toString() + "Area: "+squ.getArea());
    }
    
}
