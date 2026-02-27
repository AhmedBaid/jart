package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Triangle implements Drawable {
    private final Point a;
    private final Point b;
    private final Point c;
    private final Color color;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = randomColor();
    }

    @Override
    public void draw(Displayable displayable) {
        // TODO: draw three lines connecting the three vertices
        // Use Bresenham's line algorithm for each edge: a-b, b-c, c-a
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
