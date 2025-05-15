package Frog;

import javax.swing.*;

public class Window {
    WindowInit init;
    public Window() {
        init = new WindowInit();
        init.setVisible(true);
    }

    public void setSize(int width, int height) {
        init.setSize(width, height);
    }

    public void setFullscreen(boolean fullscreen) {
        if (fullscreen) {
            init.gd.setFullScreenWindow(null);
        }
        init.dispose();
        if (fullscreen) {
            init.setExtendedState(JFrame.MAXIMIZED_BOTH);
            init.setUndecorated(true);
        } else {
            // Hier nog mee bezig
            init.setUndecorated(true);
        }

    }
}
