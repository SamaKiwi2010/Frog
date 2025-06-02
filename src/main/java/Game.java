import Frog.*;

public class Game {
    Canvas canvas;
    Image playerImg = new Image("assets/Gatenkaas.png");
    Sprite2D player = new ImageSprite2D(new Vector2D(0, 0), playerImg);

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
        canvas.draw(player);
        player.position.x += 1;
    }
}
