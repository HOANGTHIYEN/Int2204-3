/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

import java.util.Vector;

/**
 *
 * @author MANH HOANG
 */
public class Diagram extends Vector<Layer> {

    /**
     * @param args the command line arguments
     */
    
    public Diagram() {
        super(0);
    }

    public Diagram(int initialCapacity) {
        super(initialCapacity);
    }
    public void removeCircle(){
        for(int j = 0;j < this.size();j ++){
            for(int k = 0;k < this.elementAt(j).size();k ++)
                if(this.elementAt(j).elementAt(k) instanceof Circle){
                    this.elementAt(j).remove(k);
                    k --;
                }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Diagram t = new Diagram();
        //test thu removeTriangle
        Layer t1 = new Layer();
        t1.add(new Triangle(3, 4, 5));
        t1.add(new Circle(3));
        t1.add(new Rectangle(4, 5));
        t1.add(new Square(5));
        for(int j = 0;j < t1.size();j ++)
            t1.elementAt(j).info();
        t1.removeTriangle();
        System.out.println("\nSau khi xoa hinh tam giac: \n");
        for(int j = 0;j < t1.size();j ++)
            t1.elementAt(j).info();
        //test thu removeCircle
        t.add(t1);
        Layer t2 = new Layer();
        t2.add(new Circle(3));
        t2.add(new Circle(2));
        t2.add(new Triangle(3, 5, 2.5));
        t.add(t2);
        System.out.println("\nTruoc khi xoa hinh tron:\n");
        for(int j = 0;j < t.size();j ++){
            for(int k = 0;k < t.elementAt(j).size();k ++)
                t.elementAt(j).elementAt(k).info();
            System.out.println("");
        }
        t.removeCircle();
        System.out.println("\nSau khi xoa hinh tron:\n");
        for(int j = 0;j < t.size();j ++){
            for(int k = 0;k < t.elementAt(j).size();k ++)
                t.elementAt(j).elementAt(k).info();
            System.out.println("");
        }
    }
}
