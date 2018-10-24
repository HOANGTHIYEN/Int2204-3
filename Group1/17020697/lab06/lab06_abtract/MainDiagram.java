package lab06_abtract;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainDiagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diagram Proj = new Diagram();
		System.out.println(Proj.toString());
		System.out.println("--------------");
		Layer tmp = new Layer();
		Proj.AddLayer(tmp);
		System.out.println(Proj.toString());
		Proj.DeteleCircle();
		System.out.println("--------------");
		System.out.println(Proj.toString());
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.add(new TestPane());
		frame.pack();
		frame.setVisible(true);
		
		
	}

}
