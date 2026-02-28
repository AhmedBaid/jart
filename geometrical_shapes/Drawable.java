package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public interface Drawable {
    void draw(Displayable displayable);

    default Color getColor() {
        Random rand = new Random();
        return new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    };
}
