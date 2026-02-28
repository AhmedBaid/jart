package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Circle implements Drawable {
    private Point center;
    private int radius;
    private Color color;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
        Random rand = new Random();
        this.color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    }

    public static Circle random(int width, int height) {
        Random rand = new Random();
        int radius = rand.nextInt(Math.min(width, height) / 8) + 10;
        Point center = new Point(rand.nextInt(width), rand.nextInt(height));
        return new Circle(center, radius);
    }

    @Override
    public void draw(Displayable displayable) {
        // Bresenham's circle algorithm (midpoint circle algorithm)
        // Starts at the top of the circle (x=radius, y=0) and steps through
        // one octant, mirroring the point across all 8 symmetrical octants.
        int cx = center.x;
        int cy = center.y;
        int x = radius;
        int y = 0;
        int err = 0; // decision parameter: tracks deviation from true circle

        while (x >= y) {
            // Mirror the current (x, y) offset across all 8 octants
            displayable.display(cx + x, cy + y, color); // octant 1
            displayable.display(cx + y, cy + x, color); // octant 2
            displayable.display(cx - y, cy + x, color); // octant 3
            displayable.display(cx - x, cy + y, color); // octant 4
            displayable.display(cx - x, cy - y, color); // octant 5
            displayable.display(cx - y, cy - x, color); // octant 6
            displayable.display(cx + y, cy - x, color); // octant 7
            displayable.display(cx + x, cy - y, color); // octant 8

            y++;                      // always step along y
            err += 2 * y + 1;        // update error for new y (dy² term)
            if (err > 0) {
                x--;                  // step x inward when error exceeds threshold
                err -= 2 * x + 1;    // correct error for new x (dx² term)
            }
        }
    }

    @Override
    public Color getColor() {
        return color;
    }
}