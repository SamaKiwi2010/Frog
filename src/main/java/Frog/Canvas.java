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
}
