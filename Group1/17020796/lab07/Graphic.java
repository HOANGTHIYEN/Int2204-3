
import java.awt.Graphics;
import java.awt.Canvas;
import javax.swing.JFrame;
import java.awt.EventQueue;
import java.util.*;

public class Graphic extends Layer{
    public static Layer layer = new Layer();
    public static void main(String[] args) {


        // test vẽ hình tam giác
        Scanner sc = new Scanner(System.in);
        System.out.println("Test vẽ tam giác \n Nhập tọa độ 3 đỉnh: ");
        System.out.println("Tọa độ (x1,y1):");
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        System.out.println("Tọa độ (x2,y2):");
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        System.out.println("Tọa độ (x3,y3):");
        int x3 = sc.nextInt(), y3 = sc.nextInt();
        Triangle a = new Triangle(false, x1, y1, x2, y2, x3, y3);
        layer.hinh.add(a);
        Diagram G1 = new Diagram();


        // test vẽ hình tròn
        System.out.println("Test vẽ hình tròn \nNhập tọa độ: ");
        System.out.println("Tọa độ x:");
        int x = sc.nextInt();
        System.out.println("Tọa độ y:");
        int y = sc.nextInt();
        System.out.println("Bán kính r:");
        int r = sc.nextInt();
        Circle b = new Circle(false, x, y, r);
        layer.hinh.add(b);
        Diagram G2 = new Diagram();

    }
    
}