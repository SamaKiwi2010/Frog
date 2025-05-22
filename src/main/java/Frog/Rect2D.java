package Frog;

public class Rect2D extends Sprite2D {
    Size2D size;

    public Rect2D(Vector2D position) {
        super(position);
    }

    public Rect2D(Vector2D position, Size2D size) {
        super(position);
        this.size = size;
    }

    public Rect2D(Vector2D position, Scale2D scale) {
        super(position, scale);
    }

    public Rect2D(Vector2D position, Scale2D scale, Angle2D angle) {
        super(position, scale, angle);
    }
}
