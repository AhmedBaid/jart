package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Point implements Drawable {
    public int x;
    public int y;
    private Color color;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = Color.WHITE;
    }

    // Random factory method: creates a point within given bounds
    public static Point random(int maxX, int maxY) {
        Random rand = new Random();
        return new Point(rand.nextInt(maxX), rand.nextInt(maxY));
    }

    @Override
    public void draw(Displayable displayable) {
        displayable.display(x, y, color);
    }

    @Override
    public Color getColor() {
        return color;
    }
}
