package Frog;

public class Rect2D extends Sprite2D {
    Size2D size;
    Color color;

    Rect2D(Vector2D position) {
        super(position);
    }

    Rect2D(Vector2D position, Scale2D scale) {
        super(position, scale);
    }

    Rect2D(Vector2D position, Scale2D scale, Angle2D angle) {
        super(position, scale, angle);
    }
}
