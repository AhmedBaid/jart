package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Rectangle implements Drawable {
    private final Point topLeft;
    private final Point bottomRight;
    private final Color color;

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        this.color = randomColor();
    }

    @Override
    public void draw(Displayable displayable) {
        // TODO: draw four lines forming the rectangle outline
        // top edge, bottom edge, left edge, right edge
    }

    @Override
    public Color getColor() {
        return color;
    }

    private static Color randomColor() {
        Random rand = new Random();
        return new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    }
}
