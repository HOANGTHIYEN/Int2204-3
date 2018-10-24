/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Genius
 */

public class Lab06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //khoi tao cac doi tuong
        Layer t = new Layer();
        t.add(new Cricle(40, Color.BLACK, new coordinates(50, 60)));
        t.add(new Cricle(40, Color.BLACK, new coordinates(50, 60)));
        t.add(new Triangle(new coordinates(20, 30), new coordinates(40, 30), new coordinates(30, 50), Color.BLUE));
        t.add(new Square(30, Color.CYAN, new coordinates(100, 110)));
        t.add(new Square(30, Color.CYAN, new coordinates(100, 110)));
        t.add(new Rectangle(20, 50, Color.DARK_GRAY, new coordinates(160, 170)));
        t.add(new Hexagon(40, Color.GREEN, new coordinates(200, 250)));
        t.add(new Hexagon(50, Color.GREEN, new coordinates(300, 350)));
        t.setVisiable(true);//cho la true de hien thi cac doi tuong
        draw b1 = new draw();
        b1.setL(t);
        //ve doi tuong
        JFrame a1 = new JFrame();
        a1.setSize(500, 500);
        a1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a1.add(b1);
        a1.setVisible(true);
        //test phuong thuc xoa hinh giong nhau
        System.out.println(t.size());
        t.eraseSame();
        System.out.println(t.size());
        //test thu phuong thuc chuyen hinh
        Diagram d = new Diagram();
        d.add(t);
        d.transition();
        //sau chuyen
        int l = d.size();
        Layer[] t1 = new Layer[l];
        JFrame[] a2 = new JFrame[5];
        draw[] b2 = new draw[l];
        for(int j = 0;j < l;j ++){//ve tung layer
            t1[j] = d.elementAt(j);
            t1[j].setVisiable(true);
            a2[j] = new JFrame();
            a2[j].setSize(500, 500);
            b2[j] = new draw();
            b2[j].setL(t1[j]);
            a2[j].add(b2[j]);
            a2[j].setVisible(true);
        }
    }
    
}