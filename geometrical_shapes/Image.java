package geometrical_shapes;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Image implements Displayable {
    private final int width;
    private final int height;
    private final BufferedImage bufferedImage;

    public Image(int width, int height) {
        this.width = width;
        this.height = height;
        this.bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                bufferedImage.setRGB(x, y, Color.BLACK.getRGB());
            }
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void display(int x, int y, Color color) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            bufferedImage.setRGB(x, y, color.getRGB());
        }
    }

    @Override
    public void save(String filename) {
        try {
            File output = new File(filename);
            ImageIO.write(bufferedImage, "png", output);
            System.out.println("Image saved: " + filename);
        } catch (IOException e) {
            System.err.println("Error saving image: " + e.getMessage());
        }
    }
}
