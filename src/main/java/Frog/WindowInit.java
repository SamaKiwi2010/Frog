package Frog;

import javax.swing.*;
import java.awt.*;

public class WindowInit extends JFrame {
    GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    WindowInit() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new Dimension(800, 600));
        setLocationRelativeTo(null);
    }
}
