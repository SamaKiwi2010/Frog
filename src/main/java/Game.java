import Frog.*;

public class Game {
    Canvas canvas;
    Sprite2D rect = new Rect2D(new Vector2D(100, 100), new Size2D(100, 120));

    public static void main(String[] args) {
        new Game();
    }

    Game() {
        Window window = new Window();
        canvas = new Canvas();
        window.add(canvas);
        window.setGameLoop(this::gameLoop);
        window.start();
    }

    public void gameLoop() {
        //System.out.println("hello world");
        canvas.draw(rect);
        rect.position.x += 1000 * canvas.deltaTime();
    }
}
