package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Circle implements Drawable {
    private final Point center;
    private final int radius;
    private final Color color;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
        this.color = randomColor();
    }

    // Random factory method: creates a circle with random center and radius within bounds
    public static Circle random(int maxX, int maxY) {
        Random rand = new Random();
        int radius = rand.nextInt(Math.min(maxX, maxY) / 2) + 1;
        Point center = new Point(rand.nextInt(maxX), rand.nextInt(maxY));
        return new Circle(center, radius);
    }

    @Override
    public void draw(Displayable displayable) {
        // TODO: implement Bresenham's circle algorithm (midpoint circle algorithm)
        // Draw pixels around center at given radius using displayable.display(x, y, color)
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
