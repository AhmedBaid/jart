package geometrical_shapes;
import java.awt.Color;

public class Rectangle implements Drawable {
    private final Point topLeft;
    private final Point bottomRight;

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public void draw(Displayable displayable) {
        Point topRight = new Point(this.bottomRight.x, this.topLeft.y);
        Point bottomLeft = new Point(this.topLeft.x, this.bottomRight.y);
        Color color = this.getColor();
        Line line1 = new Line(this.topLeft, topRight, color);
        Line line2 = new Line(topRight, this.bottomRight, color);
        Line line3 = new Line(this.bottomRight, bottomLeft, color);
        Line line4 = new Line(bottomLeft, this.topLeft, color);
        line1.draw(displayable);
        line2.draw(displayable);
        line3.draw(displayable);
        line4.draw(displayable);
    }
}
