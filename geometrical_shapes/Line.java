package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Line implements Drawable {
    private final Point start;
    private final Point end;
    private final Color color;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
        this.color = randomColor();
    }

    // Random factory method: creates a line with random points within given bounds
    public static Line random(int maxX, int maxY) {
        return new Line(Point.random(maxX, maxY), Point.random(maxX, maxY));
    }

    @Override
    public void draw(Displayable displayable) {
        // TODO: implement Bresenham's line algorithm
        // Draw pixels from start to end using displayable.display(x, y, color)
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
