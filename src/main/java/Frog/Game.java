package Frog;

import javax.swing.*;
import java.awt.*;

public class Game extends JPanel implements Runnable {
    Thread loop;
    Runnable gameLoopMethod;
    boolean fpsCapper = true;
    boolean fpsLogger = true;
    int maxFramerate = 1;
    double deltaTime;
    int FPS;

    Game() {

    }

    public void setGameLoop(Runnable gameLoop) {
        gameLoopMethod = gameLoop;
    }

    public void start() {
        loop = new Thread(this);
        loop.start();
    }

    @Override public void run() {
        double drawDelay;
        double delta = 0;
        long lastTime = System.nanoTime();
        long betweenTime;
        long currentTime;
        long timer = 0;
        int drawCount = 0;
        while (loop != null) {
            if (!fpsCapper) {
                drawDelay = 1.0;
            } else {
                drawDelay = (double)1_000_000_000/maxFramerate;
            }

            currentTime = System.nanoTime();
            betweenTime = currentTime - lastTime;

            delta += betweenTime / drawDelay;
            deltaTime = (double) betweenTime / 1_000_000_000;
            timer += betweenTime;
            lastTime = currentTime;


            if (delta >= 1) {
                update();
                repaint();
                delta--;
                drawCount++;
            }

            if (timer >= 1_000_000_000) {
                FPS = drawCount;
                if (fpsLogger) {
                    System.out.println("FPS: " + FPS);
                }
                drawCount = 0;
                timer = 0;
            }
        }
    }

    void update() {
        gameLoopMethod.run();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2D = (Graphics2D)g;
    }
}
