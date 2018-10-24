import ui.ShapePane;

import javax.swing.*;
import java.awt.*;

public class MainUi {
    public static void main(String args[]) {

        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(new BorderLayout());

        jFrame.add(new ShapePane());
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
