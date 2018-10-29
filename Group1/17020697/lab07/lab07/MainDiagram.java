package lab06_abtract;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.List;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainDiagram extends JPanel{
	Diagram data;
	public MainDiagram(Diagram tmp) {
		setBackground(Color.gray);
		setPreferredSize(new Dimension(1000, 1000));
		this.data = tmp;
		
	}
	
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape s : data.getRectangle().getTexture1()) {
            ((Rectangle)s).draw(g);
        }
        for (Shape s : data.getSquare().getTexture1()) {
        	((Square)s).draw(g);
        }
        for(Shape s : data.getCircle().getTexture1()) {
        	((Circle)s).draw(g);
        }
        for(Shape s : data.getTriangle().getTexture1()) {
        	((Triangle)s).draw(g);
        }
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diagram Proj = new Diagram();

//		Rectangle a1 = new Rectangle(20, 20, 40,50);
//		Rectangle a3 = new Rectangle(50, 100,40,50 );
//		Rectangle a2 = new Rectangle(150, 300, 30, 80);
//		Square s1 = new Square(40, 60, 180);
		Circle o1 = new Circle(100,600,40);
		Circle o2 = new Circle(0,0,30);
		Circle o3 = new Circle(80,20, 50);
		Triangle t1 = new Triangle(400,200,300,0,200,400);
		Triangle t2 = new Triangle(150,200,100,0,200,100);
		Triangle t3 = new Triangle(100,200,400,150,500,300);
		Proj.AddTri(t3);
		Proj.AddTri(t2);
		Proj.AddTri(t1);
//		
//		Proj.AddSqur(s1);
//		Proj.AddRect(a1);
//		Proj.AddRect(a2);
//		Proj.AddRect(a3);
		Proj.AddCir(o2);
		Proj.AddCir(o1);
		Proj.AddCir(o3);
		
		Proj.MergeDiagram();
		System.out.print(Proj.getRectangle().getTexture1().size());
		
		JFrame frame = new JFrame();
        frame.add(new MainDiagram(Proj));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
		
		
		
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					DrawDiagram frame = new DrawDiagram(Proj);
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//		
//	}
	}
}
