package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Circle implements Drawable {
    private final Point center;
    private final int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public static Circle random(int maxX, int maxY) {
        Random rand = new Random();
        int radius = rand.nextInt(Math.min(maxX, maxY) / 2) + 1;
        Point center = new Point(rand.nextInt(maxX), rand.nextInt(maxY));
        return new Circle(center, radius);
    }

    @Override
    public void draw(Displayable displayable) {
        
    }
}
