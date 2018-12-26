package testproject;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class InitializeGraphics {

    static BufferedImage buffer = null;
    static int height = 10;
    static int width = 10;
    static Graphics2D g2;

    public InitializeGraphics() {
        buffer = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB_PRE);
        g2 = buffer.createGraphics();
        g2.fillOval(2, 2, 2, 2);
        g2.dispose();
    }

    protected void paintComponent(Graphics g) {
        int x = 0;
        int y = 0;
        g.drawImage(buffer, x, y, width, height, null);
    }

    public Graphics2D getGraphics() {
        return g2;
    }
}
