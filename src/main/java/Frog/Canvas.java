package Frog;

public class Canvas {
    Game game;

    public Canvas() {
        game = new Game();
    }

    public void draw(Sprite2D sprite) {
        game.drawSprite(sprite);
    }

    public double deltaTime() {
        return game.deltaTime;
    }

    public boolean isKeyPressed(Key key) {
        KeyHandler handler = game.getKeyHandler();

        return switch (key) {
            case Key.W -> handler.w;
            case Key.S -> handler.s;
            default -> false;
        };
    }
}
