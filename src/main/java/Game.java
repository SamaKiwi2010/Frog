import Frog.*;

public class Game {
    Canvas canvas;
    Image playerImg = new Image("/assets/Gatenkaas.png");
    Sprite2D player = new ImageSprite2D(new Vector2D(0, 0), playerImg);

    int SPEED = 150;

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
        canvas.draw(player);
        if (canvas.isKeyPressed(Key.W)) {
            player.position.y += -SPEED * canvas.deltaTime();
        }
        if (canvas.isKeyPressed(Key.S)) {
            player.position.y += SPEED * canvas.deltaTime();
        }
        if (canvas.isKeyPressed(Key.A)) {
            player.position.x += -SPEED * canvas.deltaTime();
        }
        if (canvas.isKeyPressed(Key.D)) {
            player.position.x += SPEED * canvas.deltaTime();
        }
    }
}
