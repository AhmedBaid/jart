import geometrical_shapes.*;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        Image image = new Image(1000, 1000);
        for (int i = 0; i <= 1000; i++) {
            Point randomPoint = Point.random(image.getWidth(), image.getHeight());
            randomPoint.draw(image);
        }
        Line line = new Line(Point.random(image.getWidth(), image.getHeight()), Point.random(image.getWidth(), image.getHeight()), new Color(255, 0, 0));
        line.draw(image);
        Rectangle rectangle = new Rectangle(new Point(50, 50), new Point(300, 200));
        rectangle.draw(image);
        Triangle triangle = new Triangle(new Point(100, 100), new Point(900, 900), new Point(100, 900));
        triangle.draw(image);

        for (int i = 0; i < 50; i++) {
            Circle circle = Circle.random(image.getWidth(), image.getHeight());
            circle.draw(image);
        }
        image.save("image.png");
    }
}