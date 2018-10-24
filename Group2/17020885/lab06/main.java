/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author Dell
 */
import java.util.Vector;
/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        Diagram dia = new Diagram();
        Layer lay = new Layer();
        lay.add(new Triangle(4, 5, 7,"red",true,new Toado(3,4)));
        lay.add(new Cricle(9,"red",false,new Toado(5,6)));
        lay.add(new Rectangle(10, 23,"blue",true,new Toado(3,4)));
        lay.add(new Square(12,"red",true,new Toado(6,7)));
        for(int j = 0;j < lay.size();j ++)
            {
                lay.elementAt(j).info();
            
            }
        lay.eraseTriangle();
        System.out.println("\nSau khi xoa hinh tam giac: \n");
        for(int j = 0;j < lay.size();j ++)
           lay.elementAt(j).info();
        dia.add(lay);
        dia.eraseCricle();
        System.out.println("\nSau khi xoa hinh tron:\n");
        for(int j = 0;j < dia.size();j ++){
            for(int k = 0;k <dia.elementAt(j).size();k ++)
                dia.elementAt(j).elementAt(k).info();
        }
}
}

