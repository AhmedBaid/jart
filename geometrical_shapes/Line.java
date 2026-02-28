package geometrical_shapes;

import java.awt.Color;

public class Line implements Drawable {
    private final Point start;
    private final Point end;
    private final Color color;

    public Line(Point start, Point end, Color color) {
        this.start = start;
        this.end = end;
        this.color = color;
    }

    public Line random(int maxX, int maxY) {
        return new Line(Point.random(maxX, maxY), Point.random(maxX, maxY), this.color);
    }

    @Override
    public void draw(Displayable displayable) {
        Color color = this.color;
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
}
