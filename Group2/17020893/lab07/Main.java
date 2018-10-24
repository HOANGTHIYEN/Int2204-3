package JavaWeek7;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		Diagram dia = new Diagram();
        JFrame frame = new JFrame();
        frame.setTitle("JavaWeek7");
        frame.setSize(800, 800);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        Container contentPane = frame.getContentPane();
        contentPane.add(dia);
        frame.setVisible(true);
    }
}
