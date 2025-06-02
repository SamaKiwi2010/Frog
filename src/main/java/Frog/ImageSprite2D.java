package Frog;

import javax.swing.*;

public class ImageSprite2D extends Sprite2D {
    ImageIcon image;

    public ImageSprite2D(Vector2D position) {
        super(position);
    }

    public ImageSprite2D(Vector2D position, Image image) {
        super(position);
        this.image = image.image;
    }

    public ImageSprite2D(Vector2D position, Scale2D scale) {
        super(position, scale);
    }

    public ImageSprite2D(Vector2D position, Scale2D scale, Angle2D angle) {
        super(position, scale, angle);
    }
}
