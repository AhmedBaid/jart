package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Line implements Drawable {
    private final Point start;
    private final Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public static Line random(int maxX, int maxY) {
        return new Line(Point.random(maxX, maxY), Point.random(maxX, maxY));
    }

    @Override
    public void draw(Displayable displayable) {
        Color color = this.getColor();
        double x1 = start.x;
        double y1 = start.y;
        double x2 = end.x;
        double y2 = end.y;
        double dx = x2 - x1;
        double dy = y2 - y1;
        double steps = Math.max(Math.abs(dx), Math.abs(dy));
        double xIncrement = dx / steps;
        double yIncrement = dy / steps;
        double x = x1;
        double y = y1;
        for (int i = 0; i <= steps; i++) {
            displayable.display((int) Math.round(x), (int) Math.round(y), color);
            x += xIncrement;
            y += yIncrement;
        }
    }

    @Override
    public Color getColor() {
        Random rand = new Random();
        return new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    }
}
