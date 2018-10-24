/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

/**
 *
 * @author Việt Hoàng
 */
public class Lab07 {
    public static void main(String[] args) {
        Diagram d = new Diagram();
        Layer l = new Layer();
        l.add(new Square(5,"red",true,new Location(4,6)));
        l.add(new Circle(3,"red",false,new Location(1,2)));
        l.add(new Rectangle(10, 45,"red",true,new Location(2,6)));
        l.add(new Triangle(3, 4, 5,"red",true,new Location(3,7)));
        
        
        for (int i = 0; i < l.size(); i++) {
            l.elementAt(i).showInfo();
        }
        System.out.println("\n xóa hình tam giác: \n");
        l.eraseTriangle();
        for(int j = 0;j < l.size();j ++)
        {
            l.elementAt(j).showInfo();
        }
        d.add(l);
        d.eraseCricle();
        System.out.println("\n Xóa hình tròn: \n");
        for(int j = 0;j < d.size();j ++){
            for(int k = 0;k <d.elementAt(j).size();k ++)
            {
                d.elementAt(j).elementAt(k).showInfo();
            }
        }

    }
}