import Frog.*;

public class Game {
    Canvas canvas;
    Sprite2D rect = new Rect2D(new Vector2D(100, 100), new Size2D(100, 50));
    Sprite2D rect2 = new Rect2D(new Vector2D(100, 200), new Size2D(100, 50));
    Sprite2D rect3 = new Rect2D(new Vector2D(100, 300), new Size2D(100, 50));
    Sprite2D rect4 = new Rect2D(new Vector2D(100, 400), new Size2D(100, 50));

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
        canvas.draw(rect2);
        canvas.draw(rect3);
        canvas.draw(rect4);
        rect.position.x += 1;
        rect2.position.x += 1;
        rect3.position.x += 1;
        rect4.position.x += 1;
    }
}
