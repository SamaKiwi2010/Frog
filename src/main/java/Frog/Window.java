package Frog;

import javax.swing.*;
import java.awt.*;

public class Window {
    WindowInit init;
    Canvas canvas;
    int screenWidth;
    int screenHeight;
    boolean isFullscreen;

    public Window() {
        init = new WindowInit();
        init.setVisible(true);
        init.setTitle("New Frog Game");
        //setSize(800, 600);
    }

    public void setGameLoop(Runnable gameLoop) {
        canvas.game.setGameLoop(gameLoop);
    }

    public void start() {
        canvas.game.start();
    }

    public void setTitle(String title) {
        init.setTitle(title);
    }

    public void add(Canvas canvas) {
        this.canvas = canvas;
        init.add(canvas.game);
        init.pack();
        init.setSize(new java.awt.Dimension(screenWidth, screenHeight));
    }

    public void setSize(Dimension size) {
        //screenWidth = size.width;
        //screenHeight = size.height;
        init.setSize(new java.awt.Dimension());
        init.setLocationRelativeTo(null);
    }

    public void setFullscreen(boolean fullscreen) {
        if (!fullscreen) {
            init.gd.setFullScreenWindow(null);
        }
        init.dispose();
        if (fullscreen) {
            init.setUndecorated(true);
            init.gd.setFullScreenWindow(init);
            isFullscreen = true;
        } else {
            init.setUndecorated(false);
            init.setVisible(true);
            isFullscreen = false;
        }
    }
}
