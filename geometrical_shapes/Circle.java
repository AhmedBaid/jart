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

        double radiusF = (double) radius;
        double centerX = (double) center.x;
        double centerY = (double) center.y;

        double area = Math.PI * Math.pow(radiusF, 2);
        double step = 360.0 / area;

        double angleDeg = 0.0;

        while (angleDeg <= 360.0) {

            double angleRad = Math.toRadians(angleDeg);

            int x = (int) Math.round(radiusF * Math.cos(angleRad) + centerX);
            int y = (int) Math.round(radiusF * Math.sin(angleRad) + centerY);

            displayable.display(x, y, color);

            angleDeg += step;
        }
    }

    @Override
    public Color getColor() {
        return color;
    }
}