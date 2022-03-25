import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    // You will never call this yourself:
    public void paintComponent(Graphics g) {
        // Imagine 'g' as a painting machine, you tell it the color and the shape to paint (coordinates and size)
        g.setColor(Color.orange);
        g.fillRect(20, 50, 100, 100);

        // Display a jpeg
        Image image = new ImageIcon("./data/cat.jpeg").getImage();
        // The x,y coordinates for where top-left corner goes. Relative to the widget (JPanel subclass), not the frame
        g.drawImage(image, 3, 4, this);

        // Paint a randomly-colored circle on a black background
        // Fill background with black. x,y is upper-left corner, relative to the panel
        // width and height is saying: "make the width of this rect as wide/high as the panel"
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        // Random color generator
        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);

        Color randomColor = new Color(red, green, blue);
        g.setColor(randomColor);
        // x,y is top-left corner offset, width, height (all in pixels)
        g.fillOval(70, 70, 100, 100);
    }
}
