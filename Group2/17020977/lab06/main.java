/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap_06;

/**
 *
 * @author Admin
 */

public class main {
    public static void main(String[] args) {
        Diagram dig = new Diagram();
        Layer ly = new Layer();
        ly.add(new Triangle(3, 4, 5,"red",true,new Toado(3,4)));
        ly.add(new Cricle(3,"red",false,new Toado(5,6)));
        ly.add(new Rectangle(4, 5,"blue",true,new Toado(3,4)));
        ly.add(new Square(5,"red",true,new Toado(6,7)));
        for(int j = 0;j < ly.size();j ++)
            ly.elementAt(j).info();
        ly.eraseTriangle();
        System.out.println("\nSau khi xoa hinh tam giac: \n");
        for(int j = 0;j < ly.size();j ++)
           ly.elementAt(j).info();
        dig.add(ly);
        dig.eraseCricle();
        System.out.println("\nSau khi xoa hinh tron:\n");
        for(int j = 0;j < dig.size();j ++){
            for(int k = 0;k <dig.elementAt(j).size();k ++)
                dig.elementAt(j).elementAt(k).info();
        }
     
}
}
