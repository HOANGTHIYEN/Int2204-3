/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap_05_2;

/**
 *
 * @author Admin
 */
public class Lap_05_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape sh=new Shape();
        sh.setColor("red");
        sh.setFill(true);
        System.out.println(sh.getColor()+" "+sh.getFill());
        Circle cir=new Circle();
        cir.setColor("blue");
        cir.setFill(false);
        cir.setRadius(1.0);
        System.out.println(cir.getColor()+" "+cir.getFill()+" "+cir.getArea()+" "+cir.getPerimeter());
        Rectangle re=new Rectangle();
        re.setColor("black");
        re.setFill(true);
        re.setWidth(1.0);
        re.setLength(1.0);
        System.out.println(re.getColor()+" "+re.getFill()+" "+re.getArea()+" "+re.getPerimeter());
        Square sq=new Square();
        sq.setColor("white");
        sq.setFill(false);
        sq.setSize(2.0);
        System.out.println(sq.getColor()+" "+sq.getFill()+" "+sq.getArea()+" "+sq.getPerimeter());
    }
    
}
