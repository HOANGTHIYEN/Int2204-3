package JavaWeek7;

import java.awt.Container;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		Diagram dia = new Diagram();
        JFrame frame = new JFrame();
        frame.setTitle("JavaWeek7");
        frame.setSize(800, 800);
        Container contentPane = frame.getContentPane();
        contentPane.add(dia);
        frame.setVisible(true);
    }
}
