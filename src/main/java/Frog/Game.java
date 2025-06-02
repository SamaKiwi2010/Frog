package Frog;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Game extends JPanel implements Runnable {
    Thread loop;
    Runnable gameLoopMethod;
    boolean fpsCapper = true;
    boolean fpsLogger = true;
    int maxFramerate = 60;
    double deltaTime;
    int FPS;
    ArrayList<Sprite2D> spritesToDraw = new ArrayList<Sprite2D>();

    Game() {

    }

    public void setGameLoop(Runnable gameLoop) {
        gameLoopMethod = gameLoop;
    }

    public void start() {
        loop = new Thread(this);
        loop.start();
        update();
    }

    @Override public void run() {
        double drawDelay;
        double delta = 0;

        // Normal Time fields
        long lastTime = System.nanoTime();
        long betweenTime;
        long currentTime;

        // Time field for deltaTime;
        long lastDeltaTime = lastTime;
        long betweenDeltaTime;
        long currentDeltaTime;

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

            timer += betweenTime;
            lastTime = currentTime;


            if (delta >= 1) {
                currentDeltaTime = System.nanoTime();
                betweenDeltaTime = currentDeltaTime - lastDeltaTime;
                deltaTime = (double) betweenDeltaTime / 1_000_000_000;
                lastDeltaTime = currentDeltaTime;

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

    public void drawSprite(Sprite2D sprite) {
        spritesToDraw.add(sprite);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2D = (Graphics2D)g;

        for (int i = 0; i < spritesToDraw.size(); i++) {
            Sprite2D currentSprite = spritesToDraw.get(i);
            if (currentSprite.getClass() == Rect2D.class) {
                Rect2D rect = (Rect2D) currentSprite;
                g2D.setColor(Color.BLACK);
                g2D.fillRect(
                        (int) rect.position.x,
                        (int) rect.position.y,
                        (int) (rect.size.width * rect.scale.scaleX),
                        (int) (rect.size.height * rect.scale.scaleY)
                );
            } else if (currentSprite.getClass() == ImageSprite2D.class) {
                ImageSprite2D sprite = (ImageSprite2D) currentSprite;
                g2D.drawImage(sprite.image.getImage(), (int) sprite.position.x, (int) sprite.position.y, null);
            }
        }
    }
}
