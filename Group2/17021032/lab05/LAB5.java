/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author thang
 */
public class LAB5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle circle = new Circle(2);
        Square square = new Square(6);
        Rectangle rec=new Rectangle(6, 8);
        
        System.out.println("area="+square.getArea()+"\n pre="+square.getPermeter());
        System.out.println("area="+rec.getArea()+"\n pre="+rec.getPermeter());
        square.setSide(4);
        System.out.println("area="+square.getArea()+"\n pre="+square.getPermeter());
        System.out.println(circle.getArea());
        camsanh cs=new camsanh();
        System.out.println(cs.getInfo());
    }
    
}
