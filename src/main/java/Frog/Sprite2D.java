package Frog;

class Sprite2D {
    Vector2D position;
    Scale2D scale;
    Angle2D angle;

    Sprite2D(Vector2D position) {
        this.position = position;
        this.scale = new Scale2D(1.0, 1.0);
        this.angle = new Angle2D(0);
    }

    Sprite2D(Vector2D position, Scale2D scale) {
        this.position = position;
        this.scale = scale;
        this.angle = new Angle2D(0);
    }

    Sprite2D(Vector2D position, Scale2D scale, Angle2D angle) {
        this.position = position;
        this.scale = scale;
        this.angle = angle;
    }
}
