package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Triangle implements Drawable {
    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void draw(Displayable displayable) {
        Color color = this.getColor();
        Line line1 = new Line(this.a, this.b, color);
        Line line2 = new Line(this.b, this.c, color);
        Line line3 = new Line(this.c, this.a, color);
        line1.draw(displayable);
        line2.draw(displayable);
        line3.draw(displayable);
    }
}
