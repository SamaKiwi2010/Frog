import Frog.*;

public class Game {
    Canvas canvas;

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
        System.out.println("hello world");
        canvas.fillRect(new Vector2D(0, 0), 10, 10);
    }
}
