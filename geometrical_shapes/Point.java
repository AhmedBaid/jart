package geometrical_shapes;

import java.util.Random;

public class Point implements Drawable {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point random(int maxX, int maxY) {
        Random rand = new Random();
        return new Point(rand.nextInt(maxX), rand.nextInt(maxY));
    }

    @Override
    public void draw(Displayable displayable) {
        displayable.display(x, y, this.getColor());
    }
}
