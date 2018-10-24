/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_lap07;

import javax.swing.JFrame;

/**
 *
 * @author Nguyễn Thái
 */
public class Bai_Tap_Lap07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Diagram diagram = new Diagram();
        Layer layer = new Layer();
        
        
        layer.add(new Triangle(3, 4, 5,"red",true,new Toadodiem(3.6,4.5)));
        
        layer.add(new Circle(3,"red",false,new Toadodiem(5.8,6.4)));
        
        layer.add(new Rectangle(4, 5,"blue",true,new Toadodiem(3,4)));
        
        layer.add(new Square(5,"red",true,new Toadodiem(6,7)));
        
        for(int j = 0;j < layer.size();j ++)
        	
        	layer.elementAt(j).Xuat();
        	layer.eraseTriangle();
        	
        System.out.println("Xoa hinh tam giac: \n");
        
        for(int j = 0;j < layer.size();j ++)
           layer.elementAt(j).Xuat();
        		diagram.add(layer);
        		diagram.eraseCricle();
        		
        System.out.println("Sau khi xoa hinh tron:\n");
        for(int j = 0;j < diagram.size();j ++){
        	
            for(int k = 0;k <diagram.elementAt(j).size();k ++)
            diagram.elementAt(j).elementAt(k).Xuat();
        }
       //khoi tao doi tuong
        Layer lay = new Layer();
        lay.add(new Circle(40, "black",true, new Toadodiem(50, 60)));
        lay.add(new Triangle(10 , 20 , 30 , "red" , true, new Toadodiem(20, 30)));
        lay.add(new Square(30, "green", true, new Toadodiem(100, 110)));
        lay.add(new Rectangle(20, 50, "blue", true, new Toadodiem(160, 170)));
        lay.add(new Hexagon(40, "brown", new Toadodiem(200, 250)));
        lay.setVisiable(true);
        
        //ve doi tuong
        JFrame a1 = new JFrame();
        a1.setSize(500, 500);
        a1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        a1.setVisible(true);
        //phuong thuc xoa hinh giong nhau
        System.out.println(lay.size());
        lay.XoaGiongNhau();
        System.out.println(lay.size());
        
        //chuyen hinh
        Diagram d = new Diagram();
        d.add(lay);
        
        //sau chuyen
        int l = d.size();
        Layer[] u = new Layer[l];
        JFrame[] v = new JFrame[5];
        DrawObjects[] b = new DrawObjects[l];
        for(int j = 0;j < l;j ++){
            u[j] = d.elementAt(j);
            u[j].setVisiable(true);
            v[j] = new JFrame();
            v[j].setSize(500, 500);
            b[j] = new DrawObjects();
            v[j].setVisible(true);
        }
    } 
    }
    
}
